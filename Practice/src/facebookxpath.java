import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/vika/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// //TagName[attribute=(�value�)]  syntax for xpath
		driver.get("https://facebook.com/");
//		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath");	
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//TagName[attribute=(�value�)] syntax for CSS
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css");
		driver.findElement(By.cssSelector("[value='Log In']")).click();

	}

}
