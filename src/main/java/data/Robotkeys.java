package data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotkeys
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	ChromeDriver cd=new ChromeDriver();
	 cd.get("http://omayo.blogspot.com/");
//	 cd.findElement(By.xpath("//h1[normalize-space()='omayo (QAFox.com)']")).sendKeys("blogs",Keys.ENTER);
	 Actions act=new Actions(cd);
	 
////	 cd.findElement(By.className("title")).sendKeys("srikakulam");
////	 act.sendKeys(Keys.TAB)
////	 .sendKeys("drivers in selenium")
////	 .sendKeys(Keys.TAB)
////	 .sendKeys("sony")
////	 .build().perform();
act.sendKeys(Keys.ENTER).build().perform();
 String text=cd.findElement(By.id("result")).getText();
System.out.println(text);
////	 Assert.assertEquals(text,"you have ENTER");
//}
}
}