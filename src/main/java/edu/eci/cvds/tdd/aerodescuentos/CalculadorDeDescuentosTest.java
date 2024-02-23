package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadorDeDescuentosTest {
    private static final double DELTA = 0.001;
    @Test
    public void calculoTarifaTest() {
        // Test case 1: 15% discount for booking more than 20 days in advance
        assertEquals(85000, CalculadorDescuentos.calculoTarifa(100000, 25, 25), DELTA);

        // Test case 2: 5% discount for passengers under 18 years old
        assertEquals(95000, CalculadorDescuentos.calculoTarifa(100000, 10, 16), DELTA);

        // Test case 3: 8% discount for passengers over 65 years old
        assertEquals(92000, CalculadorDescuentos.calculoTarifa(100000, 15, 70), DELTA);

        // Test case 4: Both discounts applied
        assertEquals(77000, CalculadorDescuentos.calculoTarifa(100000, 25, 70), DELTA);

        // Test case 5: No discounts
        assertEquals(100000, CalculadorDescuentos.calculoTarifa(100000, 10, 30), DELTA);
    }
}
