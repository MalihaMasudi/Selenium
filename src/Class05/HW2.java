package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class HW2 {
    /*

HW2
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see categories mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
     */
    public static void main(String[] args) {

        //set the path to the driver to link it with our class  .exe on Windows.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //use the get function to open up the required website
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //select from the drop-down.
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select sel=new Select(dropDown);
        sel.selectByValue("58058");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //verify the tittle.
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets &amp; Network Hardware for Sale - eBay")){
            System.out.println("the title is verified");
        }
        else{
            System.out.println("the title is incorrect");
        }

    }
    }
