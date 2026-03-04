package org.demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SimpleTest {

    @Test
    public void openHomePageTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://nop-qa.portnov.com");

        String title = driver.getTitle();
        assertTrue(title.contains("store"));

        driver.quit();
    }
}
