import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestUkrNet {

    @DisplayName("The test for Google")
    public static class GooglePageTests {

        private static WebDriver driver;

        @BeforeAll
        static void configBrowser(){
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
            driver = new ChromeDriver();
            //driver.manage().window().setSize(new Dimension(500, 500));
            //driver.manage().window().fullscreen();
            driver.get("https://www.google.com/");
        }

        @Test
        @AfterAll
        static void closeBrowser(){
            driver.close();
        }

        @Test
        void searchTest(){
            System.out.println("hello");
        }

        @Test
        void searchTest1(){
            WebElement searchInput = driver.findElement(By.name("q"));
            //если элемент не найден использовать \\xpath
            searchInput.sendKeys("наші котики");
            searchInput.sendKeys(Keys.ENTER);

            WebElement cinemaResult = driver.findElement(By.id("search"));
            List<WebElement> spans = cinemaResult.findElements(By.tagName("span"));

            System.out.println("rex"+spans.get(0).getText());
        }
    }

}
