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
        OzPage ozPage = new OzPage();
        WebElement buttonEnter = driver.findElement(By.xpath(ozPage.buttonEnterLocator));
        buttonEnter.click();
        Thread.sleep(2000);
        WebElement buttonLoginOption = driver.findElement(By.xpath(ozPage.buttonLoginOptionLocator));
        buttonLoginOption.click();
        WebElement inputEmail = driver.findElement(By.xpath(ozPage.inputEmailLocator));
        inputEmail.sendKeys("test@test");
        WebElement inputPassword = driver.findElement(By.xpath(ozPage.inputPasswordLocator));
        inputPassword.sendKeys("test");
        Thread.sleep(2000);
        WebElement buttonSubmit = driver.findElement(By.xpath(ozPage.buttonSubmitLocator));
        buttonSubmit.click();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath((ozPage.errorMessageLocator)));
        String actualErrorMessage = errorMessage.getText();
        Assertions.assertEquals("Введите корректный адрес электронной почты", actualErrorMessage);
        driver.close();
    }

    @Test
    public void testOzPasaword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://oz.by/");
        OzPage ozPage = new OzPage();
        WebElement buttonEnter = driver.findElement(By.xpath(ozPage.buttonEnterLocator));
        buttonEnter.click();
        Thread.sleep(2000);
        WebElement buttonLoginOption = driver.findElement(By.xpath(ozPage.buttonLoginOptionLocator));
        buttonLoginOption.click();
        WebElement inputEmail = driver.findElement(By.xpath(ozPage.inputEmailLocator));
        inputEmail.sendKeys("test@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath(ozPage.inputPasswordLocator));
        inputPassword.sendKeys("test");
        Thread.sleep(2000);
        WebElement buttonSubmit = driver.findElement(By.xpath(ozPage.buttonSubmitLocator));
        buttonSubmit.click();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath((ozPage.errorMessageLocator)));
        String actualErrorMessage = errorMessage.getText();
        Assertions.assertEquals("Неверный пароль. Если вы потеряли или забыли пароль — восстановите его", actualErrorMessage);
        driver.close();


    }
}