package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TerraPizzaTest extends BaseTest {
    private TerraPizzaPage terraPizzaPage;

    @BeforeEach
    public void start() {
        driver.get(" https://terrapizza.by/");
        terraPizzaPage = new TerraPizzaPage(driver);
    }

    @Test
    public void testOrder() throws InterruptedException {
        terraPizzaPage.clickButtonCookie();
        terraPizzaPage.clickEnterMenuPizza();
        terraPizzaPage.clickButtonPizzaMargaritaBasket();
        Thread.sleep(500);
        terraPizzaPage.clickEnterMenuBar();
        terraPizzaPage.clickButtonDrinkBasket();
        Thread.sleep(500);
        terraPizzaPage.clickEnterOrder();
        Thread.sleep(500);
        // terraPizzaPage.getTextOrderPizza();
        Assertions.assertEquals("Пицца Маргарита на тонком 32 см", terraPizzaPage.getTextOrderPizza());
        Assertions.assertEquals("Матча латте на кокосовом молоке", terraPizzaPage.getTextOrderDrink());
    }

}
