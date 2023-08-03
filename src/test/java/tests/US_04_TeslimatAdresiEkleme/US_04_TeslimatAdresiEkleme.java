package tests.US_04_TeslimatAdresiEkleme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US_04_TeslimatAdresiEkleme extends ExtentReport {

    Actions action;
    AllovercommercePage allovercommercePage;
    ReusableMethods reusableMethods;


    @Test
    public void TC_01ShippingAddressKayitYapilmasi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("ShippingAddressKayitYapilmasi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");

        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        allovercommercePage.shippingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Firs name girisi yapildi.");

        //Last name gir
        allovercommercePage.shippingLastName1.clear();
        allovercommercePage.shippingLastName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name giris yapildi. ");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        ReusableMethods.bekle(3);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
       select.selectByVisibleText("Turkey");

        extentTest.info("Country sekmesinde Turkey secildi.");

        ReusableMethods.bekle(2);

        //Street address gir
        allovercommercePage.shippingStreetAddress1.clear();
        allovercommercePage.shippingStreetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adres girisi yapildi.");

        //Postcode / ZIP gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");

        ReusableMethods.bekle(3);
        //“First name is a required field.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"First name is a required field.\" yazisinin gorunurlugu dogrulandi.");

        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();
    }





    @Test
    public void TC_02_FirstNameBosBirakilmasi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("FirstNameBosBirakilmasi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");

        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        extentTest.info("Firs name bos birakildi.");

        //Last name gir
        allovercommercePage.shippingLastName1.clear();
        allovercommercePage.shippingLastName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name giris yapildi. ");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        ReusableMethods.bekle(2);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
        select.selectByVisibleText("Turkey");

        extentTest.info("Country sekmesinde Turkey secildi.");

        ReusableMethods.bekle(2);

        //Street address gir
        allovercommercePage.shippingStreetAddress1.clear();
        allovercommercePage.shippingStreetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adres girisi yapildi.");

        //Postcode / ZIP gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        //“First name is a required field.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.shippingAdresFirstNameBosBirakilmasDogrulamaYazisi1.isDisplayed());
        extentTest.info("\"First name is a required field.\" yazisinin gorunurlugu dogrulandi.");

        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();

    }






    @Test
    public void TC_03_FirstNameRakamGirilmesi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("FirstNameRakamGirilmesi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");

        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        allovercommercePage.shippingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Firs name giris yapildi.");

        //Last name rakam veri gir
        allovercommercePage.shippingLastName1.clear();
        allovercommercePage.shippingLastName1.sendKeys("11111");
        extentTest.fail("Last name rakam veri girildi. ");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        ReusableMethods.bekle(3);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");
        ReusableMethods.bekle(2);

        //Street address gir
        allovercommercePage.shippingStreetAddress1.clear();
        allovercommercePage.shippingStreetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adres girisi yapildi.");

        //Postcode / ZIP gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        //“Address changed successfully.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisinin gorunurlugu dogrulandi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("Last name rakamsal veri olmasi.");
        extentTest.info("Tum ekran resmi alindi.");


        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();

    }




    @Test
    public void TC_04_LastNameBosBirakilmasi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("LastNameBosBirakilmasi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");

        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        allovercommercePage.shippingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Firs name giris yapildi.");

        //Last name bos birak
        allovercommercePage.shippingLastName1.clear();
        extentTest.info("Last name rakam veri girildi. ");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        ReusableMethods.bekle(3);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");
        ReusableMethods.bekle(2);

        //Street address gir
        allovercommercePage.shippingStreetAddress1.clear();
        allovercommercePage.shippingStreetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adres girisi yapildi.");

        //Postcode / ZIP gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        //“Last name is a required field.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.shippingAdresFirstNameBosBirakilmasDogrulamaYazisi1.isDisplayed());
        extentTest.info("\"Last name is a required field.\" yazisinin gorunurlugu dogrulandi.");


        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();

    }



    @Test
    public void TC_05_StreetAddressRakamGirilmesi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("StreetAddressRakamGirilmesi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");

        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        allovercommercePage.shippingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Firs name giris yapildi.");

        //Last name gir
        allovercommercePage.shippingLastName1.clear();
        allovercommercePage.shippingLastName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name rakam veri girildi. ");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        ReusableMethods.bekle(3);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");
        ReusableMethods.bekle(2);

        //Street Address rakam veri gir
        allovercommercePage.shippingStreetAddress1.clear();
        allovercommercePage.shippingStreetAddress1.sendKeys("123456");
        extentTest.fail("Street adres rakam veri girisi yapildi.");


        //Postcode / ZIP gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("Street adres rakam veri girisi kabul ediliyor.");
        extentTest.info("Tum ekran resmi alindi");

        //“Address changed successfully.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisinin gorunurlugu dogrulandi.");


        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();

    }


    @Test
    public void TC_06_StreetAddressBosBirakilmasi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("StreetAddressBosBirakilmasi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");

        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        allovercommercePage.shippingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Firs name giris yapildi.");

        //Last name gir
        allovercommercePage.shippingLastName1.clear();
        allovercommercePage.shippingLastName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name rakam veri girildi. ");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        ReusableMethods.bekle(3);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");
        ReusableMethods.bekle(2);

        //Street Address bos birak
        allovercommercePage.shippingStreetAddress1.clear();
        extentTest.fail("Street adres bos birakildi.");


        //Postcode / ZIP gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        //“Street address is a required field.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.shippingAdresAdressBosBirakmaDogrulamaYazisi1.isDisplayed());
        extentTest.info("\"Street address is a required field.\" yazisinin gorunurlugu dogrulandi.");


        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();

    }


    @Test
    public void TC_07_PostcodeHarfKarakterGirilmesi() {

        action = new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest = extentReports.createTest("PostcodeHarfKarakterGirilmesi", "Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"), ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butona tiklandi.");


        ReusableMethods.bekle(3);
        //"Are you sure you want to log out? Confirm and log out" yazisini dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("\"Are you sure you want to log out? Confirm and log out\" dogrulama yazsisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.shippingAdressAddButonu1.click();
        extentTest.info("Shipping (Teslimat) Adres kayit sayfasi icin add butonuna tiklandi.");


        //“Shipping address” yazisini gor
        allovercommercePage.shippingAdressSayfasinaGirisDogrulamaYazisi1.isDisplayed();
        extentTest.info("Shipping address yazisinin gorundugu dorulandi.");

        ReusableMethods.bekle(1);
        //First name gir
        allovercommercePage.shippingFirstName1.clear();
        allovercommercePage.shippingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Firs name giris yapildi.");

        //Last name gir
        allovercommercePage.shippingLastName1.clear();
        allovercommercePage.shippingLastName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name rakam veri girildi. ");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        ReusableMethods.bekle(3);

        //Country / Region gir
        WebElement shippingselect = allovercommercePage.shippingCountry1;
        Select select = new Select(shippingselect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");
        ReusableMethods.bekle(2);

        //Street Address gir
        allovercommercePage.shippingStreetAddress1.clear();
        allovercommercePage.shippingStreetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adres girisi yapildi.");


        //Postcode / ZIP harf karakter gir
        allovercommercePage.shippingPostcode1.clear();
        allovercommercePage.shippingPostcode1.sendKeys("aaaaaaa");
        extentTest.fail("Postcode harf karakter girisi yapildi.");

        //Town / City gir
        allovercommercePage.shippingCity1.clear();
        allovercommercePage.shippingCity1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province’ i secim yap
        WebElement shippingselect1 = allovercommercePage.shippingProvince1;
        Select select1 = new Select(shippingselect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        //Save Address butona tikla
        allovercommercePage.shippingSaveAddressButon1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        //“Address changed successfully.” metninin gorunulebilirligini dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisinin gorunurlugu dogrulandi.");

        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("Postcode harf karakter kabul edildi.");
        extentTest.fail("Tum sayfa resmi alindi.");

        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();

    }



}
