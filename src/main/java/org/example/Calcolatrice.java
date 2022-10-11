package org.example;

public class Calcolatrice {

    public <T extends Number> double add(T n1, T n2){
        return n1.doubleValue() + n2.doubleValue();
    }
    public <T extends Number> double sub(T n1, T n2){
        return   n1.doubleValue()- n2.doubleValue();
    }
    public <T extends Number> double multiply(T n1, T n2){
        return   n1.doubleValue() * n2.doubleValue();
    }
    public <T extends Number> double div(T n1, T n2){
        return   n1.doubleValue() / n2.doubleValue();
    }


}