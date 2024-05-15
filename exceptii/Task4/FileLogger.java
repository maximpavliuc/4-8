package org.example.lab4.Task4;

import java.util.EnumSet;

public class FileLogger extends LoggerBase {
    public FileLogger() {
        super(EnumSet.of(LogLevel.WARNING, LogLevel.ERROR));
    }

    @Override
    protected void writeMessage(String message, LogLevel severity) {
        System.out.println("[File] " + message);
    }
}