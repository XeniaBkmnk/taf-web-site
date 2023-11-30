package by.itacademy.bakumenko;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void beseStart() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void baseFinish() {
        driver.quit();
    }

}
