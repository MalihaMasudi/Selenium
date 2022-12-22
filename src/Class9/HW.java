package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    /*
    http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
got to the url
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
the username is
admin
the password is
Hum@nhrm123
     */
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement name = driver.findElement(By.name("txtUsername"));
        name.sendKeys("admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();
        WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

       /*
        List<WebElement> listofID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));



        for (int i=0;i< listofID.size();i++){

            String id = listofID.get(i).getText();

            if(id.equalsIgnoreCase("45020A") ){
            System.out.println(i);
            check the checkBox
         WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[1]"));
        checkBox.click();
          break;
            }
        }

        */








    }
}
