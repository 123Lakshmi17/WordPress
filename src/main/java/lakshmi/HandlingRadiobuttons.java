package lakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\awde\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		WebElement radio=driver.findElement(By.xpath("//tr[24]//td[3]//input[2]"));
		radio.click();
		System.out.println(radio.isDisplayed());
		Thread.sleep(1000);
		System.out.println(radio.isSelected());
		Thread.sleep(1000);
		System.out.println(radio.isEnabled());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[24]//td[3]//input[1]")).click();
		Thread.sleep(1000);
		System.out.println(radio.isSelected());

	}

}
