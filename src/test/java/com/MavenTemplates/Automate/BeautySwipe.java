package com.MavenTemplates.Automate;

import org.testng.annotations.Test;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BeautySwipe {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://campaign.odicci.com/#/404f478e4cefda5ba4a6");
		driver.findElement(By.id("301")).click();
		driver.findElement(By.id("301")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1083")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[10]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[14]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[22]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[36]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[58]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[90]/div[2]/div[2]/button[2]")).click();
		
		driver.quit();
		
		
		
		
	}
}
