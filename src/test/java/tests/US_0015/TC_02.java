package tests.US_0015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Allovercommerce;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 extends ReusableMethods {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        Allovercommerce allovercommerce = new Allovercommerce();
        allovercommerce.signIn1.click();
        allovercommerce.email.sendKeys(ConfigReader.getProperty("email"));
        allovercommerce.password.sendKeys(ConfigReader.getProperty("password"));
        allovercommerce.signIn2.click();
        bekle(5);
        Driver.getDriver().findElement(By.tagName("body")).sendKeys(Keys.END);
        allovercommerce.myAccount.click();
        allovercommerce.storeManager.click();
        allovercommerce.product.click();
        allovercommerce.addNew.click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventorySKU"))).sendKeys("Aslan");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventoryManageStock"))).click();
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventoryStockQty"))).sendKeys("12");
        ddmIndex(allovercommerce.ddminventoryAllowBackorders,2);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventorySoldIndividually"))).click();
        bekle(3);
        tumSayfaResmi("TC_02");
        allovercommerce.submit.click();
        bekle(2);
        tumSayfaResmi("TC_02_Uyari");




    }
}
