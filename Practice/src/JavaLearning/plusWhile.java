package JavaLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class plusWhile {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/vika/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://global.momondo.com/");

		driver.findElement(By.xpath("//div[contains(text(), '1 adult, Economy')]")).click();
		Thread.sleep(3000);

		int i = 0;
		while (i < 5) {
			//driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
			driver.findElements(By.xpath("//div[@class='cabinTravelerWrapper']//span[@class='icon plus']")).get(2).click();
			i++;
		}

	}

}
