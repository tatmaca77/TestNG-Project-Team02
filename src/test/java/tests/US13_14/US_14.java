package tests.US13_14;

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

import java.time.LocalDateTime;


import static pages.AllovercommercePage.addNewCategoryButonuB;

public class US_14 extends ExtentReport {
    AllovercommercePage page;

    @Test
    public void storeManegerTest01() {
        extentTest =extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce Sayfasina Gidildi.");
        //siginin e tıklar
        ReusableMethods.signInMethod("dametrius.rheece@fixedfor.com","Sifre123");
        extentTest.info("Sing in Login Butonu Tıklandı.");
        // Kullanıcı Sign Out butonuna tıklar
        AllovercommercePage.singOutButonuB.click();
        extentTest.info("Giris icin SignOut butonu tıklandı.");
        // Kullanıcı Store Manager butonunu tıklar
        AllovercommercePage.storeManagerButonuB.click();
        extentTest.info("Store Manager butonu tıklandı.");
        // Kullanıcı Product butonunu tıklar
        AllovercommercePage.productsButonuB.click();
        extentTest.info("Product butonu tıklandı.");
        // Kullanıcı Add New butonunu tıklar
        ReusableMethods.click(AllovercommercePage.addNewButonuB);
        extentTest.info("Add New butonu tıklandı.");
        //Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri olmalı
        Select select = new Select(AllovercommercePage.simpleProductKutusuB);
        select.selectByVisibleText("Simple Product");
        select.selectByVisibleText("Variable Product");
        select.selectByVisibleText("Grouped Product");
        select.selectByVisibleText("External/Affiliate Product");
        Assert.assertTrue(AllovercommercePage.simpleProductKutusuB.isEnabled());
        extentTest.info("Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri görüldü.");
        //Kullanıcı Product Title'a yazı yazalabilmeli
        AllovercommercePage.productTitleKutusuB.sendKeys("Urun Baslıgı");
        extentTest.info("Product Title'a yazıldı.");
        Driver.getDriver().switchTo().frame("excerpt_ifr");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Kullanıcı Short Description'a yazı yazalabilmeli
        AllovercommercePage.shortDescriptionKutusuB.sendKeys("Yeni Urun");
        extentTest.info("Short Description'a yazıldı.");
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame("description_ifr");
        //Kullanıcı Description'a yazı yazalabilmeli
        AllovercommercePage.descriptionKutusuB.sendKeys("Kullanıslı Urunler");
        extentTest.info("Description'a yazıldı.");
        Driver.getDriver().switchTo().parentFrame();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.scroll(addNewCategoryButonuB);
        //Kullanıcı Categories seçebilmeli
        AllovercommercePage.aaaSecenegiB.click();
        extentTest.info("Categories'ten Besin Takviyesi Seçeneği tıklandı.");
        //Kullanıcı Yeni Categories ekleyebilmeli
        addNewCategoryButonuB.click();
        String katagory="betuldesing"+ LocalDateTime.now();
        AllovercommercePage.categoryNameKutusuB.sendKeys(katagory);
        AllovercommercePage.addButonu1B.click();
        extentTest.info("Yeni Categories eklendi");
        ReusableMethods.bekle(10);
        //Kullanıcı Product Brands seçebilmeli
        AllovercommercePage.yirmiBirGunTarhanaSecenegiB.click();
        extentTest.info("21 gün Tarhana Seçeneği tıklandı.");
        //Kullanıcı Yeni Product Brands ekleyebilmeli
        String productName="Kıyafet"+ LocalDateTime.now();
        AllovercommercePage.productBrandsNameKutusuB.sendKeys(productName);
        AllovercommercePage.addButonu2B.click();
        extentTest.info("Yeni Product Brands eklendi");
        ReusableMethods.bekle(2);
        //Ürün fotoğrafı eklenebilmeli
        AllovercommercePage.buyukResimKutusuB.click();
        AllovercommercePage.selectFilesB.click();
        ReusableMethods.uploadFileFromPc("src/test/java/resources/resim/c5f36799-95cb-4254-a516-f502f69abb0b kopyası.jpg");
        ReusableMethods.bekle(3);
        AllovercommercePage.selectFilesButonuB.click();
        Driver.getDriver().switchTo().parentFrame();
        AllovercommercePage.kucukresimKutusuB.click();
        ReusableMethods.uploadFileFromPc("src/test/java/resources/resim/c5f36799-95cb-4254-a516-f502f69abb0b kopyası.jpg");
        AllovercommercePage.selectFiles1B.click();
        ReusableMethods.bekle(3);
        AllovercommercePage.selectButonu1B.click();
        ReusableMethods.tumSayfaResmi("Sayfa Resmi");
        ReusableMethods.bekle(1);
        Driver.getDriver().switchTo().frame("excerpt_ifr");
        extentTest.info("Ürün fotoğrafları eklendi yazıldı.");
        //Kullanıcı Submit yapabilmeli
        AllovercommercePage.submitButonuB.click();
        extentTest.info("Submit Yapıldı");
        ReusableMethods.tumSayfaResmi("Submit");



    }
}
