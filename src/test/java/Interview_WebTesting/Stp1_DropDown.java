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
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\Chrome\\Chrome_Update_100.0.4896.60\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class=\"_6ltg\"][2]/a")).click();
		
//		WebElement mnth_dropdown = driver.findElement(By.id("month"));
//		Select mnth_dd=new Select(mnth_dropdown);
//		List<WebElement> mnth_list=mnth_dd.getOptions();
//		
//		int total_mnths=mnth_list.size();
//		
//		System.out.println(total_mnths);
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		List<WebElement> mnth_list=dropdown.getOptions();
		System.out.println("Size of month list "+mnth_list.size());
		System.out.println("Month Names are ");
		for(WebElement ele:mnth_list) {
			System.out.println(ele.getText());
			
//		Checkbox	
			WebElement chkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		    
		    if(chkbox.isSelected()) {
		        
		        System.out.println("Checkbox is ON");
		    }else {
		        
		        
		        System.out.println("Checkbox is Off");
		    }
		    
		    WebElement txtbx = driver.findElement(By.id("txtbox"));
		    txtbx.sendKeys("seshu");
		    
		    WebElement txtbx1=driver.findElement(By.id("txtbox"));
		    js.executeScript("argument[0],value='seshu'",txtbx1);
		}
	}
}
