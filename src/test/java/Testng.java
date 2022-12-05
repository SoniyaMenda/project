import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
@Test
public void data()
{	  
	System.out.println("test");	
}
@BeforeSuite
public void test()
{
	System.out.println("BeforeSuite");
}
@BeforeTest
public void test1()
{	
	System.out.println("BeforeTest");
}
@BeforeClass
public void test2()
{
	System.out.println("BeforeClass");
}

@AfterMethod
public void test8()
{
	System.out.println("AfterMethod");
}

@AfterSuite
public void test5()
{
	System.out.println(" Aftersuite");
}
@AfterTest
public void test6()
{
	System.out.println("AfterTest");
}
@AfterClass
public void test7()
{
	System.out.println("AfterClass");
}

@BeforeMethod
public void test3()
{
System.out.println("BeforeMethod");
}

@BeforeGroups
public void test9()
{
System.out.println("BeforeGroup");
}

@AfterGroups
public void test4()
{
System.out.println("AfterGroup");
}
}
