package com.wagwalking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    WebElement walkFreeButon;

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    WebElement becomeWalkerButon;

    @FindBy(css = ".sc-ifAKCX.fHUled")
    public List<WebElement> loginBiton;



    public PromotionWalkFreePage clikWalkFreeButon() {
        walkFreeButon.click();

        return new PromotionWalkFreePage(driver);
    }

    public BecomeWalkerPage clikBekomeWalkerButon() {
        becomeWalkerButon.click();

        return new BecomeWalkerPage(driver);
    }

    public void clickLoginButon(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBiton.get(3)));
        loginBiton.get(3).click();
    }
}
