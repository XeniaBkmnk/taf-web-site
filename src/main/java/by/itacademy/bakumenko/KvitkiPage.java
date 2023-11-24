package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KvitkiPage {
    private String enterButtonCookiLocator = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String enterButtonAdvertisLocator = "/html/body/div[7]/div";
    private String enterButtonLoginLocator = "/html/body/div[3]/div[2]/div/app-user-account-link/app-profile-link/svg-icon";
    private String enterTitleFormLocator = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    WebDriver driver;

    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
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
