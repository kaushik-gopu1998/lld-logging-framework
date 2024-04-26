package com.logger.core;

import com.logger.appenders.Appender;

import java.util.ArrayList;
import java.util.List;

public class Logger implements IAppenderAttachable{
    List<Appender> appenders = new ArrayList<>();
    String name;
    public Logger(String theName){
        name=theName;
    }
    public void info(String message){
        LoggingEvent loggingEvent = new LoggingEvent(message, LEVEL.INFO);
        callAppenders(loggingEvent);
    }

    private void callAppenders(LoggingEvent loggingEvent) {
        for (Appender appender: appenders){
            appender.doAppend(loggingEvent);
        }
    }

    public void warn(String message){
        LoggingEvent loggingEvent = new LoggingEvent(message, LEVEL.WARN);
        callAppenders(loggingEvent);
    }
    public void debug(String message){
        LoggingEvent loggingEvent = new LoggingEvent(message, LEVEL.DEBUG);
        callAppenders(loggingEvent);
    }
    public void error(String message){
        LoggingEvent loggingEvent = new LoggingEvent(message, LEVEL.ERROR);
        callAppenders(loggingEvent);
    }
    @Override
    public void addAppender(Appender appender) {
        appenders.add(appender);
    }

    @Override
    public Appender getAppender(String name) {
        return appenders.stream().filter(appender -> appender.getName().equals(name)).findFirst().orElseGet(()->null);
    }
}
