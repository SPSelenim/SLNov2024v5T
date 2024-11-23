package co.stc.SLNov2024v5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POMSearch.POMSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	WebDriver driver = null;

	@BeforeClass
	public void tearUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");

	}

	@Test
	public void f() {
		System.out.println("Started --------");
		try {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			POMSearch ss = new POMSearch(driver);
			ss.SendFName("SATISH");
			ss.SendLName("SATISH2");
			ss.ClickQA();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
