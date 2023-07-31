package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageSA {

    public PageSA() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signInButton;
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
    public WebElement searchBox;
    @FindBy(xpath = "//*[@name='add-to-cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement cartIcon;
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
    public WebElement billingDetailsText;
    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement eftButton;
    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement payAtTheDoorButton;
    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public WebElement placeOrderVerifyText;



}
