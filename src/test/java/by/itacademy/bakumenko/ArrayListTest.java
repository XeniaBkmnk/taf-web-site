package by.itacademy.bakumenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest extends BaseTest {
    private String menuItlem = "//div[@class='mainmenu']/ul/li";

    @Test
    public void testFindMenuItem() {
        driver.get(" https://www.pizzatempo.by/");
        List<WebElement> menuItems = driver.findElements(By.xpath(menuItlem));
        Assertions.assertEquals(9, menuItems.size());
    }

    @Test
    public void testFindMenuItemString() {
        driver.get(" https://www.pizzatempo.by/");
        List<WebElement> menuItems = driver.findElements(By.xpath(menuItlem));
        List<String> menuItemsString = new ArrayList<>();
        for (int i = 0; i < menuItems.size(); i++) {
            menuItemsString.add(menuItems.get(i).getText());
            System.out.println(menuItems.get(i).getText());
        }

    }

    @Test
    public void testFindMenuItem2() {
        driver.get(" https://www.pizzatempo.by/");
        List<WebElement> menuItems = driver.findElements(By.xpath(menuItlem));
        List<String> menuItemsString = new ArrayList<>();
        for (int i = 0; i < menuItems.size(); i++) {
            menuItemsString.add(menuItems.get(i).getText());
        }
        List<String> expectedMenuItemsList = new ArrayList<>();
        expectedMenuItemsList.add("ПИЦЦА");
        expectedMenuItemsList.add("АКЦИИ");
        expectedMenuItemsList.add("БУРГЕРЫ, ЗАКУСКИ, ФРИ");
        expectedMenuItemsList.add("САЛАТЫ, СУПЫ, ХЛЕБ");
        expectedMenuItemsList.add("ГОРЯЧИЕ БЛЮДА");
        expectedMenuItemsList.add("НАПИТКИ");
        expectedMenuItemsList.add("ДЕСЕРТЫ");
        expectedMenuItemsList.add("ДЕТСКОЕ МЕНЮ");
        expectedMenuItemsList.add("ПРИБОРЫ");
        Assertions.assertEquals(expectedMenuItemsList,menuItemsString);
    }

    @Test
    public void testFindMenuItem3() {
        driver.get(" https://www.pizzatempo.by/");
        List<WebElement> menuItems = driver.findElements(By.xpath(menuItlem));
        List<String> menuItemsString = new ArrayList<>();
        for (int i = 0; i < menuItems.size(); i++) {
            menuItemsString.add(menuItems.get(i).getText());
        }
        List<String> expectedMenuItemsList = new ArrayList<>();
        expectedMenuItemsList.add("ПИЦЦА");
        expectedMenuItemsList.add("АКЦИИ");
        expectedMenuItemsList.add("БУРГЕРЫ, ЗАКУСКИ, ФРИ");
        expectedMenuItemsList.add("САЛАТЫ, СУПЫ, ХЛЕБ");
        expectedMenuItemsList.add("ГОРЯЧИЕ БЛЮДА");
        expectedMenuItemsList.add("НАПИТКИ");
        expectedMenuItemsList.add("ДЕСЕРТЫ");
        expectedMenuItemsList.add("ДЕТСКОЕ МЕНЮ");
        expectedMenuItemsList.add("ПРИБОРЫ");
        Assertions.assertEquals(expectedMenuItemsList,menuItemsString);
    }

}
