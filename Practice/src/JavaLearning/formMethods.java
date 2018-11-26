package JavaLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/vika/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Before clicking on multy city radio button");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).click();
		System.out.println("After clicking on multy city button");
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"fd-wrap\"]/div[2]")).getText());
		//If you want to validate the object which is present in web page or code base
	
		driver.findElement(By.xpath("//*[@id=\"hp-widget__depart\"]")).click();
		
		Thread.sleep(2000);
	  
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__paxCounter_pot\"]")).click();
		
		int i=0;
		while(i<5) {
			driver.findElement(By.xpath("//*[@id=\"js-adult_counter\"]/li[2]")).click();
			i++;
		}
		
		int count = driver.findElements(By.xpath("//*[@id=\"multicity\"]/label")).size();
		if (count == 0) {
			System.out.println("verified");
		}
	}
}

