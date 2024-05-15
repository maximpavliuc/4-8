package org.example.lab4.Task4;

import java.util.EnumSet;

public enum LogLevel {
    INFO, DEBUG, WARNING, ERROR, FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR;

    public static EnumSet<LogLevel> all() {
        return EnumSet.allOf(LogLevel.class);
    }
}