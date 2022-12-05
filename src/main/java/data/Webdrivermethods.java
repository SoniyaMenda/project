package data;
  import java.awt.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 class Webdrivermethods {
	public static void main(String[] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		ChromeDriver methods = new ChromeDriver();
		methods.get(" https://www.hyrtutorials.com/search/label/TechNews");
		Thread.sleep(1000);
		
		//navigate()
		
		methods.navigate().refresh();	
   	methods.navigate().to("https://mapi.miraclesoft.com/mail#1");
		Thread.sleep(2000);
   	methods.navigate().back();
		
		 //findElements
//		methods.get("url");
//   		methods.findElement(By.name("username")).sendKeys("smenda1");
//   		methods.findElement(By.name("password")).sendKeys("S1ni@#34");
//        methods.findElement(By.name("login")).click();
        
        //getwindowhandle()
//  methods.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//	Thread.sleep(5000);
//  String parent=methods.getWindowHandle();
//	System.out.println(parent);
//	Thread.sleep(1000);
//	//single window
//	methods.findElement(By.id("newWindowBtn")).click();
//	Thread.sleep(5000);
//	//single tab
//	methods.findElement(By.id("newTabBtn")).click();
//	Thread.sleep(1000);
//	
//	methods.close();
//    
	//multiple windows
//	methods.findElement(By.id("newWindowsBtn")).click();
//  Set<String> window=methods.getWindowHandles();
//	for(String handle:window)
//	{
//		System.out.println(handle);
//	}
////	getTittle
//	System.out.println(methods.getTitle());
////	getcurrentURL
//	System.out.println(methods.getCurrentUrl());
//    
//    methods.quit();

 	}}

















