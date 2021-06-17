package Reusablecomponent;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Level;

public class Log {

    private static Logger log = null;

    public static void invokeLogger() {

        try {
            // creates pattern layout
            PatternLayout layout = new PatternLayout();
            String conversionPattern = "%d{dd MMM yyyy HH:mm:ss} %-7p[%C{1}] - %m%n";
            layout.setConversionPattern(conversionPattern);

            // creates console appender
            ConsoleAppender consoleAppender = new ConsoleAppender();
            consoleAppender.setLayout(layout);
            consoleAppender.activateOptions();

            // creates file appender
            FileAppender fileAppender = new FileAppender();
            fileAppender.setFile("./Test-output/Log/logfile.log");
            fileAppender.setLayout(layout);
            fileAppender.setAppend(false);
            fileAppender.activateOptions();

            // configures the root logger
            Logger rootLogger = Logger.getRootLogger();

            rootLogger.setLevel(Level.INFO);

            rootLogger.addAppender(consoleAppender);
            rootLogger.addAppender(fileAppender);

            log = Logger.getLogger(Log.class.getName());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            // ex.printStackTrace();

        }

    }

    public static Logger getLogger() {
        return log;
    }

    public static void info(String message) {
        log.info(message);
    }

    public static void error(String message) {
        log.error(message);
    }

}

