/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Aditya Sinha
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya Sinha\\Documents\\Internship\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.github.com/login";
        
        driver.get(url);
        String title = driver.getTitle();
        WebElement username = driver.findElement(By.name("login"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.name("commit"));
        username.sendKeys("Aditya");
        password.sendKeys("Sinha");
        submitButton.submit();
        
        if(driver.getTitle().equals(title)) {
            System.out.println("Login Test Failed");
        }
        else
            System.out.println("Login Test Success");
        
        driver.close();
    }
    
}
