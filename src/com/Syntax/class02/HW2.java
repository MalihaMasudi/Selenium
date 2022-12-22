package com.Syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW2 {
    /*navigate to  https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form,click on register,close the browser,navigate to fb.com,click on create new account
    fill up all the textbooks,close the pop up,close the browser
    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Maliha");
        driver.findElement(By.name("customer.lastName")).sendKeys("Masudi");
        driver.findElement(By.id("customer.address.street")).sendKeys("13880");
        driver.findElement(By.id("customer.address.city")).sendKeys("Woodbridge");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22193");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("115-801-9997");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        driver.findElement(By.id("customer.username")).sendKeys("abc@1303");
        driver.findElement(By.id("customer.password")).sendKeys("abc@1303");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abc@1303");
        driver.findElement(By.className("button")).click();

    }
}