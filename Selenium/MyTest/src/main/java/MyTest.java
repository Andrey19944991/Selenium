import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {

        Queue<String> list=new LinkedList<>();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chekov.a.a\\Desktop\\source\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.ulmart.ru/");
       // list.add(driver.getPageSource());


        driver.findElement(By.id("linkImage4449299")).click();

        Thread.sleep(30000);


        driver.findElement(By.id("linkImage4449299")).click();
        driver.close();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        driver.close();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        //driver.close();

        //driver.close();



        driver.findElement(By.xpath("//*[@id=\"addToCart_btn\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"bottom-cart\"]/span[1]/span[1]")).click();


       // list.add(driver.getTitle());

       //driver.get("https://www.ulmart.ru/cart/add?id=4449299&showPreCart=true");


       // list.add(driver.getPageSource());

        //driver.get("https://www.ulmart.ru/cart");
       // String myPage=driver.getWindowHandle();
        //driver.switchTo((String) myPage);

       // list.add(driver.getPageSource());

      /*
        for(String x:list){
            System.out.println(x);
        }

       */





    }

}
