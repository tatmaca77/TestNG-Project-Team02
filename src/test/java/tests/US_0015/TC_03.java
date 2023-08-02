package tests.US_0015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Allovercommerce;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC_03 extends ReusableMethods {
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
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shipping"))).click();
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingWeight"))).sendKeys("90");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingDimensionsLength"))).sendKeys("150");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingDimensionsWidth"))).sendKeys("50");
        Driver.getDriver().findElement(By.xpath(ConfigReader.getProperty("shippingDimensionsHeight"))).sendKeys("40");
        String expectedddm = "No shipping class";
        String actualddm = allovercommerce.ddmShippingShippingClass.getText();
        Assert.assertEquals(actualddm,expectedddm);
        Select select = new Select(allovercommerce.ddmShippingProcessingTime);
        List<WebElement> times = select.getOptions();
        for (WebElement time:times) {
            ddmVisibleText(allovercommerce.ddmShippingProcessingTime, time.getText());
        }
        ddmVisibleText(allovercommerce.ddmShippingProcessingTime,"1-2 weeks");
        bekle(3);
        tumSayfaResmi("TC_02");




    }
}
