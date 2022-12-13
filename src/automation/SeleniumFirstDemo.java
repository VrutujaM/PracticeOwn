package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaTestometer\\PracticeOwn\\chromedriver.exe");
		// Define key for chrome driver "webdriver.chrome.driver"
		//RC on chrome exe file and copy path
		WebDriver driver=new ChromeDriver();
		// WebDriver is reference of webdriver and it is interface
		// ChromeDriver() object of chromedriver and it is implementing class of WebDriver
		// It will create fresh session without cookies
		
		driver.manage().window().maximize();// To maximize window
		driver.get("https://www.google.com");// To open website must provide protocol
		By searchbox=By.name("q");// By is also class 
		// Here we searching name "q"
		//right click on google searchbox and inspect
		WebElement elm=driver.findElement(searchbox);
		elm.sendKeys("Vrutuja");// Here we replaceing name "q" by "Vrutuja" sending key 
		driver.quit();// To quit/ close entire session/if not done webdriver will keep running even if we close the browser
		
		}
	
}
class EdgeDemo{
	public static void main(String[] args) {
		System.setProperty("wedriver.edge.driver", "D:\\JavaTestometer\\PracticeOwn\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		
	}
}
class FirefoxDemo{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\JavaTestometer\\PracticeOwn\\geckodriver.exe");
        WebDriver driver2=new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.google.com");
		
	}
}
