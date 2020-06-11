import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

    public static void main(String[] args) {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get WebElement
        WebElement element = driver.findElement(By.id("idOfButton"));

        // Create String variable to hold tagName of element
        String tagName = element.getTagName();

        // Print out the tagName of element
        System.out.println("The Tag Name of the button is: " + tagName);

        // Close browser
        driver.quit();


    }

}
