package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_AuthenticatPage {

    public WebElement email(){
        WebElement email= Hooks.driver.findElement(By.id("email"));
        return email;
    }
    public WebElement pass(){
        WebElement pas= Hooks.driver.findElement(By.id("passwd"));
        return pas;
    }
    public WebElement signsub(){
        WebElement signsub= Hooks.driver.findElement(By.cssSelector("button[id=\"SubmitLogin\"]"));
        return signsub;
    }
    public WebElement signOut(){
        WebElement sout=Hooks.driver.findElement(By.cssSelector("a[class=\"logout\"]"));
        return sout;
    }
    public WebElement msg(){
        WebElement mesage=Hooks.driver.findElement(By.cssSelector("p[class=\"info-account\"]"));
        return mesage;
    }
}
