package edu.eci.cvds.tdd.parcial;

public class Parcial {

    private boolean result;
    public Parcial(){

    }
    public boolean validateAge(int age)throws Exception{
        if(age < 0){
            throw new Exception("Edad invalida");
        }
        if (age > 17){
            return false;
        }

        return true;
    }
}
