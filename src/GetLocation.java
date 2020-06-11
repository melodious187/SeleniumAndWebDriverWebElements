import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.DataInput;

public class GetLocation {

    public static void main(String[] args) {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get WebElement
        WebElement element = driver.findElement(By.id("idOfButton"));

        // Create instance of Point class and get the location of the button
        Point location = element.getLocation();

        // Print out the location of the element
        System.out.println("The location of the element is: " + location);
        System.out.println("The X coordinate of the element is: " + location.x);
        System.out.println("The Y coordinate of the element is: " + location.y);

        // Close the browser
        driver.close();


    }

}
