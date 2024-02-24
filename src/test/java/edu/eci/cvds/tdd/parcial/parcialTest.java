package edu.eci.cvds.tdd.parcial;


import org.junit.Assert;
import org.junit.Test;


public class parcialTest {
    private Parcial parcial = new Parcial();


    @Test
    public void esMayorDeEdad() throws Exception {
        boolean result;
        result = parcial.validateAge(18);
        Assert.assertEquals(false, result);
    }

    @Test
    public void esMayorDeEdadLimite() throws Exception {
        boolean result;
        result = parcial.validateAge(1000);
        Assert.assertEquals(false, result);
    }

    @Test
    public void EdadInvalida() {
        Assert.assertThrows(Exception.class, () -> parcial.validateAge(-1));
    }

    @Test
    public void EdadInvalidaLimite() {
        Assert.assertThrows(Exception.class, () -> parcial.validateAge(-1000));
    }

    @Test
    public void esMenorDeEdad() throws Exception {
        boolean result;
        result = parcial.validateAge(0);
        Assert.assertEquals(true, result);
    }

    @Test
    public void esMenorDeEdadLimite() throws Exception {
        boolean result;
        result = parcial.validateAge(17);
        Assert.assertEquals(true, result);
    }

}