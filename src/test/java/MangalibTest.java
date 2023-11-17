import by.itacademy.bakumenko.MangalibPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MangalibTest {
    @Test
    public void testMangalibLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mangalib.me/");
        MangalibPage mangalibPage = new MangalibPage();
        WebElement buttonEnter = driver.findElement(By.xpath(mangalibPage.buttonEnterLocator));
        buttonEnter.click();
        WebElement inputEmail = driver.findElement(By.xpath(mangalibPage.inputEmailLocator));
        inputEmail.sendKeys("test@text");
        WebElement inputPassword = driver.findElement(By.xpath(mangalibPage.inputPasswordLocator));
        inputPassword.sendKeys("test");
        Thread.sleep(2000);
        WebElement buttonSubmit = driver.findElement(By.xpath(mangalibPage.buttonSubmitLocator));
        buttonSubmit.click();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath((mangalibPage.errorMessageLocator)));
        String actualErrorMessage = errorMessage.getText();
        Assertions.assertEquals("Неверный логин или пароль",actualErrorMessage);
        driver.close();
    }
    
}

