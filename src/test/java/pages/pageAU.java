package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class pageAU {
    public pageAU() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement register;//Registerin locati
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
    public WebElement fakeMailCopy;//fake mail adresini kopyala
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

    @FindBy(xpath = "//*[@id='username']")
    public WebElement signinUsername;//
    @FindBy(xpath = "//*[@id='password']")
    public WebElement signinPassword;//
    @FindBy(xpath = "//*[@name='login']")
    public WebElement signinLogin;//
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signin;//










}
