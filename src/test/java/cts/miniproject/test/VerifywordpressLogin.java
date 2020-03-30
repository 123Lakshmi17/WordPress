package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.WordpressLoginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifywordpressLogin {
@Test
public void verifyValidLogin() {

//System.setProperty("webdriver.chrome.driver", "C:\Users\DELL\eclipse-workspace\awde\src\test\resources\binaries\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();


driver.get("http://demosite.center/wordpress/wp-login.php");
driver.manage().window().maximize();

WordpressLoginpage login=new WordpressLoginpage(driver);

login.typeUserName();
login.typePassword();
login.clickOnLoginButton();


String url=driver.getCurrentUrl();
Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);
}
}