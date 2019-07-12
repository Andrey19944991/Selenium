import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestForUlmart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chekov.a.a\\Desktop\\source\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ulmart.ru/");
        WebElement searchButton = driver.findElement(By.className("form b-form-search b-form-search_theme_normal"));
        Actions actions = new Actions(driver);
        // use the action handler to move the cursor to given element
        actions.moveToElement(searchButton).perform();
        // wait until the search field is presented on the webpage and create an
        // element
        WebElement searchField = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("s")));
        // puts the text "java" into the search field
        searchField.sendKeys("java");
        // submit the search (submit the form)
        searchField.submit();
        // wait 5 seconds and close the browser
        Thread.sleep(5000);
        driver.quit();
    }
}
