package tests.US03_FaturaAdresiEkleme;

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

public class US_03_FaturaAdresiKayitYapabime extends ExtentReport {


    Actions action;
    AllovercommercePage allovercommercePage;
    ReusableMethods reusableMethods;


    @Test
    public void TC_01_FaturaAdresiniEkleyebilme() {

        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();



        extentTest =extentReports.createTest("TC_01_FaturaAdresiniEkleyebilme","Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Edit Your Billing Address butonuna tiklandi.");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("Billing adress yazisi goruldu");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name girisi yapildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name girisi yapildi");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adress girisi yapildi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode1.clear();
        allovercommercePage.postcode1.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.city1.clear();
        allovercommercePage.city1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City girisi yapildi");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesinde Adana sekmesi secildi");

        ReusableMethods.bekle(2);

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        ReusableMethods.bekle(3);

        //Email address gor
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");

        ReusableMethods.bekle(3);
        // “Address changed successfully.” yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.getText().contains("Address changed successfully."));
        extentTest.info("\"Address changed successfully.\" Dogrulama yazisi gorunurlugu dogrulandi.");


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Sayfadan cikis islemi yapildi.");
        extentReports.flush();
    }





    @Test(priority = 1)
    public void TC_02_EmailAdresinOtomatikGelmesi() {
        extentTest =extentReports.createTest("TC_02_EmailAdresinOtomatikGelmesi","Allovercommerce web sayfasi test raporu");


        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
        extentTest.info("Login olundu");

        //Sing Out butona tikla
        allovercommercePage.singOutButton1.click();
        extentTest.info("Sing Out butonuna tiklandi.");

        ReusableMethods.bekle(3);
        //“Are you sure you want to log out? Confirm and log out” yazisi dogrula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiAreYouSure1.getText().contains("Are you sure you want to log out? Confirm and log out"));
        extentTest.info("“Are you sure you want to log out? Confirm and log out” yazisi goruldu.");

        //Addresses butonuna tikla
        allovercommercePage.adressButton1.click();
        extentTest.info("Address butonuna clik yapildi.");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Edit Your Billing Address butonuna tiklandi.");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing adress\" yazisi goruldu");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name girisi yapildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name girisi yapildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street adress girisi yapildi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode girisi yapildi.");

        //Town / City gir
        allovercommercePage.city1.clear();
        allovercommercePage.city1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("Ctiy girisi yapildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Contry sekmesine Adana sekmesi secildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        ReusableMethods.bekle(3);
        //Email address gor
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");


        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");

        ReusableMethods.bekle(3);
        // “Address changed successfully.” yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.getText().contains("Address changed successfully."));
        extentTest.info("\"Address changed successfully.\" yazisinin gorunurlugu dogrulandi.");


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();


    }


    @Test(priority = 2)
    public void TC_03_EmailAdresinKayitOlunandanFarkliOlmasi() {


        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_03_EmailAdresinKayitOlunandanFarkliOlmasi","Allovercommerce web sayfasi test raporu");

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("First name yazildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkiye secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street address verisi yazildi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city1.clear();
        allovercommercePage.city1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");


        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone verisi yazildi.");


        //Email sekmesine gel var olan email adresi sil
        allovercommercePage.emailKutusu1.clear();
        extentTest.info("Email sekmesinde var olan bilgi silindi.");

        //Yeni Email address gir
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("yeniemail"));
        extentTest.info("Yeni bir email adres veri girisi yapildi.");


        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Addresses butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Address changed successfully.” yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.getText().contains("Address changed successfully."));
        extentTest.info("\"Address changed successfully.\"");


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfa kapatildi,");
        extentReports.flush();

    }


    @Test(priority = 3)
    public void TC_04_FirstNameBosBirakilmasi() {


        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_04_FirstNameBosBirakilmasi","Allovercommerce web sayfasi test raporu");

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name bos birak
        allovercommercePage.bullingFirstName1.clear();
        extentTest.info("Firs name bos birakildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street address verisi yazildi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city1.clear();
        allovercommercePage.city1.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        //Email i gor
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");

        ReusableMethods.bekle(3);
        // “First name is a required field.” metnin gorunelebilirligini dogurula
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiFirstNameIsRequiredField1.isDisplayed());
        extentTest.info("\"First name is a required field.\" yazisi dogrulandi." );


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();

    }


    @Test(priority = 4)
    public void TC_05_LastNameBosBirakilmasi() {

        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_05_LastNameBosBirakilmasi","Allovercommerce web sayfasi test raporu");

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi.");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        ReusableMethods.bekle(3);
        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name bos birak
        allovercommercePage.bullingLanstName1.clear();
        extentTest.info("Last name bos birakildi.");

        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street address verisi yazildi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        ReusableMethods.bekle(3);
        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Last name is a required field.” yazisinin gorunurlugunu dogrula
        WebElement dogrulamaYazisiLastNameIsRequiredField = Driver.getDriver().findElement(By.xpath("//*[@class='page-title-bar']"));
        Assert.assertTrue(dogrulamaYazisiLastNameIsRequiredField.isDisplayed());
        extentTest.info("\"First name is a required field.\" yazisi dogrulandi." );


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();
    }


    @Test(priority = 5)
    public void TC_06_StreetAddressBosBirakilmasi() {

        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_06_StreetAddressBosBirakilmasi","Allovercommerce web sayfasi test raporu");

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address bos birak
        allovercommercePage.streetAddress1.clear();
        extentTest.info("Street adres bos birakildi.");


        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Street address is a required field” yazisinin gorunurlugunu dogrula
        WebElement dogrulamaYazisiStreetAddressField = Driver.getDriver().findElement(By.xpath("//*[@data-id='billing_address_1']"));
        Assert.assertTrue(dogrulamaYazisiStreetAddressField.isDisplayed());
        extentTest.info("\"Street address is a required field.\" yazisi dogrulandi." );


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();


    }



    @Test(priority = 6)
    public void TC_07_StreetAddressTekKarakterGirilmesi() {


        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_07_StreetAddressTekKarakterGirilmesi","Allovercommerce web sayfasi test raporu");

        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        extentTest.info("Allovercommerce web sayfasina giris yapildi.");

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name bos birak
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address tek karaker gir  ("a")
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys("a");
        extentTest.fail("Street Address tek karakter ile giris yapildi. Adres tek karakter olamaz.");

        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("Street Address tek karakter ile girisi kabul ediyor.");
        extentTest.info("Tum sayfa resmi alindi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed()); // burasi da uzun degil bu sekilde calisiyor
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Address changed successfully.”  yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisi dogrulandi." );

        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();

    }



    @Test(priority = 7)
    public void TC_08_StreetAddress500KarakterGirilmesi() {


        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_08_StreetAddress500KarakterGirilmesi","Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");


        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name bos birak
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address i 500 karakter gir()
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        extentTest.fail("Street address 500 karakter girisi yapildi. Adress 500 karakter olamaz");

        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("Street address 500 karakter girisi kabul ediyor.");
        extentTest.info("Tum sayfa resmi alindi.");


        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode1"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed()); // burasi da uzun degil bu sekilde calisiyor
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Address changed successfully.”  yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisi dogrulandi." );


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();

    }


    @Test(priority = 8)
    public void TC_09_PostcodeBosBirakilmasi() {


        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_09_PostcodeBosBirakilmasi","Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address gir (Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street address verisi yazildi.");

        //Postcode / ZIP bos birak
        allovercommercePage.postcode.clear();
        extentTest.info("Postcode bos birakildi,");


        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed()); // burasi da uzun degil bu sekilde calisiyor
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Postcode / ZIP is a required field.” yazisinin gorunurlugunu dogrula
        WebElement dogrulamaYazisiPostcodeField = Driver.getDriver().findElement(By.xpath("//*[@data-id='billing_postcode']"));
        Assert.assertTrue(dogrulamaYazisiPostcodeField.isDisplayed());
        extentTest.info("\"Postcode / ZIP is a required field.\" yazisi dogrulandi." );


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();

    }

    @Test(priority = 9)
    public void TC_10_PostcodeHarfKarakterGirilmesi() {

        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_10_PostcodeHarfKarakterGirilmesi","Allovercommerce web sayfasi test raporu");

        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
         ReusableMethods.bekle(3);
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name bos birak
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street address verisi yazildi.");

        //Postcode / ZIP harf karakter gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys("aaaaaa");
        extentTest.fail("Postcode harf karakter ile giris yapildi. Postcode harf karakter olamaz.");

        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("Postcode harf karakter ile giris yapilabiliyor.");
        extentTest.info("Tum sayfa resmi alindi.");

        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");
        extentTest.info("Country acilir sekmede Adana secimi yapildi.");

        //Phone gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys(ConfigReader.getProperty("phone1"));
        extentTest.info("Phone girisi yapildi.");

        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");

        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Address changed successfully.”  yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisi dogrulandi." );


        ReusableMethods.bekle(3);
        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();

    }


    @Test(priority = 10)
    public void TC_11_Phone25KarakterGirilmesi() {

        action =new Actions(Driver.getDriver());
        allovercommercePage = new AllovercommercePage();
        reusableMethods = new ReusableMethods();
        extentTest =extentReports.createTest("TC_11_Phone25KarakterGirilmesi","Allovercommerce web sayfasi test raporu");


        //Login ol
        ReusableMethods.signInMethod(ConfigReader.getProperty("alloverEmail"),ConfigReader.getProperty("alloverpasword"));
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
        extentTest.info("Addresses butonuna tiklandi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Add butonuna tikla
        allovercommercePage.editYourBillingAddressButton1.click();
        extentTest.info("Adres bilgilerini kayit sayfasina gecis icin add butonuna tiklandi");

        ReusableMethods.bekle(3);
        //“Billing address” yazisini gor
        Assert.assertTrue(allovercommercePage.dogrulamaYazisiBullingAdress1.getText().contains("Billing address"));
        extentTest.info("\"Billing address\" yazisinin gorunulurlugu dogrulandi");

        //First name gir
        allovercommercePage.bullingFirstName1.clear();
        allovercommercePage.bullingFirstName1.sendKeys(ConfigReader.getProperty("firstName1"));
        extentTest.info("First name yazildi");

        //Last name gir
        allovercommercePage.bullingLanstName1.clear();
        allovercommercePage.bullingLanstName1.sendKeys(ConfigReader.getProperty("lastName1"));
        extentTest.info("Last name yazildi");


        action.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Sayfada bir page down assagi inildi.");

        //Country / Region gir
        WebElement countrySelect = allovercommercePage.billingCountrySelect1;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");
        extentTest.info("Country sekmesinde Turkey  secildi.");

        //Street address gir(Fatih mh 10. sk)
        allovercommercePage.streetAddress1.clear();
        allovercommercePage.streetAddress1.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("Street address verisi yazildi.");

        //Postcode / ZIP gir
        allovercommercePage.postcode.clear();
        allovercommercePage.postcode.sendKeys(ConfigReader.getProperty("postcode"));
        extentTest.info("Postcode verisi yazildi.");

        //Town / City gir
        allovercommercePage.city.clear();
        allovercommercePage.city.sendKeys(ConfigReader.getProperty("city1"));
        extentTest.info("City verisi yazildi.");

        //Province gir
        WebElement countrySelect1 = allovercommercePage.bullingProvince1;
        Select select1 = new Select(countrySelect1);
        select1.selectByVisibleText("Adana");

        //Phone 25 karakter gir
        allovercommercePage.phone.clear();
        allovercommercePage.phone.sendKeys("55555555555555555555555555");
        ReusableMethods.bekle(2);

        ReusableMethods.bekle(3);
        extentTest.fail("Phone 25 karakterle giris yapilabiliyor. Kayit yapilmamamli.");
        extentTest.info("Tum sahya resimi alindi.");


        //Email i gor
        allovercommercePage.emailKutusu1.clear();
        allovercommercePage.emailKutusu1.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Assert.assertTrue(allovercommercePage.emailKutusu1.isDisplayed());
        extentTest.info("Email adresi goruldu.");

        ReusableMethods.tumSayfaResmi("Phone 25 karakterle giris yapilabilmesi.");

        ReusableMethods.bekle(3);
        //Save Address butona tikla
        allovercommercePage.saveAdress1Button1.click();
        extentTest.info("Save Address butonuna tiklandi.");


        ReusableMethods.bekle(3);
        // “Address changed successfully.”  yazisinin gorunurlugunu dogrula
        Assert.assertTrue(allovercommercePage.dogrulaYazisiAddressChangedSuccessfully1.isDisplayed());
        extentTest.info("\"Address changed successfully.\" yazisi dogrulandi." );


        //Sayfayi kapatalim
        Driver.closeDriver();
        extentTest.info("Web sayfasindan cikis islemi yapildi.");
        extentReports.flush();

    }
}

