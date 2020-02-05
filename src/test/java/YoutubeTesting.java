import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class YoutubeTesting {
    static ChromeDriver driver;

    @BeforeAll
    static void start(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test BEGIN");
    }
    @AfterAll
    static void end() {
        //driver.close();
        System.out.println("Test END");
    }

    @Override
    public String toString() {
        return "YoutubeTesting{}";
    }

    @Test
    void mainTest() throws InterruptedException {
        driver.get("https://www.youtube.com/");

        String url = driver.getCurrentUrl();
        Assertions.assertTrue(url.equals("https://www.youtube.com/"));
        System.out.println("URL done");

        WebElement searchInput = driver.findElementById("search");
        searchInput.sendKeys("смешарики");
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        List<WebElement> clips = driver.findElements(By.cssSelector(".style-scope ytd-video-renderer"));
        clips.get(0).click();

        //WebElement clipName = driver.findElement(By.className("title style-scope ytd-video-primary-info-renderer"));
        WebElement clipName = driver.findElement(By.className("yt-formatted-string"));
        String name = clipName.getText();
        Assertions.assertTrue(name.contains("TVSmeshariki"));
        System.out.println("Well done " + name);

        Thread.sleep(3000);

    }


}
