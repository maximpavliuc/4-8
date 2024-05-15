package org.example.lab4.Task4;

public class ConsoleLogger extends LoggerBase {
    public ConsoleLogger() {
        super(LogLevel.all());
    }

    @Override
    protected void writeMessage(String message, LogLevel severity) {
        System.out.println("[Console] " + message);
    }
}