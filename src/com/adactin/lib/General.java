package com.adactin.lib;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import com.adactin.utility.Log;


public class General extends Global{

	public void OpenApplication() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	public void LoginApplication() {
		
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
		System.out.println("login application");
		Log.info("**********login***************");
	}
    public void CloseApplication() {
    	driver.close();
    }
	public void LogoutApplication() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("login Logout");
	}
    public void SearchHotel(){

    	Select dd1 = new Select(driver.findElement(By.name("location")));
    	dd1.selectByIndex(2);
    	Select dd2 =new Select(driver.findElement(By.name("hotels")));
    	dd2.selectByIndex(2);
    	Select dd3 = new Select(driver.findElement(By.name("room_type")));
    	dd3.selectByIndex(2);
    	Select dd4 = new Select(driver.findElement(By.name("room_nos")));
    	dd4.selectByIndex(2);
    	driver.findElement(By.name("datepick_in"));
    	driver.findElement(By.name("datepick_out"));
    	Select dd5 = new Select(driver.findElement(By.name("adult_room")));
    	dd5.selectByIndex(1);
    	Select dd6 = new Select(driver.findElement(By.name("child_room")));
    	dd6.selectByIndex(1);
    	driver.findElement(By.name("Submit")).click();
        System.out.println("Search Hotel"); 	
        Log.info("**********logout***************");
 
    	    	
    	
    }
    public void LoginAgain() {
    	driver.findElement(By.linkText("Click here to login again")).click();
    	System.out.println("Login again");
    	Log.info("**********loginAgain***************");
    }
    public void SelectHotel() {
    	driver.findElement(By.name("radiobutton_0")).click();
    	driver.findElement(By.name("continue")).click();
    	System.out.println("Select Hotel");
    }
}
