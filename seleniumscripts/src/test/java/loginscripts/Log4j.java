package loginscripts;

import org.apache.logging.log4j.LogManager;

public class Log4j {

	public static void main(String[] args) {
		org.apache.logging.log4j.Logger logger = LogManager.getLogger(Log4j.class);
		System.out.println("Hello World...");
		
		logger.trace("This is Trace Message");
		logger.info("This is Information Message");
		logger.error("This is Error Message");
		logger.warn("This is warn Message");
		logger.fatal("This is fatal Message");
		
		System.out.println("Completed...");
		
		
	}
}
