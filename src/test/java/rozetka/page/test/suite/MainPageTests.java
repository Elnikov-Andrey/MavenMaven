package rozetka.page.test.suite;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import rozetka.page.MainPage;
import rozetka.page.SearchPage;
import java.util.Set;
import java.util.logging.StreamHandler;
import org.openqa.selenium.WebDriver;

public class MainPageTests {
    static WebDriver driver;
    @BeforeAll
    static void configureBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        //System.setProperty("", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua");
    }

    @AfterAll
    static void closeBrowser(){
        driver.close();
    }

    @Test
    void searchShouldReturnItems(){
        WebElement searchTextField = driver.findElement(By.className(""))
        MainPage mainPage = new MainPage(driver.findElement(By.className("search-form input")));

        SearchPage resultPage = mainPage.search("xiaomi");
        Set<String> resultItems = resultPage.getResultItems();
        Assertions.assertTrue(resultItems.contains("Видеорегистратор Xiaomy Yi"));

    }

}
