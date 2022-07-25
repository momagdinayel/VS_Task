package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_MakeOrderPage {
    public WebElement women(){
        WebElement wo= Hooks.driver.findElement(By.cssSelector("a[title=\"Women\"]"));
        return wo;
    }
    public WebElement blouses(){
        WebElement blous=Hooks.driver.findElement(By.cssSelector("a[title=\"Blouses\"]"));
        return blous;
    }
    public WebElement result(){
        WebElement blous=Hooks.driver.findElement(By.cssSelector("a[class=\"product-name\"][title=\"Blouse\"]"));
        return blous;
    }
    public WebElement sku(){
        WebElement skU=Hooks.driver.findElement(By.cssSelector("span[itemprop=\"sku\"]"));
        return skU;
    }
    public WebElement addCart(){
        WebElement add=Hooks.driver.findElement(By.cssSelector("button[name=\"Submit\"]"));
        return add;
    }
    public WebElement ptoCheck(){
        WebElement pto=Hooks.driver.findElement(By.cssSelector("a[title=\"Proceed to checkout\"]"));
        return pto;
    }
    public WebElement ptoCheck2(){
        WebElement pto2=Hooks.driver.findElement(By.cssSelector("p a[title=\"Proceed to checkout\"]"));
        return pto2;
    }
    public WebElement ptoCheck3(){
        WebElement pto3=Hooks.driver.findElement(By.cssSelector("button[name=\"processAddress\"]"));
        return pto3;
    }
    public WebElement termBtn(){
        WebElement term=Hooks.driver.findElement(By.id("cgv"));
        return term;
    }
    public WebElement ptoCheckaTerms(){
        WebElement prot=Hooks.driver.findElement(By.name("processCarrier"));
        return prot;
    }
    public WebElement bankWire(){
        WebElement bwire=Hooks.driver.findElement(By.cssSelector("a[title=\"Pay by bank wire\"]"));
        return bwire;
    }
    public WebElement confirmOrder(){
        WebElement conder=Hooks.driver.findElement(By.cssSelector("button[class=\"button btn btn-default button-medium\"]"));
        return conder;
    }
    public WebElement reference(){
        WebElement ref=Hooks.driver.findElements(By.cssSelector("div[class=\"box\"] br")).get(4);
        return ref;
    }
    public WebElement btOrder(){
        WebElement order=Hooks.driver.findElement(By.cssSelector("a[title=\"Back to orders\"]"));
        return order;
    }

    public WebElement refer(){
        WebElement ref=Hooks.driver.findElements(By.cssSelector("a[class=\"color-myaccount\"]")).get(0);
        return ref;
    }
    public WebElement selectedSku(){
        WebElement sku=Hooks.driver.findElements(By.cssSelector("td label")).get(0);
        return sku;
    }

}
