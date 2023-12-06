package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OzTest extends BaseTest {
    OzPage ozPage;

    @BeforeEach
    public void start() {
        driver.get("https://oz.by/");
        ozPage = new OzPage(driver);
    }

    @Test
    public void testOzLogin() throws InterruptedException {
        ozPage.clickButtonEnterLoginLocatorBy();
        ozPage.clickButtonLoginOptionLocator();
        ozPage.sendKeysInputEmailLocator("test@test");
        ozPage.sendKeysInputPasswordLocator("test");
        ozPage.clickButtonSubmitLocator();
        ozPage.getErrorMessageLocator();
        String actual = ozPage.getErrorMessageLocator();
        Assertions.assertEquals("Введите корректный адрес электронной почты", actual);
    }

    @Test
    public void testOzPasaword() throws InterruptedException {
        ozPage.clickButtonEnterLoginLocatorBy();
        ozPage.clickButtonLoginOptionLocator();
        ozPage.sendKeysInputEmailLocator("test@gmail.com");
        ozPage.sendKeysInputPasswordLocator("test");
        ozPage.clickButtonSubmitLocator();
        String actual = ozPage.getErrorMessageLocator();
        Assertions.assertEquals("Неверный пароль. Если вы потеряли или забыли пароль — восстановите его", actual);
    }

    @Test
    public void testOzEntry() throws InterruptedException {
        ozPage.clickButtonEnterLoginLocatorBy();
        String actual = ozPage.getEnterTitleOauthFormLocator();
        Assertions.assertEquals("Вход", actual);
    }

}
