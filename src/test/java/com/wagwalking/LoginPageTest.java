package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testLoginPage(){

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.clickLoginButon();
        loginPage.inputEmail("qweewr.qwe");
        loginPage.inputPassword("123qwe");
        loginPage.clickLoginButon();
        String invalidEmailMessage = loginPage.getInvalidEmailMessage();
        System.out.println(invalidEmailMessage);
        Assert.assertEquals("Invalid email address", invalidEmailMessage);

        driver.navigate().refresh();

        loginPage.inputEmail("alex@gmail.com");
        loginPage.inputPassword("qwe");
        loginPage.clickLoginButon();
        String invalidCredentials = loginPage.getInvalidCredentials();
        System.out.println(invalidCredentials);
        Assert.assertEquals("Invalid credentials", invalidCredentials);

        driver.quit();
    }
}
