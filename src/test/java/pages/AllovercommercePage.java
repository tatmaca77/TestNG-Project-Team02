package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
git
public class AllovercommercePage {


    public AllovercommercePage() {   // Constructor olusturulur !!!
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //AHMET EFE
    //ASLI UZUN












































    //ASLI UZUN
    //BETUL SONGUL ARSLANOGLU
















































    //BETUL SONGUL ARSLANOGLU
    //BETUL OZDAS
















































    //BETUL OZDAS
    //EKREM ASLAN
















































    //EKREM ASLAN
    //HAKAN SAHIN

















































    //HAKAN SAHIN
    //M.SERBULENT ASRLAN















































    //M.SERBULENT ARSLAN
    //SULTAN GOKTAS
















































    //SULTAN GOKTAS
    //TOLGAHAN ATMACA

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signIn;
    @FindBy (xpath = "//a[text()='Signup as a vendor?']")
    public WebElement signupAsVendor;
    @FindBy (xpath = "(//input[@id='username'])[1]")
    public WebElement emailUsername;
    @FindBy (xpath = "(//input[@id='password'])[1]")
    public WebElement passwordBox;
    @FindBy (xpath = "(//input[@id='rememberme'])[1]")
    public WebElement rememberMe;
    @FindBy (xpath = "(//button[@name='login'])[1]")
    public WebElement signInButton;
    @FindBy (xpath = "//span[text()='Sign Out']")
    public WebElement signOut;
    @FindBy (xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchBox;
    @FindBy (xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']/following-sibling::img)[3]")
    public WebElement product1;
    @FindBy (xpath = "//button[text()='Add to cart']")
    public WebElement addToCart;
    @FindBy (xpath = "//button[@title='Plus']")
    public WebElement plus;
    @FindBy (xpath = "//button[@title='Minus']")
    public WebElement minus;
    @FindBy (xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement cartIcon;
    @FindBy (xpath = "(//span[@class='cart-count'])[1]")
    public WebElement cart1;
    @FindBy (xpath = "//h4[text()='Shopping Cart']")
    public WebElement shoppingCart;
    @FindBy (xpath = "//a[text()='Checkout']")
    public WebElement checkout;
    @FindBy (xpath = "//h3[text()='Billing details']")
    public WebElement billingDetailsText;
    @FindBy (id = "billing_first_name")
    public WebElement firstName;
    @FindBy (id = "billing_last_name")
    public WebElement lastName;
    @FindBy (id = "billing_address_1")
    public WebElement address;
    @FindBy (id = "billing_city")
    public WebElement city;
    @FindBy (id = "billing_postcode")
    public WebElement zipCode;
    @FindBy (id = "billing_phone")
    public WebElement phone;
    @FindBy (id = "billing_email")
    public WebElement emailAddress;
    @FindBy (xpath = "//select[@id='billing_country']")
    public WebElement country;
    @FindBy (xpath = "//select[@id='billing_state']")
    public WebElement stateOptional;
    @FindBy (xpath = "//button[@id='place_order']")
    public WebElement placeOrder;
    @FindBy (xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtTheDoor;
    @FindBy (xpath = "//input[@id='payment_method_bacs']")
    public WebElement wireTransfer;






























































    //TOLGAHAN ATMACA
    //ZEYNEP GUL KAYA
















































    //ZEYNEP GUL KAYA

}
