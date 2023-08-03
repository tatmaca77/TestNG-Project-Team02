package tests.US_0015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.*;

public class TC_03 extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("US0015_TC03","Test Raporu");
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
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shipping"))).click();
        extentTest.info("Shipping secenegi secildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingWeight"))).sendKeys("90");
        extentTest.info("Weight(kg) kutusuna gecerli bir sayi girildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingDimensionsLength"))).sendKeys("150");
        extentTest.info("Dimensions(cm), length kutusuna gecerli bir sayi girildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingDimensionsWidth"))).sendKeys("50");
        extentTest.info("Dimensions(cm), Width kutusuna gecerli bir sayi girildi");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingDimensionsHeight"))).sendKeys("40");
        extentTest.info("Dimensions(cm), Height kutusuna gecerli bir sayi girildi");
        String expectedddm = "No shipping class";
        String actualddm = allovercommercePage.ddmShippingShippingClassEA.getText();
        Assert.assertEquals(actualddm,expectedddm);
        extentTest.info("Shipping class kutusunda No shipping seceneginin oldugu dogrulandi");
        Select select = new Select(allovercommercePage.ddmShippingProcessingTimeEA);
        List<WebElement> times = select.getOptions();
        for (WebElement time:times) {
            ddmVisibleText(allovercommercePage.ddmShippingProcessingTimeEA, time.getText());
        }
        extentTest.info("Processing Time menüsünden bütün seceneklerin secilebilir oldugu dogrulandi");
        ddmVisibleText(allovercommercePage.ddmShippingProcessingTimeEA,"1-2 weeks");
        extentTest.info("Processing Time seceneklerinden 1-2 weeks secenegi secildi");
        bekle(3);
        extentTest.info("Tüm islemlerin yapilabildigi dogrulandi");
        tumSayfaResmi("TC_03");







    }
}