/**
 * 
 */
package com.iqmsoft.spring.batch.hadoop.launch;

import org.h2.tools.Console;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class LaunchDatabaseAndConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext(
			"/META-INF/spring/batch-infrastructure-context.xml",
			"/META-INF/spring/initialize/initialize-database-context.xml"
		);
		Console.main(args);
	}

}
