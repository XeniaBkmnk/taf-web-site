package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private String enterButtonCookieLocator = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    private String enterButtonAdvertisLocator = "//app-user-account-link[@tabindex='0']";
    private String enterButtonLoginLocator = "//span[@class='mdc-tab__text-label' and text()='Вход']";
    private String buttonEnterLocator = " //app-ui-button";
    private String inputEmailLocator = "//input[@type='email']";
    private String inputPasswordLocator = "//input[@type='password']";
    private String errorMassageEmailLocator = "//app-email-input/app-field-error";
    private String errorMassagePasswordLocator = "//app-password-input/app-field-error";
    private String errorMassageNoFindUserLocator = "//div[@class='info-text']";
    private WebDriver driver;

    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterButtonCookie() {
        driver.findElement(By.xpath(enterButtonCookieLocator)).click();
    }

    public void clickEnterButtonAdvertis() {
        driver.findElement(By.xpath(enterButtonAdvertisLocator)).click();
    }


    public void clickInputEmail() {
        driver.findElement(By.xpath(inputEmailLocator)).click();
    }

    public void clickInputPassword() {
        driver.findElement(By.xpath(inputPasswordLocator)).click();
    }

    public void clickButtonEnter() {
        driver.findElement(By.xpath(buttonEnterLocator)).click();
    }

    public void sendKeysInputEmail(String nameEmail) {
        driver.findElement(By.xpath(inputEmailLocator)).sendKeys(nameEmail);
    }

    public void sendKeysInputPassword(String namePassword) {
        driver.findElement(By.xpath(inputPasswordLocator)).sendKeys(namePassword);
    }

    public String getEnterTitleForm() {
        return driver.findElement(By.xpath(enterButtonLoginLocator)).getText();
    }

    public String getErrorMassageEmail() {
        return driver.findElement(By.xpath(errorMassageEmailLocator)).getText();
    }

    public String getErrorMassagePassword() {
        return driver.findElement(By.xpath(errorMassagePasswordLocator)).getText();
    }

    public String getErrorMassageNoFindUser() {
        return driver.findElement(By.xpath(errorMassageNoFindUserLocator)).getText();
    }
}