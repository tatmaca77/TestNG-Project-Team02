package tests.US_17_ShoppingVendor;

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
     Search for products in Search Box. Enter the "pencil"
     Click on a product image
     The "ADD TO CART" button is verified to appear
     The user increases the number of products with "+" in the Quantity section  1->2
     The user decrease the number of products with "-" in the Quantity section   2->1
     Click on the "ADD TO CART"
     Verify that the Number in the Basket Icon has changed
     Search for products in Search Box
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
     After click on the place order. Verify the message "Thank you. Your order has been received."
     Click on the "Sign Out"
     Click on the "Orders"
     Verify that the "My Account" text has been seen
     Verify that there is a selected product under "Orders"
     Click on "VIEW" button
     Verify that "ORDER DETAILS" is open
     Close the WebPage
     */

    public static Actions action ;
    public static AllovercommercePage page;

    @Test
    public void shopVendor() {

        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");

        //  Go to HomePage
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        extentTest.info("Allovercommerce Sayfasina Gidildi.");

        // Click the "Sign In" button
        page = new AllovercommercePage();
        page.signIn.click();
        extentTest.info("Giris icin SignIn tiklandi.");

        // Enter the "Email address or Username"
        page.emailUsername.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("Email address or Username bölümüne Email adresi yazildi.");

        // Enter your "Password"
        page.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password kismina sifre yazildi.");

        // Select the " Remember Me" button
        page.rememberMe.click();
        extentTest.info("Remember Me kutusuna tiklandi.");

        // Click the "Sign In" button
        page.signInButton.click();
        extentTest.info("Giris icin SignIn butonuna tiklandi.");

        // Verify the login
        Assert.assertTrue(page.signOut.isDisplayed());
        extentTest.info("Basarili giris icin SignOut butonunun görüntülendigi dogrulandi.");

        // Search for products in Search Box. Enter the "pencil"
        ReusableMethods.sendKeysJS(page.searchBox,ConfigReader.getProperty("product"));
        extentTest.info("Arama Kutusuna 'Pencil' yazildi ve aratildi.");

        // Click on a product image
        ReusableMethods.click(page.product);
        extentTest.info("Arama sonuclarindaki 3.ürünün resmine tiklandi.");

        // The "ADD TO CART" button is verified to appear
        Assert.assertTrue(page.addToCart.isDisplayed());
        extentTest.info("Ürünleri sepete ekleyebilmek icin 'Add To Cart' butonunun görünürlügü dogrulandi.");

        // The user increases the number of products with "+" in the Quantity section  1->2
        page.plus.click();
        extentTest.info("Sepete eklemeden önce ürünün adedini belirlemek icin '+' butonuna basildi ve calistigi dogrulandi.");

        ReusableMethods.bekle(2);

        // The user decrease the number of products with "-" in the Quantity section   2->1
        page.minus.click();
        extentTest.info("Sepete eklemeden önce ürünün adedini belirlemek icin '-' butonuna basildi ve calistigi dogrulandi.");

        // Click on the "ADD TO CART"
        page.addToCart.click();
        extentTest.info("Aratilan Ürün Sepete eklendi.");

        // Verify that the Number in the Basket Icon has changed  Cart=1
        //Assert.assertTrue(page.cart1.isDisplayed());
        Assert.assertTrue(page.cartCount.getText()!="0");
        extentTest.info("Sepete Ürün eklendigi dogrulandi.");

        // Click on the "Cart" icon above
        page.cartIcon.click();
        extentTest.pass("'Cart' icon'una tiklandi.");

        // Verify that the "SHOPPING CART" section opens on the right side
        Assert.assertTrue(page.shoppingCart.isDisplayed());
        extentTest.pass("SHOPPING CART bölümünün acildigi dogrulandi.");

        // Click to "CHECKOUT" button
        page.checkout.click();
        extentTest.info("Checkout butonuna tiklandi.");

        // Verify the opening of the "BILLING DETAILS" page
        Assert.assertTrue(page.billingDetailsText.isDisplayed());
        extentTest.pass("BILLING DETAILS sayfasinin acildigi dogrulandi.");

        // Enter the "first name" part
        page.firstName.clear();
        page.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        extentTest.info("First name kismina kullanici ismi girildi.");

        // Enter the "last name" part
        page.lastName.clear();
        page.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        extentTest.info("Last name kismina kullanici soyismi girildi.");

        // "Enter the ""Street address"" part
        page.address.clear();
        page.address.sendKeys(ConfigReader.getProperty("address"));
        extentTest.info("Address kismina kullanici adresi girildi.");

        // "Enter the ""Postcode/ZIP Code"" part
        page.zipCode.clear();
        page.zipCode.sendKeys(ConfigReader.getProperty("zipCode"));
        extentTest.info("Posta Kodu kismina kullanici postakodu girildi.");

        // Enter the "Town/City" part
        page.city.clear();
        page.city.sendKeys(ConfigReader.getProperty("city"));
        extentTest.info("City kismina kullanici sehri girildi.");

        // Enter the "Phone number" part
        page.phone.clear();
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("Phone kismina kullanici telefonu girildi.");

        // Enter the "Email address" part
        page.emailAddress.clear();
        page.emailAddress.sendKeys(ConfigReader.getProperty("emailAddress"));
        extentTest.info("EmailAddress kismina kullanici emailadresi girildi.");

        // Enter the "Country/Region" part
        ReusableMethods.ddmVisibleText(page.country,"Germany");
        extentTest.info("Country kismina kullanici ülkesi girildi.");

        // Enter the " State Optional" part
        ReusableMethods.ddmVisibleText(page.stateOptional,"Baden-Württemberg");
        extentTest.info("State kismina kullanici bölgesi girildi.");

        // Verify that the "Payment Methods" section is visible
        Assert.assertTrue(page.paymentMethods.isDisplayed());
        extentTest.pass("Payment Methods görüldügü dogrulandi.");

        // Verify that "Wire Transfer/EFT" has been selected
        Assert.assertTrue(page.wireTransfer.isSelected());
        extentTest.info("Wire Transfer/EFT secili oldugu dogrulandi");

        ReusableMethods.bekle(2);

        // Select "Pay at the door"
        page.payAtTheDoor.click();
        extentTest.info("Pay at the door secildi.");

        // Verify that "Wire Transfer/EFT" has not been selected
        Assert.assertTrue(page.payAtTheDoor.isSelected());
        extentTest.info("Ayni anda iki seceneginde secilemeyecegi dogrulandi.");
        ReusableMethods.bekle(1);
        page.wireTransfer.click();
        extentTest.info("Pay at the door secildi.");

        ReusableMethods.bekle(5);

        // Click on the "PLACE ORDER"
        page.placeOrder.click();
        extentTest.info("Siparisi tamamlamak icin Place Order butonuna tiklandi.");

        // After click on the place order. Verify the message "Thank you. Your order has been received."
        Assert.assertTrue(page.messageText.isDisplayed());
        extentTest.info("Siparisin basarili bir sekilde olusturuldugu dogrulandi.");

        // Click on the "Sign Out"
        page.signOut.click();
        extentTest.info("Sag üst kösedeki Sign Out kismina tiklandi.");

        // Click on the "Orders"
        page.orders.click();
        extentTest.info("Acilan Sayfada Siparislerin görülmesi icin Orders kismina tiklandi.");

        // Verify that the "My Account" text has been seen
        Assert.assertTrue(page.myAccountText.isDisplayed());
        extentTest.info("My Account yazisinin görüldügü dogrulandi.");

        // Verify that there is a selected product under "Orders"
        Assert.assertTrue(page.view.isDisplayed());
        extentTest.info("View butonunun görüldügü dogrulandi.");

        // Click on "VIEW" button
        page.view.click();
        extentTest.info("Siparisler altinda ürün detaylarini görmek icin View bölümüe tiklandi.");

        // Verify that "ORDER DETAILS" is open
        Assert.assertTrue(page.orderDetails.isDisplayed());
        extentTest.info("Siparis detayarinin görüldügü dogrulandi.");

        ReusableMethods.bekle(2);

        // Close the WebPage
        Driver.closeDriver();
        extentTest.info("WebPage kapatildi.");


    }
}
