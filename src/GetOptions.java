import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetOptions {

    public static void main(String[] args) throws InterruptedException {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page and maximize window
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();

        // Get the WebElement
        WebElement contentsDropdown = driver.findElement(By.id("testingDropdown"));

        // Create an object of class Select
        Select oSelect = new Select(contentsDropdown);

        // Get all the Dropdown options and store them to a list
        List<WebElement> options = oSelect.getOptions();

        // Print WebElement
        System.out.println("The contentsDropdown include: " + contentsDropdown);
        System.out.println("The number of options in the selected dropdown is " +  options.size());

        for (int i = 0; i<options.size(); i++ ){
            System.out.println("Item " + i + " is: " + options.get(i).getText());
        }

        // sleep for a bit
        Thread.sleep(30);

        // Close the browser
        driver.close();


    }

}

