package Interview_WebTesting;
//Chrome Driver update is mandatory
//pom.xml file selenium-java package is mandatory
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Stp1_DropDown {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mallamuruvs\\selenium_browsers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
		
//		WebElement mnth_dropdown = driver.findElement(By.id("month"));
//		Select mnth_dd=new Select(mnth_dropdown);
//		List<WebElement> mnth_list=mnth_dd.getOptions();
//		
//		int total_mnths=mnth_list.size();
//		
//		System.out.println(total_mnths);
		System.out.println("Click on Create Sign up option");
		driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
		List<WebElement> accList=driver.findElements(By.xpath("//ul[@aria-label='Create account']/li")); 
//		Select dropdown=new Select(driver.findElements(By.xpath("//ul[@aria-label='Create account']/li")));
//		List<WebElement> createAccOptions=accList.getOptions();//personal,child, Business
		System.out.println("Type of gmail Accounts Size list "+accList.size());
		System.out.println("Gmail Account opening option types ");
		for(WebElement ele:accList) {
			System.out.println(ele.getText());
			
//		Checkbox	
//			WebElement chkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
//		    
//		    if(chkbox.isSelected()) {
//		        
//		        System.out.println("Checkbox is ON");
//		    }else {
//		        
//		        
//		        System.out.println("Checkbox is Off");
//		    }
//		    
//		    WebElement txtbx = driver.findElement(By.id("txtbox"));
//		    txtbx.sendKeys("seshu");
//		    
//		    WebElement txtbx1=driver.findElement(By.id("txtbox"));
//		    txtbx1.sendKeys("seshu");
//		    js.executeScript("argument[0],value='seshu'",txtbx1);
		}
	}
}
