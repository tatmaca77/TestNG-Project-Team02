package tests.US_06_Alisveris;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllovercommercePage;
import utilities.*;

public class US_06_Alisveris extends ExtentReport {
    AllovercommercePage pageSA;
    String filePath = "src/test/java/resources/musteriverileri.xlsx";
    String pageName = "Sayfa1";
    ExcelReader excelReader = new ExcelReader(filePath,pageName);
    Actions action;

    @Test(priority = 0)
    public void TC01_Sepete_Urun_Ekleme() {
        extentTest = extentReports.createTest("US06_TC01","Test Raporu");
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        pageSA = new AllovercommercePage();
        extentTest.info("Allovercommerce sitesine gidildi.");
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBoxSA.sendKeys("pencil",Keys.ENTER);
        extentTest.info("Arama kutusunda pencil aratıldı.");

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();
        extentTest.info("Çıkan ürünlerden birisi seçildi.");

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();
        extentTest.info("ADD TO CART butonuna tıklandı.");

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIconSA.click();
        extentTest.info("Sağ üstte bulunan Cart ikonuna tıklandı.");

        // Çıkan ekranda seçilen ürünün görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.productVerify.isDisplayed());
        extentTest.pass("Seçilen ürünün sepete eklendiği doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC01");
    }

    @Test(priority = 1)
    public void TC02_Sepet_Urun_Miktari() {
        extentTest = extentReports.createTest("US06_TC02","Test Raporu");
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        pageSA = new AllovercommercePage();
        extentTest.info("Allovercommerce sitesine gidildi.");
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBoxSA.sendKeys("pencil",Keys.ENTER);
        extentTest.info("Arama kutusunda pencil aratıldı.");

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();
        extentTest.info("Çıkan ürünlerden birisi seçildi.");

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();
        extentTest.info("ADD TO CART butonuna tıklandı.");

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIconSA.click();
        extentTest.info("Sağ üstte bulunan Cart ikonuna tıklandı.");

        //VIEW CART butonuna tıkla.
        pageSA.viewCartButton.click();
        extentTest.info("VIEW CART butonuna tıklandı.");

        //Eklenmiş olan ürünün miktarını arttır.
        int numberOfProduct1 = Integer.parseInt(pageSA.numberOfProduct.getAttribute("value"));
        System.out.println(numberOfProduct1);
        pageSA.plusButton.click();
        extentTest.info("Sepete eklenmiş olan ürünün miktarı arttırıldı");

        //UPDATE CART butonuna tıkla.
        pageSA.updateButton.click();
        ReusableMethods.bekle(4);
        int numberOfProduct2 = Integer.parseInt(pageSA.numberOfProduct.getAttribute("value"));
        System.out.println(numberOfProduct2);


        //Ürün miktarının artmış olduğunu doğrula.
        Assert.assertTrue(numberOfProduct1<numberOfProduct2);
        extentTest.pass("Ürün miktarının artmış olduğu doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC02_UrunArttırma");
        //Ürün miktarını azalt.
        ReusableMethods.visibleWait(pageSA.minusButton,10);
        ReusableMethods.click(pageSA.minusButton);
        ReusableMethods.bekle(2);
        extentTest.info("Sepete eklenmiş olan ürünün miktarı azaltıldı.");



        //UPDATE CART butonuna tıkla.
        ReusableMethods.click(pageSA.updateButton);
        ReusableMethods.bekle(4);
        int numberOfProduct3 = Integer.parseInt(pageSA.numberOfProduct.getAttribute("value"));
        System.out.println(numberOfProduct3);

        //Ürün miktarının azalmış olduğunu doğrula.
        Assert.assertTrue(numberOfProduct3<numberOfProduct2);
        extentTest.pass("Ürün miktarının azalmış olduğu doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC02_UrunAzaltma");

    }

    @Test(priority = 2)
    public void TC03_Fatura_Adresi() {
        extentTest = extentReports.createTest("US06_TC03","Test Raporu");
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        pageSA = new AllovercommercePage();
        extentTest.info("Allovercommerce sitesine gidildi.");
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();extentTest.info("Müşteri olarak giriş yapıldı.");

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBoxSA.sendKeys("pencil",Keys.ENTER);
        extentTest.info("Arama kutusunda pencil aratıldı.");

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();
        extentTest.info("Çıkan ürünlerden birisi seçildi.");

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();
        extentTest.info("ADD TO CART butonuna tıklandı.");

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIconSA.click();
        extentTest.info("Sağ üstte bulunan Cart ikonuna tıklandı.");

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();
        action = new Actions(Driver.getDriver());
        action.scrollByAmount(0,300).perform();
        extentTest.info("CHECKOUT butonuna tıklandı.");

        //Fatura bilgilerinin görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.billingDetailsTextSA.isDisplayed());
        extentTest.pass("Fatura bilgilerinin görünür olduğu doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC03");

    }

