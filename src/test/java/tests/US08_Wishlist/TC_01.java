package tests.US08_Wishlist;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.click;

public class TC_01 extends ExtentReport {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());

    AllovercommercePage page = new AllovercommercePage();

    Select select;

    @Test
    public void test01() throws InterruptedException {

        extentTest = extentReports.createTest("TestNGTeam02", "Test Raporu");

        ReusableMethods.signInMethod(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));

        extentTest.info("Allovercommerce web sitesine gidildi");

        bekle(2);
        page.aramaKutusuzk.sendKeys("Macbook Air");

        extentTest.info("Arama kutusunda urun aratildi");

        //page.searchButonuzk.click();
        click(page.searchButonuzk);
        extentTest.info("searchbox butonu tiklandi");
        bekle(3);


        // page.ilkUrunzk.click();
        //js.executeScript("arguments[0].click();",  page.ilkUrunzk);
        click(page.ilkUrunzk);
        extentTest.info("Urun secildi");
        bekle(10);
        Driver.getDriver().navigate().refresh();
        bekle(5);

        actions.doubleClick(page.wishlistzk).perform();
        click(page.wishlistzk);
        extentTest.info("wishlist butonu tiklandi");
        bekle(3);


        //page.addToCartButonuzk.click();
        //js.executeScript("arguments[0].click();",page.addToCartButonuzk);
        click(page.addToCartButonuzk);
        extentTest.info("AddToCart Butonu tiklandi");
        bekle(6);


        //page.viewCartzk.click();
        // js.executeScript("arguments[0].click();",page.viewCartzk);
        click(page.viewCartzk);
        extentTest.info("viewCard Butonuna tiklandi");
        bekle(5);

        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();


        //page.proceedtocheckoutzk.click();
        //js.executeScript("arguments[0].click();",page.proceedtocheckoutzk);
        click(page.proceedtocheckoutzk);
        extentTest.info("ProceedToCheckout Butonu tiklandi");
        bekle(5);

        //Kullanici firstname alanini doldurur
        js.executeScript("arguments[0].value = '';", page.firstName);
        bekle(3);
        page.firstName.sendKeys("Mehtap", Keys.TAB);
        extentTest.info("Kullanici firstname alanini doldurdu");
        bekle(3);

        //Kullanici lastname alanini doldurur
        js.executeScript("arguments[0].value = '';", page.lastName);
        bekle(3);
        page.lastName.sendKeys("Sannli", Keys.TAB, Keys.TAB);
        extentTest.info("Kullanici lastname alanini doldurdu");
        bekle(3);

        //Kullanici country/region alanini doldurur
        actions.click(page.ddmzk).sendKeys("Yemen", Keys.ENTER).perform();
        extentTest.info("Kullanici country/region alanini doldurdu");

//        select = new Select(page.ddmzk);
//        select.selectByVisibleText("Vatican");
        bekle(3);

        //Kullanici street address alanini doldurur
        js.executeScript("arguments[0].value = '';", page.streetAdreezk);
        bekle(3);

        actions.click(page.streetAdreezk);
        page.streetAdreezk.sendKeys("Kucukcekmece kanarya", Keys.TAB, Keys.TAB);
        extentTest.info("Kullanici street address alanini doldurdu");
        bekle(3);


        //Kullanici town/city alanini doldurur
        js.executeScript("arguments[0].value = '';", page.cityzk);
        bekle(3);
        page.cityzk.sendKeys("Baliksu", Keys.TAB);
        bekle(3);
        extentTest.info("Kullanici street address alanini doldurdu");

        //Kullanici state/country alanini doldurur
        //page.countryzk.sendKeys("Alabama",Keys.TAB);
        js.executeScript("arguments[0].value = '';", page.countryzk);
        bekle(3);
        actions.click(page.countryzk).sendKeys("Busia").perform();
        extentTest.info("Kullanici state/country alanini doldurdu");
        bekle(3);
//        select = new Select(page.countryselectzk);
//        select.selectByVisibleText("Busia");


        //Kullanici postacode/zip alanini doldurur

        js.executeScript("arguments[0].value = '';", page.postcodezk);
        bekle(3);
        page.postcodezk.sendKeys("44312", Keys.TAB);
        extentTest.info("Kullanici postacode/zip alanini doldurdu");
        bekle(3);


        //Kullanici phone alanini doldurur
        js.executeScript("arguments[0].value = '';", page.phonezk);
        bekle(3);
        page.phonezk.sendKeys("958730009", Keys.TAB);
        extentTest.info("Kullanici phone alanini doldurdu");
        bekle(3);

        //Kullanici email address alanini doldurur
        js.executeScript("arguments[0].value = '';", page.emailAdreszk);
        bekle(3);
        page.emailAdreszk.sendKeys("www.projella.@gmail.com");
        extentTest.info("Kullanici email address alanini doldurdu");

        bekle(3);

        //Kullanici payment methods secer
        page.eftzk.click();
        extentTest.info("Kullanici wire transfer/EFT'yi secti");
        bekle(3);

        page.payzk.click();
        extentTest.info("Kullanici pay at the door'u secti");
        bekle(3);

        page.eftzk.click();
        extentTest.info("Kullanici wire transfer/EFT'yi secti");
        bekle(3);

        click(page.placeOrderzk);
        extentTest.info("placeOrderButonuna tiklandi");

        Assert.assertTrue(page.thankyoumsjzk.getText().contains("Thank you. Your order has been received"));

        extentTest.info("Kullanici istek listesine ekledigi urunu satin aldigina dair mesaj gerceklendi");

        Driver.closeDriver();

        extentTest.info("Driver kapatildi");

    }
}