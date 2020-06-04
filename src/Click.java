import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

    public static void main(String[] args) throws InterruptedException {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        WebElement element = driver.findElement(By.linkText("This is a link"));
        element.click();
        Thread.sleep(3000);

        driver.quit();

    }

}
