package Pages;

import Contants.SearchPageContants;
import base.BasePage;
import base.BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage implements SearchPageContants {
    static String firstPriceText;

    private Logger LOGGER = LogManager.getLogger(SearchPage.class);
    protected WebDriver driver = BaseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);

    public void Search() {
        waitForElementAndClick(tumKategoriler);
        waitForElementAndClick(superFırsatText);
        waitForElementAndClick(superFırsatUrun);
        firsPriceeText();
        javaScriptClicker(sepetEkleButton);
        waitForElementAndClick(sepeteGit);
        sepetFiyatKarsilastirma();
        waitSeconds(1);
        waitForElementAndClick(hizmetSartSec);
        waitForElementAndClick(odemeButton);
        Assert.assertTrue("Ödeme sayfası acılmadı.",isElementVisible(odemeBaslık,10));

    }

    public void sepetFiyatKarsilastirma() {

        WebElement secondByPrice = driver.findElement(By.cssSelector(".product-unit-price"));
        String secondPriceText = secondByPrice.getText();
        LOGGER.info("Sepettekı ürün fıyatı alındı.");
        System.out.println("Second price :" + secondPriceText);
        Assert.assertEquals("", firstPriceText, secondPriceText);
        LOGGER.info("Ürün ve sepettekı fıyat eşıt olduğu doğrulandı");
    }

    public void firsPriceeText() {
        WebElement byPrice = driver.findElement(By.cssSelector(".price-value-4747"));
        firstPriceText = byPrice.getText();
        LOGGER.info("Ürün sayfasından fıyat alındı");
        System.out.println("First price :" + firstPriceText);

    }

}
