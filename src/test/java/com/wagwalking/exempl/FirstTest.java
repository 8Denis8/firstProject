package com.wagwalking.exempl;

import com.wagwalking.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst() {

        WebElement walkFreeButon = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));

        walkFreeButon.click(); // sc-ifAKCX bCMkWd

        WebElement emailField = driver.findElement(By.cssSelector("input[type=\"email\"]"));

        emailField.sendKeys(user1.getEmail()); // input[type="email"]

        WebElement passwordField = driver.findElement(By.cssSelector("input[type=\"password\"]"));

        passwordField.sendKeys(user1.getPassword()); // input[type="password"]

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNameField.sendKeys(user1.getFirstName()); // input[name="firstName"]

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNameField.sendKeys(user1.getLastName()); // input[name="lastName"]

        WebElement telefonField = driver.findElement(By.cssSelector("input[type=\"tel\"]"));

        telefonField.sendKeys(user1.getCellFon()); // input[type="tel"]

//        driver.navigate().back();

    }

}
