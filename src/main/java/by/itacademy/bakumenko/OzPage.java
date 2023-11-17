package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OzPage {
    public String errorMessageLocator = "//*[@id=\"test\"]/div/div";
    public String buttonSubmitLocator = "//*[@id=\"loginForm\"]/button";
    public String inputPasswordLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    public String enterTitleOauthFormLocator = "//*[@id=\"loginPopupIntro\"]";
    public String inputEmailLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    public String buttonLoginOptionLocator = "//*[@id=\"loginFormLoginEmailLink\"]";
    public String buttonEnterLocatorBy = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";

    WebDriver driver;

    public OzPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEnterLoginLocatorBy() throws InterruptedException {
      WebElement buttonEnter = driver.findElement(By.xpath(buttonEnterLocatorBy));
        buttonEnter.click();
        Thread.sleep(2000);
    }

    public void clickButtonLoginOptionLocator() {
      WebElement buttonEnter =  driver.findElement(By.xpath(buttonLoginOptionLocator));
         buttonEnter.click();
    }

    public void sendKeysInputEmailLocator(String newEmail) {
        WebElement element = driver.findElement(By.xpath(inputEmailLocator));
        element.sendKeys(newEmail);
    }

    public void sendKeysInputPasswordLocator(String newPassword) throws InterruptedException {
        WebElement element =  driver.findElement(By.xpath(inputPasswordLocator));
        element.sendKeys(newPassword);
        Thread.sleep(2000);
    }

    public void clickButtonSubmitLocator() throws InterruptedException {
        WebElement buttonEnter =driver.findElement(By.xpath((buttonSubmitLocator)));
        buttonEnter.click();
        Thread.sleep(2000);
    }
    public String getErrorMessageLocator(){
        WebElement errorMessage = driver.findElement(By.xpath((errorMessageLocator)));
        String actual = errorMessage.getText();
        return actual;
    }
}
