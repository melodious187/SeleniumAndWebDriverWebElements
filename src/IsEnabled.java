import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

    public static void main(String[] args) {


        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch web page
        String url = "http://www.testdiary.com/training/selenium/selenium-test-page/";
        driver.get(url);

        // Get the WebElement corresponding to the Check Boxes & Radio Buttons SAVE button
        WebElement saveButton = driver.findElement(By.id("demo"));


        // check if button is enabled
        boolean buttStatus;
        buttStatus = saveButton.isEnabled();
        System.out.println("Is the Save button enabled?: " + buttStatus);

 
        // close the browser
        driver.quit();




    }

}
