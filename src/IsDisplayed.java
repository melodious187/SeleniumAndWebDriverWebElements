import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

    public static void main(String[] args) {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch web page
        String url = "http://omayo.blogspot.com/";
        driver.get(url);

        // Get WebElement corresponding to hidden button
        WebElement hiddenbutton = driver.findElement(By.id("hbutton"));
        boolean hbstatus;

        // check if hidden button is displayed
        hbstatus = hiddenbutton.isDisplayed();
        System.out.println("Is the hidden button displayed on the screen?: " + hbstatus);

        // check if hidden button is present in the DOM and print the findings
        boolean hButtDom = driver.findElements(By.id("hbutton")).size()>0;
        System.out.println("Is the hidden button found in the DOM?:        " + hButtDom);

        // Find the size of the hidden button WebElement and print the results
        Dimension hButtSize = driver.findElement(By.id("hbutton")).getSize();
        System.out.println("The size of the hidden button is: " + hButtSize);


        // close browser
        driver.quit();


    }

}
