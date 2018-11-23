import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/vika/Downloads/geckodriver-v0.23.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hey");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hello");
		driver.findElement(By.cssSelector("#Login")).click();
		
	/*  1.Verify in firebug before you run the script
		2. css customised xpath
		3. #idname
		   .classname
		4. find the unique attribute   */
				
						
				/*css =[class='identitiy first']
								 // xpath=*[@class='identity first']*/

	}

}
