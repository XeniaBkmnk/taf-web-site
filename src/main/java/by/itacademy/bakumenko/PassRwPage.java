package by.itacademy.bakumenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassRwPage {
    private String errorEnterLocator = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
    private String buttonEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String enterButtonPasswordLocator = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String enterButtonLoginLocator = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    private String enterTitleFormLocator = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private String inputEnter = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String enterButtonLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    WebDriver driver;

    public PassRwPage(WebDriver driver) {
        this.driver = driver;
    }
}
