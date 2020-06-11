import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

    public static void main(String[] args) {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get WebElement
        WebElement element = driver.findElement(By.id("idOfButton"));

        // Create instance of Dimension class and get the size of the Button
        Dimension size = element.getSize();

        // Print out the button dimension
        System.out.println("The size of the button is: " + size);
        System.out.println("The width of the button from the constant is: "+ size.width);
        System.out.println("The height of the button from the constant is: " + size.height);
        System.out.println("The width of the button using the method getWidth is: " + size.getWidth());
        System.out.println("The height of the button using the method getHeight is: " + size.getHeight());

        // Close the browser
        driver.close();







    }

}
