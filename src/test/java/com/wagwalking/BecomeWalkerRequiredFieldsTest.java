package com.wagwalking;

import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class BecomeWalkerRequiredFieldsTest extends BaseTest{

    private HomePage homePage;
    private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void testBecomeWalkerRequiredField() throws InterruptedException {

        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clikBekomeWalkerButon();

        becomeWalkerPage.clikApplyNowButton();
        Thread.sleep(1000);

        String firstNameError = becomeWalkerPage.getFirstNameErrorMessage();
        System.out.println(firstNameError);
        Assert.assertEquals("First name cannot be blank", firstNameError);

        String lastNameError = becomeWalkerPage.getLastNameErrorMessage();
        System.out.println(lastNameError);
        Assert.assertEquals("Last name cannot be blank", lastNameError);

        String emailError = becomeWalkerPage.getEmailErrorMaessage();
        System.out.println(emailError);
        Assert.assertEquals("Enter a valid email address", emailError);

        String phoneError = becomeWalkerPage.getPhoneErrorMessage();
        System.out.println(phoneError);
        Assert.assertEquals("Enter a valid phone number", phoneError);

    }
}
