package com.kodilla;

public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }
    public double substract(double x, double y) {
        return x - y;
    }

    public static void main (String[]args) {
        double x=5.56;
        double y=7.00;
        Calculator calculator = new Calculator();
        System.out.format("Suma: x+y= "+"%.2f%n",calculator.add(x,y));
        System.out.format("Różnica: x-y= "+"%.2f%n",calculator.substract(x,y));
    }
}

