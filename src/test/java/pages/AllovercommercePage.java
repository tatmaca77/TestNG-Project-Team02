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
    @FindBy(xpath = "//*[@id='username']")
    public WebElement signinUsername;//
    @FindBy(xpath = "//*[@id='password']")
    public WebElement signinPassword;//
    @FindBy(xpath = "//*[@name='login']")
    public WebElement signinLogin;//
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signin;//
    //********* US13
    //Kullanıcı Sing Out butonuna tıklar
    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public static WebElement singOutButonu;
    //Kullanıcı Adress butonuna tıklar
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public static WebElement adressButonu;
    //Kullanıcı Shipping Adress in altındaki ADD butonuna tıklar
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public static WebElement shippingAdressADDButonu;
    //Kullanıcı FirstName kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public static WebElement firstNameKutusu;
    //Kullanıcı LastName kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public static WebElement lastNameKutusu;
    //Kullanıcı Country / Region kutusunu tıklar
    @FindBy(xpath = "//select[@id='shipping_country']")
    public static WebElement countryRegion1;
    //Kullanıcı Street address kutusunu tıklar
    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public static WebElement streetAddressKutusu;
    //Kullanıcı Town/City kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_city']")
    public static WebElement townCityKutusu;
    //Kullanıcı Postcode/Zip kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public static WebElement postCodeZipKutusu;
    //Kullanıcı Province kutusunu tıklar
    @FindBy(xpath = "//select[@id='shipping_state']")
    public static WebElement provinceKutusu;
    //Kullanıcı Save Address butonunu tıklar
    @FindBy(xpath = "//button[@name='save_address']")
    public static WebElement saveAddress;
    //********  US_14
    //Kullanıcı 'Store Manager' butnuna tiklar
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public static WebElement storeManagerButonu;
    // Kullanıcı 'Products' butonuna tiklar
    @FindBy(xpath = "(//span[@class='text'])[4]")
    public static WebElement productsButonu;
    //Kullanıcı çıkan Add New butonuna tıklar
    @FindBy(xpath = "//*[text()='Add New']")
    public static WebElement addNewButonu;
    //Kullanıcı Simple Product kutusunu tıklar
    @FindBy(xpath = "//select[@id='product_type']")
    public static WebElement simpleProductKutusu;
    //Kullanıcı 'Product Title' kutusunu doldurur
    @FindBy(xpath = "//input[@id='pro_title']")
    public static WebElement productTitleKutusu;
    //Kullanıcı 'Short Description' kutusunu doldurur
    @FindBy(xpath = "(//body[@id='tinymce'])[1]")
    public static WebElement shortDescriptionKutusu;
    //Kullanıcı 'Description' kutusunu doldurur
    @FindBy(xpath = "//body[@data-id='description']")
    public static WebElement descriptionKutusu;
    //Kullanıcı  büyük resim kutusuna  tıklar
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public static WebElement buyukResimKutusu;
    //Kullanıcı "Select files" butonuna tiklar
    @FindBy(xpath = "//button[@class='browser button button-hero']")
    public static WebElement selectFilesButonu;
    //Kullanıcı "Select " butonuna tiklar
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public static WebElement selectButonu1;
    //Kullanıcı küçük resim kutusuna tıklar
    @FindBy(xpath = "//span[@class='wcfm-wp-fields-uploader wcfm_gallery_upload multi_input_block_element wcfm_img_uploader']")
    public static WebElement kucukresimKutusu;
    //Kullanıcı 'Appointment' secenegine tiklar
    @FindBy(xpath = "//input[@value='645']")
    public static WebElement aaaSecenegi;
    //Kullanıcı 'Add new category' butonuna tıklar
    @FindBy(xpath = "(//p[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[1]")
    public static WebElement addNewCategoryButonu;
    //Kullanıcı 'Category name' butonuna tıklar
    @FindBy(xpath = "//input[@id='wcfm_new_cat']")
    public static WebElement categoryNameKutusu;
    //Kullanıcı ''ADD' butonuna tıklar
    @FindBy(xpath = "//button[@data-taxonomy='product_cat']")
    public static WebElement addButonu1;
    //Kullanıcı Products Brands seçeneklerinden 'ack' seçeneğine tıklar

    @FindBy(xpath = "(//input[@value='468']")
    public static WebElement yirmiBirGunTarhanaSecenegi;


    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
    public static WebElement selectFiles;

    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
    public static WebElement selectFiles1;
    @FindBy(xpath = "(//*[text()='Catalog visibility:'])[1]")
    public static WebElement catalogVisibilitiButonu;
    //Kullanıcı 'Add new Product Brands' yazizina tiklar
    @FindBy(xpath = "(//p)[17]")
    public static WebElement addNewProductBrandsKutusu;
    //Kullanıcı 'Product Brands name' yazizina tiklar
    @FindBy(xpath = "//input[@id='wcfm_new_product_brand']")
    public static WebElement productBrandsNameKutusu;
    //Kullanıcı 'ADD' butonuna tiklar
    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    public static WebElement addButonu2;
    //Kullanıcı 'SUBMIT' butonuna tiklar
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public static WebElement submitButonu;














































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
    @FindBy (xpath = "//a[text()='Pencil2']")
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
    // Kupon kismina gitmek icin alinan Store Manager locate'i.
    @FindBy (xpath = "//a[text()='Store Manager']")
    public WebElement storeManager;
    // Kupon bölümü locate'i.
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/store-manager/coupons/']")
    public WebElement coupons;
    // Kupon olusturmak icin ekle butonu locate'i.
    @FindBy (xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement addNew;
    @FindBy (xpath = "//h2[text()='Add Coupon']")
    public WebElement blueAddNewText;
    // Kupon olusturmak icin gerekli yerlerin locateleri.
    @FindBy (xpath = "(//input[@class='wcfm-text wcfm_ele'])[1]")
    public WebElement codeSection;
    @FindBy (xpath = "description")
    public WebElement description;
    @FindBy (xpath = "//select[@id='discount_type']")
    public WebElement discountType;
    @FindBy (xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;
    @FindBy (xpath = "//input[@id='expiry_date']")
    public WebElement couponExpiryDate;
    @FindBy (xpath = "//select[@data-handler='selectMonth']")
    public WebElement month;
    @FindBy (xpath = "//select[@data-handler='selectYear']")
    public WebElement year;
    @FindBy (xpath = "//a[@data-date='25']")
    public WebElement date;
    @FindBy (xpath = "//input[@id='free_shipping']")
    public WebElement allowFreeShipping;
    @FindBy (xpath = "//input[@id='show_on_store']")
    public WebElement showOnStore;
    @FindBy (xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitButton;
    @FindBy (xpath = "//a[text()='bedava123']")
    public WebElement codeText;
    // Fatura Bilgileri doldururken alinan hata mesajlari
    @FindBy (xpath = "//li[contains(@class,'alert alert-simple')]")
    public WebElement firstNameAlertMessage;
    @FindBy (xpath = "//li[@data-id='billing_last_name']")
    public WebElement lastNameAlertMessage;
    @FindBy (xpath = "(//input[@class='input-text '])[4]")
    public WebElement addressAlertMessage;
    @FindBy (xpath = "//li[@data-id='billing_postcode']")
    public WebElement postCodeAlertMessage;
    @FindBy (xpath = "//li[@data-id='billing_phone']")
    public WebElement phoneAlertMessage;
    @FindBy (xpath = "//li[@data-id='billing_email']")
    public WebElement emailAlertMessage;































































    //TOLGAHAN ATMACA
    //ZEYNEP GUL KAYA
















































    //ZEYNEP GUL KAYA

}
