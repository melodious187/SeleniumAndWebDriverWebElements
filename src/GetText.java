import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

    public static void main(String[] args) {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get the WebElement
        WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div"));

        // Create string variable to hold the text of the element
        String text = element.getText();

        // Print the test of the element
        System.out.println("The text in the element is: " + text);

        // Close browser
        driver.quit();



    }

}
