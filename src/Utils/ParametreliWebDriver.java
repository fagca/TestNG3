package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametreliWebDriver {


    public  WebDriver driver;

    public static WebDriverWait wait;


    @Parameters("browser")
    @BeforeClass
    public void BaslangicIslemleri(String browser){
        System.out.println("Driver start..");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if (browser.equalsIgnoreCase("chrome")){

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe" );
        driver = new ChromeDriver();

        } else
            if (browser.equalsIgnoreCase("firefox")) {

                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
        }


        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece anasayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //bütün webelement için geçerli

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        LoginTest();
    }

    @AfterClass
    public void BitisIslemleri(){
        System.out.println("Driver stop..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    void LoginTest(){


        WebElement login = driver.findElement(By.id("input-email"));
        login.sendKeys("cucumber_1@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("12345");

        WebElement click = driver.findElement(By.cssSelector("[value=\"Login\"]"));
        click.click();
    }


}
