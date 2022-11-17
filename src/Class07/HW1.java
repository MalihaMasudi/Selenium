package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup");
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        Set<String> allHandles = driver.getWindowHandles();
        String mainPage =driver.getWindowHandle();
        for (String handel : allHandles) {
            driver.switchTo().window(handel);
            String tittle = driver.getTitle();

            if (tittle.equalsIgnoreCase("Google Account Help")) {
                System.out.println("the tittle of the current pag is " + tittle);
                break;
            }



        }

        WebElement community = driver.findElement(By.xpath("//a[text()='Community']"));
        community.click();
        Thread.sleep(2000);

        driver.switchTo().window(mainPage);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Maliha");

    }}


    /*
        *HomeWork 1**
    **WindowHandles**
    1.goto
    http://accounts.google.com/signup
    2.click on help and privacy btn
    3.click on community Button
    4.goto gmail.com page and enter your username in form

         */
   /* public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("http://accounts.google.com/signup");
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        Set<String> allHandles = driver.getWindowHandles();
        String main=driver.getWindowHandle();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("Display text is:" + title);
                break;

            }
        }

        WebElement community = driver.findElements(By.xpath("//a[text()='Community']"));




    }
}

    */

