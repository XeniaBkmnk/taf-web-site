package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiTest {
    @Test
    public void testKvitkiAutorisation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookieWebElement();
        kvitkiPage.clickEnterButtonAdvertisWebElement();
        kvitkiPage.clickEnterButtonLoginWebElement();
        kvitkiPage.getEnterTitleFormWebElement();
        String actual = kvitkiPage.getEnterTitleFormWebElement();
        Assertions.assertEquals("Вход", actual);
        driver.close();
    }

    @Test
    public void testKvitkiLoginEmptyError() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookieWebElement();
        kvitkiPage.clickEnterButtonAdvertisWebElement();
        kvitkiPage.clickEnterButtonLoginWebElement();
        Thread.sleep(4000);
        kvitkiPage.clickEnterButtonEmailWebElement();
        Thread.sleep(500);
        kvitkiPage.clickEnterButtonPasswordWebElement();
        kvitkiPage.getErrorMessageLoginWebElement();
        String actual = kvitkiPage.getErrorMessageLoginWebElement();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", actual);
        driver.close();
    }
}
