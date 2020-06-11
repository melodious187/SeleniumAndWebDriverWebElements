import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class DropDownAndMultipleSelect {

    public static void main(String[] args) throws InterruptedException {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page and maximize window
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();

        // Get the WebElement for the dropdown
        WebElement contentsDropdown = driver.findElement(By.id("testingDropdown"));

        // Create an object of Select Class
        Select oSelect = new Select(contentsDropdown);

        // Select item Manual Testing on drop down via Visible text
        oSelect.selectByVisibleText("Manual Testing");
        // Sleep so the page can be observed
        Thread.sleep(3000);

        // Select item Manual Testing on drop down via index value
        oSelect.selectByIndex(3);
        // Sleep so the page can be observed
        Thread.sleep(3000);


        // close the browser
        driver.close();










    }

}
