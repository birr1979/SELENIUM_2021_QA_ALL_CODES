package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest {
	
	private static Logger log=LogManager.getLogger(Log4JTest.class.getName());
	

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
		
log.debug("Message A");
log.error("Message B");
log.info("Message C");
log.fatal("Message D");

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



System.out.println("this is the forst test.");



	}

}
