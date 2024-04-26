package com.logger.appenders;

import com.logger.core.ILoggingEvent;

public interface Appender {
    public void doAppend(ILoggingEvent event);
    public String getName();
}
