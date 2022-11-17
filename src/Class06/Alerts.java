package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        //        set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
                // find the button click me for the alert and click on it

                WebElement simpleAlert =driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        // Handling the alert

        Alert simpleAlert1=driver.switchTo().alert();
        Thread.sleep(2000);
        simpleAlert1.accept();
        // find the button for confirmation alert and click on it
        WebElement confimationAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Thread.sleep(2000);
        confimationAlert.click();
        Alert confirmation=driver.switchTo().alert();
        confirmation.dismiss();
        // find the prompt alert and send the text then accept
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));

        promptAlert.click();

        //swich the focus to the alert
        Alert prompt1=driver.switchTo().alert();
        prompt1.sendKeys("abracadabra");
        prompt1.accept();



    }
}
