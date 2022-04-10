package com.java.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.java.helper.helperClass;
import com.java.pageDefinationModel.OpenCart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;


public class stepDefination extends OpenCart {

	WebDriver driver = null; 
	helperClass helperObj = null;

	@Given("^Navigate to the Homepage URL$")
	public void navigate_to_the_Homepage_URL() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().driverVersion("100.0.4896.75").setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helperObj = new helperClass(driver);
	}

	@When("^User enters the credentials and login to the application\"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_the_credentials_and_login_to_the_application(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(accountTab).click();
		driver.findElement(loginTab).click();
		Assert.assertEquals(driver.findElement(pageHeading).getText(), "Your Store");

		driver.findElement(userName).sendKeys(arg1);
		driver.findElement(password).sendKeys(arg2);
		driver.findElement(loginButton).click();
		Assert.assertEquals(driver.findElement(loginAssertString).getText(), "My Account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//throw new PendingException();
	}

	@And("^User enters the string to \"([^\"]*)\"$")
	public void user_enters_the_string_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(searchBar).clear();
		driver.findElement(searchBar).sendKeys(arg1);
		driver.findElement(searchButton).click();
		// Assert.assertEquals(driver.findElement(pageObj.searchAssertString).getText(),
		// "Products meeting the search criteria");

		String asserStr = driver.findElement(searchAssertString).getText();

		if (asserStr.equalsIgnoreCase("Products meeting the search criteria")) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Failed");
			try {
				helperClass.takeScreenShot("Failed");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Test Case Failed to generate Screenshoot!");
			}
		}

		//throw new PendingException();
	}

	@And("^User opens the product and add the same to cart$")
	public void user_opens_the_product_and_add_the_same_to_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(firstProduct).click();
		WebDriverWait wait = new WebDriverWait(driver, '5');
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
		Thread.sleep(10000);
		String asserStr = driver.findElement(addToCartButton).getText();
		System.out.println(asserStr);
		if (asserStr.equalsIgnoreCase("Add to Cart")) {
			System.out.println("Test Case Pass");
			helperClass.takeScreenShot("Pass");
		} else {
			System.out.println("Test Case Failed");
			helperClass.takeScreenShot("Failed");
		}

		//throw new PendingException();
	}

	@Then("^User Logout$")
	public void user_Logout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(accountTab2).click();
		driver.findElement(logout).click();
		Assert.assertEquals(driver.findElement(pageHeading).getText(), "Your Store");
		driver.quit();
		//throw new PendingException();
	}

}
