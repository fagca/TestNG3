package TestNGFriday_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project5_POM {

    public Project5_POM(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "Email")
    public  WebElement login;

    @FindBy (id = "Password")
    public WebElement password;

    @FindBy (css = "[class=\"button-1 login-button\"")
    public WebElement click;

    @FindBy (xpath = "(//a[@class=\"account\"])[1]")
    public WebElement loginCheck;

    @FindBy (css = "[class=\"validation-summary-errors\"] span")
    public WebElement negativeLoginText;

    @FindBy (css = "[class=\"validation-summary-errors\"]>ul>li")
    public WebElement negativeCustomerText;

    @FindBy(css = "[class=\"ico-logout\"")
    public WebElement logout;

    @FindBy(css = "[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/31/1/1    ');return false;\"")
    public WebElement addChart2;

    @FindBy (xpath = "//span[text()=\"Shopping cart\"]")
    public WebElement shoppingCardBtn;

    @FindBy (id = "termsofservice")
    public WebElement agrebox;

    @FindBy (id = "checkout")
    public WebElement checkout1;

    @FindBy (css = "[onclick=\"Billing.save()\"")
    public WebElement cnt1;

    @FindBy (id = "PickUpInStore")
    public WebElement inStorePickup;

    @FindBy (css = "[onclick=\"Shipping.save()\"")
    public WebElement cnt2;

    @FindBy (css = "[onclick=\"ShippingMethod.save()\"")
    public WebElement cnt3;

    @FindBy (css = "[onclick=\"PaymentMethod.save()\"")
    public WebElement cnt4;

    @FindBy (css = "[onclick=\"PaymentInfo.save()\"")
    public WebElement cnt5;

    @FindBy (css = "[onclick=\"ConfirmOrder.save()\"")
    public WebElement cnt6;

    @FindBy (css = "div [class=\"title\"]>strong")
    public WebElement success;

    @FindBy (css = "[class=\"ico-login\"")
    public  WebElement loginMain;









}
