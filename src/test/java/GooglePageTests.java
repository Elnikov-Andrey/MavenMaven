import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("The test for Google")
public class GooglePageTests {

    private static WebDriver driver;

    @BeforeAll
    static void confBrowser(){
        System.setProperty("webdriver.gecko.driver", "/geckodriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ukr.net/");
    }

    @Test
    void searchTest(){
        System.out.println("hello");
        //driver.getElement();
    }
//
//    @Test
//    void searchTest(){
//        driver.getElement();
//    }
}
