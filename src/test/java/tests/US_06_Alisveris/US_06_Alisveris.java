package tests.US_06_Alisveris;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageSA;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelReader;
import utilities.ReusableMethods;

public class US_06_Alisveris {
    PageSA pageSA;
    String filePath = "src/test/java/resources/musteriverileri.xlsx";
    String pageName = "Sayfa1";
    ExcelReader excelReader = new ExcelReader(filePath,pageName);
    Actions action;

    @Test(priority = 0)
    public void TC01_Sepete_Urun_Ekleme() {
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        pageSA = new PageSA();
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBox.sendKeys("pencil",Keys.ENTER);

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIcon.click();

        // Çıkan ekranda seçilen ürünün görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.productVerify.isDisplayed());
    }

    @Test(priority = 1)
    public void TC02_Sepet_Urun_Miktari() {
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        pageSA = new PageSA();
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBox.sendKeys("pencil",Keys.ENTER);

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIcon.click();

        //VIEW CART butonuna tıkla.
        pageSA.viewCartButton.click();

        //Eklenmiş olan ürünün miktarını arttır.
        int numberOfProduct1 = Integer.parseInt(pageSA.numberOfProduct.getAttribute("value"));
        System.out.println(numberOfProduct1);
        pageSA.plusButton.click();

        //UPDATE CART butonuna tıkla.
        pageSA.updateButton.click();
        ReusableMethods.bekle(4);
        int numberOfProduct2 = Integer.parseInt(pageSA.numberOfProduct.getAttribute("value"));
        System.out.println(numberOfProduct2);

        //Ürün miktarının artmış olduğunu doğrula.
        Assert.assertTrue(numberOfProduct1<numberOfProduct2);
        //Ürün miktarını azalt.
        ReusableMethods.visibleWait(pageSA.minusButton,10);
        ReusableMethods.click(pageSA.minusButton);
        ReusableMethods.bekle(2);

        //UPDATE CART butonuna tıkla.
        ReusableMethods.click(pageSA.updateButton);
        ReusableMethods.bekle(4);
        int numberOfProduct3 = Integer.parseInt(pageSA.numberOfProduct.getAttribute("value"));
        System.out.println(numberOfProduct3);

        //Ürün miktarının azalmış olduğunu doğrula.
        Assert.assertTrue(numberOfProduct3<numberOfProduct2);
    }

    @Test(priority = 2)
    public void TC03_Fatura_Adresi() {
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        pageSA = new PageSA();
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBox.sendKeys("pencil",Keys.ENTER);

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIcon.click();

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();
        action = new Actions(Driver.getDriver());
        action.scrollByAmount(0,300).perform();



        //Fatura bilgilerinin görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.billingDetailsText.isDisplayed());

    }

    @Test(priority = 3)
    public void TC04_Odeme_Secenekleri() {
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        pageSA = new PageSA();
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBox.sendKeys("pencil",Keys.ENTER);

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIcon.click();

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();

        //Payment Methods kısmından Wire transfer/EFT seçeneğini seç.
        ReusableMethods.scroll(pageSA.placeOrderButton);
        ReusableMethods.visibleWait(pageSA.placeOrderButton,5);

        ReusableMethods.click(pageSA.eftButton);

        //Wire transfer/EFT seçeneğinin görünür ve seçili olduğunu doğrula.
        Assert.assertTrue(pageSA.eftButton.isDisplayed());
        Assert.assertTrue(pageSA.eftButton.isSelected());

        //Payment Methods kısmından Pay at the door seçeneğini seç.
        ReusableMethods.click(pageSA.payAtTheDoorButton);

        //Pay at the door seçeneğinin görünür ve seçili olduğunu doğrula.
        Assert.assertTrue(pageSA.payAtTheDoorButton.isDisplayed());
        Assert.assertTrue(pageSA.payAtTheDoorButton.isSelected());

    }

    @Test(priority = 4)
    public void testTC05_Odeme_Islemi() {
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        pageSA = new PageSA();
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBox.sendKeys("pencil",Keys.ENTER);

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIcon.click();

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();

        //Payment Methods kısmından Wire transfer/EFT seçeneğini seç.
        ReusableMethods.scroll(pageSA.placeOrderButton);
        ReusableMethods.visibleWait(pageSA.placeOrderButton,5);

        ReusableMethods.click(pageSA.eftButton);


        //PLACE ORDER butonuna tıkla.
        ReusableMethods.click(pageSA.placeOrderButton);

        //"Thank you. Your order has been received." yazısının görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.placeOrderVerifyText.isDisplayed());

    }

    @Test(priority = 5)
    public void TC06_Odeme_Islemi() {
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        pageSA = new PageSA();
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBox.sendKeys("pencil",Keys.ENTER);

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIcon.click();

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();

        //Payment Methods kısmından Pay at the door seçeneğini seç.
        ReusableMethods.click(pageSA.payAtTheDoorButton);

        //PLACE ORDER butonuna tıkla.
        ReusableMethods.click(pageSA.placeOrderButton);

        //"Thank you. Your order has been received." yazısının görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.placeOrderVerifyText.isDisplayed());

    }

    public void loginMethod(){
        pageSA.signInButton.click();
        pageSA.usernameTextBox.sendKeys(excelReader.getCellData(1,0));
        pageSA.passwordTextBox.sendKeys(excelReader.getCellData(1,1), Keys.ENTER);

    }
}
