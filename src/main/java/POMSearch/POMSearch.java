
package POMSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

	public WebDriver driver = null;
	public String FN = "fname";
	public String LN = "lname";
	public String QA = "//a[@name='QA']";

	public POMSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		WebElement fn1 = null;
		fn1 = driver.findElement(By.id(FN));
		return fn1;
	}

	public WebElement getLastName() {
		WebElement ln1 = null;
		ln1 = driver.findElement(By.id(LN));
		return ln1;
	}

	public WebElement getQA() {
		WebElement qa1 = null;
		qa1 = driver.findElement(By.xpath(QA));
		return qa1;
	}

	public void SendFName(String myF) {
		try {
			getFirstName().sendKeys(myF);
			Thread.sleep(2000);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void SendLName(String myL) {
		try {
			getLastName().sendKeys(myL);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ClickQA() {
		getQA().click();
		System.out.println(" Finally CLicked -----------");
	}

}
