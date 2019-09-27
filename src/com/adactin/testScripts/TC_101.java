package com.adactin.testScripts;

import com.adactin.lib.General;

public class TC_101 {
	
	public static void main(String[]args) throws Exception {
		
		General g = new General();
		g.OpenApplication();
		g.LoginApplication();
		g.SearchHotel();
		g.SelectHotel();
		g.LogoutApplication();
		g.LoginAgain();
		
	}

}
