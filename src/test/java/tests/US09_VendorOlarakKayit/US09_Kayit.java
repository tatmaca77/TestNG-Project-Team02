package tests.US09_VendorOlarakKayit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class US09_Kayit extends ExtentReport {

    @Test
    public void TestCase01() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Password yazar. Password: kucuk harf, büyük harf, rakam ve special karakter içermeli
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC01_Password"));
        extentTest.info("Küçük harf, büyük harf, rakam ve special karakter içeren password girildi.");

        //Passwordu tekrar yazar
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC01_Password"));
        extentTest.info("Password tekrar yazıldı.");

        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //Welcome to allower conwers yazısını görüldüğünü test eder
        allovercommercePage.welcomeToAllowerYazisi.isDisplayed();
        extentTest.info("'Welcome to allower conwers' yazısı görüldü.");
        ReusableMethods.tumSayfaResmi("US_09TC01");

    }

    @Test
    public void TestCase02() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Küçük harf ve special karakter içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC02_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC02_Password"));
        extentTest.info("Küçük harf ve special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC02");
    }

    @Test
    public void TestCase03() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf ve special karakter içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC03_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC03_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC03");
    }

    @Test
    public void TestCase04() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Special karakter içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC04_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC04_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC04");
    }

    @Test
    public void TestCase05() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Special karakter ve rakam içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC05_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC05_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC05");
    }

    @Test
    public void TestCase06() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf ve küçük harf içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC06_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC06_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC06");
    }

    @Test
    public void TestCase07() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC07_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC07_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        ReusableMethods.tumSayfaResmi("US_09TC07");
    }

    @Test
    public void TestCase08() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf , rakam ve special karakter içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC08_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC08_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        allovercommercePage.vendorPasswordHataMesaji.isDisplayed();
        ReusableMethods.tumSayfaResmi("US_09TC08");
    }

    @Test
    public void TestCase09() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Küçük harf , rakam ve special karakter içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC09_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC09_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        allovercommercePage.vendorPasswordHataMesaji.isDisplayed();
        ReusableMethods.tumSayfaResmi("US_09TC09");
    }

    @Test
    public void TestCase10() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Küçük harf , büyük harf ve special karakter içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC10_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC10_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        allovercommercePage.vendorPasswordHataMesaji.isDisplayed();
        ReusableMethods.tumSayfaResmi("US_09TC10");
    }

    @Test
    public void TestCase11() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf , küçük harf ve rakam içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC11_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC11_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        ReusableMethods.tumSayfaResmi("US_09TC11");
    }

    @Test
    public void TestCase12() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        AllovercommercePage allovercommercePage = new AllovercommercePage();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        allovercommercePage.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        allovercommercePage.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        allovercommercePage.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        allovercommercePage.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        allovercommercePage.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        allovercommercePage.verificationcodeac.click();
        WebElement code = allovercommercePage.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        allovercommercePage.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf ve rakam içermeyen bir şifre girer
        allovercommercePage.vendorPassword.sendKeys(ConfigReader.getProperty("TC12_Password"));
        allovercommercePage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC12_Password"));
        //Register butonuna tıklar
        allovercommercePage.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(allovercommercePage.welcomeToAllowerYazisi.isDisplayed());
        ReusableMethods.tumSayfaResmi("US_09TC12");
    }
}

















































































