package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the fb.com
        Object WebElement;
        driver.get("https://www.facebook.com");

// find the button create account and click on it
        org.openqa.selenium.WebElement createAccountBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createAccountBtn.click();
//        sleep for 3 seconds to wait for the window to open up
        Thread.sleep(3000);

//        Select the date from the down
//        approach to use the select
//        1.Find the webElement that contains the select Tag
//        2.use Select class Select sel =new Select(Webelement)

//        1.Find the webElement that contains the select Tag
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//        2.use Select class Select sel =new Select(Webelement)
        Select sel=new Select(day);

//        We have now three methods
//        1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
//        2.Select by visible Text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
//        3.Select by Value
        sel.selectByValue("16");
//        .....................








    }
}

