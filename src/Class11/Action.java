package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Action {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //go to amazon.com
        driver.get("http://amazon.com");
        //find element EN
        driver.findElement(By.xpath("//div[text()='EN']"));
        //action class


    }
}
