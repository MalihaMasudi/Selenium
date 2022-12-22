package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

public class HW1 {
  /*  1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screenshot of filled out form manually and share in HW channel along with code
*/
  public static void main(String[] args) throws InterruptedException {

 System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    //create a WebDriver instance
    WebDriver driver=new ChromeDriver();
    //use the get function to open up the required website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(Long.parseLong("2000"));
      driver.findElement(By.name("firstname")).sendKeys("rez");
      driver.findElement(By.name("lastname")).sendKeys("ahmadi");
      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rezahmadi024@gmail.com");
      driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rezahmadi024@gmail.com");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcdef123$");
      WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
      Select select=new Select(Month);
      select.selectByIndex(11);
      WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
      Select sel=new Select(Day);
      sel.selectByValue("12");
      WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
      Select se=new Select(Year);
      se.selectByVisibleText("1985");
      WebElement Gender = driver.findElement(By.xpath("//input[@type='radio']"));
      Gender.click();
      driver.findElement(By.xpath("//button[@name='websubmit']")).click();








}
}
