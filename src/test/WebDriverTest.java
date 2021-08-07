package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
		WebElement Username = driver.findElement(By.name("user_login"));
		
		Username.sendKeys("abc@xyz.com");
		
		WebElement password = driver.findElement(By.name("user_pwd"));
		
		password.sendKeys("123pqr");

		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		
		RememberMe.click();

		WebElement Login = driver.findElement(By.name("btn_login"));
		
		Login.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActMsg = Error.getText();
		
		String ExpMsg = "The email or password you have entered is invalid.";
		
		if(ActMsg.equals(ExpMsg)) {
			
			System.out.println("Test passed");
		}
		else {
			
			System.out.println("Test failed");
		}
		

			
		
	}

}
