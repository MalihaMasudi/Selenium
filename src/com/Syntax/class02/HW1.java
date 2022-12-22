package com.Syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
       /* navigate to fb.com,click on create new account,fill up all the textbook, close the pop-up
        close the browser*/
        System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
                driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("maliha");
        driver.findElement(By.name("lastname")).sendKeys("masoomi");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("hzazmo@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hzazmo@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("adc123@03");
        driver.findElement(By.id("month")).sendKeys("Jun");
        driver.findElement(By.name("birthday_day")).sendKeys("28");
        driver.findElement(By.name("birthday_year")).sendKeys("1983");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();


    }
}







