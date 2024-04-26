package com.logger.core;

public class LoggingEvent implements ILoggingEvent{
    private LEVEL level;
    private String message;
    public LoggingEvent(String theMessage, LEVEL theLevel){
        message=theMessage;
        level=theLevel;
    }
    @Override
    public LEVEL getLevel() {
        return level;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
