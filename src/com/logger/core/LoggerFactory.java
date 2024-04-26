package com.logger.core;

public class LoggerFactory{
    private LoggerFactory(){}
    public static Logger getLogger(String name) {
        Logger logger = new Logger(name);
        return logger;
    }
}
