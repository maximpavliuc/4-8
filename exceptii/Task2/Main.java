package org.example.lab4.Task2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Calculator calculator = null;
        Calculator calculator = new DoubleCalculator();

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        System.out.println("Max and Max value double: ");
        try {
            System.out.println(calculator.add(Double.MAX_VALUE, Double.MAX_VALUE));
        } catch (Calculator.OverflowException e) {
            System.err.println("OverflowException: " + e.getMessage());
        } catch (Calculator.UnderflowException e) {
            System.err.println("UnderflowException: " + e.getMessage());
        } catch (Calculator.NullParameterException e) {
            System.err.println("NullParameterException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

        System.out.println("Null and 2d: ");
        try {
            calculator.add(null, 2d);
        } catch (Calculator.OverflowException e) {
            System.err.println("OverflowException: " + e.getMessage());
        } catch (Calculator.UnderflowException e) {
            System.err.println("UnderflowException: " + e.getMessage());
        } catch (Calculator.NullParameterException e) {
            System.err.println("NullParameterException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

        System.out.println("Min and Min double ");
        try {
            calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (Calculator.OverflowException e) {
            System.err.println("OverflowException: " + e.getMessage());
        } catch (Calculator.UnderflowException e) {
            System.err.println("UnderflowException: " + e.getMessage());
        } catch (Calculator.NullParameterException e) {
            System.err.println("NullParameterException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println(calculator.divide(1d, 0d));
        } catch (Calculator.OverflowException e) {
            System.err.println("OverflowException: " + e.getMessage());
        } catch (Calculator.UnderflowException e) {
            System.err.println("UnderflowException: " + e.getMessage());
        } catch (Calculator.NullParameterException e) {
            System.err.println("NullParameterException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

    }
}
