package org.example.lab4.Task4;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {
    public EmailLogger() {
        super(EnumSet.of(LogLevel.FUNCTIONAL_MESSAGE, LogLevel.FUNCTIONAL_ERROR));
    }

    @Override
    protected void writeMessage(String message, LogLevel severity) {
        System.out.println("[Email] " + message);
    }
}