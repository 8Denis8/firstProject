package com.wagwalking;

import com.wagwalking.user.User;
import com.wagwalking.user.User2;
import com.wagwalking.user.User3;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected WebDriver driver;

    protected User user1;

    protected User2 user2;

    protected User3 user3;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/deniskim/Downloads/chromedriver");// для тестирования в хроме

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        System.out.println("START");

        String actualeTitle = driver.getTitle();

        System.out.println(actualeTitle);

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(expectedTitle, actualeTitle);

        user1 = new User("alex@gmail.com", "1q2w3e4r", "Vanya", "Barankin", "1234567890");

        user2 = new User2("dkim+1@testpro.io", "1q2w3e4r", "Vanya", "Fotofackoff", "0987654321");

        user3 = new User3("alex@gmail.com", "1a2s3d4f", "Larisa", "Ivanova", "1231231231", "8500 Beverly Blvd", "N/A", "Los Angeles", "CA", "90048");
    }

    @After
    public void quit() {

        System.out.println("FINISH");

        //driver.quit();

    }

//    i added some new code
}
