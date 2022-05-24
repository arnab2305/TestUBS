package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pages {
	
	public static WebDriver driverweb=null;

	public void launch(String url)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnab.adak\\eclipse-workspace\\Test\\browser\\chromedriver.exe");  
         
         // Instantiate a ChromeDriver class.     
    WebDriver driver=new ChromeDriver();  
      driverweb=driver;
       // Launch Website  
      driverweb.get(url);  
      
     //Maximize the browser  
      driverweb.manage().window().maximize();  
	}
	
	public void Enterdata()
	{
		driverweb.findElement(By.xpath("//*[@class='btn btn-outline-primary float-right openBooking']")).click();
		driverweb.findElement(By.xpath("//*[@class='form-control room-firstname']")).sendKeys("Leanne");
		driverweb.findElement(By.xpath("//*[@class='form-control room-lastname']")).sendKeys("Graham");
		driverweb.findElement(By.xpath("//*[@class='form-control room-email']")).sendKeys("Sincere@april.biz");
		driverweb.findElement(By.xpath("//*[@class='form-control room-phone']")).sendKeys("1-770-736-8031");
		driverweb.findElement(By.xpath("//*[@class='btn btn-outline-primary float-right book-room']")).click();
	}
	

}
