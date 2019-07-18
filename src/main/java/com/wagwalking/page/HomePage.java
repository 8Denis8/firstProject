package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    WebElement walkFreeButon;

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    WebElement becomeWalkerButon;

    public PromotionWalkFreePage clikWalkFreeButon() {
        walkFreeButon.click();

        return new PromotionWalkFreePage(driver);
    }

    public BecomeWalkerPage clikBekomeWalkerButon() {
        becomeWalkerButon.click();

        return new BecomeWalkerPage(driver);
    }
}
