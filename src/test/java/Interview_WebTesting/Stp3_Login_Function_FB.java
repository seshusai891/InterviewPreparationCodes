package Interview_WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stp3_Login_Function_FB {
	
public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\Chrome\\Chrome_Update_100.0.4896.60\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement loc = driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]"));
		
		for(int i=0;i<1;i++) {
			if(loc.isDisplayed()) {
				loc.click();
				driver.navigate().back();
				driver.findElement(By.id("email")).sendKeys("seshu");
				driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("seshu123");
			}
			
		}
	}

}
