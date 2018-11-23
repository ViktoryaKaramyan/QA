import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 create driver object for chrome browser
		  we will strictly imlement methods of webdriver
		  
		       classs name = ChromeDriver
				X driver = new X();*/
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "/home/vika/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");//hit url on browser
		System.out.println(driver.getTitle());//Validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl());//validate if you are landed on current url
		
		//System.out.println(driver.getPageSource());//print page source 
		
		driver.get("https://www.yahoo.com/");
		//driver.navigate().to("https://www.yahoo.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		driver.close();//closes current browser
		//driver.quit();//closes all the browsers opened by selenium script

	}

}
