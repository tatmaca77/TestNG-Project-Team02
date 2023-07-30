package tests.US_17_ShoppingVendor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.ConfigReader;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_02_NegativesTests extends ExtentReport {

    public static Actions action ;
    public static AllovercommercePage page;

    @Test
    public void shopVendor() {

        extentTest = extentReports.createTest("TestNGTeam02","Allovercommerce test edebilmeli");

        ReusableMethods.login(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));

        // Verify the login
        Assert.assertTrue(page.signOut.isDisplayed());
        extentTest.info("Basarili giris icin SignOut butonunun görüntülendigi dogrulandi.");

        // Search for products in Search Box. Enter the "pencil"
        page.searchBox.sendKeys(ConfigReader.getProperty("product1"), Keys.ENTER);
        extentTest.info("Arama Kutusuna 'Pencil' yazildi ve aratildi.");

        // Click on a product image
        page.product.click();
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

        // Verify that "Pay at the door" has been selected
        Assert.assertTrue(page.payAtTheDoor.isSelected());
        extentTest.info("Pay at the door secili oldugu dogrulandi");

        ReusableMethods.bekle(2);

        // Select "Wire Transfer/EFT"
        page.wireTransfer.click();
        extentTest.info("Wire Transfer/EFT secildi.");

        // Verify that "Pay at the door" has not been selected
        Assert.assertTrue(page.wireTransfer.isSelected());
        extentTest.info("Ayni anda iki seceneginde secilemeyecegi dogrulandi.");
        ReusableMethods.bekle(1);
        page.payAtTheDoor.click();
        extentTest.info("Pay at the door secildi.");

        ReusableMethods.bekle(5);

        // Click on the "PLACE ORDER"
        page.placeOrder.click();
        extentTest.info("Siparisi tamamlamak icin Place Order butonuna tiklandi.");





        // Close the WebPage
        //Driver.closeDriver();
        //extentTest.info("WebPage kapatildi.");

    }
}
