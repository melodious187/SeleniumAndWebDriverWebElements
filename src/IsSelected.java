import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

    public static void main(String[] args) throws InterruptedException{

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch web page
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Get the WebElements corresponding to the "Automation Testing" and "Performance Testing" checkboxes
        WebElement autoCheckbox = driver.findElement(By.className("Automation"));
        WebElement perfCheckbox = driver.findElement(By.className("Performance"));

        boolean autoResult;
        boolean perfResult;

        // check if checkbox is selected
        autoResult = autoCheckbox.isSelected();
        perfResult = perfCheckbox.isSelected();

        System.out.println("Automation checkbox selection is:  " + autoResult);
        System.out.println("Performance checkbox selection is: " + perfResult);
        Thread.sleep(2000);

        // click on both checkboxes
        autoCheckbox.click();
        perfCheckbox.click();

        // check again if checkbox is selected
        autoResult = autoCheckbox.isSelected();
        perfResult = perfCheckbox.isSelected();

        System.out.println("Automation checkbox selection is:  " + autoResult);
        System.out.println("Performance checkbox selection is: " + perfResult);

        Thread.sleep(2000);

        driver.quit();


    }

}
