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

public class US_14 extends ExtentReport {
    AllovercommercePage page;

    @Test
    public void storeManegerTest01() {
        extentTest =extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");
        //Kullanıcı adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Allovercommerce Sayfasina Gidildi.");
        //siginin e tıklar
        page.signin.click();
        extentTest.info("Sing in Butonu Tıklandı.");
        //Gecerli e mail adresini girer
        page.signinUsername.sendKeys("yussuf.azarius@fixedfor.com");
        extentTest.info("Username Yazıldı.");
        //Password yazar.
        page.signinPassword.sendKeys("Asli1234*");
        extentTest.info("Password Yazıldı");
        //signin te tıklar
        page.signinLogin.click();
        extentTest.info("Sing in Login Butonu Tıklandı.");
        // Kullanıcı Sign Out butonuna tıklar
        page.singOutButonu.click();
        extentTest.info("Giris icin SignOut butonu tıklandı.");
        // Kullanıcı Store Manager butonunu tıklar
        page.storeManagerButonu.click();
        extentTest.info("Store Manager butonu tıklandı.");
        // Kullanıcı Product butonunu tıklar
        page.productsButonu.click();
        extentTest.info("Product butonu tıklandı.");
        // Kullanıcı Add New butonunu tıklar
        ReusableMethods.click(page.addNewButonu);
        extentTest.info("Add New butonu tıklandı.");
        //Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri olmalı
        Select select = new Select(page.simpleProductKutusu);
        select.selectByVisibleText("Simple Product");
        select.selectByVisibleText("Variable Product");
        select.selectByVisibleText("Grouped Product");
        select.selectByVisibleText("External/Affiliate Product");
        Assert.assertTrue(page.simpleProductKutusu.isEnabled());
        extentTest.info("Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri görüldü.");
        //Kullanıcı Product Title'a yazı yazalabilmeli
        page.productTitleKutusu.sendKeys("Urun Baslıgı");
        extentTest.info("Product Title'a yazıldı.");
        Driver.getDriver().switchTo().frame("excerpt_ifr");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Kullanıcı Short Description'a yazı yazalabilmeli
        page.shortDescriptionKutusu.sendKeys("Yeni Urun");
        extentTest.info("Short Description'a yazıldı.");
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame("description_ifr");
        //Kullanıcı Description'a yazı yazalabilmeli
        page.descriptionKutusu.sendKeys("Kullanıslı Urunler");
        extentTest.info("Description'a yazıldı.");
        Driver.getDriver().switchTo().parentFrame();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Kullanıcı Categories seçebilmeli
        page.besinTakviyesiiSecenegi.click();
        extentTest.info("Categories'ten Besin Takviyesi Seçeneği tıklandı.");
        //Kullanıcı Yeni Categories ekleyebilmeli
        page.addNewCategoryButonu.click();
        page.categoryNameKutusu.sendKeys("betuldesing");
        page.addButonu1.click();
        extentTest.info("Yeni Categories eklendi");
        ReusableMethods.bekle(10);
        //Kullanıcı Product Brands seçebilmeli
        page.aCKSecenegi.click();
        extentTest.info("ACK Seçeneği tıklandı.");
        //Kullanıcı Yeni Product Brands ekleyebilmeli
        page.addNewProductBrandsKutusu.click();
        page.productBrandsNameKutusu.sendKeys("kıyafet");
        page.addButonu2.click();
        extentTest.info("Yeni Product Brands eklendi");
        ReusableMethods.bekle(2);
        //Ürün fotoğrafı eklenebilmeli
        page.buyukResimKutusu.click();
        page.selectFiles.click();
        ReusableMethods.uploadFileFromPc("src/test/java/resources/resim/c5f36799-95cb-4254-a516-f502f69abb0b kopyası.jpg");
        ReusableMethods.bekle(3);
        page.selectFilesButonu.click();
        Driver.getDriver().switchTo().parentFrame();
        page.kucukresimKutusu.click();
        ReusableMethods.uploadFileFromPc("src/test/java/resources/resim/c5f36799-95cb-4254-a516-f502f69abb0b kopyası.jpg");
        page.selectFiles1.click();
        ReusableMethods.bekle(3);
        page.selectButonu1.click();
        ReusableMethods.tumSayfaResmi("Sayfa Resmi");
        ReusableMethods.bekle(1);
        Driver.getDriver().switchTo().frame("excerpt_ifr");
        extentTest.info("Ürün fotoğrafları eklendi yazıldı.");
        //Kullanıcı Submit yapabilmeli
        page.submitButonu.click();
        extentTest.info("Submit Yapıldı");
        ReusableMethods.tumSayfaResmi("Submit");



    }
}
