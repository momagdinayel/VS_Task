package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_AuthenticatPage;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D02_AuthenticateStepDef {
    P02_AuthenticatPage authenticate=new P02_AuthenticatPage();

    @When("^user enter valid mail\"(.*)\" and valid Password\"(.*)\"")
    public void authenticateNewUser(String email,String pass){
        authenticate.email().sendKeys(email);
        authenticate.pass().sendKeys(pass);
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    @And("And user clicks sign button")
    public void userClickSign(){
        authenticate.signsub().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("user Authenticated successfully")
    public void successAuthentication(){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(authenticate.signOut().isDisplayed());
        soft.assertTrue(authenticate.msg().getText().contains("Welcome to your account."));
        soft.assertAll();
        System.out.println("User Authenticated Successfully...!");
    }
}
