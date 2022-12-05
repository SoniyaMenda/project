package data;

import java.util.Set;
import java.util.Iterator;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Switchto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		ChromeDriver snap = new ChromeDriver();
		snap.manage().window().maximize();
//		snap.get("http://omayo.blogspot.com/");
		
		//alert()
//		snap.findElement(By.id("alert1")).click();
//		Alert alt = snap.switchTo().alert();
//		System.out.println(alt.getText());
		
		
		//window()
//		snap.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();
// 
//		Set<String> window=snap.getWindowHandles();
//        Iterator<String> itr=window.iterator();
//        String defaultwindow=itr.next();
//        String childwindow=itr.next();
//        snap.switchTo().window(childwindow);
        
        
        //frame

snap.get("https://www.hyrtutorials.com/p/frames-practice.html");
		snap.findElement(By.xpath("//input[@id='name']")).sendKeys("data");
		Thread.sleep(3000);
		snap.switchTo().frame("frm1");
		Select courseName_dd = new Select(snap.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(1000);
		snap.switchTo().defaultContent();
		
		snap.switchTo().frame("frm2");
		snap.findElement(By.id("firstName")).sendKeys("soni");
		Thread.sleep(3000);
		snap.switchTo().defaultContent();
		snap.switchTo().frame("frm1");
		
		courseName_dd.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		snap.switchTo().defaultContent();
	snap.findElement(By.id("name")).clear();
		snap.findElement(By.id("name")).sendKeys("data2");
		Thread.sleep(2000);
		snap.close();
	}

}
