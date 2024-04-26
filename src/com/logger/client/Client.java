package com.logger.client;

import com.logger.appenders.ConsoleAppender;
import com.logger.core.Logger;
import com.logger.core.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Client.class.getName());
        logger.addAppender(new ConsoleAppender("console"));
        logger.info("message received");
        logger.error("an error occurred while processing message");
        logger.warn("too many login attempts");
        logger.debug("debug the message");
    }
}
