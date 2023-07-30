package tests.US_18_CreateCuoponVendor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

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
        //  Go to HomePage
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));


        // Click the "Sign In" button
        AllovercommercePage page = new AllovercommercePage();
        page.signIn.click();


        // Enter the "Email address or Username"
        page.emailUsername.sendKeys(ConfigReader.getProperty("email"));


        // Enter your "Password"
        page.passwordBox.sendKeys(ConfigReader.getProperty("password"));


        // Select the " Remember Me" button
        page.rememberMe.click();


        // Click the "Sign In" button
        page.signInButton.click();


        // Verify the login
        Assert.assertTrue(page.signOut.isDisplayed());


        // Click on te "Sign Out"
        page.signOut.click();


        // Click on the "Store Manager" section
        page.storeManager.click();

        // Click on the Coupons tab under the My Store section
        /** action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
         action.moveToElement(page.coupons).contextClick().build().perform();
         */
        ReusableMethods.click(page.coupons);

        // Click on the "Add New"
        ReusableMethods.click(page.addNew);

        // Verify that there is a blue Add Coupon option in the top left corner
        Assert.assertTrue(page.blueAddNewText.isDisplayed());

        // Write in the "Code" section "bedava123" // written in the "Description" section "Tüm Ürünlerde Gecerli Indirim Kuponu"
        page.codeSection.sendKeys(ConfigReader.getProperty("code"), Keys.TAB,
                ConfigReader.getProperty("description"),Keys.TAB);

        ReusableMethods.bekle(1);

        // Verify that Discount Type is "Fixed Product Discount" by default
        Assert.assertTrue(page.discountType.isDisplayed());

        ReusableMethods.bekle(2);

        // Select to "Percentage Discount"
        ReusableMethods.ddmVisibleText(page.discountType,"Fixed Product Discount");

        ReusableMethods.bekle(2);

        // Select "Fixed Product Discount"
        ReusableMethods.ddmIndex(page.discountType,1);

        // Verify that characters other than numbers are not entered in Coupon Amount
        page.couponAmount.clear();
        ReusableMethods.bekle(2);
        page.couponAmount.sendKeys(ConfigReader.getProperty("wrongCouponAmount"));
        Assert.assertTrue(page.couponAmount.getText() !="15tt+.$%0");

        ReusableMethods.bekle(2);

        // Enter '10' in Coupon Amount
        page.couponAmount.clear();
        ReusableMethods.bekle(2);
        page.couponAmount.sendKeys(ConfigReader.getProperty("rightCouponAmount"));

        // Verify Coupon Amount 10
        String expectedResult = "10";
        String actualResult = ConfigReader.getProperty("rightCouponAmount");
        Assert.assertEquals(actualResult, expectedResult);

        // Enter coupon expiration date 2025.5.25
        page.couponExpiryDate.click();
        page.month.click();
        ReusableMethods.ddmVisibleText(page.month, ConfigReader.getProperty("month"));
        ReusableMethods.bekle(1);
        page.year.click();
        ReusableMethods.ddmVisibleText(page.year,ConfigReader.getProperty("year"));
        ReusableMethods.bekle(1);
        page.date.click();
        ReusableMethods.bekle(1);

        // Verify that the coupon expiration date is 2025.5.25
        String expected = "2025-05-25";
        String actual = ConfigReader.getProperty("couponExpiryDate");
        Assert.assertEquals(actual,expected);

        // Select "Allow free shipping"
        page.allowFreeShipping.click();

        // Verify that "Allow free shipping" is selected
        Assert.assertTrue(page.allowFreeShipping.isSelected());

        // Select "Show on store"
        page.showOnStore.click();

        // Verify that "Show on store" is selected
        Assert.assertTrue(page.showOnStore.isSelected());

        ReusableMethods.bekle(2);

        // Scroll down until the "SUBMIT" button appears
        //action.scrollToElement(page.submitButton).click(page.submitButton).perform();

        // Click on the "Coupons"
        ReusableMethods.click(page.coupons);

        // Verify that the generated "Coupon" has been seen
        Assert.assertTrue(page.codeText.isDisplayed());

        // Close the WebPage
        Driver.closeDriver();

    }
}
