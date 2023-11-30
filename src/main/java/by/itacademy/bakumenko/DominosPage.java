package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    private String enterBanner = "/html/body/div[4]/div[2]/button";
    private String enterPizza = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/a/span";
    private String enterPizzaBasket = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[6]/div/div/div[10]/div/div[6]/div[2]/button";
    private String buttonOrder = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/button";
    private String textOrder = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div[1]";
    private WebDriver driver;

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterBanner() {
        driver.findElement(By.xpath(enterBanner)).click();
    }

    public void clickEnterPizza() {
        driver.findElement(By.xpath(enterPizza)).click();
    }

    public void clickEnterPizzaBasket() {
        driver.findElement(By.xpath(enterPizzaBasket)).click();
    }

    public void clickButtonOrder() {
        driver.findElement(By.xpath(buttonOrder)).click();
    }

    public String getTextOrder() {
        return driver.findElement(By.xpath(textOrder)).getText();
    }

}
