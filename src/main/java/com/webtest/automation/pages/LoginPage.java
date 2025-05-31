package com.webtest.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By loginlink = By.xpath("//a[text()=' Signup / Login']");
    private By usernameInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[text()='Login']");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void goToLogin(){
        driver.findElement(loginlink).click();
    }

    public void loginSuccess(String email, String password){
    driver.findElement(usernameInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
