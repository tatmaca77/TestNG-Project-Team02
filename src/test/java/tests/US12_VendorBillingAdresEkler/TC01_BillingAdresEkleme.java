package tests.US12_VendorBillingAdresEkler;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_BillingAdresEkleme extends ExtentReport {
    AllovercommercePage page = new AllovercommercePage();
    @Test
    public void TC_01_BillingAddressEkleme() {
        extentTest = extentReports.createTest("TestNGTeam02","VendorBilling");

        // 1 Vendor anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        ReusableMethods.bekle(2);
        extentTest.info("Anasayfaya gidildi");

        // 2 Sign In butonuna tıklar
        ReusableMethods.click(page.signInRegister);
        extentTest.info("Sign in butonuna tıklandı");
        ReusableMethods.bekle(1);

        //3 "Username or email address" alanına geçerli bir mail adresi girer.
        page.usernameKutusu.sendKeys(ConfigReader.getProperty("vendorEmail"));
        extentTest.info("Geçerli bir email adresi girildi");
        ReusableMethods.bekle(1);

        //4 "Password" alanına geçerli bir şifre girer.
        page.passwordKutusu.sendKeys(ConfigReader.getProperty("vendorPassword"));
        extentTest.info("Geçerli bir password girildi");
        ReusableMethods.bekle(1);

        //5- "Popup sign in butonuna tıklar.
        page.popUpsignIn.click();
        ReusableMethods.bekle(1);

        //6- SignOut butonuna tıklar
        page.signOutButonu.click();
        ReusableMethods.bekle(1);

        //7- Adresses butonuna tıkla.
        page.addressesText.click();
        ReusableMethods.bekle(1);
        extentTest.info("Addresses sayfasına gidildi");

        //8- Billing Address alanında ADD yazısına tıkla.
        page.addText.click();
        ReusableMethods.bekle(1);
        extentTest.info("(Billing)ADD yazısına tıklandı");

        //9- Billing address sayfasının açıldığını doğrula
        page.billingAddressSayfasi.isDisplayed();
        ReusableMethods.bekle(1);
        extentTest.info("Billing address sayfasina gidildi");

        //10- Name bilgisi gir.
        Faker faker=new Faker();
        page.firstNameKutu.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(1);
        extentTest.info("First Name girildi.");

        //11- Last Name bilgisi gir.
        page.LastNameKutusu.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(1);
        extentTest.info("Last Name girildi.");

        //12- Kullanıcı Country/Region alanını doldurur
        ReusableMethods.ddmVisibleText(page.countryRegion, "Turkey");
        ReusableMethods.bekle(1);
        extentTest.info("Ülke seçimi yapıldı");

        /* Street address alanına adres bilgilerini gir.
        page.streetAddressKutusu.sendKeys("Adalet Mah.");
        extentTest.info("Street address alanı dolduruldu.");
*/
        //13-  Street address alanına adres bilgilerini gir.
        String addres = faker.address().fullAddress();
        page.streetAddressKutu.sendKeys(addres);
        ReusableMethods.bekle(1);
        extentTest.info("Adres bilgisi girildi");

        //14- Postcode/zip alanına posta kodu gir.
        page.postcode.sendKeys(ConfigReader.getProperty("postcode"));
        ReusableMethods.bekle(1);
        extentTest.info("Posta kodu girildi");

        //15- Town/City bilgisi gir.
        String town = faker.address().city();
        page.town.sendKeys(town);
        ReusableMethods.bekle(1);
        extentTest.info("City bilgisi girildi");

        //16- Province alanına şehir bilgisi gir.
        ReusableMethods.ddmVisibleText(page.province, "Ankara");
        ReusableMethods.bekle(1);
        extentTest.info("Province alanına şehir bilgisi girildi");

        //17- Phone alanına telefon numarası gir.
        page.phoneNumber.sendKeys(ConfigReader.getProperty("phoneNumber"));
        ReusableMethods.bekle(1);
        extentTest.info("Phone alanına telefon numarası girildi");

        //18- e-mail adress alanında, kayıt olunan e-mail adresinin otomatik olarak geldiğini doğrula.
        ReusableMethods.scroll(page.billingMailKutusu);
        Assert.assertEquals(page.billingMailKutusu.getAttribute("value"),ConfigReader.getProperty("vendorEmail"));
        ReusableMethods.bekle(1);
        extentTest.info("kayıt olunan e-mail adresinin otomatik olarak geldiğini doğrulandı");

        //19- Save Addres butonuna tıkla.
        page.saveAddressButton.submit();
        ReusableMethods.bekle(1);
        extentTest.info("save addres butonuna tıklandı");

        //20- "Address changed successufly" yazısının görüldüğünü doğrula.
        Assert.assertTrue(page.addressChanged.isDisplayed());
        ReusableMethods.bekle(1);
        extentTest.info("Address changed successufly yazısı görüldü");




    }
}
