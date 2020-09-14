import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Runner {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://catalog.onliner.by/");
//        WebElement electronicNavButton = driver.findElement(By.cssSelector("li[data-id='1']"));
        WebElement electronicNavButton = driver.findElement(By.xpath("//li[@data-id='1']"));
        electronicNavButton.click();
        WebElement gadgetsSecondLevelNavButton = driver.findElement(By.cssSelector("div[data-id='1'] " +
                "div.catalog-navigation-list__aside-list " +
                "div.catalog-navigation-list__aside-item:nth-child(8)"));
        gadgetsSecondLevelNavButton.click();



        driver.close();
    }
}
