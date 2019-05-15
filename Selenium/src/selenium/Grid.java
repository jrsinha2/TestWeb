/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.MalformedURLException;
import java.net.URL;
 

/**
 *
 * @author Aditya Sinha
 */
public class Grid {
    public static WebDriver driver;

    public static void main(String[]  args) throws MalformedURLException, InterruptedException{

        String URL = "http://www.google.com";
        String Node = "http://192.168.56.1:4444/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();

        driver = new RemoteWebDriver(new URL(Node), cap);

        driver.navigate().to(URL);
        Thread.sleep(500);
        driver.quit();
    } 
}

