package tests.US_05_Account_Details;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US_05_Acoount_Details extends ExtentReport {

    PageSA pageSA;


    @Test(priority = 0)
    public void TC01_Acoount_Details() {

        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();

        //First name alanını doldur.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        //Display name alanını doldur.
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);

        //"Account details changed successfully." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
    }

    @Test(priority = 1)
    public void TC02_Acoount_Details() {

        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();

        //First name alanını boş bırak.
        pageSA.firstNameTextBox.clear();

        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        //Display name alanını doldur.
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);

        //"FIRST NAME is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());

    }

    @Test
    public void TC03_Acoount_Details() {
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();

        //First name alanını boş bırak.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        //Last name alanını boş bırak.
        pageSA.lastNameTextBox.clear();

        //Display name alanını doldur.
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);

        //"LAST NAME is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());

    }

    @Test
    public void TC04_Acoount_Details() {
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();

        //First name alanını boş bırak.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        //Display name alanını boş bırak
        pageSA.displayNameTextBox.clear();

        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);

        //"DISPLAY NAME is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
    }

    @Test
    public void TC05_Acoount_Details() {
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();

        //First name alanını boş bırak.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        //Display name alanını boş bırak
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        //Email address alanını boş bırak.
        pageSA.emailTextBox.clear();

        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);

        //"EMAIL ADDRESS is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
    }


    @Test
    public void TC06_PasswordTest() {
    }


    public void loginMethod(){
        pageSA.signInButton.click();
        pageSA.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        pageSA.passwordTextBox.sendKeys(ConfigReader.getProperty("password1SA"), Keys.ENTER);

    }





}
