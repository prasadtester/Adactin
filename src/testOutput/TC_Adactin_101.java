package testOutput;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.adactin.lib.General;

public class TC_Adactin_101 {

	@Test
	public void adactin() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
		
		General g = new General();
		g.OpenApplication();
		Reporter.log("Openapplication");
		g.LoginApplication();
		Reporter.log("Loginapplication");
		g.SearchHotel();
		Reporter.log("Search hotel");
		g.SelectHotel();
		Reporter.log("select hotel");
		g.LogoutApplication();
		Reporter.log("logout application");
		g.LoginAgain();
		Reporter.log("loginAgain application");
		g.CloseApplication();
		Reporter.log("close application");

		
	}
	
}
