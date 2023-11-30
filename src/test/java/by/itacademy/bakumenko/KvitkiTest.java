package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class KvitkiTest extends BaseTest{

    WebDriver driver;
    private KvitkiPage kvitkiPage;

    @BeforeEach
    public void start() {
        driver.get("https://www.kvitki.by/rus/");
        kvitkiPage = new KvitkiPage(driver);
    }

    @Test
    public void testKvitkiAutorisatino() throws InterruptedException {
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        Assertions.assertEquals("Вход", kvitkiPage.getEnterTitleForm());
    }

    @Test
    public void testKvitkiEmptyEmail() throws InterruptedException {
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        kvitkiPage.clickInputEmail();
        kvitkiPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiPage.getErrorMassageEmail());
        driver.quit();
    }

    @Test
    public void testKvitkiEmptyPassword() throws InterruptedException {
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        kvitkiPage.clickInputPassword();
        kvitkiPage.clickInputEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiPage.getErrorMassagePassword());
    }

    @Test
    public void testKvitkiLoginEmail() throws InterruptedException {
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(600);
        kvitkiPage.sendKeysInputEmail("test");
        kvitkiPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiPage.getErrorMassageEmail());
    }

    @Test
    public void testKvitkiInvalidValues() throws InterruptedException {
        kvitkiPage.clickEnterButtonCookie();
        kvitkiPage.clickEnterButtonAdvertis();
        Thread.sleep(500);
        kvitkiPage.sendKeysInputEmail("test@gmail.com");
        kvitkiPage.sendKeysInputPassword("test12345");
        kvitkiPage.clickButtonEnter();
        Thread.sleep(500);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitkiPage.getErrorMassageNoFindUser());
    }

}
