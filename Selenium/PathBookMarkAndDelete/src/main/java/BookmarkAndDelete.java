import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class BookmarkAndDelete {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chekov.a.a\\Desktop\\source\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.ulmart.ru/");

        WebElement webDriver=driver.findElement(By.xpath("//*[@id=\"searchField\"]"));
        webDriver.sendKeys("Компьютер");
        webDriver.submit();
       /* for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        */
        Thread.sleep(10000);

        Actions builder=new Actions(driver);
        Action action=builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"prod4467947\"]/div/div[2]/div[2]/span/a/span"))).build();
        action.perform();
        driver.findElement(By.xpath("//*[@id=\"toFavorites4467936\"]/span[2]")).click();


        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"toFavorites4467941\"]/span[2]"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();", ele2);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fav_link\"]/span[2]/span[1]")).click();

        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"listOfFavLists\"]/li[2]/div[2]/button[2]/span")).click();



    }

}
