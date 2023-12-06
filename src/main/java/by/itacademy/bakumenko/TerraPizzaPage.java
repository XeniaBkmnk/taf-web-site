package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPizzaPage {
    private String buttonCookie = "//button[@class='close-icon']";
    private String enterMenuPizza = "/html/body/div[3]/div[2]/div/div/div/div/div/ul/li[10]/a";
    private String buttonPizzaMargaritaBasket = "//*[@id=\"menu-card-364\"]/div[3]/div[3]/div[2]/div[2]/button";
    private String enterMenuBar = "/html/body/div[3]/div[1]/div/div/div[1]/div/div/div/ul/li[16]/a";
    private String buttonDrinkBasket = "//*[@id=\"menu-card-869\"]/div[3]/div[2]/div/div[2]/button";
    private String enterOrder = "/html/body/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]";
    private String textOrderPizza = "//*[@id=\"basket-el-0\"]/div[2]/div[1]/div[1]";
    private String textOrderDrink = "//*[@id=\"basket-el-1\"]/div[2]/div[1]/div[1]";
    private WebDriver driver;

    public TerraPizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCookie() {
        driver.findElement(By.xpath(buttonCookie)).click();
    }

    public void clickEnterMenuPizza() {
        driver.findElement(By.xpath(enterMenuPizza)).click();
    }

    public void clickButtonPizzaMargaritaBasket() {
        driver.findElement(By.xpath(buttonPizzaMargaritaBasket)).click();
    }

    public void clickEnterMenuBar() {
        driver.findElement(By.xpath(enterMenuBar)).click();
    }

    public void clickButtonDrinkBasket() {
        driver.findElement(By.xpath(buttonDrinkBasket)).click();
    }

    public void clickEnterOrder() {
        driver.findElement(By.xpath(enterOrder)).click();
    }

    public String getTextOrderPizza() {
        return driver.findElement(By.xpath(textOrderPizza)).getText();
    }

    public String getTextOrderDrink() {
        return driver.findElement(By.xpath(textOrderDrink)).getText();
    }

}
