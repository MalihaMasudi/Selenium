package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //use the get function to open up the required website
        driver.get("https://www.syntaxprojects.com/basic-radiobutton-demo.php");
        driver.findElements(By.xpath("//input[@name='ageGroup']"));
        // travers through the list of webelemnt
        //maximize
        driver.manage().window().maximize();

        // find the radio button
        List<WebElement> radioButton = driver.findElements(By.xpath("//input[@name='ageGroup'"));

        // travers through the list of webelemnt
        for(WebElement radioBttn:radioButton){

// find the desired radio button
            String option =radioBttn.getAttribute("value");
            if(option.equalsIgnoreCase("5-15")){
                // click the radio button
                radioBttn.click();
            }
        }
    }
    }


