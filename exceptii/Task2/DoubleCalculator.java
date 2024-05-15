package org.example.lab4.Task2;

import java.util.Collection;

public class DoubleCalculator implements Calculator {
    @Override
    public Double add(Double nr1, Double nr2) throws NullParameterException, OverflowException, UnderflowException {
        if (nr1 == null || nr2 == null) {
            throw new NullParameterException("Null parameters are not allowed");
        }
        double result = nr1 + nr2;
        if (Double.isInfinite(result) && result > 0) {
            throw new OverflowException("Result is too large (overflow)");
        }
        if (Double.isInfinite(result) && result < 0) {
            throw new UnderflowException("Result is too small (underflow)");
        }
        return result;
    }

    @Override
    public Double divide(Double nr1, Double nr2) throws NullParameterException, OverflowException, UnderflowException {
        if (nr1 == null || nr2 == null) {
            throw new NullParameterException("Null parameters are not allowed");
        }
        if (nr2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = nr1 / nr2;
        if (Double.isInfinite(result) && result > 0) {
            throw new OverflowException("Result is too large (overflow)");
        }
        if (Double.isInfinite(result) && result < 0) {
            throw new UnderflowException("Result is too small (underflow)");
        }
        return result;
    }

    @Override
    public Double average(Collection<Double> numbers) throws NullParameterException, OverflowException, UnderflowException {
        if (numbers == null || numbers.isEmpty()) {
            throw new NullParameterException("Collection is null or empty");
        }
        Double sum = 0d;
        for (Double number : numbers) {
            if (number == null) {
                throw new NullParameterException("Null value found in the collection");
            }
            sum = add(sum, number);
        }
        if (sum == 0d) {
            throw new ArithmeticException("Division by zero");
        }
        return divide(sum, (double) numbers.size());
    }
}
