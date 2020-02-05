import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//        set.add("String1");
//        set.add("String1");
//        set.add("String1");
//
//        set.add("String2");
//        set.add("String3");
//        set.add("String4");
//
//        System.out.println(set);
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";

        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
    }
}
