package tests.US_0015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Allovercommerce;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 extends ReusableMethods {
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
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributes"))).click();
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesColorKutusu"))).click();
        bekle(2);
        WebElement element = Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesColorYazmaKutusu")));
        element.click();
        element.sendKeys("Black",Keys.ENTER);
        bekle(2);
        element.sendKeys("Red",Keys.ENTER);
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesSizeKutusu"))).click();
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("attributesSizeYazmaKutusu"))).sendKeys("1101",Keys.ENTER);
        bekle(3);
        tumSayfaResmi("TC_02");




    }
}
