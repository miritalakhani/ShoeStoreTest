package myClassFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Test_One {
	
	@Test
	public void verifyButton() throws InterruptedException{
		
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Nov2019\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rb-shoe-store.herokuapp.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
			
		
		driver.findElement(By.xpath("//input[@id='remind_email_input']")).sendKeys("abc.#@org.apk.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='remind_email_submit']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Problem Definition")).click();
		Thread.sleep(5000);
		
		String url=driver.getCurrentUrl();
		if(url.contains("https://rb-shoe-store.herokuapp.com/definition"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		Thread.sleep(2000);
		
		
	
        Select s=new Select(driver.findElement(By.id("brand")));
		s.selectByValue("ALDO");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='search_button']")).click();
        Thread.sleep(5000);		

           
        
		
		driver.close();
		

		
		
	}

}
