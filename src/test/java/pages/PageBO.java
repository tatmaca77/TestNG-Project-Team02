package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageBO {

    public PageBO() {   // Constructor olusturulur !!!
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class = 'login inline-type']")
    public WebElement singInbuton;
    @FindBy(xpath = "(//*[@name= 'username'])[1]")
    public WebElement useremail;
    @FindBy(xpath = "(//*[@name= 'password'])[1]")
    public WebElement password;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement singOutButton;
    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement dogrulamaYazisiAreYouSure;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement adressButton;
    @FindBy(xpath = "(//h3)[1]")
    public WebElement dogrulamaYazisiBullingAdress;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAdressAddButton;
    @FindBy(xpath = "//*[@name='billing_first_name']")
    public WebElement bullingFirstName;
    @FindBy(xpath = "//*[@name='billing_last_name']")
    public WebElement bullingLanstName;
    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement country;
    @FindBy(xpath = "//*[@name='billing_address_1']")
    public WebElement streetAddress;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement postcode;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phone;
    @FindBy(xpath = "//*[@autocomplete='email']")
    public WebElement emailKutusu;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement city;
    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement saveAdress1Button;
    @FindBy(xpath= "(//select)[1]")
    public WebElement billingCountrySelect;
    @FindBy(xpath = "(//select)[2]")
    public  WebElement bullingProvince;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement dogrulaYazisiAddressChangedSuccessfully;
    @FindBy(xpath = "//*[text()='Edit Your Billing Address']")
    public WebElement editYourBillingAddressButton;
    @FindBy(xpath = "//*[@data-id='billing_first_name']")
    public WebElement dogrulamaYazisiFirstNameIsRequiredField;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdressAddButonu;
    @FindBy(xpath = "(//*/h3)[1]")
    public WebElement shippingAdressSayfasinaGirisDogrulamaYazisi;
    @FindBy(xpath = "//*[@id='shipping_first_name']")
    public WebElement shippingFirstName;
    @FindBy(xpath = "//*[@id='shipping_last_name']")
    public WebElement shippingLastName;
    @FindBy(xpath = "(//select)[1]")
    public WebElement shippingCountry;
    @FindBy(xpath = "//*[@id='shipping_address_1'] ")
    public WebElement shippingStreetAddress;
    @FindBy(xpath = "//*[@id='shipping_postcode']")
    public WebElement shippingPostcode;
    @FindBy(xpath = "//*[@id='shipping_city']")
    public WebElement shippingCity;
    @FindBy(xpath = "(//select)[2]")
    public WebElement shippingProvince;
    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement shippingSaveAddressButon;
    @FindBy(xpath = "//*[@data-id='shipping_first_name']")
    public WebElement shippingAdresFirstNameBosBirakilmasDogrulamaYazisi;
    @FindBy(xpath = "//*[@data-id='shipping_address_1']")
    public WebElement shippingAdresAdressBosBirakmaDogrulamaYazisi;




}
