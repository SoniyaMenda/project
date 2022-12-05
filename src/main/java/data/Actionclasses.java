package data;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclasses
{	
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	ChromeDriver methods = new ChromeDriver();
	  methods.get("http://mrbool.com/");
Actions act=new Actions(methods);
act.moveToElement(methods.findElement(By.className("menulink"))).build().perform();
methods.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(),'Articles')]")).click();

}
}
