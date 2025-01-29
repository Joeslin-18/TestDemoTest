package pages;

import org.openqa.selenium.By;
import utility.BrowserInit;

public class SearchEngine extends BrowserInit {


    public static void hit_Url() {
    driver.get("https://www.google.com");
}
    public static void find_location() {
        driver.findElement(By.xpath("//*[@class='gLFyf']"));
        System.out.println("test1");
    }
    public static void enter_value() {
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("text");

    }
    public static void close_search() {
        driver.close();
    }
}

