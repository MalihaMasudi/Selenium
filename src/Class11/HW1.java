package Class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HW1 {
        /*
        goto https://demo.guru99.com/test/simple_context_menu.html
right-click  on the button, select edit and handle the alert

double-click on the button and handle the alert
         */
        public static void main(String[] args) throws InterruptedException {
                //set the path to the driver to link it with our class on Mac u don't need .exe on Windows u need .exe
                System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                // create a WebDriver instance
                WebDriver driver= new ChromeDriver();
                //goto syntaxProject.com simple-form-demo
                driver.get("https://demo.guru99.com/test/simple_context_menu.html");
                WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
                Actions actions=new Actions(driver);
                actions.contextClick(rightClick).perform();
                WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
                edit.click();
                Thread.sleep(2000);
                Alert alert=driver.switchTo().alert();
                alert.accept();
                WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
                actions.doubleClick(doubleClick).perform();
                Alert alert1=driver.switchTo().alert();
                alert1.accept();


        }
    }

