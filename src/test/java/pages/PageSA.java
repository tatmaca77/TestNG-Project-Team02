package pages;

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
    @FindBy(xpath = "//section//a[text()='My Account']")
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









}
