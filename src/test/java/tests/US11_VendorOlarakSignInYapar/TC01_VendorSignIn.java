package tests.US11_VendorOlarakSignInYapar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageAE;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_VendorSignIn extends ExtentReport {



    @Test
    public void tc_01_vendorSignIn() {
        extentTest = extentReports.createTest("TestNGTeam02","VendorGiriş");

        // 1 Vendor anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        ReusableMethods.bekle(2);

        extentTest.info("Anasayfaya gidildi");
        PageAE page = new PageAE();

        // 2 Sign In butonuna tıklar
        ReusableMethods.click(page.signInRegister);
        extentTest.info("Sign in butonuna tıklandı");

        ReusableMethods.bekle(1);

        //3 Sign in pop-up penceresinde bulunan "SIGN-IN" butonunun görünür ve ulaşılabilir olduğunu doğrula
        page.signInPopUp.isEnabled();//Ulasilabilir
        extentTest.info("Sign In PopUp penceresinin erişilebildiği doğrulandı");

        ReusableMethods.bekle(1);

        //4 "Username or email address" alanına geçerli bir mail adresi girer.
        page.usernameKutusu.sendKeys(ConfigReader.getProperty("vendorEmail"));
        extentTest.info("Geçerli bir email adresi girildi");

        ReusableMethods.bekle(1);

        //5 "Password" alanına geçerli bir şifre girer.
        page.passwordKutusu.sendKeys(ConfigReader.getProperty("vendorPassword"));
        extentTest.info("Geçerli bir password girildi");

        ReusableMethods.bekle(1);

        //6 "Popup sign in butonuna tıklar.
        page.popUpsignIn.click();
        ReusableMethods.bekle(1);
        extentTest.info("PopUp penceresi Sign In butonuna tıklandı");

        ReusableMethods.bekle(1);

        //7 "Sign out butonuna tıkla (Sign in yapıldığını doğrula)
        Assert.assertTrue(page.signOutButonu.isDisplayed());
        page.signOutButonu.click();
        extentTest.info("Sign out butonuna tıklandı");

        ReusableMethods.bekle(1);

        //8 My Account yazısının göründüğünü doğrula
        Assert.assertTrue(page.myAccountYazisi.isDisplayed());
        extentTest.info("Vendor olarak kendi hesabına gidilidiği doğrulandı.");
        ReusableMethods.bekle(1);





    }


}
