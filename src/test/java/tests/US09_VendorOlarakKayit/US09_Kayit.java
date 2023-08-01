package tests.US09_VendorOlarakKayit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pageAU;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class US09_Kayit extends ExtentReport {


    @Test
    public void TestCase01() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Password yazar. Password: kucuk harf, büyük harf, rakam ve special karakter içermeli
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC01_Password"));
        extentTest.info("Küçük harf, büyük harf, rakam ve special karakter içeren password girildi.");

        //Passwordu tekrar yazar
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC01_Password"));
        extentTest.info("Password tekrar yazıldı.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //Welcome to allower conwers yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Welcome to allower conwers' yazısı görüldü.");
        ReusableMethods.tumSayfaResmi("US_09TC01");


    }

    @Test
    public void TestCase02() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Küçük harf ve special karakter içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC02_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC02_Password"));
        extentTest.info("Küçük harf ve special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC02");
    }

    @Test
    public void TestCase03() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf ve special karakter içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC03_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC03_Password"));
        extentTest.info("Büyük harf ve special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC03");
    }

    @Test
    public void TestCase04() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Special karakter içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC04_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC04_Password"));
        extentTest.info("Special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC04");
    }

    @Test
    public void TestCase05() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Special karakter ve rakam içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC05_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC05_Password"));
        extentTest.info("Special karakter ve rakam içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC05");
    }

    @Test
    public void TestCase06() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf ve küçük harf içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC06_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC06_Password"));
        extentTest.info("Büyük harf ve küçük harf içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC06");
    }

    @Test
    public void TestCase07() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC07_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC07_Password"));
        extentTest.info("Büyük harf içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC07");
    }

    @Test
    public void TestCase08() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf , rakam ve special karakter içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC08_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC08_Password"));
        extentTest.info("Büyük harf , rakam ve special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
       Assert.assertTrue(pageAU.vendorPasswordHataMesaji.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görüldü.");
        ReusableMethods.tumSayfaResmi("US_09TC08");
    }

    @Test
    public void TestCase09() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Küçük harf , rakam ve special karakter içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC09_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC09_Password"));
        extentTest.info("Küçük harf , rakam ve special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.vendorPasswordHataMesaji.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görüldü.");
        ReusableMethods.tumSayfaResmi("US_09TC09");
    }

    @Test
    public void TestCase10() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Küçük harf , büyük harf ve special karakter içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC10_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC10_Password"));
        extentTest.info("Küçük harf , büyük harf ve special karakter içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
       Assert.assertTrue(pageAU.vendorPasswordHataMesaji.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görüldü.");
        ReusableMethods.tumSayfaResmi("US_09TC10");
    }

    @Test
    public void TestCase11() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf , küçük harf ve rakam içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC11_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC11_Password"));
        extentTest.info("Büyük harf , küçük harf ve rakam içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC11");
    }

    @Test
    public void TestCase12() {
        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");
        pageAU pageAU = new pageAU();

        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce sitesine gidildi.");

        //Register a tıklar
        pageAU.register.click();
        extentTest.info("Register butonuna tıklandı.");

        // Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
        pageAU.becomeAVendor.click();
        extentTest.info("Sign Up sekmesini kullanarak 'Become a Vendor' linki ile giriş yapıldı.");

        //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        extentTest.info("Fake mail sitesi yeni bir sekmede açıldı.");

        //Fake maili kopyalar
        pageAU.fakeMailCopy.click();
        extentTest.info("Fake mail sitesinden fake mail kopyalandı.");

        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.eMailKutusu.sendKeys(Keys.CONTROL, "V");
        extentTest.info("Fake mail sitesinden kopyalanan mail mail text kutusuna yapıştırıldı");

        //Verification code text kutusuna tıklar
        pageAU.verificationCode.click();
        extentTest.info("Verification code text kutusuna tıklandı.");
        ReusableMethods.bekle(3);

        //Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görür
        pageAU.verificationCodeSentYourMailYazisi.isDisplayed();
        extentTest.info("Verification Code text kutusuna geldiğinde 'Verification code sent to your email: abc@abc.com.' mesajını gördü");

        //Mail adresine gelen kodu kopyalar
        ReusableMethods.switchToWindow(1);
        extentTest.info("Fakemail sitesine geçildi.");
        ReusableMethods.bekle(10);
        pageAU.verificationcodeac.click();
        WebElement code = pageAU.verificationCodeCopy;
        String text = code.getText();
        String result = text.replaceAll("[^0-9]", "");
        extentTest.info("Mail adresine gelen kod kopyalandı.");

        // maile gelen Verification Code text kutusuna girer
        ReusableMethods.switchToWindow(0);
        extentTest.info("Allovercommerce sitesine geçildi.");
        pageAU.verificationCode.sendKeys(result);
        extentTest.info("Maile gelen Verification Code text kutusuna girildi.");

        //Büyük harf ve rakam içermeyen bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC12_Password"));
        pageAU.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("TC12_Password"));
        extentTest.info("Büyük harf ve rakam içermeyen bir şifre girildi.");

        //Register butonuna tıklar
        pageAU.registrationRegister.click();
        extentTest.info("Register butonuna tıklandı.");

        //"Password and Confirm-password are not same." yazısını görüldüğünü test eder
        Assert.assertTrue(pageAU.welcomeToAllowerYazisi.isDisplayed());
        extentTest.info("'Password and Confirm-password are not same.' yazısı görülmedi.");
        ReusableMethods.tumSayfaResmi("US_09TC12");
    }
}

















































































