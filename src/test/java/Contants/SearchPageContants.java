package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface SearchPageContants {


    public ElementInfo tumKategoriler = new ElementInfo("Tüm kategoriler alanı tıklamadı", By.cssSelector(".category-navigation-title"));
    public ElementInfo superFırsatText = new ElementInfo("Süper fırsatlar alanı", By.xpath("//ul[@class='category-navigation-list sticky-flyout']//li[1]"));
    public ElementInfo superFırsatUrun = new ElementInfo("İlk ürün secilemedi", By.cssSelector(" .product-item.sevenspikes-ajaxcart > .picture"));
    public ElementInfo sepetEkleButton = new ElementInfo("Sepete eklenemedi", By.cssSelector(".ajax-cart-button-wrapper > input[value='Sepete ekle']"));
    public ElementInfo sepeteGit = new ElementInfo("Sepete eklenemedi", By.cssSelector(".button-1.productAddedToCartWindowCheckout"));
    public ElementInfo hizmetSartSec = new ElementInfo("Sepete eklenemedi", By.cssSelector("input#termsofservice"));
    public ElementInfo odemeButton = new ElementInfo("Sepete eklenemedi", By.cssSelector("button#checkout"));
    public ElementInfo odemeBaslık = new ElementInfo("Sepete eklenemedi", By.cssSelector("//h1[.='Ödeme']"));


}
