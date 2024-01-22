package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;


@Test
public class testNG8 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEvn()  {
		System.setProperty("webdriver.chrome.driver","D:\\Training Materials\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	}
    @DataProvider
    public Object[][] dataSet() throws Exception {
    	
    	//specify the location of propertie file
    	File src3 = new File("C:\\Users\\INVENT\\eclipse-workspace\\Testing\\Repository");
		
    	//creat FileInputStream class object load the file
    	FileInputStream fis3 = new FileInputStream(src3);
    	
    	
    	//create propertie class object to read propertie file
    	Properties pro3 = new Properties();
    	pro3.load(fis3);
    	
    	Object arr[][] = new Object[3][2];
    	arr[0][0] = pro3.getProperty("testData1");
    	arr[0][1] = pro3.getProperty("testData2");
    	
    	arr[1][0] = "TestData2";
    	arr[1][1] = "TestData3";
    	
    	arr[2][0] = "TestData2";
       	arr[2][1] = "TestData3";
    		
    	return arr;
    	
    	public void enterData(String userName, String password) throws Exception {
    	Thread.sleep(2000);
    	driver.findElement(By.id("email")).clear();
    	Thread.sleep(2000);
    	driver.findElement(By.id("pass")).clear();
    	Thread.sleep(2000);
    	driver.findElement(By.id("email")).sendKeys(userName);
        Thread.sleep(2000);
    	driver.findElement(By.id("pass")).sendKeys(password);
    	Thread.sleep(2000);
    }
	
	   
}
