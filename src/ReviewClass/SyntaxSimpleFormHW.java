package ReviewClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxSimpleFormHW {
    /*
    Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" http://syntaxprojects.com");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep((3000));
        driver.findElement(By.xpath("//a[@class='list-group-item'and@href='basic-first-form-demo.php']")).click();

    }
}
