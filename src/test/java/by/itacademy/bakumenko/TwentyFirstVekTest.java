package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwentyFirstVekTest {
    @Test
    public void test21VekLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        TwentyFirstVekPage twentyFirstVekPage = new TwentyFirstVekPage(driver);
        twentyFirstVekPage.clickEnterButtonCookie();
        twentyFirstVekPage.clickAccountButton();
        twentyFirstVekPage.clickEnterButton();
        twentyFirstVekPage.clickButtonModule();
        twentyFirstVekPage.getErrorMessageLogin();
        String actual = twentyFirstVekPage.getErrorMessageLogin();
        Assertions.assertEquals("Электронная почта не указана", actual);
        twentyFirstVekPage.getErrorMessagePassword();
        String actualPassword = twentyFirstVekPage.getErrorMessagePassword();
        Assertions.assertEquals("Пароль не указан", actualPassword);
        driver.close();
    }

    @Test
    public void test21VekLoginPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        TwentyFirstVekPage twentyFirstVekPage = new TwentyFirstVekPage(driver);
        twentyFirstVekPage.clickEnterButtonCookie();
        twentyFirstVekPage.clickAccountButton();
        twentyFirstVekPage.clickEnterButton();
        twentyFirstVekPage.sendKeysInputEmailXpath("test@gmail.com");
        twentyFirstVekPage.clickButtonModule();
        twentyFirstVekPage.getErrorMessagePassword();
        String actual = twentyFirstVekPage.getErrorMessagePassword();
        Assertions.assertEquals("Пароль не указан", actual);
        driver.close();
    }

    @Test
    public void test21VekLoginUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        TwentyFirstVekPage twentyFirstVekPage = new TwentyFirstVekPage(driver);
        twentyFirstVekPage.clickEnterButtonCookie();
        twentyFirstVekPage.clickAccountButton();
        twentyFirstVekPage.clickEnterButton();
        twentyFirstVekPage.sendKeysInputEmailXpath("bkmnkgmail.com");
        twentyFirstVekPage.sendKeysInputPasswordXpath("test");
        twentyFirstVekPage.clickErrorButtonEnter();
        String actual = twentyFirstVekPage.getErrorMessageLogin();
        Assertions.assertEquals(
                "Неправильный формат электронной почты", actual);
        driver.close();
    }
}
