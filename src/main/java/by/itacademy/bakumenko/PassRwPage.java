package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassRwPage {
    private String errorEnterLocator = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
    private String buttonEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String enterButtonPasswordLocator = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String enterButtonLoginLocator = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    private String errorMessageLoginPassword = "//*[@id=\"password-error\"]";
    private String errorMessageLoginLocator = "//*[@id=\"login-error\"]";
    private String enterTitleFormLocator = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private String inputEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String enterButtonLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    private String enterCheckBox = "//*[@id=\"notification-popup\"]/div/div/div[2]/div[2]/label/span";
    WebDriver driver;

    public PassRwPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterCheckBoxWebElement() throws InterruptedException {
        Thread.sleep(500);
        WebElement enterCheckBoxWebElement = driver.findElement(By.xpath(enterCheckBox));
        enterCheckBoxWebElement.click();
    }

    public void clickEnterButtonWebElement() {
        WebElement enterButtonWebElement = driver.findElement(By.xpath(enterButtonLocator));
        enterButtonWebElement.click();
    }

    public String getEnterTitleFormWebElement() throws InterruptedException {
        WebElement enterTitleFormWebElement = driver.findElement(By.xpath(enterTitleFormLocator));
        Thread.sleep(500);
        String actual = enterTitleFormWebElement.getText();
        return actual;
    }

    public void clickInputEnterWebElement() throws InterruptedException {
        WebElement inputEnterWebElement = driver.findElement(By.xpath(inputEnter));
        inputEnterWebElement.click();
        Thread.sleep(500);
    }

    public String getErrorMessageLoginWebElemen() {
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(errorMessageLoginLocator));
        String actuaiLogin = errorMessageLoginWebElement.getText();
        return actuaiLogin;
    }

    public String getErrorMessagePasswordWebElement() throws InterruptedException {
        Thread.sleep(500);
        WebElement errorMessagePasswordWebElement = driver.findElement(By.xpath(errorMessageLoginPassword));
        String actualPassword = errorMessagePasswordWebElement.getText();
        return actualPassword;
    }

    public void sendKeysEnterButtonPasswordWebElement(String namePassword) {
        WebElement enterButtonPasswordWebElement = driver.findElement(By.xpath(enterButtonPasswordLocator));
        enterButtonPasswordWebElement.sendKeys(namePassword);
    }

    public void sendKeysEnterButtonLoginLocator(String nameLogin) {
        WebElement enterButtonLoginWebElement = driver.findElement(By.xpath(enterButtonLoginLocator));
        enterButtonLoginWebElement.sendKeys(nameLogin);
    }

    public String getErrorMessageLoginWebElement() throws InterruptedException {
        Thread.sleep(500);
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(errorMessageLoginLocator));
        String actualLogin = errorMessageLoginWebElement.getText();
        return actualLogin;
    }

    public void clickButtonEnter() {
        WebElement buttonEnterWebElement = driver.findElement(By.xpath(buttonEnter));
        buttonEnterWebElement.click();
    }

    public String getErrorEnterWebElement() {
        WebElement errorEnterWebElement = driver.findElement(By.xpath(errorEnterLocator));
        String actual = errorEnterWebElement.getText();
        return actual;
    }
}
