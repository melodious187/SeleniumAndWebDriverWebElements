import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

    public static void main(String[] args) throws InterruptedException  {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch web page
        String url = "https://www.kickstarter.com/login?ref=nav";
        driver.get(url);

        // Get the WebElement corresponding to the "Email" field and enter value
        WebElement email = driver.findElement(By.id("user_session_email"));
        email.sendKeys("andrew@fromthemind.com");
        // Get the WebElement corresponding to the "Password" field and enter value
        WebElement password = driver.findElement(By.id("user_session_password"));
        password.sendKeys("Th1s!sMyP4ssw0rd");
        // Get the WebElement corresponding to the "Login" button
        WebElement login = driver.findElement(By.name("commit"));
        // Submit the form
        //login.submit();
        // or
        //email.submit();
        // or
        password.submit();




        Thread.sleep(3000);




    }

}
