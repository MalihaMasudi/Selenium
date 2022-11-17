package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Open Chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there in the top right corner
     */
    public static void main(String[] args) {
        //set the path to the driver to link it with our class  .exe on Windows.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get function to open up the required website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("Hum@nhrm123");
        WebElement welcomeAdmin=driver.findElement(By.cssSelector("a#welcome"));
        boolean statusDisplayed=welcomeAdmin.isDisplayed();
        System.out.println("The 'Welcome Admin' message is displayed :"+statusDisplayed);
// write the username
        driver.findElement(By.cssSelector("input[name^='txtU']")).sendKeys("Admin");
        // click on login button
        driver.findElement(By.cssSelector("input[id$='in']")).click();
        // find the element of the error
        WebElement errorText=driver.findElement(By.cssSelector("span[id*='span']"));
        // get the text of the error
        var text = errorText.getText();
        // boolean condition of the text error (is it true or not)
        var displayed = errorText.isDisplayed();
        //
        if (displayed){
            System.out.println(text+" is displayed : "+displayed);
        } else {
            System.out.println(text+" is displayed : "+displayed);
        }
    }

    }

