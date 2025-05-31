package com.webtest.automation.tests;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.webtest.automation.base.BaseClass;
import com.webtest.automation.pages.LoginPage;
import com.webtest.automation.reports.ExtentManager;
import com.webtest.automation.utils.ScreenshotUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    private static final Logger log = LogManager.getLogger();
    private static ExtentTest test = ExtentManager.getTest();
@Test
public void login(){
    LoginPage page = new LoginPage(driver);
    log.info("Navigating to login page");

    page.goToLogin();
    ScreenshotUtil.attachStepScreenshot(driver, "Step1_GoToLogin", "Navigated to login page");

    page.loginSuccess("Test_demo@gmail.com","Demo@123");
    ScreenshotUtil.attachStepScreenshot(driver, "Step2_LoginClicked", "Entered credentials and clicked login");

    String logintext = driver.findElement(By.xpath("//a[contains(text(),' Logged in as ')]")).getText();
    Assert.assertTrue(logintext.contains("Logged in as"),"Login failed or username not displayed");
    ScreenshotUtil.attachStepScreenshot(driver, "Step3_Validation", "Login validation passed");

}

}
