import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Elements {

    public static void main(String[] args) {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.nytimes.com";
        driver.get(url);

        // Get a list of all links on the web page by tagName
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Get the size of the list
        int linksSize = links.size();
        System.out.println("The size of the list of links on NY Times page is: " + linksSize);

        // Print out a list of the links on the page
        for (int i=0; i<linksSize; i++) {
            System.out.println(i + " " + links.get(i).getText());
        }

        // close the browser
        driver.quit();

    }

}
