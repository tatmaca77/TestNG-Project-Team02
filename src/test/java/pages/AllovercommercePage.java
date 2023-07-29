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
    //Kullanıcı Sing Out butonuna tıklar
    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public WebElement singOutButonu;

    //Kullanıcı Adress butonuna tıklar

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement adressButonu;

    //Kullanıcı Shipping Adress in altındaki ADD butonuna tıklar
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdressADDButonu;

    //Kullanıcı FirstName kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement firstNameKutusu;

    //Kullanıcı LastName kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement lastNameKutusu;

    //Kullanıcı Country / Region kutusunu tıklar
    @FindBy(xpath = "select2-shipping_country-container")
    public WebElement countryRegionKutusu;

    //Kullanıcı Street address kutusunu tıklar
    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public WebElement streetAddressKutusu;

    //Kullanıcı Postcode/Zip kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public WebElement postcodeZipKutusu;

    //Kullanıcı Town/City kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement townCityKutusu;

    //Kullanıcı Province kutusunu tıklar
    @FindBy(xpath = "//span[@id='select2-shipping_state-container']")
    WebElement provinceKutusu;

    //Kullanıcı Save Address butonunu tıklar
    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement saveAddress;

    //Kullanıcı vendor shipping adres i kaydettiğini doğrular
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement editYourShippingAddressButonu;

//********  US_14

    //Kullanıcı My Accont tu tıklar
    @FindBy(xpath = "//li[@id='menu-item-1079']")
    public WebElement myAccontButonu;

















































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
    @FindBy (xpath = "(//img[@sizes='(max-width: 300px) 100vw, 300px']/following-sibling::img)[4]")
    public WebElement product;
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
    public WebElement cartCount;
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
    @FindBy (xpath = "//h4[text()='Payment Methods']")
    public WebElement paymentMethods;
    @FindBy (xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement messageText;
    @FindBy (xpath = "(//a[text()='View'])[1]")
    public WebElement view;
    @FindBy (xpath = "//h2[text()='Order details']")
    public WebElement orderDetails;
    // Sign Out yaptiktan sonra Orders bölümünün locate'i. ( Kayitli Ürünleri Görebilmek icin )
    @FindBy (xpath = "//a[text()='Orders']")
    public WebElement orders;
    @FindBy (xpath = "//h2[text()='My Account']")
    public WebElement myAccountText;































































    //TOLGAHAN ATMACA
    //ZEYNEP GUL KAYA
















































    //ZEYNEP GUL KAYA

}
