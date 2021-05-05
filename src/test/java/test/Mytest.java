package test;

import Pages.LoginPage;
import Pages.SearchPage;
import base.BaseTest;
import org.junit.Test;

public class Mytest extends BaseTest {

    LoginPage loginPage;
    SearchPage searchPage;

    @Test
    public void  MyTest(){

        loginPage=new LoginPage();
        searchPage=new SearchPage();

        loginPage.Login();
        searchPage.Search();



    }



}
