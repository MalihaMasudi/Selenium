package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    HW

go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    public static void main(String[] args) throws InterruptedException {

        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
        WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
        String gettext = message.getText();
        if (gettext.equalsIgnoreCase("It's gone!")) {
            System.out.println("The message is "+gettext);


        }else{
            System.out.println("there is no such message");
        }
        WebElement butn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        butn.click();
        WebElement enable = driver.findElement(By.xpath("//p[@id='message']"));
        String Enable = enable.getText();
        System.out.println("The text is "+Enable);
        System.out.println("the text is enable "+butn.isEnabled());
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        text.click();
        text.sendKeys("Selenium");
        WebElement disableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableBtn.click();
        String Disable = disableBtn.getText();
        System.out.println("The text is "+Disable);




    }
}
