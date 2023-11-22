package com.romualdo.camila.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaucedemoPage {
    private WebDriver driver;

    private By usernameInputLocator = By.xpath("//input[@id='user-name']");
    private By passwordInputLocator = By.xpath("//input[@id='password']");
    private By loginButtonLocator = By.xpath("//input[@id='login-button']");
    private By menuButtonLocator = By.xpath("(//button[normalize-space()='Open Menu'])[1]");
    private By logoutButtonLocator = By.xpath("//a[@id='logout_sidebar_link']");

    public SaucedemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement usernameInputField = driver.findElement(usernameInputLocator);
        usernameInputField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordInputField = driver.findElement(passwordInputLocator);
        passwordInputField.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void clickMenu() {
        WebElement menuButton = driver.findElement(menuButtonLocator);
        menuButton.click();
    }

    public boolean clickLogout() {
        return driver.findElement(logoutButtonLocator).isDisplayed();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
