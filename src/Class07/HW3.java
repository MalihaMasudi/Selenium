package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {
    /*
    HomeWork3: (do not use thread .sleep  or Explicit wait)
1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty

write down  whatever the reason you understand  of text being empty after exploring DOM
     */
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(text.getText());// The text is empty because at the time of running the code, the web still
        //being loading.

    }
}
