package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiTest {
    @Test
    public void testKvitkiAutorisatino() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        Assertions.assertEquals("Вход", kvitkiPage.getEnterTitleForm());
        driver.close();
    }

    @Test
    public void testKvitkiEmptyEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        kvitkiPage.clickInputEmail();
        kvitkiPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiPage.getErrorMassageEmail());
        driver.close();
    }

    @Test
    public void testKvitkiEmptyPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        kvitkiPage.clickInputPassword();
        kvitkiPage.clickInputEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiPage.getErrorMassagePassword());
        driver.close();
    }

    @Test
    public void testKvitkiLoginEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(600);
        kvitkiPage.sendKeysInputEmail("test");
        kvitkiPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiPage.getErrorMassageEmail());
        driver.close();
    }

    @Test
    public void testKvitkiInvalidValues() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by/rus/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        kvitkiPage.sendKeysInputEmail("test@gmail.com");
        kvitkiPage.sendKeysInputPassword("test12345");
        kvitkiPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitkiPage.getErrorMassageNoFindUser());
        driver.close();
    }

}
