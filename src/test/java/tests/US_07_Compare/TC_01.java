package tests.US_07_Compare;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.bekle;

public class TC_01 extends ExtentReport {


    Actions actions = new Actions(Driver.getDriver());

    AllovercommercePage page = new AllovercommercePage();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    List<WebElement> tumUrunler;

    List<WebElement> xSilmeListesi;


    @Test
    public void test01() throws InterruptedException {

        extentTest = extentReports.createTest("ExtentReport", "Test Raporu");


        //Kullanici web sitesine login olur

        ReusableMethods.signInMethod(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        bekle(3);

        extentTest.info("Kullanici Allovercommerce uygulamasina giriş yaptı");


        //Kullanici arama kutusuna "MacBook Air" adli ürününü yazar

        page.aramaKutusuzk.sendKeys("MacBook Air");
        bekle(2);
        extentTest.info("Kullanici arama kutusuna karsilastiracagi urunu girdi");


        //Kullanici arama butonuna basar
        page.searchButonuzk.click();
        bekle(5);
        extentTest.info("Kullanici arama kutusunu tikladi");


        tumUrunler = Driver.getDriver().findElements(By.xpath("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[position()<5]"));


        for (int i = 0; i < tumUrunler.size(); i++) {


            if (i < 3) {

                tumUrunler = Driver.getDriver().findElements(By.xpath("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[position()<5]"));
                actions.moveToElement(tumUrunler.get(i)).perform();
                bekle(3);
                extentTest.info("Kullanici karsilastirmak istedigi urunleri secer");

                //  page.compareButon.click();

                js.executeScript("arguments[0].click();", page.compareButonzk);
                bekle(3);
                extentTest.info("Kullanici Compare Butonuna tikladi");

                //page.startcompareButon.click();
                js.executeScript("arguments[0].click();", page.startcompareButonzk);
                bekle(3);
                Driver.getDriver().navigate().back();
                bekle(3);
                Driver.getDriver().navigate().refresh();
                bekle(3);

                extentTest.info("Kullanici StartCompare Butonuna tikladi");
            } else if (i == 3) {
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                bekle(3);

                tumUrunler = Driver.getDriver().findElements(By.xpath("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[position()<5]"));
                actions.moveToElement(tumUrunler.get(i)).perform();
                bekle(3);


                js.executeScript("arguments[0].click();", page.compareButonzk);
                bekle(3);
                extentTest.info("Kullanici Compare Butonuna tikladi");


                js.executeScript("arguments[0].click();", page.startcompareButonzk);
                bekle(10);
                extentTest.info("Kullanici StartCompare Butonuna tikladi");

            } else if (i > 3) {
                break;
            }


        }
        bekle(2);
        xSilmeListesi = Driver.getDriver().findElements(By.xpath("(//i[@class= 'w-icon-times-solid'])[position()<3]"));
        extentTest.info("Kullanici ekledigi urunleri sildi");


        for (int j = 0; j < xSilmeListesi.size(); j++) {
            bekle(2);
            xSilmeListesi = Driver.getDriver().findElements(By.xpath("(//i[@class= 'w-icon-times-solid'])[position()<3]"));

            js.executeScript("arguments[0].click();", xSilmeListesi.get(j));
            actions.click();

            extentTest.info("Kullanici silme ikonuna tiklar");

            //xSilmeListesi.get(j).click();

            bekle(3);

            Assert.assertTrue(xSilmeListesi.size() < 4);
            extentTest.info("Kullanici karsilastirmak icin sectigi urunleri silebildigi gerceklendi");
        }

        Driver.closeDriver();
        extentTest.info("Uygulama kapatildi");
    }

}




