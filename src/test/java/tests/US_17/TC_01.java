package tests.US_17;

import org.openqa.selenium.Keys;
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
     Search for products in Search Box. Enter the "pencil"
     Click on a product image
     The "ADD TO CART" button is verified to appear
     The user increases the number of products with "+" in the Quantity section  1->2
     The user decrease the number of products with "-" in the Quantity section   2->1
     Click on the "ADD TO CART"
     Verify that the Number in the Basket Icon has changed
     Search for products in Seach Box
     Click on a product image
     The "ADD TO CART" button is verified to appear
     Click on the "ADD TO CART"
     Verify that the Number in the Basket Icon has changed
     Click on the "Cart" icon above
     Verify that the "SHOPPING CART" section opens on the right side
     Click to "CHECKOUT" button
     Verify the opening of the "BILLING DETAILS" page
     Enter the "first name" part
     Enter the "last name" part
     Enter the "Country/Region" part
     "Enter the ""Street address"" part
     "Enter the ""Postcode/ZIP Code"" part
     Enter the "Town/City" part
     Enter the "Phone number" part
     Enter the "Email address" part
     Verify that the "PLACE ORDER" section is visible
     Select "Pay at the door"
     Verify that "Pay at the door" has been selected
     Select "Wire Transfer/EFT"
     Verify that "Wire Transfer/EFT" has been selected
     Click on the "PLACE ORDER"
     Scroll to the bottom of the page
     Verify that the My Account section has been seen
     Click on the "My Orders "
     Verify that there is a selected product under "Orders"
     Click on "VIEW" button
     Verify that "ORDER DETAILS" is open
     */

    @Test
    public void shopVendor() {

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


        // Search for products in Search Box. Enter the "pencil"
        page.searchBox.sendKeys(ConfigReader.getProperty("product1"), Keys.ENTER);


        // Click on a product image
        page.product1.click();


        // The "ADD TO CART" button is verified to appear
        Assert.assertTrue(page.addToCart.isDisplayed());


        // The user increases the number of products with "+" in the Quantity section  1->2
        page.plus.click();

        ReusableMethods.bekle(2);

        // The user decrease the number of products with "-" in the Quantity section   2->1
        page.minus.click();


        // Click on the "ADD TO CART"
        page.addToCart.click();


        // Verify that the Number in the Basket Icon has changed  Cart=1
        Assert.assertTrue(page.cart1.isDisplayed());


        // Click on the "Cart" icon above
        page.cartIcon.click();


        // Verify that the "SHOPPING CART" section opens on the right side
        Assert.assertTrue(page.shoppingCart.isDisplayed());


        // Click to "CHECKOUT" button
        page.checkout.click();


        // Verify the opening of the "BILLING DETAILS" page
        Assert.assertTrue(page.billingDetailsText.isDisplayed());


        // Enter the "first name" part
        page.firstName.sendKeys(ConfigReader.getProperty("firstName"));

        // Enter the "last name" part
        page.lastName.sendKeys(ConfigReader.getProperty("lastName"));

        // "Enter the ""Street address"" part
        page.address.sendKeys(ConfigReader.getProperty("address"));

        // "Enter the ""Postcode/ZIP Code"" part
        page.zipCode.sendKeys(ConfigReader.getProperty("zipCode"));

        // Enter the "Town/City" part
        page.city.sendKeys(ConfigReader.getProperty("city"));

        // Enter the "Phone number" part
        page.phone.sendKeys(ConfigReader.getProperty("phone"));

        // Enter the "Email address" part
        page.emailAddress.clear();
        page.emailAddress.sendKeys(ConfigReader.getProperty("emailAddress"));


        // Enter the "Country/Region" part
        ReusableMethods.ddmVisibleText(page.country,"Germany");

        // Enter the " State Optional" part
        ReusableMethods.ddmVisibleText(page.stateOptional,"Baden-Württemberg");

        // Verify that the "PLACE ORDER" section is visible
        Assert.assertTrue(page.placeOrder.isDisplayed());

        // Verify that "Wire Transfer/EFT" has been selected
        Assert.assertTrue(page.wireTransfer.isSelected());

        // Select "Payment at the door"
        //page.payAtTheDoor.click();

        // Verify that "Pay at the door" has not been selected
        Assert.assertFalse(page.payAtTheDoor.isSelected());

        // Click on the "PLACE ORDER"
        page.placeOrder.click();











































    }


}
