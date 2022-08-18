package Gun07;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
// bunun için aşağıdaki consructor eklendi ve için PageFatory ile
// driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
// Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
// anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
// aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
// gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.


public class _03_PlaceOrderElements {

    public _03_PlaceOrderElements(WebDriver driver) {

        PageFactory.initElements(driver,this);

    }

    @FindBy(css="[class=\"form-control input-lg\"")
    public WebElement searchBox;

    @FindBy(css = "[class=\"btn btn-default btn-lg\"")
    public WebElement searchBtn;

    @FindBy(xpath = "(//span[text()=\"Add to Cart\"])[1]")
    public WebElement addChart1;

    @FindBy(id = "cart-total")
    public WebElement cartCheck;

    @FindBy(xpath = "(//a[@href=\"https://opencart.abstracta.us:443/index.php?route=checkout/checkout\"])[1]")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public  WebElement cnt1;

    @FindBy(id = "button-shipping-address")
    public  WebElement cnt2;

    @FindBy(id = "button-shipping-method")
    public  WebElement cnt3;

    @FindBy(css = "[type=\"checkbox\"")
    public  WebElement lastcheckbox;

    @FindBy(id = "button-payment-method")
    public  WebElement cnt4;

    @FindBy(id = "button-confirm")
    public  WebElement cnt5;

    @FindBy(css = "[id=\"content\"]>h1")
    public  WebElement lastText2;

}
