package tests.US_0015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Allovercommerce;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 extends ReusableMethods {
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
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventory"))).click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shipping"))).click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributes"))).click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("linked"))).click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("seo"))).click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("advanced"))).click();
        scroll(allovercommerce.scroll7Things);
        bekle(3);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("inventory"))).click();
        bekle(5);
        tumSayfaResmi("TC_01");






    }
}
