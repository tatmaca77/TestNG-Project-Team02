package tests.US11_VendorOlarakSignInYapar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC02_DashboardMenu extends ExtentReport {

    AllovercommercePage page = new AllovercommercePage();
    @Test
    public void tc_01_vendorSignIn() {
        extentTest = extentReports.createTest("TestNGTeam02","Dashboard Menüsüne Giriş");

        // 1 Vendor anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        ReusableMethods.bekle(2);
        extentTest.info("Anasayfaya gidildi");

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

        //9 My Account sayfasında "Dashboard" yazısının olduğunu doğrula.
        Assert.assertTrue(page.dashboardText.isDisplayed());
        extentTest.info("Dashboard yazısının olduğu doğrulandı");
        ReusableMethods.bekle(1);

        //10 Dashboard altında, "Store manager" yazısının olduğunu doğrula.
        Assert.assertTrue(page.storeManagerText.isDisplayed());
        extentTest.info("Store Manager yazısının olduğu doğrulandı");
        page.storeManagerText.click();

        Assert.assertTrue(page.storeManagerBaslik.isDisplayed());
        Driver.getDriver().navigate().back();
        extentTest.info("Store Manager menüsüne girildiği görüldü");
        ReusableMethods.bekle(1);

        //11 Dashboard altında, Orders yazısının olduğunu doğrula.
        Assert.assertTrue(page.orderText.isDisplayed());
        extentTest.info("Orders yazısının olduğu doğrulandı");
        page.orderText.click();
        Assert.assertTrue(page.orderBaslik.isDisplayed());
        extentTest.info("Orders menüsüne girildiği görüldü");
        ReusableMethods.bekle(1);

        //12 Dashboard altında, Downloads yazısının olduğunu doğrula.
        Assert.assertTrue(page.downloadsText.isDisplayed());
        page.downloadsText.click();
        extentTest.info("Dashboard altında, Downloads yazısının olduğunu doğrulandı");
        Assert.assertTrue(page.downloadsBaslik.isDisplayed());
        extentTest.info("Downloads menüsüne girildiği görüldü");
        ReusableMethods.bekle(1);

        //13 Dashboard altında, Addresses yazısının olduğunu doğrula.
        Assert.assertTrue(page.addressesText.isDisplayed());
        page.addressesText.click();
        extentTest.info("Dashboard altında, Addresses yazısının olduğunu doğrulandı");
        Assert.assertTrue(page.addressesBaslik.isDisplayed());
        extentTest.info("Addresses menüsüne girildiği görüldü");
        ReusableMethods.bekle(1);

        //14 Dashboard altında, Account Details yazısının olduğunu doğrula.
        Assert.assertTrue(page.accountDetailstext.isDisplayed());
        page.accountDetailstext.click();
        extentTest.info("Dashboard altında, Account Details yazısının olduğunu doğrulandı");
        Assert.assertTrue(page.accountDetailsBaslik.isDisplayed());
        extentTest.info("Account Details menüsüne girildiği görüldü");
        ReusableMethods.bekle(1);

        //15 Dashboard altında, Wishlist yazısının olduğunu doğrula.
        ReusableMethods.scroll(page.wishlistText);
        Assert.assertTrue(page.wishlistText.isDisplayed());
        ReusableMethods.click(page.wishlistText);
        extentTest.info("Dashboard altında, Wishlist yazısının olduğunu doğrulandı");
        page.wishlistBaslik.isDisplayed();
        extentTest.info("Wishlist menüsüne girildiği görüldü");
        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

        // 16 Dashboard altında, Supoort Tickets yazısının olduğunu doğrula.
        ReusableMethods.scroll(page.supportTicketsText);
        Assert.assertTrue(page.supportTicketsText.isDisplayed());
        ReusableMethods.click(page.supportTicketsText);
        extentTest.info("Dashboard altında, Supoort Tickets yazısının olduğunu doğrulandı");
        page.ticketsStatus.isDisplayed();
        ReusableMethods.bekle(1);

        // 17 Dashboard altında, Followings yazısının olduğunu doğrula.
        ReusableMethods.scroll(page.followingsText);
        Assert.assertTrue(page.followingsText.isDisplayed());
        ReusableMethods.click(page.followingsText);
        page.followingStore.isDisplayed();
        extentTest.info("Dashboard altında, Followings yazısının olduğunu doğrulandı");
        ReusableMethods.bekle(1);

        // 18 ==> Dashboard altında, Logout yazısının olduğunu doğrula.
        ReusableMethods.scroll(page.logoutText);
        Assert.assertTrue(page.logoutText.isDisplayed());
        ReusableMethods.click(page.logoutText);
        extentTest.info("Dashboard altında, logout yazısının olduğunu doğrulandı");


        //19 Sign in pop-up penceresinde bulunan "SIGN-IN" butonunun görünür ve ulaşılabilir olduğunu doğrula
        Assert.assertTrue(page.signInPopUp.isDisplayed());
        ReusableMethods.bekle(1);
        extentTest.info("Sayfadan logout yapıldı");



    }


}

