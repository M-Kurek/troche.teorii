package pl.mk.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.lang.invoke.MethodHandles;

public class StartLogging {
    private final static Logger log = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        log.info("loguje sie tutaj");
    }
}
