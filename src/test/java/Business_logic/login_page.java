package Business_logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import page_object.locators;

public class login_page 
{
	static WebDriver driver;
	public static void valid_login()
	{
		driver.findElement(By.xpath(locators.login)).click();
	}
}
