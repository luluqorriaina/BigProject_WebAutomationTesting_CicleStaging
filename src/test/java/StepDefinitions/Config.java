package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {

    public static WebDriver driver;

    @Before
    public static void openBrowser() throws InterruptedException {

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\luluq\\AppData\\Local\\Google\\Chrome\\User Data");
        chrome_options.addArguments("--profile-directory=default");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver(chrome_options);
        driver.manage().window().maximize();
        driver.get("https://staging.cicle.app");
        Thread.sleep(20000);
        WebElement btnTeam = driver.findElement(By.xpath("//*[contains(text(),'Web Automation')]"));
        WebDriverWait wait = new WebDriverWait(driver, 10, 10);
        WebElement waitBtnTeam = wait.until(ExpectedConditions.visibilityOf(btnTeam));
        waitBtnTeam.click();
    }

    @After
    public void closeBrowser() {driver.quit();}

}
