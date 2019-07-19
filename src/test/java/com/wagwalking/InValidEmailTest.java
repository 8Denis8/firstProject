package com.wagwalking;

import com.wagwalking.BaseTest;
import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

public class InValidEmailTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkFreePage promotionWalkFreePage;

    @Test
    public void testInValidEmail(){
        homePage = new HomePage(driver);
        promotionWalkFreePage = homePage.clikWalkFreeButon();

        promotionWalkFreePage.inputEmail("12324435");
        promotionWalkFreePage.clickPasswordField();
        String errorNote = promotionWalkFreePage.getInValidEmail();
        System.out.println(errorNote);
        Assert.assertEquals("please provide a valid email", errorNote);
        driver.quit();
    }
}
