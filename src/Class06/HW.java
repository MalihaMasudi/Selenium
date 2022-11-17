package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW {
    /*
    goto https://chercher.tech/practice/frames
 1.check the checkBox
 2.Select BabyCat from drop down
 3. Send text in text box "DONE"

     */
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //goto syntax project /checkbox demo
        driver.get(" https://chercher.tech/practice/frames");
        //maximize
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");

        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement drop = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(drop);
        sel.selectByIndex(1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).sendKeys("DONE");
    }
}




