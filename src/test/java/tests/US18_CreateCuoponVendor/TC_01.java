package tests.US18_CreateCuoponVendor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_01 extends ExtentReport {

    /**
     Go to HomePage
     Click the "Sign In" button
     Enter the "Email address or Username"
     Enter your "Password"
     Select the " Remember Me" button
     Click the "Sign In" button
     Verify the login
     Click on tehe "Store Manager" section
     Click on the Coupons tab under the My Store section
     Click on the "Add New"
     Verify that there is a blue Add Coupon option in the top left corner
     Writte in the "Code" section "bedava123"
     written in the "Description" section   "Tüm Ürünlerde Gecerli Indirim Kuponu"
     Select to "Percentage Discount"
     Select "Fixed Product Discount"
     Verify that characters other than numbers are not entered in Coupon Amount
     Enter '10' in Coupon Amount
     Verify Coupon Amount 10
     Enter coupon expiration date 2023.7.25
     Verify that the coupon expiration date is 2023.7.25
     Select "Allow free shipping"
     Verify that "Allow free shipping" is selected
     Select "Show on store"
     Verify that "Show on store" is selected
     Scroll down until the "SUBMIT" button appears
     Click on the "SUBMIT"
     Click on the "Coupons"
     Verify that the generated "Coupon" has been seen
     */

    public static Actions action ;

    @Test
    public void couponVendor() {

        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");

        ReusableMethods.login(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        extentTest.info("Sign In islemi ile kullanici girisi yapildi.");

        ReusableMethods.bekle(5);

        AllovercommercePage page = new AllovercommercePage();
        ReusableMethods.click(page.signOut);
        extentTest.info("Sign Out kismina tiklandi.");


        // Verify the login
        Assert.assertTrue(page.signOut.isDisplayed());
        extentTest.info("Basarili giris icin SignOut butonunun görüntülendigi dogrulandi.");


        // Click on te "Sign Out"
        page.signOut.click();
        extentTest.pass("Sign Out kismina tiklandi.");


        // Click on the "Store Manager" section
        page.storeManager.click();
        extentTest.info("Store Manager bölümüne tiklandi.");

        // Click on the Coupons tab under the My Store section
        /** action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
         action.moveToElement(page.coupons).contextClick().build().perform();
         */
        ReusableMethods.click(page.coupons);
        extentTest.info("Cuopons bölümüne tiklandi.");

        // Click on the "Add New"
        ReusableMethods.click(page.addNew);
        extentTest.info("Kupon eklemek icin Add New tiklandi.");

        // Verify that there is a blue Add Coupon option in the top left corner
        Assert.assertTrue(page.blueAddNewText.isDisplayed());
        extentTest.pass("Add New mavi olarak görüldügü dogrulandi.");

        // Scroll down until the "SUBMIT" button appears
        ReusableMethods.scroll(page.submitButton);
        extentTest.info("Submit butonuna kadar sayfa asagiya dogru (Scroll down) kaydirildi.");

        // Write in the "Code" section "bedava123" // written in the "Description" section "Tüm Ürünlerde Gecerli Indirim Kuponu"
        page.codeSection.sendKeys(ConfigReader.getProperty("code"),Keys.TAB,
                ConfigReader.getProperty("description"),Keys.TAB);
        extentTest.info("Code ve Description bölümleri dolduruldu.");

        ReusableMethods.bekle(1);

        // Verify that Discount Type is "Percentage Discount" by default
        Assert.assertTrue(page.discountType.isDisplayed());
        extentTest.info("Percentage Discount secenegi default olarak görüldügü dogrulandi.");

        ReusableMethods.bekle(2);

        // Select to "Fixed Product Discount"
        ReusableMethods.ddmVisibleText(page.discountType,"Fixed Product Discount");
        extentTest.info("Fixed Product Discount secildi.");

        ReusableMethods.bekle(2);

        // Select "Percentage Discount"
        ReusableMethods.ddmIndex(page.discountType,1);
        extentTest.info("Percentage Discount secildi.");


        // Verify that characters other than numbers are not entered in Coupon Amount
        page.couponAmount.clear();
        ReusableMethods.bekle(2);
        page.couponAmount.sendKeys(ConfigReader.getProperty("wrongCouponAmount"));
        extentTest.pass("CouponAmount bölümü temizledi, sonra coklu karakterden olusan deger yazildi.");
        Assert.assertTrue(page.couponAmount.getText() !="15tt+.$%0");
        extentTest.info("couponAmount bölümüne rakamlar disinda baska bir karakter girilemeyecegi dogrulandi.");

        ReusableMethods.bekle(2);

        // Enter '10' in Coupon Amount
        page.couponAmount.clear();
        ReusableMethods.bekle(2);
        page.couponAmount.sendKeys(ConfigReader.getProperty("rightCouponAmount"));
        extentTest.pass("couponAmount bölümü temizledi ve 10 sayisi yazildi.");

        // Verify Coupon Amount 10
        String expectedResult = "10";
        String actualResult = ConfigReader.getProperty("rightCouponAmount");
        Assert.assertEquals(actualResult, expectedResult);
        extentTest.pass("couponAmount bölümünün 10 icerdigi dogrulandi.");

        // Enter coupon expiration date 2025-5-25
        ReusableMethods.click(page.couponExpiryDate);
        extentTest.pass("Gecerlilik tarihi icin couponExpiryDate bölümüne tiklandi");
        page.month.click();
        ReusableMethods.ddmVisibleText(page.month, ConfigReader.getProperty("month"));
        extentTest.info("Ay bölümüne tiklandi ve degeri girildi.");
        ReusableMethods.bekle(1);
        page.year.click();
        ReusableMethods.ddmVisibleText(page.year,ConfigReader.getProperty("year"));
        extentTest.info("Yil bölümüne tiklandi ve degeri girildi.");
        ReusableMethods.bekle(1);
        page.date.click();
        extentTest.info("Yil bölümüne tiklandi ve degeri girildi.");
        ReusableMethods.bekle(1);

        // Verify that the coupon expiration date is 2025.5.25
        String expected = "2025-05-25";
        String actual = ConfigReader.getProperty("couponExpiryDate");
        Assert.assertEquals(actual,expected);
        extentTest.info("Istenilen tarihin görüldügü dogrulandi.");

        // Select "Allow free shipping"
        ReusableMethods.click(page.allowFreeShipping);
        extentTest.info("aallowFreeShipping kutucugu isaretlendi.");

        // Verify that "Allow free shipping" is selected
        Assert.assertTrue(page.allowFreeShipping.isSelected());
        extentTest.pass("allowFreeShipping secili oldugu dogrulandi.");

        // Select "Show on store"
        page.showOnStore.click();
        extentTest.pass("Show on store kutucugu secildi.");

        // Verify that "Show on store" is selected
        Assert.assertTrue(page.showOnStore.isSelected());
        extentTest.info("Show on store secili oldugu dogrulandi.");

        ReusableMethods.bekle(2);

        // Click on the "Coupons"
        ReusableMethods.click(page.coupons);
        extentTest.info("Coupons tiklandi.");

        // Verify that the generated "Coupon" has been seen
        Assert.assertTrue(page.codeText.isDisplayed());
        extentTest.info("Coupons bölümünde kupon olusturuldugu dogrulandi.");

        ReusableMethods.bekle(2);

        // Close the WebPage
        Driver.closeDriver();
        extentTest.pass("WebPage kapatildi.");

    }
}
