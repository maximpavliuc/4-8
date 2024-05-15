package org.example.lab4.Task2;

import java.util.Collection;

public interface Calculator {
    class NullParameterException extends RuntimeException {
        public NullParameterException(String message) {
            super(message);
        }
    }

    class UnderflowException extends RuntimeException {
        public UnderflowException(String message) {
            super(message);
        }
    }

    class OverflowException extends RuntimeException {
        public OverflowException(String message) {
            super(message);
        }
    }

    Double add(Double nr1, Double nr2);

    Double divide(Double nr1, Double nr2);

    Double average(Collection<Double> numbers);
}