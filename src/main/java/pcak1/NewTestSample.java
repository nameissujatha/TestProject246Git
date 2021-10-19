package pcak1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestSample {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sujathalakhmi\\Desktop\\driverstest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com");
  }
}
