package lakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nameandpasswd {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\awde\\src\\test\\resources\\binaries\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.zamzar.com/login/");
				driver.findElement(By.name("username")).sendKeys("lakshmi1998durga@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.name("password")).sendKeys("9030476442");
				Thread.sleep(1000);
				driver.findElement(By.name("rememberme")).sendKeys("checkbox");
				Thread.sleep(1000);
			}
			

		

	}


