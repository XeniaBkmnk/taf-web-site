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
        TwentyFirstVekPage twentyFirstVekPage = new TwentyFirstVekPage();
        WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(twentyFirstVekPage.enterButtonCookie));
        enterButtonCookieWebElement.click();
        WebElement accountButtonWebElement = driver.findElement(By.xpath(twentyFirstVekPage.accountButton));
        accountButtonWebElement.click();
        WebElement enterButtonWebElement = driver.findElement(By.xpath(twentyFirstVekPage.enterButton));
        enterButtonWebElement.click();
        Thread.sleep(2000);
        WebElement buttonModuleWebElement = driver.findElement(By.xpath(twentyFirstVekPage.buttonModule));
        buttonModuleWebElement.click();
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(twentyFirstVekPage.errorMessageLogin));
        Assertions.assertEquals("Электронная почта не указана", errorMessageLoginWebElement.getText());
        WebElement errorMessagePasswordWebElement = driver.findElement(By.xpath(twentyFirstVekPage.errorMessagePassword));
        Assertions.assertEquals("Пароль не указан", errorMessagePasswordWebElement.getText());
        driver.close();
    }

    @Test
    public void test21VekLoginPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        TwentyFirstVekPage twentyFirstVekPage = new TwentyFirstVekPage();
        WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(twentyFirstVekPage.enterButtonCookie));
        enterButtonCookieWebElement.click();
        WebElement accountButtonWebElement = driver.findElement(By.xpath(twentyFirstVekPage.accountButton));
        accountButtonWebElement.click();
        WebElement enterButtonWebElement = driver.findElement(By.xpath(twentyFirstVekPage.enterButton));
        enterButtonWebElement.click();
        Thread.sleep(2000);
        WebElement inputEmailWebElement = driver.findElement(By.xpath(twentyFirstVekPage.inputEmailXpath));
        inputEmailWebElement.sendKeys("test@gmail.com");
        WebElement buttonModuleWebElement = driver.findElement(By.xpath(twentyFirstVekPage.buttonModule));
        buttonModuleWebElement.click();
        WebElement errorMessagePasswordWebElement = driver.findElement(By.xpath(twentyFirstVekPage.errorMessagePassword));
        Assertions.assertEquals("Пароль не указан", errorMessagePasswordWebElement.getText());
        driver.close();
    }

    @Test

    public void test21VekLoginUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        TwentyFirstVekPage twentyFirstVekPage = new TwentyFirstVekPage();
        WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(twentyFirstVekPage.enterButtonCookie));
        enterButtonCookieWebElement.click();
        WebElement accountButtonWebElement = driver.findElement(By.xpath(twentyFirstVekPage.accountButton));
        accountButtonWebElement.click();
        WebElement enterButtonWebElement = driver.findElement(By.xpath(twentyFirstVekPage.enterButton));
        enterButtonWebElement.click();
        WebElement inputEmailWebElement = driver.findElement(By.xpath(twentyFirstVekPage.inputEmailXpath));
        inputEmailWebElement.sendKeys("bkmnkgmail.com");
        WebElement inputPasswordWebElement = driver.findElement(By.xpath(twentyFirstVekPage.inputPasswordXpath));
        inputPasswordWebElement.sendKeys("test");
        WebElement buttonModuleWebElement = driver.findElement(By.xpath(twentyFirstVekPage.errorButtonEnter));
        buttonModuleWebElement.click();
        Thread.sleep(4000);
        Assertions.assertEquals(
                "Неправильный формат электронной почты",
                driver.findElement(By.xpath(twentyFirstVekPage.errorMessageLogin)).getText()
        );
        driver.close();
    }
}
