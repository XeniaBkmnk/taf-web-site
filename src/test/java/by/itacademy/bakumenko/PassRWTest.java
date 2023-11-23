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
        String enterButtonLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
        WebElement enterButtonWebElement = driver.findElement(By.xpath(enterButtonLocator));
        enterButtonWebElement.click();
        String enterTitleFormLocator = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
        WebElement enterTitleFormWebElement = driver.findElement(By.xpath(enterTitleFormLocator));
        Thread.sleep(500);
        String actual = enterTitleFormWebElement.getText();
        Assertions.assertEquals("Авторизация", actual);
        driver.close();
    }

    @Test
    public void testPassRwLoginEmptyError() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        String enterButtonLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
        WebElement enterByttonWebElement = driver.findElement(By.xpath(enterButtonLocator));
        enterByttonWebElement.click();
        String inputEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
        By inputEnterBy = By.xpath(inputEnter);
        WebElement inputEnterWebElement = driver.findElement(inputEnterBy);
        inputEnterWebElement.click();
        String errorMessageLoginLocator = "//*[@id=\"login-error\"]";
        By errorMessageLoginBy = By.xpath(errorMessageLoginLocator);
        Thread.sleep(500);
        WebElement errorMessageLoginWebElement = driver.findElement(errorMessageLoginBy);
        String actuaiLogin = errorMessageLoginWebElement.getText();
        Assertions.assertEquals("Заполните поле", actuaiLogin);
        String errorMessageLoginPassword = "//*[@id=\"password-error\"]";
        By errorMessagePasswordBy = By.xpath(errorMessageLoginPassword);
        Thread.sleep(500);
        WebElement errorMessagePasswordWebElement = driver.findElement(errorMessagePasswordBy);
        String actualPassword = errorMessagePasswordWebElement.getText();
        Assertions.assertEquals("Заполните поле", actualPassword);
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
