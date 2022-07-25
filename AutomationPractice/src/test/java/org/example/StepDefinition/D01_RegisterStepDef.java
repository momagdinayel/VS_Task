package org.example.StepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_RegisterPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D01_RegisterStepDef {
    P01_RegisterPage register=new P01_RegisterPage();
    @Given("user navigate to home page")
    public void home_page(){
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String url="http://automationpractice.com/index.php";
        Hooks.driver.get(url);
    }
    @And("user click sign_in")
    public void clicksign(){
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        register.signBtn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @When("^user enter new email\"(.*)\" and click create$")
    public void enterEmailClickCreate(String email){
        register.emailField().sendKeys(email);
        register.submitBtn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @And("^user enter title\"(.*)\" Firstname\"(.*)\" Lastname\"(.*)\" Email\"(.*)\" Password\"(.*)\" day\"(.*)\" month\"(.*)\" year\"(.*)\" AdreFname\"(.*)\" AdreLname\"(.*)\" Company\"(.*)\" Address\"(.*)\" city\"(.*)\" state\"(.*)\" postalcode\"(.*)\" country\"(.*)\" Mobilephone\"(.*)\" AliasAddress\"(.*)\"$")
    public void entervaliddata(String title,String fname,String lname,String email,String password,String day,String month,String year,String adresfname,String adreslname,String company,String address,String city,String state,String postcode,String country,String mobile,String aliasaddres){
        register.gender(title).click();
        register.fnamefield().sendKeys(fname);
        register.lnamefield().sendKeys(lname);
        register.email().clear();
        register.email().sendKeys(email);
        register.password().sendKeys(password);
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Select selectedday=new Select(register.day());
        selectedday.selectByValue(day);
        Select selectedmonth=new Select(register.month());
        selectedmonth.selectByValue(month);
        Select selectedyear=new Select(register.year());
        selectedyear.selectByValue(year);
        register.newsletter().click();
        register.specialoffer().click();
        register.addressfname().clear();
        register.addressfname().sendKeys(adresfname);
        register.addresslname().clear();
        register.addresslname().sendKeys(adreslname);
        register.company().sendKeys(company);
        register.address().sendKeys(address);
        register.city().sendKeys(city);
        Select selectedstate=new Select(register.state());
        selectedstate.selectByVisibleText(state);
        register.postalcode().sendKeys(postcode);
        Select selectedCountry=new Select(register.country());
        selectedCountry.selectByVisibleText(country);
        register.phonemobile().sendKeys(mobile);
        register.alias().clear();
        register.alias().sendKeys(aliasaddres);
    }

    @And("user clicks register button")
    public void clickRegister(){
        register.registerBtn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("^user\"(.*)\" registered successfully$")
    public void successRegister(String name){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.signOut().isDisplayed());
        soft.assertTrue(register.myAccount().getText().contains(name));
        soft.assertTrue(register.msg().getText().contains("Welcome to your account."));
        soft.assertAll();
        System.out.println("User Registered Successfully...!");
    }

}
