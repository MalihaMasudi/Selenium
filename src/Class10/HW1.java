package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
     HW1
Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023
     */
    public static void main(String[] args) {
        //set the path to the driver to link it with our class on Mac u don't need .exe on Windows u need .exe
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
        WebElement recruitment = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitment.click();
        WebElement candidate = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        candidate.click();
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select mont=new Select(month);
        mont.selectByVisibleText("Mar");
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select yea=new Select(year);
        yea.selectByVisibleText("2023");
        WebElement date = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        date.sendKeys("2023-08-08");

      /*  boolean isFound=false;
        while (!isFound){
            String monthName=month.getText();
        if (month.getText().equalsIgnoreCase("March")){
            System.out.println("I have found the desired month :" +monthName);
            isFound=true;
        }
         else{
            WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        }
        }

       */


    }
}

