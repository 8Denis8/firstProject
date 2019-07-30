package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Test;

public class VerifyTextInFieldTest extends BaseTest {

    HomePage homePage;
    PromotionWalkFreePage promoPage;

    @Test
    public void verifyTextInFieldTest(){

        homePage = new HomePage(driver);

        promoPage = homePage.clikWalkFreeButon();
        promoPage.inputEmail("abc@abc.io");
        promoPage.inputPassword("ne5kaju");
        promoPage.inputFirstName("Bob");
        promoPage.inputLastName("Marley");
        promoPage.inputCellFonField("1234567890");
        promoPage.verifyEmail();
    }
}
