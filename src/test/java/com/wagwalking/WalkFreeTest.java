package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Test;

public class WalkFreeTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promoPage;

    @Test
    public void WalkFreeTest() {

        homePage = new HomePage(driver);

        promoPage = homePage.clikWalkFreeButon();
        promoPage.inputEmail(user2.getEmail());
        promoPage.inputPassword(user2.getPassword());
        promoPage.inputFirstName(user2.getFirstName());
        promoPage.inputLastName(user2.getLastName());
        promoPage.inputCellFonField(user2.getCellFon());

    }
}
