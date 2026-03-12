package Test1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.EALoingpage;

public class ToVerifyEALoginPage {

	WebDriver driver;
	// EALoingpage lp;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://35.169.238.58/LPDD/EA/");

	}

	@Test(priority = 1)

	void loginTest() {
		EALoingpage lp = PageFactory.initElements(driver, EALoingpage.class);
		lp.verifyLogin();
	}

	@Test(priority = 2)
	void verifyValidandInvalidLinks() {
		EALoingpage lp = PageFactory.initElements(driver, EALoingpage.class);
		lp.verifyLinks();
		String titile = driver.getTitle();
		System.out.println(titile);
	}

	@AfterClass
	void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
