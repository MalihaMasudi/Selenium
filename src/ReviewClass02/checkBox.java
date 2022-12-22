package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        // open the syntax
        //use the get function to open up the required website
        driver.get("http://ironspider.ca/forms/checkradio.htm");
        //What does this list contain?
//
//     find the checkBoxes
                    List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

// what does this list contain?
//        it contains all the 6 Webelements

            for(WebElement checkBx:checkbxes){

                String color = checkBx.getAttribute("value");

                if(color.equalsIgnoreCase("orange")){
                    checkBx.click();
                    break;
                }


            }



        }
    }
