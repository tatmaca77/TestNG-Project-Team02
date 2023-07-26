package tests.US_17;

import org.testng.annotations.Test;
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
     Select "Payment at the door"
     Verify that "Payment at the door" has been selected
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
        // Go to HomePage
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    }
}
