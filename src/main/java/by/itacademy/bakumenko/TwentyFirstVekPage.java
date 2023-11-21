package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwentyFirstVekPage {

    public String errorMessagePassword = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
    public String errorMessageLogin = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    public String errorButtonEnter = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    public String buttonModule = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button/div";
    public String accountButton = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button/span";
    public String enterButton = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button/div/span";
    public String inputEmailXpath = "//*[@id=\"login-email\"]";
    public String inputPasswordXpath = "//*[@id=\"login-password\"]";
    public String enterButtonCookie = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[3]/div";

    WebDriver driver;

    public TwentyFirstVekPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterButtonCookie() throws InterruptedException {
        WebElement enterButtonCookieWebElement = driver.findElement(By.xpath(enterButtonCookie));
        enterButtonCookieWebElement.click();
        Thread.sleep(2000);
    }

    public void clickAccountButton() {
        WebElement accountButtonWebElement = driver.findElement(By.xpath(accountButton));
        accountButtonWebElement.click();
    }

    public void clickEnterButton() throws InterruptedException {
        WebElement enterButtonWebElement = driver.findElement(By.xpath(enterButton));
        enterButtonWebElement.click();
        Thread.sleep(2000);
    }

    public void sendKeysInputPasswordXpath(String namePassword) {
        WebElement inputPasswordWebElement = driver.findElement(By.xpath(inputPasswordXpath));
        inputPasswordWebElement.sendKeys(namePassword);
    }

    public void sendKeysInputEmailXpath(String nameEmail) {
        WebElement inputEmailWebElement = driver.findElement(By.xpath(inputEmailXpath));
        inputEmailWebElement.sendKeys(nameEmail);
    }

    public void clickButtonModule() {
        WebElement buttonModuleWebElement = driver.findElement(By.xpath(buttonModule));
        buttonModuleWebElement.click();
    }

    public String getErrorMessageLogin() {
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(errorMessageLogin));
        String actual = errorMessageLoginWebElement.getText();
        return actual;
    }

    public String getErrorMessagePassword() {
        WebElement errorMessagePasswordWebElement = driver.findElement(By.xpath(errorMessagePassword));
        String actual = errorMessagePasswordWebElement.getText();
        return actual;
    }

    public void clickErrorButtonEnter() throws InterruptedException {
        WebElement buttonModuleWebElement = driver.findElement(By.xpath(errorButtonEnter));
        buttonModuleWebElement.click();
        Thread.sleep(2000);
    }
}
