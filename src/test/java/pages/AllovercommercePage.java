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
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signInRegister;
    @FindBy(id = "customer_login")
    public WebElement signInPopUp;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameKutusu;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//*[@name='login']")
    public WebElement popUpsignIn;
    @FindBy(xpath = "//*[@class='account']")
    public WebElement signOutButonu;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement myAccountYazisi;
    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboardText;
    @FindBy(xpath = "//*[.='Store Manager']")
    public WebElement storeManagerText;
    @FindBy(xpath = "//h2[1]")//Store Manager başlığı
    public WebElement storeManagerBaslik;
    @FindBy(xpath = "(//*[.='Orders'])[1]")
    public WebElement orderText;
    @FindBy(xpath = "(//h4)[2]")
    public WebElement orderBaslik;
    @FindBy(xpath ="//*[.='Downloads']")
    public WebElement downloadsText;
    @FindBy(xpath = "(//*[h4])[2]")
    public WebElement downloadsBaslik;
    @FindBy(xpath = "(//*[.='Addresses'])")
    public WebElement addressesText;
    @FindBy(xpath = "(//h4)[2]")
    public WebElement addressesBaslik;
    @FindBy(xpath = "//*[.='Account details']")
    public WebElement accountDetailstext;
    @FindBy(xpath = "(//h4)[2]")
    public WebElement accountDetailsBaslik;
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/wishlist/'])[2]")
    public WebElement wishlistText;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement wishlistBaslik;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/my-account-2/support-tickets/']")
    public WebElement supportTicketsText;
    @FindBy(xpath = "//*[@data-title='Ticket(s)']")
    public WebElement ticketsStatus;
    @FindBy(xpath = "//*[.='Followings']")
    public WebElement followingsText;
    @FindBy(xpath = "//*[.='Followings']")
    public WebElement followingStore;
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logoutText;
    @FindBy(xpath = "//a[@class='edit btn btn-link btn-primary btn-underline mb-4']")
    public WebElement addText;
    @FindBy(xpath = "//h3[text()='Billing address']")
    public WebElement billingAddressSayfasi;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstNameKutu;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement LastNameKutusu;
    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement countryRegion;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAddressKutu;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement postcode;
    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement town;
    @FindBy(xpath = "//button[@class='btn btn-dark btn-rounded btn-sm']")
    public WebElement saveAddressButton;
    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement billingMailKutusu;
    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement province;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement addressChanged;










































































    //Ahmet EFE
    //BETUL SONGUL ARSLANOGLU
    @FindBy(xpath = "//*[@id='username']")
    public WebElement signinUsernameB;//
    @FindBy(xpath = "//*[@id='password']")
    public WebElement signinPasswordB;//
    @FindBy(xpath = "//*[@name='login']")
    public WebElement signinLoginB;//
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signinB;//
    //********* US13
    //Kullanıcı Sing Out butonuna tıklar
    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public static WebElement singOutButonuB;
    //Kullanıcı Adress butonuna tıklar
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public static WebElement adressButonuB;
    //Kullanıcı Shipping Adress in altındaki ADD butonuna tıklar
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public static WebElement shippingAdressADDButonuB;
    //Kullanıcı FirstName kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public static WebElement firstNameKutusuB;
    //Kullanıcı LastName kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public static WebElement lastNameKutusuB;
    //Kullanıcı Country / Region kutusunu tıklar
    @FindBy(xpath = "//select[@id='shipping_country']")
    public static WebElement countryRegion1B;
    //Kullanıcı Street address kutusunu tıklar
    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public static WebElement streetAddressKutusuB;
    //Kullanıcı Town/City kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_city']")
    public static WebElement townCityKutusuB;
    //Kullanıcı Postcode/Zip kutusunu doldurur
    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public static WebElement postCodeZipKutusuB;
    //Kullanıcı Province kutusunu tıklar
    @FindBy(xpath = "//select[@id='shipping_state']")
    public static WebElement provinceKutusuB;
    //Kullanıcı Save Address butonunu tıklar
    @FindBy(xpath = "//button[@name='save_address']")
    public static WebElement saveAddressB;
    //********  US_14
    //Kullanıcı 'Store Manager' butnuna tiklar
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public static WebElement storeManagerButonuB;
    // Kullanıcı 'Products' butonuna tiklar
    @FindBy(xpath = "(//span[@class='text'])[4]")
    public static WebElement productsButonuB;
    //Kullanıcı çıkan Add New butonuna tıklar
    @FindBy(xpath = "//*[text()='Add New']")
    public static WebElement addNewButonuB;
    //Kullanıcı Simple Product kutusunu tıklar
    @FindBy(xpath = "//select[@id='product_type']")
    public static WebElement simpleProductKutusuB;
    //Kullanıcı 'Product Title' kutusunu doldurur
    @FindBy(xpath = "//input[@id='pro_title']")
    public static WebElement productTitleKutusuB;
    //Kullanıcı 'Short Description' kutusunu doldurur
    @FindBy(xpath = "(//body[@id='tinymce'])[1]")
    public static WebElement shortDescriptionKutusuB;
    //Kullanıcı 'Description' kutusunu doldurur
    @FindBy(xpath = "//body[@data-id='description']")
    public static WebElement descriptionKutusuB;
    //Kullanıcı  büyük resim kutusuna  tıklar
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public static WebElement buyukResimKutusuB;
    //Kullanıcı "Select files" butonuna tiklar
    @FindBy(xpath = "//button[@class='browser button button-hero']")
    public static WebElement selectFilesButonuB;
    //Kullanıcı "Select " butonuna tiklar
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public static WebElement selectButonu1B;
    //Kullanıcı küçük resim kutusuna tıklar
    @FindBy(xpath = "//span[@class='wcfm-wp-fields-uploader wcfm_gallery_upload multi_input_block_element wcfm_img_uploader']")
    public static WebElement kucukresimKutusuB;
    //Kullanıcı 'Appointment' secenegine tiklar
    @FindBy(xpath = "//input[@value='645']")
    public static WebElement aaaSecenegiB;
    //Kullanıcı 'Add new category' butonuna tıklar
    @FindBy(xpath = "(//p[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[1]")
    public static WebElement addNewCategoryButonuB;
    //Kullanıcı 'Category name' butonuna tıklar
    @FindBy(xpath = "//input[@id='wcfm_new_cat']")
    public static WebElement categoryNameKutusuB;
    //Kullanıcı ''ADD' butonuna tıklar
    @FindBy(xpath = "//button[@data-taxonomy='product_cat']")
    public static WebElement addButonu1B;
    //Kullanıcı Products Brands seçeneklerinden 'ack' seçeneğine tıklar

    @FindBy(xpath = "(//input[@value='468']")
    public static WebElement yirmiBirGunTarhanaSecenegiB;


    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
    public static WebElement selectFilesB;

    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
    public static WebElement selectFiles1B;
    @FindBy(xpath = "(//*[text()='Catalog visibility:'])[1]")
    public static WebElement catalogVisibilitiButonuB;
    //Kullanıcı 'Add new Product Brands' yazizina tiklar
    @FindBy(xpath = "(//p)[17]")
    public static WebElement addNewProductBrandsKutusuB;
    //Kullanıcı 'Product Brands name' yazizina tiklar
    @FindBy(xpath = "//input[@id='wcfm_new_product_brand']")
    public static WebElement productBrandsNameKutusuB;
    //Kullanıcı 'ADD' butonuna tiklar
    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    public static WebElement addButonu2B;
    //Kullanıcı 'SUBMIT' butonuna tiklar
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public static WebElement submitButonuB;














































    //BETUL SONGUL ARSLANOGLU
    //BETUL OZDAS
















































    //BETUL OZDAS
    //EKREM ASLAN

    @FindBy(xpath = "//span[normalize-space()='Sign In']")
    public WebElement signIn1EA;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailEA;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordEA;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signIn2EA;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    public WebElement myAccountEA;

    @FindBy(xpath = "//a[normalize-space()='Store Manager']")
    public WebElement storeManagerEA;

    @FindBy(xpath = "//span[@class='text'][normalize-space()='Products']")
    public WebElement productEA;

    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    public WebElement addNewEA;

    @FindBy(xpath = "//div[@class='wcfm-tabWrap']")
    public WebElement scroll7ThingsEA;

    @FindBy(xpath = "//select[@id='backorders']")
    public WebElement ddminventoryAllowBackordersEA;

    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitEA;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
    public WebElement uyariEA;

    @FindBy(xpath = "//select[@id='shipping_class']")
    public WebElement ddmShippingShippingClassEA;

    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")
    public WebElement ddmShippingProcessingTimeEA;


    @FindBy(xpath = "//span[@aria-expanded='true']//ul[@class='select2-selection__rendered']")
    public WebElement ddmattributesColorYazmaKutusuEA;


    @FindBy(xpath = "(//span[@class='dropdown-wrapper'])[3]")
    public WebElement ddmattributesSizeYazmaKutusuEA;

    @FindBy(xpath = "//select[@id='product_type']")
    public WebElement ddmSimpleProductEA;

    @FindBy(xpath = "//select[@id='product_type']")
    public WebElement checkBoxVirtualEA;

    @FindBy(xpath = "//select[@id='product_type']")
    public WebElement checkBoxDownloadableEA;

    @FindBy(xpath = "//input[@id='regular_price']")
    public WebElement priceKutusuEA;

    @FindBy(xpath = "//input[@id='sale_price']")
    public WebElement salePriceKutusuEA;

    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement productTitleEA;

    @FindBy(xpath = "//li[@id='select2-attributes_value_1-result-qkud-29']")
    public WebElement colorBlackEA;

    @FindBy(xpath = "//li[@id='select2-attributes_value_1-result-v84a-276']")
    public WebElement colorRedEA;

    @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
    public WebElement colorYazmaKutusu;
















































    //EKREM ASLAN
    //HAKAN SAHIN

















































    //HAKAN SAHIN
    //M.SERBULENT ARSLAN
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signInButtonSA;
    @FindBy(xpath = "(//*[@id='username'])[1]")
    public WebElement usernameTextBox;
    @FindBy(xpath = "(//*[@id='password'])[1]")
    public WebElement passwordTextBox;
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountButton;
    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutButton;
    @FindBy(xpath = "//*[text()='Account details']")
    public WebElement accountDetailsButton;
    @FindBy(xpath = "//*[@id='account_first_name']")
    public WebElement firstNameTextBox;
    @FindBy(xpath = "//*[@id='account_display_name']")
    public WebElement displayNameTextBox;
    @FindBy(xpath = "//*[@id='account_last_name']")
    public WebElement lastNameTextBox;
    @FindBy(xpath = "//*[@id='account_email']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement biographyTextBox;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement saveChangesButton;
    @FindBy(id = "user_description_ifr")
    public WebElement userDescriptionIframe;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement verifyText;
    @FindBy(xpath = "//*[@id='password_current']")
    public WebElement currentPasswordTextBox;
    @FindBy(xpath = "//*[@id='password_1']")
    public WebElement newPasswordTextBox;
    @FindBy(xpath = "//*[@id='password_2']")
    public WebElement confirmPasswordTextBox;
    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement searchBoxSA;
    @FindBy(xpath = "//*[@name='add-to-cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement cartIconSA;
    @FindBy(xpath = "//a[text()='Pencil6']")
    public WebElement productText;
    @FindBy(xpath = "//span[text()='Pencil6']")
    public WebElement productVerify;
    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//*[@type='number']")
    public WebElement numberOfProduct;
    @FindBy(xpath = "//*[@title='Plus']")
    public WebElement plusButton;
    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement updateButton;
    @FindBy(xpath = "//*[@title='Minus']")
    public WebElement minusButton;
    @FindBy(xpath = "//*[@class='button checkout wc-forward']")
    public WebElement checkoutButton;
    @FindBy(xpath = "(//h3)[1]")
    public WebElement billingDetailsTextSA;
    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement eftButton;
    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement payAtTheDoorButton;
    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public WebElement placeOrderVerifyText;















































    //M.SERBULENT ARSLAN
    //SULTAN GOKTAS
    @FindBy(xpath = "//span[.='Register']")
    public WebElement register;
    @FindBy(xpath = "//a[@href='signup']")
    public WebElement ustSIGNUP;
    @FindBy(xpath = "(//input[@id='reg_username'])[1]")
    public WebElement Username;
    @FindBy(xpath = "(//input[@id='reg_email'])[1]")
    public WebElement Email;
    @FindBy(xpath = "(//input[@id='reg_password'])[1]")
    public WebElement password;
    @FindBy(xpath = "(//input[@id='register-policy'])[1]")
    public WebElement sart;
    @FindBy(xpath = "(//button[@name='register'])[1]")
    public WebElement altSIGNUP;
    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement SIGNOUT;
   // @FindBy(xpath = "(//small[@class='woocommerce-password-hint'])[1]")
    //public WebElement gecersiz;
    @FindBy (xpath="//*[@class='color cetc']")
    public WebElement fakeMailCopy;//fake mail adresini kopyala
    @FindBy(xpath = "//a[@class='color cetc hidden-mobile']")
    public WebElement sahtepasword;//sahtepassword kopyala
    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement alreadymesaji;//An account is already registered with your email address.'  mesaji locate'i
    @FindBy(xpath = "//a[@class='showlogin']")
    public WebElement pleaseLogInmesaji;//'Pleaselog in'  mesaji locate'i















































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

    @FindBy(xpath = "//input[@placeholder='Search'][1]")//      MacBookAir
    public WebElement aramaKutusuzk;


    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButonuzk;

    //Compare butonunun gorunurlugunu dogrula
    @FindBy(xpath = "//a[@class='compare btn-product-icon'][1]")
    public WebElement compareButonzk;


    //Start compare butonunun gorunurlugunu dogrula
    @FindBy(xpath = "//a[text()='Start Compare !']")
    public WebElement startcompareButonzk;


    //kullanici ekledigi urunleri siler
    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[1]")
    public WebElement carpiSilmezk;


    //Go Shop butonuna tiklar
    @FindBy(xpath = "//a[@class='woocommerce-Button button']")
    public WebElement goShopButonuzk;

    //ilk urun locator
    @FindBy(xpath = "//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
    public WebElement ilkUrunzk;

    //compare yanindaki wishlist
    @FindBy(xpath = "(//a[@rel='nofollow'])[2]")
    public WebElement wishlistzk;

    //kullaninici add to card butonu
    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement addToCartButonuzk;
    //ilk urun
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]")
    public WebElement macbookzk;
    //view cart butonu
    @FindBy(xpath = "(//a[text()='View cart'])[2]")
    public WebElement viewCartzk;
    //proceed to checkout butonu
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedtocheckoutzk;
    //shoppinCard
    @FindBy(xpath = "//a[text()='Shopping Cart']")
    public WebElement shoppinCartzk;

    //placeolder
    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderzk;
    //Thank you. Your order has been received
    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement thankyoumsjzk;
    //FirstName
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement isimKutusu;
    //dropDown
    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement ddmzk;
    //city
    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement cityzk;
    //country ddm
    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement countryselectzk;

    @FindBy(xpath = "//input[@id='billing_state']")
    public WebElement countryzk;

    //poscode
    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement postcodezk;
    //Phone
    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement phonezk;

    //Email Adrees
    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement emailAdreszk;

    //  adress

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAdreezk;

//pay at the door

    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payzk;
    //EFT
    @FindBy(xpath = "//input[@id='payment_method_bacs']")
    public WebElement eftzk;














































    //ZEYNEP GUL KAYA

    //aslı uzun
    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerAU;//Registerin locati
    @FindBy(xpath = "(//*[@class='nav-link active'])[1]")
    public WebElement signUp;//Sign up locati
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/vendor-register/'])[2]")
    public WebElement becomeAVendor;//Become a Vendor locati
    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement eMailKutusu;//email kutusu locati
    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement verificationCode;//Verification Code kutusu locati
    @FindBy(xpath = "(//*[@tabindex='-1'])[1]")
    public WebElement verificationCodeSentYourMailYazisi;//"Verification code sent to your email: abc@abc.com." mesajının locati
    @FindBy(xpath = "(//*[@type='password'])[1]")
    public WebElement vendorPassword;//Vendor password kutusu locati
    @FindBy(xpath = "(//*[@type='password'])[2]")
    public WebElement vendorConfirmPassword;//Vendor  Confirm password kutusu locati
    @FindBy(xpath = "//*[@value='Register']")
    public WebElement registrationRegister;// vendor registration sayfasındaki register butonu locati
    @FindBy(xpath = "(//h1)[2]")
    public WebElement welcomeToAllowerYazisi;//Welcome to allower conwers yazısının locati
    @FindBy(xpath = "//*[@id='email']")
    public WebElement fakeMail;//fakemail sitesinde mail kutusu locati
    @FindBy(xpath = "//*[@class='color cetc']")
    public WebElement fakeMailCopyAU;//fake mail adresini kopyala
    @FindBy(xpath = "(//*[@class='glyphicon glyphicon-download-alt'])[2]")
    public WebElement verificationcodeac;
    @FindBy(xpath = "//*[@id='predmet']")
    public WebElement verificationCodeCopy;//verificationcode copykopyala
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement vendorPasswordHataMesaji;//Password strength should be atleast "Good". locati
    @FindBy(xpath = "//*[@class='short']")
    public WebElement shortYazisi;//short yazısı locati
    @FindBy(xpath = "//*[@class='weak']")
    public WebElement weakYazisi;//weak yazısı locati
    @FindBy(xpath = "//*[@class='good']")
    public WebElement goodYazisi;//good yazısı locati
    @FindBy(xpath = "//*[@class='strong']")
    public WebElement strongYazisi;//strong yazısı locati
    @FindBy(xpath = " //*[@class='wcfm-message wcfm-error']")
    public WebElement thisEmailAlreadyExistsYazisi;
    @FindBy(xpath = "//*[@data-action='sign in']")
    public WebElement gmailOturumAc;
    @FindBy(xpath = "//*[@class='BHzsHc']")
    public WebElement gmailBaskaHesap;
    @FindBy(xpath = "//*[@id='identifierId']")
    public WebElement gmailMailKutusu;
    @FindBy(xpath = "(//*[@class='VfPpkd-RLmnJb'])[2]")
    public WebElement gmailmailIleriButonu;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement gmailPassword;
    @FindBy(xpath = " (//*[@class='VfPpkd-vQzf8d'])[2]")
    public WebElement gmailpasswordIleriButonu;
    @FindBy(xpath = " (//*[@class='VfPpkd-vQzf8d'])[2]")
    public WebElement gmailSimdiDegil;
    @FindBy(xpath = "(//*[text()='Allover Commerce'])[2]")
    public WebElement alloverGelenMail;
    @FindBy(xpath = "//h2[@jsname='r4nke']")
    public WebElement maileGelenKod;


//BETUL O.
   // @FindBy(xpath = "//*[@class = 'login inline-type']")
   // public WebElement singInbuton;
   // @FindBy(xpath = "(//*[@name= 'username'])[1]")
  // public WebElement useremail;
  //  @FindBy(xpath = "(//*[@name= 'password'])[1]")
   // public WebElement password;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement singOutButton1;
    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement dogrulamaYazisiAreYouSure1;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement adressButton1;
    @FindBy(xpath = "(//h3)[1]")
    public WebElement dogrulamaYazisiBullingAdress1;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAdressAddButton1;
    @FindBy(xpath = "//*[@name='billing_first_name']")
    public WebElement bullingFirstName1;
    @FindBy(xpath = "//*[@name='billing_last_name']")
    public WebElement bullingLanstName1;
    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement country1;
    @FindBy(xpath = "//*[@name='billing_address_1']")
    public WebElement streetAddress1;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement postcode1;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phone1;
    @FindBy(xpath = "//*[@autocomplete='email']")
    public WebElement emailKutusu1;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement city1;
    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement saveAdress1Button1;
    @FindBy(xpath= "(//select)[1]")
    public WebElement billingCountrySelect1;
    @FindBy(xpath = "(//select)[2]")
    public  WebElement bullingProvince1;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement dogrulaYazisiAddressChangedSuccessfully1;
    @FindBy(xpath = "//*[text()='Edit Your Billing Address']")
    public WebElement editYourBillingAddressButton1;
    @FindBy(xpath = "//*[@data-id='billing_first_name']")
    public WebElement dogrulamaYazisiFirstNameIsRequiredField1;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdressAddButonu1;
    @FindBy(xpath = "(//*/h3)[1]")
    public WebElement shippingAdressSayfasinaGirisDogrulamaYazisi1;
    @FindBy(xpath = "//*[@id='shipping_first_name']")
    public WebElement shippingFirstName1;
    @FindBy(xpath = "//*[@id='shipping_last_name']")
    public WebElement shippingLastName1;
    @FindBy(xpath = "(//select)[1]")
    public WebElement shippingCountry1;
    @FindBy(xpath = "//*[@id='shipping_address_1'] ")
    public WebElement shippingStreetAddress1;
    @FindBy(xpath = "//*[@id='shipping_postcode']")
    public WebElement shippingPostcode1;
    @FindBy(xpath = "//*[@id='shipping_city']")
    public WebElement shippingCity1;
    @FindBy(xpath = "(//select)[2]")
    public WebElement shippingProvince1;
    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement shippingSaveAddressButon1;
    @FindBy(xpath = "//*[@data-id='shipping_first_name']")
    public WebElement shippingAdresFirstNameBosBirakilmasDogrulamaYazisi1;
    @FindBy(xpath = "//*[@data-id='shipping_address_1']")
    public WebElement shippingAdresAdressBosBirakmaDogrulamaYazisi1;

}
