package z_sofskills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCasesGroup3Genel {


    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri(){
        System.out.println("Driver start..");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe" );
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece anasayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //bütün webelement için geçerli

        driver.get("https://campus.techno.study/");

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

        WebElement email = driver.findElement(By.cssSelector("[class*='mat-form-field-infix']>input"));
        email.sendKeys("ferhatagca@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("LtRoF5ra");

        WebElement login = driver.findElement(By.cssSelector("span[class='mat-button-wrapper']"));
        login.click();

    }


}
