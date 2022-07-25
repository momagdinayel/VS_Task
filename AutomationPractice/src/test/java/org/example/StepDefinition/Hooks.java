package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void open_browser(){
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("resolution", "1024x768");
        driver=new ChromeDriver(caps);
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @After
    public static void quit_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
