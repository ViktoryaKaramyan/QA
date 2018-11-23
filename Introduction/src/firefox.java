import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 create driver object for chrome browser
		  we will strictly imlement methods of webdriver
		  
		       classs name = ChromeDriver
				X driver = new X();*/
		
		//invoke .exe file first
		
		System.setProperty("webdriver.ie.driver", "/home/vika/Downloads/IEDriverServer");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());

	}

}