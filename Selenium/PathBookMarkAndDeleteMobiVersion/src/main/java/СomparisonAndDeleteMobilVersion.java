import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class СomparisonAndDeleteMobilVersion {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chekov.a.a\\Desktop\\source\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://m.ulmart.ru/");
        //driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/a[4]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/a[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[4]/div[1]/div/div[3]/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[5]/div[1]/div/div[3]/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[5]/div[1]/div/div[3]/div/a[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/div/div[2]/form/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/div/div[2]/form/a")).click();
    }
}
