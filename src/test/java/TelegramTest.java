import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramTest {

    @Test
    public void testTelegramLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.telegram.org/a/");
        String enterButtonLogin ="//*[@id=\"auth-qr-form\"]/div/button[1]";
        By enterButtonBy =By.xpath(enterButtonLogin);
        Thread.sleep(2000);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();
        Thread.sleep(4000);

        String buttonEnter = "//*[@id=\"auth-qr-form\"]/div/button[1]";
        By buttonEnterBy = By.xpath(buttonEnter);
        WebElement buttonEnterWebElement = driver.findElement(buttonEnterBy);
        buttonEnterWebElement.click();

        String errorNumberLogin = "//*[@id=\"auth-phone-number-form\"]/div";
        By errorNumberLoginBy = By.xpath(errorNumberLogin);
        Thread.sleep(4000);
        WebElement errorNumberLoginWebElement = driver.findElement(errorNumberLoginBy);
        String actualErrorNumberLogin = errorNumberLoginWebElement.getText();
        String expectedErrorNumberLogin = "Укажите ник или e-mail";
        Assertions.assertEquals(expectedErrorNumberLogin, actualErrorNumberLogin);




        driver.close();
    }
}
