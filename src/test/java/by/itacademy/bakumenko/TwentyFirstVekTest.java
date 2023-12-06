package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwentyFirstVekTest extends BaseTest {
    private TwentyFirstVekPage twentyFirstVekPage;

    @BeforeEach
    public void start() {
        driver.get("https://www.21vek.by/");
        twentyFirstVekPage = new TwentyFirstVekPage(driver);
    }

    @Test
    public void test21VekLogin() throws InterruptedException {
        twentyFirstVekPage.clickEnterButtonCookie();
        twentyFirstVekPage.clickAccountButton();
        twentyFirstVekPage.clickEnterButton();
        twentyFirstVekPage.clickButtonModule();
        twentyFirstVekPage.getErrorMessageLogin();
        String actual = twentyFirstVekPage.getErrorMessageLogin();
        Assertions.assertEquals("Электронная почта не указана", actual);
        twentyFirstVekPage.getErrorMessagePassword();
        String actualPassword = twentyFirstVekPage.getErrorMessagePassword();
        Assertions.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void test21VekLoginPassword() throws InterruptedException {
        twentyFirstVekPage.clickEnterButtonCookie();
        twentyFirstVekPage.clickAccountButton();
        twentyFirstVekPage.clickEnterButton();
        twentyFirstVekPage.sendKeysInputEmailXpath("test@gmail.com");
        twentyFirstVekPage.clickButtonModule();
        twentyFirstVekPage.getErrorMessagePassword();
        String actual = twentyFirstVekPage.getErrorMessagePassword();
        Assertions.assertEquals("Пароль не указан", actual);
    }

    @Test
    public void test21VekLoginUser() throws InterruptedException {
        twentyFirstVekPage.clickEnterButtonCookie();
        twentyFirstVekPage.clickAccountButton();
        twentyFirstVekPage.clickEnterButton();
        twentyFirstVekPage.sendKeysInputEmailXpath("bkmnkgmail.com");
        twentyFirstVekPage.sendKeysInputPasswordXpath("test");
        twentyFirstVekPage.clickErrorButtonEnter();
        String actual = twentyFirstVekPage.getErrorMessageLogin();
        Assertions.assertEquals(
                "Неправильный формат электронной почты", actual);
    }

}
