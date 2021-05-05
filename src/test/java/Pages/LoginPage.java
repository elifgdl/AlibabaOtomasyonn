package Pages;

import Contants.LoginPageContants;
import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class LoginPage extends BasePage implements LoginPageContants {

    private Logger LOGGER = LogManager.getLogger(LoginPage.class);
    String email="elifbanu_94@hotmail.com";
    String sifre="elif.1234";



    public void Login(){
        waitForElementAndClick(login);
        waitForElementAndClick(loginbutton);
        waitForElementAndClick(emailText);
        waitForElementAndSendKeys(emailText,email);
        waitForElementAndClick(sifreText);
        waitForElementAndSendKeys(sifreText,sifre);
        waitForElementAndClick(girisYap);
   //     Assert.assertTrue("Hesabım elementi gözükmedi. Login işlemi başarısız.",isElementVisible(submitKontrol,10));
        LOGGER.info("Başarılı şekılde gırış yapıldı.");
    }

}
