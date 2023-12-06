package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassRWTest extends BaseTest {
    PassRwPage passRwPage;

    @BeforeEach
    public void start() {
        driver.get("https://pass.rw.by/ru/");
        passRwPage = new PassRwPage(driver);
    }

    @Test
    public void testPassRwAutorisation() throws InterruptedException {
        Thread.sleep(500);
        passRwPage.clickEnterCheckBoxWebElement();
        passRwPage.clickEnterButtonWebElement();
        passRwPage.getEnterTitleFormWebElement();
        String actual = passRwPage.getEnterTitleFormWebElement();
        Assertions.assertEquals("Авторизация", actual);
    }

    @Test
    public void testPassRwLoginEmptyError() throws InterruptedException {
        Thread.sleep(500);
        passRwPage.clickEnterCheckBoxWebElement();
        passRwPage.clickEnterButtonWebElement();
        Thread.sleep(500);
        passRwPage.clickInputEnterWebElement();
        Assertions.assertEquals(
                "Заполните поле", passRwPage.getErrorMessageLoginWebElemen()
        );
        Assertions.assertEquals(
                "Заполните поле", passRwPage.getErrorMessagePasswordWebElement()
        );
    }

    @Test
    public void testPassRwEmptyLogin() throws InterruptedException {
        Thread.sleep(500);
        passRwPage.clickEnterCheckBoxWebElement();
        passRwPage.clickEnterButtonWebElement();
        passRwPage.clickInputEnterWebElement();
        passRwPage.sendKeysEnterButtonPasswordWebElement("123456");
        passRwPage.getErrorMessageLoginWebElement();
        String actuaiLogin = passRwPage.getErrorMessageLoginWebElement();
        Assertions.assertEquals("Заполните поле", actuaiLogin);
    }

    @Test
    public void testPassRwFullLogin() throws InterruptedException {
        passRwPage.clickEnterCheckBoxWebElement();
        Thread.sleep(500);
        passRwPage.clickEnterButtonWebElement();
        Thread.sleep(500);
        passRwPage.clickInputEnterWebElement();
        passRwPage.sendKeysEnterButtonLoginLocator("test@gmail.com");
        passRwPage.sendKeysEnterButtonPasswordWebElement("123456");
        passRwPage.clickButtonEnter();
        passRwPage.getErrorEnterWebElement();
        String actual = passRwPage.getErrorEnterWebElement();
        Assertions.assertEquals("Пользователь не найден", actual);
    }

}
