package tests.US15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;

import static utilities.ReusableMethods.*;

public class TC_04 extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("US0015_TC04","Test Raporu");
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
        extentTest.info("Product sayfasina gidild");
        allovercommercePage.addNewEA.click();
        extentTest.info("Add New secenegine tiklandi");
        scroll(allovercommercePage.scroll7ThingsEA);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributes"))).click();
        extentTest.info("Attributes secenegi secildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesColorKutusu"))).click();
        bekle(2);
        WebElement element = Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesColorYazmaKutusu")));
        element.click();
        extentTest.info("Color kutusuna tiklandi");
        element.sendKeys("Black",Keys.ENTER,Keys.ENTER);
        extentTest.info("Search for an attribute kutusuna metin girildi");
        bekle(3);
        element.sendKeys("Red",Keys.ENTER,Keys.ENTER);
        bekle(3);
        extentTest.info("Search for an attribute kutusuna metin girildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesSizeKutusu"))).click();
        extentTest.info("Size Butonuna tiklandi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesSizeYazmaKutusu"))).sendKeys("1101",Keys.ENTER,Keys.ENTER);
        extentTest.info("Size kutusuna bir rakam girildi");
        bekle(3);
        extentTest.info("Tüm islemlerin basarili bir sekilde yapildigi dogrulandi");
        tumSayfaResmi("TC_04");




    }
}