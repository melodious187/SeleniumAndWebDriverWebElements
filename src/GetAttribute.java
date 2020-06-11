import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

    public static void main(String[] args) {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get the WebElement
        WebElement element = driver.findElement(By.id("female"));

        // Create String variable to hold the value of the Attribute
        String attributeValue = element.getAttribute("name");

        // Print name of Attribute
        System.out.println("The name of the Attribute is: " + attributeValue);

        // Close this instance of the browser
        driver.close();



    }

}
