# Logger Framework LLD

Design and implement a logging framework using Object-Oriented Principles.

# Components
1) Logger: Core class of the logging framework. Provides a rich set of features for logging different types of messages. 
2) LoggerFactory: A factory class that manufactures loggers.
3) Appender: An interface with a method called doAppend(ILoggingEvent event). Any appender that wants to write logs to target should implement this interface.
4) LoggingEvent: An object that holds information about a single log (message, level);
5) IAppenderAttachable: Logger class implements this interface to attach and detach appenders that it holds;
6) Level: An enum that consists of different log levels.

