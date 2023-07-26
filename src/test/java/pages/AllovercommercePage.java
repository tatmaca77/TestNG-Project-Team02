package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
    /** TOLGAHAN ATMACA */
    // Ana sayfada giris yapabilmek icin Sag üst kösedeki " SIG IN " kisminin locate'i.
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signIn;
    //Sign in yapabilmek icin email kutusunun locate'i.
    @FindBy (xpath = "(//input[@id='username'])[1]")
    public WebElement emailUsername;
    // Sign in yapabilmek icin password kutusun locate'i.
    @FindBy (xpath = "(//input[@id='password'])[1]")
    public WebElement passwordBox;
    // Remember Me kutucugunun locate'i.
    @FindBy (xpath = "(//input[@id='rememberme'])[1]")
    public WebElement rememberMe;
    // Sign in butonu'nun locate'i.
    @FindBy (xpath = "(//button[@name='login'])[1]")
    public WebElement signInButton;
    // Sign Out kisminin locate'i.
    @FindBy (xpath = "//span[text()='Sign Out']")
    public WebElement signOut;
    // Arama Kutusunun locate'i.
    @FindBy (xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchBox;
    @FindBy (xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']/following-sibling::img)[3]")
    public WebElement product1;
    // Add To Cart butonu'nun locate'i.
    @FindBy (xpath = "//button[text()='Add to cart']")
    public WebElement addToCart;
    // Ürün sayisini artirmak icin Quantity "+" bölümünün locate'i.
    @FindBy (xpath = "//button[@title='Plus']")
    public WebElement plus;
    // Ürün Sayisini azaltmak icin Quantity "-" bölümünün locate'i.'
    @FindBy (xpath = "//button[@title='Minus']")
    public WebElement minus;
    // Sag üst kösedeki " CART ICON " nun locate'i.
    @FindBy (xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement cartIcon;
    @FindBy (xpath = "(//span[@class='cart-count'])[1]")
    public WebElement cart1;
    @FindBy (xpath = "//h4[text()='Shopping Cart']")
    public WebElement shoppingCart;
    // Ürünlerin siparislerine devam etmek icin Fatura Detaylarina gitmek icin "CheckOut" butonu locate'i.
    @FindBy (xpath = "//a[text()='Checkout']")
    public WebElement checkout;
    @FindBy (xpath = "//h3[text()='Billing details']")
    public WebElement billingDetailsText;
    // Fatura bölümündeki isim locate'i.
    @FindBy (id = "billing_first_name")
    public WebElement firstName;
    // Fatura kismi soyisim locate'i
    @FindBy (id = "billing_last_name")
    public WebElement lastName;
    // Fatura kismi address Street bölümü locate'i
    @FindBy (id = "billing_address_1")
    public WebElement address;
    // Fatura bölümündeki city locate'i.
    @FindBy (id = "billing_city")
    public WebElement city;
    // Fatura bölümündeki Posta Code locate'i.'
    @FindBy (id = "billing_postcode")
    public WebElement zipCode;
    // Fatura bölümünün telefon numarasi locate'i.
    @FindBy (id = "billing_phone")
    public WebElement phone;
    // Fatura bölümündeki mail adresi locate'i.
    @FindBy (id = "billing_email")
    public WebElement emailAddress;
    // Fatura bölümündeki Country locate'i.
    @FindBy (xpath = "//select[@id='billing_country']")
    public WebElement country;
    @FindBy (xpath = "//select[@id='billing_state']")
    public WebElement stateOptional;
    // Siparisi Tamamlamak icin " PLACE ORDER" butonu locate'i.
    @FindBy (xpath = "//button[@id='place_order']")
    public WebElement placeOrder;
    // Ödeme Methodu bölümündeki " Pay at the Door" locate'i
    @FindBy (xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtTheDoor;
    // Ödeme Methodu bölümündeki " Wire Transfer" locate'i.
    @FindBy (xpath = "//input[@id='payment_method_bacs']")
    public WebElement wireTransfer;






























































    //TOLGAHAN ATMACA
    //ZEYNEP GUL KAYA
















































    //ZEYNEP GUL KAYA

}
