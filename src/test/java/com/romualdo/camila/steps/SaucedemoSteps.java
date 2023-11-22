package com.romualdo.camila.steps;

import com.romualdo.camila.poms.SaucedemoPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SaucedemoSteps {
    private WebDriver driver;
    private SaucedemoPage saucedemoPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    public void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Open the Chrome and visit Saucedemo")
    public void openBrowserAndGoToSaucedemo() {
        driver.get("https://www.saucedemo.com/");
        sleep();
        saucedemoPage = new SaucedemoPage(driver);
        System.out.println("This step open the Chrome and visit Saucedemo site.");
    }

    @Given("I insert a valid username")
    public void iInsertUsername() {
        saucedemoPage.enterUsername("standard_user");
        sleep();
        System.out.println("This step I insert a valid username on field.");
    }

    @Given("I insert a valid password")
    public void iInsertPassword() {
        saucedemoPage.enterPassword("secret_sauce");
        sleep();
        System.out.println("This step I insert a valid password on field.");
    }

    @When("I click on the Login button")
    public void iClickOnButton() {
        saucedemoPage.clickLogin();
        sleep();
        System.out.println("This step I click on the Login button.");
    }

    @When("I click on the menu button")
    public void iClickOnMenuButton() {
        saucedemoPage.clickMenu();
        sleep();
        System.out.println("This step I click on the menu button.");
    }

    @Then("I should be able to login successfully")
    public void iLoginSuccessful() {
        Assert.assertEquals(saucedemoPage.clickLogout(), true);
        sleep();
        System.out.println("This step I should be able to login successfully.");
    }

    @After
    public void quite() {
        if (driver != null) {
            driver.quit();
        }
    }
}
