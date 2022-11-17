package Class9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    }
}
