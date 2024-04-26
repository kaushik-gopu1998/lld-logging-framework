package com.logger.appenders;

import com.logger.core.ILoggingEvent;

public class ConsoleAppender implements Appender{
    private String name;
    public ConsoleAppender(String theName){
        name=theName;
    }
    @Override
    public void doAppend(ILoggingEvent event) {
        System.out.println(event.getLevel()+":"+event.getMessage());
    }
    @Override
    public String getName(){
        return  name;
    }
}
