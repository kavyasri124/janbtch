package log4jtest;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4jtestfile {
	public Logger log = LogManager.getLogger(Log4jtestfile.class.getName());
	
@Test

public void log() {
	log.debug("i am from debug");
	log.error("i am from error");
	log.info("i am from info");
	log.fatal("i am from fatal===");
	System.out.println("we are done");
}

}


