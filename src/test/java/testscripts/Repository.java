package testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mavem.jenkins.job.Login;

public class Repository {

	public WebDriver driver;

	public void LaunchStart()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://srssprojects.in/home.aspx");
	}
	public void LoginStart()
	{
		Login.username(driver).sendKeys("Admin");
		Login.password(driver).sendKeys("Admin");
		Login.loginbutton(driver).click();
	}
}
