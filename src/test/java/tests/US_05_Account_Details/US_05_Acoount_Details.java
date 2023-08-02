package tests.US_05_Account_Details;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageSA;
<<<<<<< HEAD
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;
=======
import utilities.*;
>>>>>>> master

public class US_05_Acoount_Details extends ExtentReport {

    PageSA pageSA;
    Faker faker = new Faker();
    String randomWord = faker.lorem().word();
    String randomNumber = faker.number().digits(8);
    String randomPassword = randomWord + randomNumber;
    String filePath = "src/test/java/resources/musteriverileri.xlsx";
    String pageName = "Sayfa1";
    ExcelReader excelReader = new ExcelReader(filePath,pageName);


    @Test(priority = 0)
    public void TC01_Acoount_Details() {

        extentTest = extentReports.createTest("TestNGTeam02","Test Raporu");
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);
        extentTest.info("My Account butonuna tıklandı.");

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();
        extentTest.info("Account details butonuna tıklandı.");

        //First name alanını doldur.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        extentTest.info("First Name alanındaki yazı değiştirildi.");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        extentTest.info("Last Name alanındaki yazı değiştirildi.");
        //Display name alanını doldur.
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        extentTest.info("Display Name alanındaki yazı değiştirildi.");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        extentTest.info("Email address alanındaki yazı değiştirildi.");
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Biography alanına yazılar yazıldı.");

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);
        extentTest.info("SAVE CHANGES butonuna tıklandı.");

        //"Account details changed successfully." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
        extentTest.pass("Account details changed successfully. uyarısı görüldü.");
        ReusableMethods.tumSayfaResmi("US05_TC01");
    }

    @Test(priority = 1)
    public void TC02_Acoount_Details() {
        extentTest = extentReports.createTest("TestNGTeam02","Test Raporu");
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);
        extentTest.info("My Account butonuna tıklandı.");

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();
        extentTest.info("Account details butonuna tıklandı.");

        //First name alanını boş bırak.
        pageSA.firstNameTextBox.clear();
        extentTest.info("First Name alanı boş bırakıldı.");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        extentTest.info("Last Name alanındaki yazı değiştirildi.");
        //Display name alanını doldur.
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        extentTest.info("Display Name alanındaki yazı değiştirildi.");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        extentTest.info("Email address alanındaki yazı değiştirildi.");
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Biography alanına yazılar yazıldı.");

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);
        extentTest.info("SAVE CHANGES butonuna tıklandı.");

        //"FIRST NAME is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
        extentTest.pass("FIRST NAME is a required field. uyarısı görüldü.");
        ReusableMethods.tumSayfaResmi("US05_TC02");
    }

    @Test(priority = 2)
    public void TC03_Acoount_Details() {
        extentTest = extentReports.createTest("TestNGTeam02","Test Raporu");
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);
        extentTest.info("My Account butonuna tıklandı.");

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();
        extentTest.info("Account details butonuna tıklandı.");

        //First name alanını doldur.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        extentTest.info("First Name alanındaki yazı değiştirildi.");
        //Last name alanını boş bırak.
        pageSA.lastNameTextBox.clear();
        extentTest.info("Last Name alanı boş bırakıldı.");
        //Display name alanını doldur.
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        extentTest.info("Display Name alanındaki yazı değiştirildi.");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        extentTest.info("Email address alanındaki yazı değiştirildi.");
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Biography alanına yazılar yazıldı.");

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);
        extentTest.info("SAVE CHANGES butonuna tıklandı.");

        //"LAST NAME is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
        extentTest.pass("LAST NAME is a required field. uyarısı görüldü.");
        ReusableMethods.tumSayfaResmi("US05_TC03");
    }

    @Test(priority = 3)
    public void TC04_Acoount_Details() {
        extentTest = extentReports.createTest("TestNGTeam02","Test Raporu");
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);
        extentTest.info("My Account butonuna tıklandı.");

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();
        extentTest.info("Account details butonuna tıklandı.");

        //First name alanını doldur.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        extentTest.info("First Name alanındaki yazı değiştirildi.");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        extentTest.info("Last Name alanındaki yazı değiştirildi.");
        //Display name alanını boş bırak
        pageSA.displayNameTextBox.clear();
        extentTest.info("Display Name alanı boş bırakıldı.");
        //Email address alanını doldur.
        pageSA.emailTextBox.clear();
        pageSA.emailTextBox.sendKeys(ConfigReader.getProperty("usernameSA"));
        extentTest.info("Email address alanındaki yazı değiştirildi.");
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Biography alanına yazılar yazıldı.");

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);
        extentTest.info("SAVE CHANGES butonuna tıklandı.");

        //"DISPLAY NAME is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
        extentTest.pass("DISPLAY NAME is a required field. uyarısı görüldü.");
        ReusableMethods.tumSayfaResmi("US05_TC04");
    }

    @Test(priority = 4)
    public void TC05_Acoount_Details() {
        extentTest = extentReports.createTest("TestNGTeam02","Test Raporu");
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);
        extentTest.info("My Account butonuna tıklandı.");

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();
        extentTest.info("Account details butonuna tıklandı.");

        //First name alanını doldur.
        pageSA.firstNameTextBox.clear();
        pageSA.firstNameTextBox.sendKeys("serbulent");
        extentTest.info("First Name alanındaki yazı değiştirildi.");
        //Last name alanını doldur.
        pageSA.lastNameTextBox.clear();
        pageSA.lastNameTextBox.sendKeys("arslan");
        extentTest.info("Last Name alanındaki yazı değiştirildi.");
        //Display name alanını boş bırak
        pageSA.displayNameTextBox.clear();
        pageSA.displayNameTextBox.sendKeys("serbo");
        extentTest.info("Display Name alanındaki yazı değiştirildi.");
        //Email address alanını boş bırak.
        pageSA.emailTextBox.clear();
        extentTest.info("Email address alanı boş bırakıldı.");
        //Biography alanını doldur.
        Driver.getDriver().switchTo().frame(pageSA.userDescriptionIframe);
        ReusableMethods.scroll(pageSA.biographyTextBox);
        pageSA.biographyTextBox.clear();
        pageSA.biographyTextBox.sendKeys(ConfigReader.getProperty("biographyText"));
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Biography alanına yazılar yazıldı.");

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.click(pageSA.saveChangesButton);
        extentTest.info("SAVE CHANGES butonuna tıklandı.");

        //"EMAIL ADDRESS is a required field." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
        extentTest.pass("EMAIL ADDRESS is a required field. uyarısı görüldü.");
        ReusableMethods.tumSayfaResmi("US05_TC05");
    }


    @Test(priority = 5)
    public void TC06_PasswordTest() {
        extentTest = extentReports.createTest("TestNGTeam02","Test Raporu");
        //Belirtilen adrese git.
        pageSA = new PageSA();
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");
        //Sign In butonuna tıkla.
        //Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        //Sayfanın altında bulunan My Account butonuna tıkla.
        ReusableMethods.visibleWait(pageSA.signOutButton,20);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(pageSA.myAccountButton);
        extentTest.info("My Account butonuna tıklandı.");

        //Account details butonuna tıkla.
        pageSA.accountDetailsButton.click();
        extentTest.info("Account details butonuna tıklandı.");

        ReusableMethods.scroll(pageSA.saveChangesButton);
        ReusableMethods.visibleWait(pageSA.saveChangesButton,10);

        //"Current password leave blank to leave unchanged" alanına mevcut şifreyi gir.
        pageSA.currentPasswordTextBox.sendKeys(excelReader.getCellData(1,1));
        extentTest.info("Current password leave blank to leave unchanged. alanına doğru şifre girildi.");

        //"New password leave blank to leave unchanged" alanına yeni şifreyi gir.
        pageSA.newPasswordTextBox.sendKeys(randomPassword);
        extentTest.info("New password leave blank to leave unchanged. alanına yeni şifre girildi.");

        //"Confirm password" alanına yeni şifreyi tekrar gir.
        pageSA.confirmPasswordTextBox.sendKeys(randomPassword);
        extentTest.info("Confirm password. alanına yeni şifre tekrar girildi.");

        //yeni şifre excel'e eklendi
        excelReader.writeCell(1,1,filePath,randomPassword);

        //SAVE CHANGES butonuna tıkla.
        ReusableMethods.click(pageSA.saveChangesButton);
        extentTest.info("SAVE CHANGES butonuna tıklandı.");

        //"Account details changed successfully." yazısının göründüğünü doğrula.
        Assert.assertTrue(pageSA.verifyText.isDisplayed());
        extentTest.pass("Account details changed successfully. uyarısı görüldü.");
        ReusableMethods.tumSayfaResmi("US05_TC06");

    }
    public void loginMethod(){
        pageSA.signInButton.click();
        pageSA.usernameTextBox.sendKeys(excelReader.getCellData(1,0));
        pageSA.passwordTextBox.sendKeys(excelReader.getCellData(1,1), Keys.ENTER);
    }





}
