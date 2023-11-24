package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KvitkiPage {
    private String enterButtonCookiLocator = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String enterButtonAdvertisLocator = "/html/body/div[7]/div";
    private String enterButtonLoginLocator = "/html/body/div[3]/div[2]/div/app-user-account-link/app-profile-link/svg-icon";
    private String enterButtonPasswordLokator = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div/input";
    private String enterTitleFormLocator = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    private String enterButtonEmailLocator = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
    private String enterInputEnterLocator = "//*[@id=\"mat-tab-content-1-0\"]/div/app-user-login-form/app-collapsible/div/app-ui-button/button";
    private String errorMessageLoginLocator = "//*[@id=\"mat-tab-content-3-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    WebDriver driver;

    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getErrorMessageLoginWebElement() {
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(errorMessageLoginLocator));
        String actual = errorMessageLoginWebElement.getText();
        return actual;
    }

    public void clickEnterButtonPasswordWebElement() {
        WebElement enterButtonPasswordWebElement = driver.findElement(By.xpath(enterButtonPasswordLokator));
        enterButtonPasswordWebElement.click();
    }

    public void clickEnterButtonEmailWebElement() throws InterruptedException {
        Thread.sleep(2000);
        WebElement enterButtonEmailWebElement = driver.findElement(By.xpath(enterButtonEmailLocator));
        enterButtonEmailWebElement.click();
    }

    public void clickEnterInputEnterWebElement() {
        WebElement enterInputEnterWebElement = driver.findElement(By.xpath(enterInputEnterLocator));
        enterInputEnterWebElement.click();
    }

    public void clickEnterButtonAdvertisWebElement() {
        WebElement enterButtonAdvertisWebElement = driver.findElement(By.xpath(enterButtonAdvertisLocator));
        enterButtonAdvertisWebElement.click();
    }

    public void clickEnterButtonCookieWebElement() {
        WebElement enterButtonCookiWebElement = driver.findElement(By.xpath(enterButtonCookiLocator));
        enterButtonCookiWebElement.click();
    }

    public void clickEnterButtonLoginWebElement() throws InterruptedException {
        WebElement enterButtonLoginWebElement = driver.findElement(By.xpath(enterButtonLoginLocator));
        enterButtonLoginWebElement.click();
        Thread.sleep(500);
    }

    public String getEnterTitleFormWebElement() {
        WebElement enterTitleFormWebElement = driver.findElement(By.xpath(enterTitleFormLocator));
        String actual = enterTitleFormWebElement.getText();
        return actual;
    }

}
