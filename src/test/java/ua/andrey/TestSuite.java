package ua.andrey;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@DisplayName("Base tests")
public class TestSuite {

    @Test
    public void site_header_is_on_home_page() {

        //System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucelabs.com");
        //WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
        //assertTrue((href.isDisplayed()));

        browser.close();

    }
//    @BeforeAll
//    static void setUp(){
//        System.out.println("Connect to DB");
//    }
//
//    @AfterAll
//    static void tearDown(){
//        System.out.println("Disconnect with DB");
//    }
//    @BeforeEach
//    void clearCache(){
//        System.out.println("Cleare browser cache");
//    }
//
//    @AfterEach
//    void gotoMainPage(){
//        System.out.println("Main page opens");
//    }
//
//    @Test
//    void test(){
//        Assertions.assertTrue(true);
//    }
//
//    @Test
//    @DisplayName("2+2=4")
//    void test1(){
//        Assertions.assertTrue(2 + 2 == 4);
//    }
//
//    @Test
//    @Timeout(value=1, unit = TimeUnit.NANOSECONDS)
//    void test2(){
//        Assertions.assertTrue(2 + 2 == 4);
//    }
//
//    @Test
//    @RepeatedTest(3)
//    @Disabled("Until bug #21224 will be fixed. Fix me 20.09.2021")
//    void test3(){
//        Assertions.assertTrue(2 + 7 == 9);
//    }
//
//    @Nested
//    @DisplayName("Arith")
//    class Arith{
//        @Test
//        @DisplayName("2+3=5")
//        void test1(){
//            Assertions.assertTrue(2 + 3 == 5);
//        }
//    }

}
