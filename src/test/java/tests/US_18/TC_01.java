package tests.US_18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {

    /**
     Go to HomePage
     Click the "Sign In" button
     Enter the "Email address or Username"
     Enter your "Password"
     Select the " Remember Me" button
     Click the "Sign In" button
     Verify the login
     Verify that the "Store Manager" text is visible
     Click on the Coupons tab under the My Store section
     Click on the "Add New"
     Verify that there is a blue Add Coupon option in the top left corner
     Verify that something can be written in the Code section
     Verify that something can be written in the Description section
     Verify that Discount Type is "Percentage Discount" by default
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




















    }

}
