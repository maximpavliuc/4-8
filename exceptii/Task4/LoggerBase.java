package org.example.lab4.Task4;

import java.util.EnumSet;

public abstract class LoggerBase {
    private EnumSet<LogLevel> logLevels;
    private LoggerBase nextLogger;

    public LoggerBase(EnumSet<LogLevel> logLevels) {
        this.logLevels = logLevels;
    }

    public void setNext(LoggerBase nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected abstract void writeMessage(String message, LogLevel severity);

    public void message(String message, LogLevel severity) {
        if (logLevels.contains(severity)) {
            writeMessage(message, severity);
        }
        if (nextLogger != null) {
            nextLogger.message(message, severity);
        }
    }
}