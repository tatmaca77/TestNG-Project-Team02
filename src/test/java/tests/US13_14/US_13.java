package tests.US13_14;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import javax.swing.*;

import static pages.AllovercommercePage.provinceKutusu;
import static pages.AllovercommercePage.saveAddress;
import static tests.US_17_ShoppingVendor.TC_01.page;

public class US_13 extends ExtentReport {

    private JavascriptExecutor js;
    @Test
    public void vendorAdresKayit() {
        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
        //Kullanıcı adrese gider

        ReusableMethods.signInMethod("dametrius.rheece@fixedfor.com","Sifre123");
        extentTest.info("Sing in Login Butonu Tıklandı.");
        // Kullanıcı Sign Out butonuna tıklar
        AllovercommercePage.singOutButonu.click();
        extentTest.info("Giris icin SignOut butonu tıklandı.");
        // Kullanıcı çıkan sayfada Addresses butonuna tıklar
        AllovercommercePage.adressButonu.click();
        extentTest.info("Address butonu tıklandı.");
        // Kullanıcı Shipping Address altındaki ADD butonuna tıklar
        AllovercommercePage.shippingAdressADDButonu.click();
        extentTest.info("Shipping Address butonu tıklandı.");
        // Kullanıcı First name alanını doldurur
        AllovercommercePage.firstNameKutusu.clear();
        Faker faker=new Faker();
        AllovercommercePage.firstNameKutusu.sendKeys(faker.name().firstName());
        extentTest.info("First Name alanı dolduruldu.");
        // Kullanıcı Last name alanını doldurur
        AllovercommercePage.lastNameKutusu.clear();
        AllovercommercePage.lastNameKutusu.sendKeys(faker.name().lastName());
        extentTest.info("Last Name alanı dolduruldu.");
        // Kullanıcı Country/Region alanını doldurur
        Select select=new Select(AllovercommercePage.countryRegion1);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country/Region alanına 'Turkey' olarak dolduruldu.");
        // Kullanıcı Street address alanını doldurur
        AllovercommercePage.streetAddressKutusu.clear();
        AllovercommercePage.streetAddressKutusu.sendKeys("NKM 9/4");
        extentTest.info("Street address alanına 'NKM 9/4' olarak dolduruldu.");
        // Kullanıcı ZIP Code alanını doldurur
        AllovercommercePage.postCodeZipKutusu.clear();
        AllovercommercePage.postCodeZipKutusu.sendKeys("010134");
        extentTest.info("ZIP Code alanına '010134' olarak dolduruldu.");
        // Kullanıcı Town/City alanını doldurur
        AllovercommercePage.townCityKutusu.clear();
        AllovercommercePage.townCityKutusu.sendKeys(faker.address().city(), Keys.TAB,Keys.ENTER);
        extentTest.info("Town/City alanı dolduruldu.");
        ReusableMethods.scroll(provinceKutusu);
        // Kullanıcı Province Kutusunu tıklar
        Select province=new Select(provinceKutusu);
        province.selectByVisibleText("Adana");
        extentTest.info("Province kutusu 'Adana' olarak dolduruldu.");
        // Kullanıcı save adress butonuna tıklar
        saveAddress.click();
        extentTest.info("Save Adress butonu tıklandı.");
        //Yeni shipping adressin kayıt edildiği resmi
        ReusableMethods.tumSayfaResmi("Shipping Adres Kayıt");


    }



}
