package com.wagwalking;

import com.wagwalking.page.HomePage;
import com.wagwalking.page.PromotionWalkFreePage;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class VerifyRequiredFieldsTest  extends BaseTest{

    private static Logger log = Logger.getLogger(VerifyRequiredFieldsTest.class.getName());

    private HomePage homePage;
    private PromotionWalkFreePage promotionPage;

    @Test
    public void testVerifyRequiredFields() {

        homePage = new HomePage(driver);
        promotionPage = homePage.clikWalkFreeButon();

        promotionPage.clickEmailField();
        promotionPage.clickPasswordField();
        promotionPage.clickFirstNameField();
        promotionPage.clickLastNameField();
        promotionPage.clickCellFonField();
        promotionPage.clickPasswordField();


        String firstNameNote = promotionPage.getRequiredFirstNameNote();
        System.out.println(firstNameNote);
        Assert.assertEquals("required", firstNameNote);

        String lastNameNote = promotionPage.getRequiredLastNameNote();
        log.info("Error Notification " + lastNameNote);
        Assert.assertEquals("required", lastNameNote);

        String cellFonNote = promotionPage.getRequiredCellFonNote();
        log.info("Error Notification " + cellFonNote);
        Assert.assertEquals("required", cellFonNote);

        String charactersNote = promotionPage.getVerifyPasswordCharactrs();
        log.info("Error Nitification " + charactersNote);
        Assert.assertTrue(charactersNote.contains("8 Characters"));
//        Assert.assertEquals("(8 Characters,", charactersNote);

        String letterNote = promotionPage.getVerifyPasswordLetter();
        System.out.println(letterNote);
        Assert.assertTrue(letterNote.contains("1 Letter"));
//        Assert.assertEquals("1 Letter,", letterNote);

        String numberNote = promotionPage.getVerifyPasswordNumber();
        System.out.println(numberNote);
        Assert.assertTrue(numberNote.contains("1 Number"));
//        Assert.assertEquals("1 Number)", numberNote);

    }
}
