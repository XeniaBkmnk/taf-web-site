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
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();
        String enterTitleFormLocator = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
        By enterTitleFormBy = By.xpath(enterTitleFormLocator);
        WebElement enterTitleFormWebElement = driver.findElement(enterTitleFormBy);
        Thread.sleep(500);
        String actual = enterTitleFormWebElement.getText();
        Assertions.assertEquals("Авторизация", actual);
        driver.close();
    }
}
