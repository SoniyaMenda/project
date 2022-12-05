import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice {
	  public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
WebDriver rika=new ChromeDriver();
rika.get("https://www.saucedemo.com/");
rika.manage().window().maximize();
Thread.sleep(2000);
rika.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
rika.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
Thread.sleep(2000);
rika.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(2000);
	Select option=new Select(rika.findElement(By.className("product_sort_container")));
	String defaultOption=option.getFirstSelectedOption().getText();
	System.out.println("the default option is:"+defaultOption);
	
 java.util.List<WebElement> dropdown=option.getOptions();	
	for(WebElement ds:dropdown)
{
	System.out.println(ds.getText());
}
//	option.deselectByVisibleText("price (low to high)");
	rika.close();
	  }
}
