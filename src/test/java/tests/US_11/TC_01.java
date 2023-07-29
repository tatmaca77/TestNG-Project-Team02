package tests.US_11;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    /*
    Vendor goes to home page
    Click to sign in button
    Enter email
    Enter password
    Click to sign in button
    Verify My Account visibility
     */


    @Test
    public void shopVendor() {
        // Go to HomePage
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
    }
}
