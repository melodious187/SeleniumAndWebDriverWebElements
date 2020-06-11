import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

    public static void main(String[] args) throws InterruptedException {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get WebElement
        WebElement element = driver.findElement(By.id("idOfButton"));

        // Create string variable to hold the CSS Value of the element
        String cssValue = element.getCssValue("background-color");

        // Print out pre-click cssValue
        System.out.println("The pre-click CSS Value of the background color of the button is: " + cssValue);

        // Click on button and get color again
        element.click();
        String cssValue2 = element.getCssValue("background-color");
        // Print out post-click cssValue
        System.out.println("The post-click CSS Value of the background color of the button is: " + cssValue2);

        // sleep
        Thread.sleep(2000);


        // Close browser
        driver.close();


    }

}
