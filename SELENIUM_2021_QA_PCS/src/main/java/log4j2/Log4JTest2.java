package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest2 {
	
	private static Logger log=LogManager.getLogger(Log4JTest2.class.getName());

	public static void main(String[] args) {
		
		/*
		 * log.info(); when a page verification is required and successfully performed
		 * 
		 * 
		 * log.debug(); when each selenium action is performed linke onclick, ...
		 * 
		 * log.info(); when a problem occures during test excution
		 * 
		 * 
		 * log.fatal(); when a critical error occers that prevernts further excution
		 * 
		 		like browser not loaded, property file not loaded
		 * 
		 */
		
		
//by default its configured to print errors only in the councul
if 		(6==5) {
	log.info("6 is equal to 5");
} else {
	System.out.println("");
	log.info("6 is Not equal to 5");
}
log.debug("I am debugging");
log.error("An error occurred");
log.info("This is some info");
log.fatal("This is a fatal error");

//to be able to print all 

//https://logging.apache.org/log4j/2.x/manual/configuration.html
// 3 items during config that we need to Build
/*1. new folder at the project level//resources
 * 
 * 2. new XML file //log4j2.xml 
 * 
 * 3. add resourses folder to the project build path this connects java to the log4j
 * 
 * 
 */
System.out.println("Test is completed");




	}

}
