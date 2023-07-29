package tests.US10_PasswordSeviyeleri;

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

public class US10_PasswordSeviye extends ExtentReport {
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

        //Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
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

        //En fazla 5 karakterli sadece küçük harf içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC1_1_Password"));
        extentTest.info("En fazla 5 karakterli sadece küçük harf içeren bir pasword girildi.");

         //"to short" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.shortYazisi.isDisplayed());
        extentTest.info("'to short' yazısı göründü.");
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("US10_TC01_1");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En fazla 5 karakterli sadece büyük  harf içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC1_2_Password"));
        extentTest.info("En fazla 5 karakterli sadece büyük  harf içeren bir pasword girildi.");

        //"to short" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.shortYazisi.isDisplayed());
        extentTest.info("'to short' yazısı göründü.");
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("US10_TC01_2");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En fazla 5 karakterli sadece specifik karakter içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC1_3_Password"));
        extentTest.info("En fazla 5 karakterli sadece specifik karakter içeren bir pasword girildi.");

        //"to short" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.shortYazisi.isDisplayed());
        extentTest.info("'to short' yazısı göründü.");
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("US10_TC01_3");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En fazla 5 karakterli sadece rakam  içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC1_4_Password"));
        extentTest.info("En fazla 5 karakterli sadece rakam  içeren bir pasword girildi.");

        //"to short" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.shortYazisi.isDisplayed());
        extentTest.info("'to short' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC01_4");

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

        //Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
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

        //7 karakterli sadece küçük harfve büyük harf içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC2_1_Password"));
        extentTest.info("7 karakterli sadece küçük harfve büyük harf içeren bir pasword girildi.");

        //"weak" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.weakYazisi.isDisplayed());
        extentTest.info("'weak' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC02_1");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 6  karakterli sadecerakam  içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC2_2_Password"));
        extentTest.info("En az 6  karakterli sadecerakam  içeren bir pasword girildi.");

        //"weak" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.weakYazisi.isDisplayed());
        extentTest.info("'weak' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC02_2");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //6  karakterli sadece specifik karakter ve rakam  içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC2_3_Password"));
        extentTest.info("6  karakterli sadece specifik karakter ve rakam  içeren bir pasword girildi.");

        //"weak" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.weakYazisi.isDisplayed());
        extentTest.info("'weak' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC02_3");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //6 karakterli sadeceküçük harf  içeren bir pasword girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC2_4_Password"));
        extentTest.info("6 karakterli sadeceküçük harf  içeren bir pasword girildi.");

        //"weak" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.weakYazisi.isDisplayed());
        extentTest.info("'weak' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC02_4");


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

        //Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
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

        //En az 8 karakterli büyük harf ve küçük harf içeren bir password girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC3_1_Password"));
        extentTest.info("En az 8 karakterli büyük harf ve küçük harf içeren bir password girildi.");

        //"good" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.goodYazisi.isDisplayed());
        extentTest.info("'good' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC03_1");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 8 karakterli rakam ve büyük harf   içeren bir password girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC3_2_Password"));
        extentTest.info("En az 8 karakterli rakam ve büyük harf   içeren bir password girildi.");

        //"good" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.goodYazisi.isDisplayed());
        extentTest.info("'good' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC03_2");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 6 karakterli büyük harf, rakam  ve küçük harf içeren bir password girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC3_3_Password"));
        extentTest.info("En az 6 karakterli büyük harf, rakam  ve küçük harf içeren bir password girildi.");

        //"good" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.goodYazisi.isDisplayed());
        extentTest.info("'good' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC03_3");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 6 karakterli büyük harf ve specifik karakter içeren bir password girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC3_4_Password"));
        extentTest.info("En az 6 karakterli büyük harf ve specifik karakter içeren bir password girildi.");

        //"good" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.goodYazisi.isDisplayed());
        extentTest.info("'good' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC03_4");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 8 karakterli rakam ve küçük harf içeren bir password girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC3_5_Password"));
        extentTest.info("En az 8 karakterli rakam ve küçük harf içeren bir password  girildi.");

        //"good" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.goodYazisi.isDisplayed());
        extentTest.info("'good' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC03_5");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //EEn az 6 karakterli specifik karakter  ve küçük harf içeren bir password girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC3_6_Password"));
        extentTest.info("En az 6 karakterli büyük harf ve specifik karakter içeren bir password girildi.");

        //"good" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.goodYazisi.isDisplayed());
        extentTest.info("'good' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC03_6");

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

        //Register ekranından, Sign Up sekmesini kullanarak "Become a Vendor" linki ile giriş yapar
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

        //En az 8 karakterli rakam,küçük harf ve specifik karakter içeren bir şifre girer.
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC4_1_Password"));
        extentTest.info("En az 8 karakterli rakam,küçük harf ve specifik karakter içeren bir şifre girildi.");

        //"strong" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.strongYazisi.isDisplayed());
        extentTest.info("'strong' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC04_1");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 8 karakterli rakam, büyük harf ve küçük harf içeren bir şifre girer.
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC4_2_Password"));
        extentTest.info("En az 8 karakterli rakam, büyük harf ve küçük harf içeren bir şifre girildi.");

        //"strong" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.strongYazisi.isDisplayed());
        extentTest.info("'strong' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC04_2");

        // pasword kutusunu temizlemeli
        pageAU.vendorPassword.clear();
        extentTest.info("Pasword kutusu temizlendi.");

        //En az 6 karakterli büyük harf , küçük harf ve specifik karakter içeren bir şifre girer
        pageAU.vendorPassword.sendKeys(ConfigReader.getProperty("TC4_3_Password"));
        extentTest.info("En az 6 karakterli büyük harf , küçük harf ve specifik karakter içeren bir şifre girildi.");

        //"strong" yazısının göründüğünü test etmeli
        Assert.assertTrue(pageAU.strongYazisi.isDisplayed());
        extentTest.info("'strong' yazısı göründü.");
        ReusableMethods.tumSayfaResmi("US10_TC04_3");




    }
}