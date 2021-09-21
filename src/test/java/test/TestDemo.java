package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestDemo {
    public String baseUrl = "https://demoqa.com/automation-practice-form";
    public WebDriver driver;

    // Test Case: Verify the form can be submitted successfully
    @Test
    public void test() {
        driver.get(baseUrl);


    }

    @Before
    public void initTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Beginning test");
    }

    @After
    public void cleanUp() {
//        driver.quit();
        System.out.println("Test concluded");
    }

    public void hold(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ignored) {

        }

    }
}
