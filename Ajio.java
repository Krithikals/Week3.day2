package week3.day2;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("searchVal")).sendKeys("Kids",Keys.ENTER);
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='Boys']/following-sibling::label")).click();
	    driver.findElement(By.xpath("//input[@id='Boys - Shorts & 3/4ths']/following-sibling::label")).click();
	    Thread.sleep(2000);
		String items = driver.findElement(By.xpath("(//div[@class='length'])[1]")).getText();
		System.out.println("The number of item present is " + items);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		long intitalHeight= (Long) js.executeScript("return document.body.scrollHeight");
		while(true)
		{
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			long currentHeight= (Long) js.executeScript("return document.body.scrollHeight");
			if(intitalHeight==currentHeight)
			{
				break;
			}
			intitalHeight= currentHeight;
		}
		
		System.out.println(" List of Brands");
		List<WebElement> dressBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + dressBrandList.size());
		
		for (WebElement webElement : dressBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the shirt and print it
		List<WebElement> shirtList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + shirtList.size());
		System.out.println(" Names of the Shirt");
		for (WebElement webElement : shirtList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		

	}
		
}

