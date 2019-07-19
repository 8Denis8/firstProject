package com.wagwalking;

import com.wagwalking.page.BecomeWalkerPage;
import com.wagwalking.page.HomePage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ApplyCustomerTest extends BaseTest {

    private HomePage homePage;
    private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void testApplyCustomer(){
        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clikBekomeWalkerButon();

        becomeWalkerPage.clickFirstNameField();
        becomeWalkerPage.inputFirstNameApply(user3.getFirstName());
        becomeWalkerPage.inputLastNameApply(user3.getLastName());
        becomeWalkerPage.inputEmailApply(user3.getEmail());
        becomeWalkerPage.inputPhoneApply(user3.getCellFon());
        becomeWalkerPage.inputAddressApply("8500");

        Random random = new Random();
        int randomNumber = random.nextInt(5);
        becomeWalkerPage.selectAddress(randomNumber);

//        becomeWalkerPage.inputAddressApply(user3.getAddress());     /** becomeWalkerPage.selectAddress(0);*/
        becomeWalkerPage.inputAptApply(user3.getApt());
//        becomeWalkerPage.inputCityApply(user3.getCiti());
//        becomeWalkerPage.clickZero();
//        Thread.sleep(1000);
//        becomeWalkerPage.clickFirstNameField();
//        becomeWalkerPage.clickStateField();

//        String california = becomeWalkerPage.getCalifornia();
//        System.out.println(california);
//        Assert.assertEquals("California", california);
//        becomeWalkerPage.clickState();
//        becomeWalkerPage.inputZipcodeApply(user3.getZipcode());

    }
}
