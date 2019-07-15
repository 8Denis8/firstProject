package com.wagwalking.exempl;

import com.wagwalking.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondTest extends BaseTest {

    @Test
    public void SecondTest() {

        WebElement walkFreeButon = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));

        walkFreeButon.click(); // sc-ifAKCX bCMkWd

        List<WebElement> fieldsCollection = driver.findElements(By.cssSelector("input"));

        /**
         * [0] - email
         * [1] - password
         * [2] - firstName
         * [3] - lastName
         * [4] - cell fon
         **/

        fieldsCollection.get(0).sendKeys(user2.getEmail());
        fieldsCollection.get(1).sendKeys(user2.getPassword());
        fieldsCollection.get(2).sendKeys(user2.getFirstName());
        fieldsCollection.get(3).sendKeys(user2.getLastName());
        fieldsCollection.get(4).sendKeys(user2.getCellFon());

//        driver.navigate().back();
    }
}
