package by.itacademy.bakumenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalcPage {

    private String enterButtonCalc = "//input[@type=\"submit\"]";
    private WebDriver driver;

    public CalcPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterButtonCalc() {
        driver.findElement(By.xpath(enterButtonCalc)).click();
    }

}
