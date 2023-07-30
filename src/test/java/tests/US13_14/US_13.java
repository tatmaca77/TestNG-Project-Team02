package tests.US13_14;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static pages.AllovercommercePage.saveAddress;
import static tests.US_17_ShoppingVendor.TC_01.page;

public class US_13 extends ExtentReport {

    private JavascriptExecutor js;
    @Test
    public void vendorAdresKayit() {
        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce Sayfasina Gidildi.");
        //siginin e tıklar
        page.signin.click();
        extentTest.info("Sing in Butonu Tıklandı.");
        //Gecerli e mail adresini girer
        page.signinUsername.sendKeys("yussuf.azarius@fixedfor.com");
        extentTest.info("Username Yazıldı.");
        //Password yazar.
        page.signinPassword.sendKeys("Asli1234*");
        extentTest.info("Password Yazıldı");
        //signin te tıklar
        page.signinLogin.click();
        extentTest.info("Sing in Login Butonu Tıklandı.");
        // Kullanıcı Sign Out butonuna tıklar
        page.singOutButonu.click();
        extentTest.info("Giris icin SignOut butonu tıklandı.");
        // Kullanıcı çıkan sayfada Addresses butonuna tıklar
        page.adressButonu.click();
        extentTest.info("Address butonu tıklandı.");
        // Kullanıcı Shipping Address altındaki ADD butonuna tıklar
        page.shippingAdressADDButonu.click();
        extentTest.info("Shipping Address butonu tıklandı.");
        // Kullanıcı First name alanını doldurur
        page.firstNameKutusu.clear();
        Faker faker=new Faker();
        page.firstNameKutusu.sendKeys(faker.name().firstName());
        extentTest.info("First Name alanı dolduruldu.");
        // Kullanıcı Last name alanını doldurur
        page.lastNameKutusu.clear();
        page.lastNameKutusu.sendKeys(faker.name().lastName());
        extentTest.info("Last Name alanı dolduruldu.");
        // Kullanıcı Country/Region alanını doldurur
        Select select=new Select(page.countryRegion1);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country/Region alanına 'Turkey' olarak dolduruldu.");
        // Kullanıcı Street address alanını doldurur
        page.streetAddressKutusu.clear();
        page.streetAddressKutusu.sendKeys("NKM 9/4");
        extentTest.info("Street address alanına 'NKM 9/4' olarak dolduruldu.");
        // Kullanıcı ZIP Code alanını doldurur
        page.postCodeZipKutusu.clear();
        page.postCodeZipKutusu.sendKeys("010134");
        extentTest.info("ZIP Code alanına '010134' olarak dolduruldu.");
        // Kullanıcı Town/City alanını doldurur
        page.townCityKutusu.clear();
        page.townCityKutusu.sendKeys(faker.address().city(), Keys.TAB,Keys.ENTER);
        extentTest.info("Town/City alanı dolduruldu.");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", select);
        // Kullanıcı Province Kutusunu tıklar
        Select province=new Select(page.provinceKutusu);
        province.selectByVisibleText("Adana");
        extentTest.info("Province kutusu 'Adana' olarak dolduruldu.");
        // Kullanıcı save adress butonuna tıklar
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", saveAddress);
        saveAddress.click();
        extentTest.info("Save Adress butonu tıklandı.");
        //Yeni shipping adressin kayıt edildiği resmi
        ReusableMethods.tumSayfaResmi("Shipping Adres Kayıt");


    }



}
