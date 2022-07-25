package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_MakeOrderPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D03_MOrderStepDef {
    P03_MakeOrderPage order=new P03_MakeOrderPage();
    String myReference,mySku;

    @When("user select subcategory blouses from category women")
    public void subcatfromCat() {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Actions action=new Actions(Hooks.driver);
        action.moveToElement(order.women()).build().perform();
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        action.moveToElement(order.blouses()).click().build().perform();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @And("select the resulted product")
    public void selectResult(){
        order.result().click();
    }
    @And("click addCart and proceed to checkout")
    public void addCartptoCheckout(){
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String actualSku=order.sku().getText();
        this.mySku=actualSku;
        order.addCart().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        order.ptoCheck().click();
    }
    @And("follow the checkout procedures accept terms and proceed")
    public void followCheckandproceed(){
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        order.ptoCheck2().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        order.ptoCheck3().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        order.termBtn().click();
        order.ptoCheckaTerms().click();
    }
    @And("select bank_wire and confirm the order")
    public void bankandConfirm(){
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        order.bankWire().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        order.confirmOrder().click();
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String ref=order.reference().getText();
        this.myReference=ref;
    }

    @Then("navigate to order history page to validate order was placed")
    public void navigateOrderandValidate(){
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        order.btOrder().click();
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String myref=this.myReference;
        String ref=order.refer().getText();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(myref.contains(ref));
        order.refer().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String expectedSku=order.selectedSku().getText();
        String actualSku=this.mySku;
        Assert.assertTrue(actualSku.contains(expectedSku));
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        System.out.println("The right product with the right order took place...!");
    }
}
