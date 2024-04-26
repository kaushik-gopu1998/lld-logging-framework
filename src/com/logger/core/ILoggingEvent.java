package com.logger.core;

public interface ILoggingEvent {
    LEVEL getLevel();
    String getMessage();
}
