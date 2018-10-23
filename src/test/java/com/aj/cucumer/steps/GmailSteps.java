package com.aj.cucumer.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSteps {

  WebDriver dr;

  @Given("^navigate to Gmail page$")
  public void navigateToGmailPage() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
    dr = new FirefoxDriver();
    dr.get("http://www.gmail.com");
  }

  @When("^user logged in using username as user and password as pass$")
  public void userLoggedInUsingUsernameAsUserAndPasswordAsPass() throws Throwable {
    dr.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("username");
    dr.findElement(By.xpath("//*[@id='identifierNext']")).click();
    dr.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
    dr.findElement(By.xpath("//*[@id='passwordNext']")).click();
    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @Then("^home page should be displayed$")
  public void homePageShouldBeDisplayed() throws Throwable {
    String expectedText = "Gmail";
    String actualText = dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
    Assert.assertTrue("Login not successful", expectedText.equals(actualText));
  }
}
