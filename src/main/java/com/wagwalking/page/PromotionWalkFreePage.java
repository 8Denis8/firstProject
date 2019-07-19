package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PromotionWalkFreePage extends BasePage {

    public PromotionWalkFreePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[type=\"tel\"]")
    private WebElement cellFonField;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> requiredFields;

    @FindBy(css = "div[class$=\"kOShw\"]")
    private WebElement inValidEmailNote;

    /**
     [0]-email required
     [1]-firstName required
     [2]-lastName required
     [3]-cellFon required
     **/

    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement> verifyPassword;

    /**
    [0]-(8 Characters,
    [1]-1 Letter,
    [2]-1 Number)
     **/

    @FindBy(css = ".sc-gzVnrw.jvIbBW")
    private WebElement next;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement existingEmail;

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputCellFonField(String cellFon) {
        cellFonField.sendKeys(cellFon);
    }

    public void clickEmailField() {
        emailField.click();
    }

    public void clickPasswordField() {
        passwordField.click();
    }

    public void clickFirstNameField() {
        firstNameField.click();
    }

    public void clickLastNameField() {
        lastNameField.click();
    }

    public void clickCellFonField() {
        cellFonField.click();
    }

    public String getRequiredEmailNote() {
        return  requiredFields.get(0).getText();
    }

    public String getRequiredFirstNameNote() {
        return requiredFields.get(1).getText();
    }

    public String getRequiredLastNameNote() {
        return requiredFields.get(2).getText();
    }

    public String getRequiredCellFonNote() {
        return requiredFields.get(3).getText();
    }

    public String getVerifyPasswordCharactrs() {
        return verifyPassword.get(0).getText();
    }

    public String getVerifyPasswordLetter() {
        return verifyPassword.get(1).getText();
    }

    public String getVerifyPasswordNumber() {
        return verifyPassword.get(2).getText();
    }

    public void clickButtonNext() {
        next.click();
    }

    public String getExistingEmail() {
        return existingEmail.getText();
    }

    public String getInValidEmail(){
        return inValidEmailNote.getText();
    }
}
