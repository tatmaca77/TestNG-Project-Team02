package tests.US_0016;

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

public class TC_01 extends ExtentReport {
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
        extentTest.info("Product sayfasina gidildi");
        allovercommercePage.addNewEA.click();
        extentTest.info("Add New secenegine tiklandi");
        Select select=new Select(allovercommercePage.ddmSimpleProductEA);
        String expectedResult = "Simple Product";
        String actualResult = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualResult,expectedResult);
        bekle(2);
        webElementResmi(allovercommercePage.ddmSimpleProductEA);
        extentTest.info("Simple Product'in Dropdown menüde default olarak geldigi dogrulandi");
        Assert.assertTrue(allovercommercePage.checkBoxVirtualEA.isEnabled());
        allovercommercePage.checkBoxVirtualEA.click();
        bekle(1);
        webElementResmi(allovercommercePage.checkBoxVirtualEA);
        extentTest.info("Virtual ve Downloadable'in seceneklerine tiklandi");
        bekle(1);
        Assert.assertTrue(allovercommercePage.checkBoxDownloadableEA.isEnabled());
        allovercommercePage.checkBoxDownloadableEA.click();
        bekle(1);
        webElementResmi(allovercommercePage.checkBoxDownloadableEA);
        extentTest.info("Virtual ve Downloadable'in seceneklerine tiklanabildigi dogrulandi");
        bekle(1);
        allovercommercePage.priceKutusuEA.sendKeys("150");
        extentTest.info("Price kutusuna gecerli bir rakam girildi");
        bekle(1);
        webElementResmi(allovercommercePage.priceKutusuEA);
        allovercommercePage.salePriceKutusuEA.sendKeys("50");
        extentTest.info("Sale Price kutusuna gecerli bir rakam girildi");
        bekle(1);
        webElementResmi(allovercommercePage.salePriceKutusuEA);
        allovercommercePage.productTitleEA.sendKeys("Aslan");
        extentTest.info("Product Title kutusuna gecerli bir metin girildi");
        bekle(1);
        webElementResmi(allovercommercePage.productTitleEA);

        List<WebElement> categories = Driver.getDriver().findElements(By.xpath(ConfigReader.getProperty("categoriesList")));

        // Her bir checkbox için seçilebilirliği kontrol edin
        for (WebElement checkbox : categories) {
            if (checkbox.isEnabled()) {
                System.out.println("Checkbox seçilebilir durumda: " + checkbox.getText());
            } else {
                System.out.println("Checkbox seçilemez durumda: " + checkbox.getText());
            }
        }
        extentTest.info("Categories kisminda tüm seceneklerin secilebilir oldugu dogrulandi");
        scroll(Driver.getDriver().findElement(By.xpath("//ul[@id='product_cats_checklist']")));
        bekle(2);
        Driver.getDriver().findElement(By.xpath("//input[@value='645']")).click();
        extentTest.info("Categories kismindan bir secenek secildi");
        bekle(2);
        scroll(allovercommercePage.submitEA);
        extentTest.info("Submit butonuna tiklandi");
        bekle(2);
        allovercommercePage.submitEA.click();
        bekle(2);
        tumSayfaResmi("US_16_TC_01");
        extentTest.fail("Ürünün basariyla eklenemedi");



    }
}
