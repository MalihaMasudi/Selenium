package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarPagination {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        // set the path to the driver to link it with our class    on Mac u don't need .exe on Windows
        // u need .exe
        // create a WebDriver instance
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
                WebDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize
                driver.manage().window().maximize();
                //  go to the website
                driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                //fill out username
                driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
                //fill out password
                driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
                //press the Login button
                driver.findElement(By.xpath("//input[@name='Submit']")).click();
                //find the PIM button
                WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
                //click on it
                pimBtn.click();
                //find the Employee List
                WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
                //click on it
                employeeListBtn.click();

//        get all the ids from the columns

                List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']" +
                        "/tbody/tr/td[2]"));

                boolean idFound=false;
                while(!idFound) {
                    for (int i = 0; i < columnID.size(); i++) {
//extract the id from the entry in list
                        String id = columnID.get(i).getText();
//            check if it is the desired id
                        if (id.equalsIgnoreCase("677373784498")) {
//                check the checkbox associated with this particular  row
                            System.out.println("i have found the id on row number " + (i + 1));
                            WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']" +
                                    "/tbody/tr[" + (i + 1) + "]/td[1]"));
                            checkBox.click();
                            idFound=true;
                            break;
                        }

                    }
                    if (!idFound){
                        System.out.println("clicking ont he next button");
                    }
                }


            }
        }




