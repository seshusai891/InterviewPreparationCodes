package Interview_WebTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Stp2_Country_Sorting {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\Chrome\\Chrome_Update_100.0.4896.60\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement mnth=driver.findElement(By.xpath(""));
		Select mnth_dpdn=new Select(mnth);
		List<WebElement> mnthlst = mnth_dpdn.getOptions();
		
		List opts=new ArrayList();
		
		for(WebElement optionsElements:mnthlst) {
			opts.add(optionsElements.getText());
		}
		
		List templst=new ArrayList(opts);
		Collections.sort(templst);
	}
	
	boolean ifSortedAscending = opts.equals(templst);
	
	if(ifSortedAscending) {
		System.out.println("Sorted");
	}
	else {
		System.out.println("Not sorted");
	}
	driver.quit();

}
}