    @Test(priority = 3)
    public void TC04_Odeme_Secenekleri() {
        extentTest = extentReports.createTest("US06_TC04","Test Raporu");
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        pageSA = new AllovercommercePage();
        extentTest.info("Allovercommerce sitesine gidildi.");
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBoxSA.sendKeys("pencil",Keys.ENTER);
        extentTest.info("Arama kutusunda pencil aratıldı.");

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();
        extentTest.info("Çıkan ürünlerden birisi seçildi.");

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();
        extentTest.info("ADD TO CART butonuna tıklandı.");

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIconSA.click();
        extentTest.info("Sağ üstte bulunan Cart ikonuna tıklandı.");

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();
        extentTest.info("CHECKOUT butonuna tıklandı.");

        //Payment Methods kısmından Wire transfer/EFT seçeneğini seç.
        ReusableMethods.scroll(pageSA.placeOrderButton);
        ReusableMethods.visibleWait(pageSA.placeOrderButton,5);
        ReusableMethods.click(pageSA.eftButton);
        extentTest.info("Wire transfer/EFT seçeneği seçildi.");


        //Wire transfer/EFT seçeneğinin görünür ve seçili olduğunu doğrula.
        Assert.assertTrue(pageSA.eftButton.isDisplayed());
        Assert.assertTrue(pageSA.eftButton.isSelected());
        extentTest.pass("Wire transfer/EFT seçeneğinin seçili olduğu doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC04_EFT");

        //Payment Methods kısmından Pay at the door seçeneğini seç.
        ReusableMethods.click(pageSA.payAtTheDoorButton);
        extentTest.info("Pay at door seçeneği seçildi.");

        //Pay at the door seçeneğinin görünür ve seçili olduğunu doğrula.
        Assert.assertTrue(pageSA.payAtTheDoorButton.isDisplayed());
        Assert.assertTrue(pageSA.payAtTheDoorButton.isSelected());
        extentTest.pass("Pay at door seçeneğinin seçili olduğu doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC04_PayAtDoor");

    }

    @Test(priority = 4)
    public void testTC05_Odeme_Islemi() {
        extentTest = extentReports.createTest("US06_TC05","Test Raporu");
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        pageSA = new AllovercommercePage();
        extentTest.info("Allovercommerce sitesine gidildi.");
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");

        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBoxSA.sendKeys("pencil",Keys.ENTER);
        extentTest.info("Arama kutusunda pencil aratıldı.");

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();
        extentTest.info("Çıkan ürünlerden birisi seçildi.");

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();
        extentTest.info("ADD TO CART butonuna tıklandı.");

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIconSA.click();
        extentTest.info("Sağ üstte bulunan Cart ikonuna tıklandı.");

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();
        extentTest.info("CHECKOUT butonuna tıklandı.");

        //Payment Methods kısmından Wire transfer/EFT seçeneğini seç.
        ReusableMethods.scroll(pageSA.placeOrderButton);
        ReusableMethods.visibleWait(pageSA.placeOrderButton,5);
        ReusableMethods.click(pageSA.eftButton);
        extentTest.info("Wire transfer/EFT seçeneği seçildi.");

        //PLACE ORDER butonuna tıkla.
        ReusableMethods.click(pageSA.placeOrderButton);
        extentTest.info("PLACE ORDER butonuna tıklandı.");

        //"Thank you. Your order has been received." yazısının görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.placeOrderVerifyText.isDisplayed());
        extentTest.pass("Siparişin başarılı bir şekilde verildiği doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC05");
    }

    @Test(priority = 5)
    public void TC06_Odeme_Islemi() {
        extentTest = extentReports.createTest("US06_TC06","Test Raporu");
        // Belirtilen adrese git.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        pageSA = new AllovercommercePage();
        extentTest.info("Allovercommerce sitesine gidildi.");
        // Sign In butonuna tıkla.
        // Müşteri olarak sign in yap.
        loginMethod();
        extentTest.info("Müşteri olarak giriş yapıldı.");
        // Arama kutusunda listelenmiş bir ürün ara.
        ReusableMethods.visibleWait(pageSA.signOutButton,10);
        pageSA.searchBoxSA.sendKeys("pencil",Keys.ENTER);
        extentTest.info("Arama kutusunda pencil aratıldı.");

        // Listelenen ürünlerden birini seç.
        pageSA.productText.click();
        extentTest.info("Çıkan ürünlerden birisi seçildi.");

        // ADD TO CART butonuna tıkla.
        pageSA.addToCartButton.click();
        extentTest.info("ADD TO CART butonuna tıklandı.");

        // Sağ üstte bulunan Cart ikonuna tıkla.
        pageSA.cartIconSA.click();
        extentTest.info("Sağ üstte bulunan Cart ikonuna tıklandı.");

        //CHECKOUT butonuna tıkla.
        pageSA.checkoutButton.click();
        extentTest.info("CHECKOUT butonuna tıklandı.");

        //Payment Methods kısmından Pay at the door seçeneğini seç.
        ReusableMethods.click(pageSA.payAtTheDoorButton);
        extentTest.info("Pay at door seçeneği seçildi.");

        //PLACE ORDER butonuna tıkla.
        ReusableMethods.click(pageSA.placeOrderButton);
        extentTest.info("PLACE ORDER butonuna tıklandı.");

        //"Thank you. Your order has been received." yazısının görünür olduğunu doğrula.
        Assert.assertTrue(pageSA.placeOrderVerifyText.isDisplayed());
        extentTest.pass("Siparişin başarılı bir şekilde verildiği doğrulandı.");
        ReusableMethods.tumSayfaResmi("US06_TC06");

    }

    public void loginMethod(){
        pageSA.signInButtonSA.click();
        pageSA.usernameTextBox.sendKeys(excelReader.getCellData(1,0));
        pageSA.passwordTextBox.sendKeys(excelReader.getCellData(1,1), Keys.ENTER);

    }
}
