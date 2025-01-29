package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserInit {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserInit() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public void close() {
        driver.close();

    }
}

