package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzTest {
    @Test
    public void testOzLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage ozPage = new OzPage(driver);
        ozPage.clickButtonEnterLoginLocatorBy();
        ozPage.clickButtonLoginOptionLocator();
        ozPage.sendKeysInputEmailLocator("test@test");
        ozPage.sendKeysInputPasswordLocator("test");
        ozPage.clickButtonSubmitLocator();
        ozPage.getErrorMessageLocator();
        String actual = ozPage.getErrorMessageLocator();
        Assertions.assertEquals("Введите корректный адрес электронной почты", actual);
        driver.close();
    }

    @Test
    public void testOzPasaword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage ozPage = new OzPage(driver);

        ozPage.clickButtonEnterLoginLocatorBy();
        ozPage.clickButtonLoginOptionLocator();
        ozPage.sendKeysInputEmailLocator("test@gmail.com");
        ozPage.sendKeysInputPasswordLocator("test");
        ozPage.clickButtonSubmitLocator();
        String actual = ozPage.getErrorMessageLocator();
        Assertions.assertEquals("Неверный пароль. Если вы потеряли или забыли пароль — восстановите его", actual);
        driver.close();
    }

    @Test
    public void testOzEntry() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage ozPage = new OzPage(driver);
        ozPage.clickButtonEnterLoginLocatorBy();
        String actual = ozPage.getEnterTitleOauthFormLocator();
        Assertions.assertEquals("Вход", actual);
        driver.close();
    }
}
