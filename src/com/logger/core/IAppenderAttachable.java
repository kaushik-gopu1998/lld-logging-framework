package com.logger.core;

import com.logger.appenders.Appender;

public interface IAppenderAttachable {
    public void addAppender(Appender appender);
    public Appender getAppender(String name);
}
