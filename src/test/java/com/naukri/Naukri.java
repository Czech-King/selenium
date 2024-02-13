package com.naukri;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input"))
				.sendKeys("tamaraiselvant56@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input"))
				.sendKeys("Elite@2839");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[3]/div[2]/a")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"resumeHeadlineTxt\"]")).sendKeys(".");
		driver.findElement(By.xpath("/html/body/div[6]/div[7]/div[2]/form/div[3]/div/button")).click();
		// driver.findElement(By.xpath("//*[@id=\"lazyPersonalDetail\"]/div/div/div/div[2]/div/div[2]/div/a")).click();
		// driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div[1]/span[2]")).click();
		// driver.findElement(By.xpath("//*[@id=\"lazyITSkills\"]/div/div/div/div[2]/div/ul/li[2]/span[5]")).click();
		// Actions actions = new Actions(driver);
		// WebElement element =
		// driver.findElement(By.xpath("//*[@id=\"expMonthDroopeFor\"]"));
		// actions.click(element);

	}

}
