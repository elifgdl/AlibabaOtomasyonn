package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContants {
    public ElementInfo login = new ElementInfo("Giriş yapılamadı", By.cssSelector(".header-links-wrapper > label"));

    public ElementInfo loginbutton = new ElementInfo("Giriş butonu bulunamadı", By.cssSelector(".header-upper .header-links-wrapper:nth-child(5) [data-loginurl]"));

    public ElementInfo emailText = new ElementInfo("E-posta adresi girilemedi", By.cssSelector(".fieldset.returning-wrapper > form[method='post'] input#Email"));

    public ElementInfo sifreText = new ElementInfo("Password şifresi girilemedi", By.cssSelector(".fieldset.returning-wrapper > form[method='post'] input#Password"));

    public ElementInfo girisYap = new ElementInfo("Giriş yapılamadı", By.cssSelector(".button-1.login-button"));




}
