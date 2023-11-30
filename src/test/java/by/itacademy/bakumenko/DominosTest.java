package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DominosTest extends BaseTest {
    private DominosPage dominosPage;

    @BeforeEach
    public void start() {
        driver.get("https://dominos.by/");
        dominosPage = new DominosPage(driver);
    }

    @Test
    public void testOrderPizza() throws InterruptedException {
        dominosPage.clickEnterBanner();
        dominosPage.clickEnterPizza();
        dominosPage.clickEnterPizzaBasket();
        Thread.sleep(500);
        dominosPage.clickButtonOrder();
        Thread.sleep(500);
        Assertions.assertEquals("Барбекю", dominosPage.getTextOrder());
    }

}
