package by.itacademy.bakumenko;

import org.junit.jupiter.api.Test;

public class CalcTest extends BaseTest {
    @Test
    public void testCalc() throws InterruptedException {
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalcPage calcPage = new CalcPage(driver);
        Thread.sleep(500);
        calcPage.clickEnterButtonCalc();
    }

}
