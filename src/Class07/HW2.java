package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    /*
    **HomeWork 2**
*Implicit wait**
1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
2. click on get New User
3. get the firstname  of user and print it on console

     */
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(" https://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.findElement(By.xpath("//button[text()='Get New User']")).click();
        WebElement name = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(name.getText());

    }
}
