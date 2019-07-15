package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionWalkFreePage extends BasePage {

    public PromotionWalkFreePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"email\"]")
    WebElement emailField;

    @FindBy(css = "input[type=\"password\"]")
    WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    WebElement lastNameField;

    @FindBy(css = "input[type=\"tel\"]")
    WebElement cellFonField;

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
}
