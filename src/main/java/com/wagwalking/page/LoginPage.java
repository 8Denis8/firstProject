package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"email\"]")
    public WebElement emailField;

    @FindBy(css = "input[name=\"password\"]")
    public WebElement passwordField;

    @FindBy(css = ".btn.btn-secondary.btn-block")
    public WebElement loginButon;

    @FindBy(css = ".invalid-feedback.d-block")
    public WebElement invalidEmailMessage;

    @FindBy(css = ".LoginForm_alert__14-Lm.bootstrap_alert__3S0Lp.bootstrap_alert-warning__3q-tY")
    public WebElement invalidCredentials;

    public void inputEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }

    public void clickLoginButon(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButon));
        loginButon.click();
    }

    public String getInvalidEmailMessage(){
        wait.until(ExpectedConditions.visibilityOfAllElements(invalidEmailMessage));
        return invalidEmailMessage.getText();
    }

    public String getInvalidCredentials(){
        wait.until(ExpectedConditions.visibilityOfAllElements(invalidCredentials));
        return invalidCredentials.getText();
    }

//    @FindBy(css = ".sc-ifAKCX.fHUled")
//    public List<WebElement> loginBiton;
//
//    public void clickLoginButon(){
//        wait.until(ExpectedConditions.elementToBeClickable(loginBiton.get(3)));
//        loginBiton.get(3).click();
//    }
}
