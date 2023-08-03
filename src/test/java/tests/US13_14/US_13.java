package tests.US13_14;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static pages.AllovercommercePage.*;

public class US_13 extends ExtentReport {

    private JavascriptExecutor js;
    @Test
    public void vendorAdresKayit() {
        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
        //Kullanıcı adrese gider

        ReusableMethods.signInMethod("dametrius.rheece@fixedfor.com","Sifre123");
        extentTest.info("Sing in Login Butonu Tıklandı.");
        // Kullanıcı Sign Out butonuna tıklar
        AllovercommercePage.singOutButonuB.click();
        extentTest.info("Giris icin SignOut butonu tıklandı.");
        // Kullanıcı çıkan sayfada Addresses butonuna tıklar
        AllovercommercePage.adressButonuB.click();
        extentTest.info("Address butonu tıklandı.");
        // Kullanıcı Shipping Address altındaki ADD butonuna tıklar
        AllovercommercePage.shippingAdressADDButonuB.click();
        extentTest.info("Shipping Address butonu tıklandı.");
        // Kullanıcı First name alanını doldurur
        AllovercommercePage.firstNameKutusuB.clear();
        Faker faker=new Faker();
        AllovercommercePage.firstNameKutusuB.sendKeys(faker.name().firstName());
        extentTest.info("First Name alanı dolduruldu.");
        // Kullanıcı Last name alanını doldurur
        AllovercommercePage.lastNameKutusuB.clear();
        AllovercommercePage.lastNameKutusuB.sendKeys(faker.name().lastName());
        extentTest.info("Last Name alanı dolduruldu.");
        // Kullanıcı Country/Region alanını doldurur
        Select select=new Select(AllovercommercePage.countryRegion1B);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country/Region alanına 'Turkey' olarak dolduruldu.");
        // Kullanıcı Street address alanını doldurur
        AllovercommercePage.streetAddressKutusuB.clear();
        AllovercommercePage.streetAddressKutusuB.sendKeys("NKM 9/4");
        extentTest.info("Street address alanına 'NKM 9/4' olarak dolduruldu.");
        // Kullanıcı ZIP Code alanını doldurur
        AllovercommercePage.postCodeZipKutusuB.clear();
        AllovercommercePage.postCodeZipKutusuB.sendKeys("010134");
        extentTest.info("ZIP Code alanına '010134' olarak dolduruldu.");
        // Kullanıcı Town/City alanını doldurur
        AllovercommercePage.townCityKutusuB.clear();
        AllovercommercePage.townCityKutusuB.sendKeys(faker.address().city(), Keys.TAB,Keys.ENTER);
        extentTest.info("Town/City alanı dolduruldu.");
        ReusableMethods.scroll(provinceKutusuB);
        // Kullanıcı Province Kutusunu tıklar
        Select province=new Select(provinceKutusuB);
        province.selectByVisibleText("Adana");
        extentTest.info("Province kutusu 'Adana' olarak dolduruldu.");
        // Kullanıcı save adress butonuna tıklar
        saveAddressB.click();
        extentTest.info("Save Adress butonu tıklandı.");
        //Yeni shipping adressin kayıt edildiği resmi
        ReusableMethods.tumSayfaResmi("Shipping Adres Kayıt");


    }



}
