package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageAE {

        public PageAE() {
    // Constructor olusturulur !!!
    PageFactory.initElements(Driver.getDriver(), this);
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
        public WebElement firstNameKutusu;
        @FindBy(xpath = "//input[@id='billing_last_name']")
        public WebElement LastNameKutusu;
        @FindBy(xpath = "//select[@id='billing_country']")
        public WebElement country;
        @FindBy(xpath = "//input[@id='billing_address_1']")
        public WebElement streetAddressKutusu;
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







}