package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumWebDriverScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\2019\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		String url = "http://softwaretestingmaterial.com";
		String expectedTitle = "Software Testing Material - A site for Software Testers";
		String actualTitle = null;
		driver.get(url);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Expected Value is "+expectedTitle);
			System.out.println("Actual Value is "+actualTitle);
			System.out.println("Test Passed");
		} else {
			System.out.println("Expected Value is "+expectedTitle);
			System.out.println("Actual Value is "+actualTitle);
			System.out.println("Test Failed");
		}
		driver.close();

	}
}