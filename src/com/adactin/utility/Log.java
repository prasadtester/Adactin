package com.adactin.utility;

import org.apache.log4j.Logger;

public class Log {
	
	private static Logger Log = Logger.getLogger(Log.class);
	 
	public static void info(String message) {
		Log.info(message);
	}

}
