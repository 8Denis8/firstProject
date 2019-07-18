package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BecomeWalkerPage extends BasePage {

    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button-text")
    private WebElement apllyNow;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMessage;

    @FindBy(css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "input[id=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "input[id=\"address__line-one\"]")
    private WebElement addressField;

    @FindBy(css = "input[id=\"address_line_2\"]")
    private WebElement aptField;

    @FindBy(css = "input[id=\"city\"]")
    private WebElement cityField;

    @FindBy(css = ".btn.common-dropdown.common-dropdown-item")
    private WebElement state;

    @FindBy(css = ".become-walker-application")
    private WebElement zero;

    @FindBy(css = ".common-dropdown-option.common-dropdown-item")
    private List<WebElement> dropDownList;

    @FindBy(css = "input[id=\"zipcode\"]")
    private WebElement zipcodeField;

    @FindBy(css = ".symbol.fail")
    private WebElement fail;

//    symbol in-progress
//    symbol success
//    input#first_name.form-utils-input
//1: input#last_name.form-utils-input
//2: input#email.form-utils-input
//3: input#phone.form-utils-input
//4: input#address__line-one.form-utils-input
//5: input#address_line_2.form-utils-input
//6: input#city.form-utils-input
//7: input#zipcode.form-utils-input

    public void clikApplyNowButton() {
        apllyNow.click();
    }

    public String getFailSimbol() {
        return fail.getText();
    }

    public String getFirstNameErrorMessage() {
        return errorMessage.get(0).getText();
    }

    public String getLastNameErrorMessage() {
        return errorMessage.get(1).getText();
    }

    public String getEmailErrorMaessage() {
        return errorMessage.get(2).getText();
    }

    public String getPhoneErrorMessage() {
        return errorMessage.get(3).getText();
    }

    public void clickFirstNameField() {
        firstNameField.click();
    }

    public void inputFirstNameApply(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastNameApply(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputEmailApply(String email) {
        emailField.sendKeys(email);
    }

    public void inputPhoneApply(String phone) {
        phoneField.sendKeys(phone);
    }

    public void inputAddressApply(String address) {
        addressField.sendKeys(address);
    }

    public void inputAptApply(String apt) {
        aptField.sendKeys(apt);
    }

    public void inputCityApply(String city) {
        cityField.sendKeys(city);
    }

    public void clickStateField() {
        state.click();
    }

    public void clickZero() {
        zero.click();
    }

    public String getCalifornia() {
        return dropDownList.get(4).getText();
    }

    public void clickState() {
        dropDownList.get(4).click();
    }

    public void inputZipcodeApply(String zipcode) {
        zipcodeField.sendKeys(zipcode);
    }
}
