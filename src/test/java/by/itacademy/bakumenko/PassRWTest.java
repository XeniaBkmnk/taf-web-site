package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassRWTest {
    @Test
    public void testPassRwAutorisation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRwPage passRwPage = new PassRwPage(driver);
        Thread.sleep(500);
        passRwPage.clickEnterCheckBoxWebElement();
        passRwPage.clickEnterButtonWebElement();
        passRwPage.getEnterTitleFormWebElement();
        String actual = passRwPage.getEnterTitleFormWebElement();
        Assertions.assertEquals("Авторизация", actual);
        driver.close();
    }

    @Test
    public void testPassRwLoginEmptyError() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRwPage passRwPage = new PassRwPage(driver);
        Thread.sleep(500);
        passRwPage.clickEnterCheckBoxWebElement();
        passRwPage.clickEnterButtonWebElement();
        Thread.sleep(500);
        passRwPage.clickInputEnterWebElement();
        Assertions.assertEquals(
                "Заполните поле", passRwPage.getErrorMessageLoginWebElemen()
        );
        Assertions.assertEquals(
                "Заполните поле", passRwPage.getErrorMessagePasswordWebElement()
        );
        driver.close();
    }

    @Test
    public void testPassRwEmptyLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassRwPage passRwPage = new PassRwPage(driver);
        Thread.sleep(500);
        passRwPage.clickEnterCheckBoxWebElement();
        passRwPage.clickEnterButtonWebElement();
        passRwPage.clickInputEnterWebElement();
        passRwPage.sendKeysEnterButtonPasswordWebElement("123456");
        passRwPage.getErrorMessageLoginWebElement();
        String actuaiLogin = passRwPage.getErrorMessageLoginWebElement();
        Assertions.assertEquals("Заполните поле", actuaiLogin);
        driver.close();
    }
}
