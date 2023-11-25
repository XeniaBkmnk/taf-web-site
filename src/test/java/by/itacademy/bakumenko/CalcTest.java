package by.itacademy.bakumenko;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcTest {
    @Test
    public void testCalc() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalcPage calcPage = new CalcPage(driver);
        Thread.sleep(500);
        calcPage.clickEnterButtonCalc();
        driver.close();
    }
}
