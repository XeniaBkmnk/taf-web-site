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
        String enterButtonLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
        WebElement enterByttonWebElement = driver.findElement(By.xpath(enterButtonLocator));
        enterByttonWebElement.click();
        String inputEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
        WebElement inputEnterWebElement = driver.findElement(By.xpath(inputEnter));
        inputEnterWebElement.click();
        String enterButtonPasswordLocator = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
        WebElement enterButtonPasswordWebElement = driver.findElement(By.xpath(enterButtonPasswordLocator));
        enterButtonPasswordWebElement.sendKeys("123456");
        String errorMessageLoginLocator = "//*[@id=\"login-error\"]";
        Thread.sleep(500);
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(errorMessageLoginLocator));
        String actuaiLogin = errorMessageLoginWebElement.getText();
        Assertions.assertEquals("Заполните поле", actuaiLogin);
        driver.close();
    }
}
