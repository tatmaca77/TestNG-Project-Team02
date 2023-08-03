package tests.US_0015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class TC_02 extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("US0015_TC02","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        extentTest.info("Anasayfaya gidildi");
        AllovercommercePage allovercommercePage = new AllovercommercePage();
        allovercommercePage.signIn1EA.click();
        allovercommercePage.emailEA.sendKeys(ConfigReader.getProperty("emailEA"));
        allovercommercePage.passwordEA.sendKeys(ConfigReader.getProperty("passwordEA"));
        allovercommercePage.signIn2EA.click();
        extentTest.info("Satici olarak Log in olundu");
        bekle(5);
        Driver.getDriver().findElement(By.tagName("body")).sendKeys(Keys.END);
        allovercommercePage.myAccountEA.click();
        extentTest.info("My Account sayfasina gidildi");
        allovercommercePage.storeManagerEA.click();
        extentTest.info("Store Manager a sayfasina gidildi");
        allovercommercePage.productEA.click();
        extentTest.info("Product sayfasina gidildi");
        allovercommercePage.addNewEA.click();
        extentTest.info("Add New secenegine tiklandi");
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventorySKU"))).sendKeys("Aslan");
        extentTest.info("SKU kutucuguna bir metin girildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventoryManageStock"))).click();
        extentTest.info("Manage Stock secenegini isaretlendi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventoryStockQty"))).sendKeys("12");
        extentTest.info("Stock Qty kutucuguna gecerli bir rakam girildi");
        ddmIndex(allovercommercePage.ddminventoryAllowBackordersEA,2);
        extentTest.info("Allow Backorders' dan Allow secenegi secildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventorySoldIndividually"))).click();
        extentTest.info("Sold Individually secenegi tiklandi");
        bekle(3);
        extentTest.info("Islemlerin yapilabildigi dogrulandi");
        tumSayfaResmi("TC_02");
        allovercommercePage.submitEA.click();
        extentTest.info("Submit secenegi tiklandi");
        bekle(2);
        extentTest.pass("Zorunlu alanlarin doldurulmadigina dair uyari alindi");
        tumSayfaResmi("TC_02_Uyari");






    }
}