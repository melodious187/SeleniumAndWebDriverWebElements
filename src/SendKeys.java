import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

    public static void main(String[] args) throws InterruptedException  {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get the WebElement corresponding to the Text Box Field
        WebElement textBox = driver.findElement(By.name("firstName"));

        // Type some text into the text field
        textBox.sendKeys("Bond.  James Bond");
        Thread.sleep(1500);

        // Clear the text box
        textBox.clear();
        Thread.sleep(1500);

        driver.quit();

    }

}
