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

public class TC_01 extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("US0015_TC01","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        extentTest.info("Anasayfaya gidildi");
        AllovercommercePage allovercommercePage = new AllovercommercePage();
        allovercommercePage.signIn1EA.click();
        allovercommercePage.emailEA.sendKeys(ConfigReader.getProperty("emailEA"));
        allovercommercePage.passwordEA.sendKeys(ConfigReader.getProperty("passwordEA"));
        extentTest.info("Satici olarak Log in olundu");
        allovercommercePage.signIn2EA.click();
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
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventory"))).click();
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shipping"))).click();
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributes"))).click();
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("linked"))).click();
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("seo"))).click();
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("advanced"))).click();
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventory"))).click();
        bekle(5);
        extentTest.pass("Inventory, Shipping, Attributes, Linked, Seo, Advanced menülerinin tiklanabilir ve görülebilir oldugunu dogrulandi");
        tumSayfaResmi("TC_01");






    }
}
