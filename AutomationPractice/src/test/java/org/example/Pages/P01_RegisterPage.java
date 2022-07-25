package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P01_RegisterPage {
    public WebElement signBtn(){
        WebElement sign= Hooks.driver.findElement(By.cssSelector("a[class=\"login\"]"));
        return sign;
    }
    public WebElement emailField(){
        WebElement field=Hooks.driver.findElement(By.cssSelector("input[id=\"email_create\"]"));
        return field;
    }
    public WebElement submitBtn(){
        WebElement submit=Hooks.driver.findElement(By.cssSelector("button[id=\"SubmitCreate\"]"));
        return submit;
    }
    public WebElement gender(String type){
        WebElement gender=null;
        if(type.equals("Mr")){
            gender=Hooks.driver.findElement(By.cssSelector("input[id=\"id_gender1\"]"));
        }
        else if(type.equals("Mrs")){
            gender=Hooks.driver.findElement(By.cssSelector("input[id=\"id_gender2\"]"));
        }
        return gender;
    }
    public WebElement fnamefield(){
        WebElement fname=Hooks.driver.findElement(By.id("customer_firstname"));
        return fname;
    }
    public WebElement lnamefield(){
        WebElement lname=Hooks.driver.findElement(By.id("customer_lastname"));
        return lname;
    }
    public WebElement email(){
        WebElement email=Hooks.driver.findElement(By.id("email"));
        return email;
    }
    public WebElement password(){
        WebElement pass=Hooks.driver.findElement(By.id("passwd"));
        return pass;
    }
    public WebElement day(){
        WebElement day=Hooks.driver.findElement(By.id("days"));
        return day;
    }
    public WebElement month(){
        WebElement month=Hooks.driver.findElement(By.id("months"));
        return month;
    }
    public WebElement year(){
        WebElement year=Hooks.driver.findElement(By.id("years"));
        return year;
    }
    public WebElement newsletter(){
        WebElement news=Hooks.driver.findElement(By.cssSelector("input[id=\"newsletter\"]"));
        return news;
    }
    public WebElement specialoffer(){
        WebElement offer=Hooks.driver.findElement(By.cssSelector("input[id=\"optin\"]"));
        return offer;
    }
    public WebElement addressfname(){
        WebElement fname=Hooks.driver.findElement(By.id("firstname"));
        return fname;
    }
    public WebElement addresslname(){
        WebElement lname=Hooks.driver.findElement(By.id("lastname"));
        return lname;
    }
    public WebElement company(){
        WebElement cmp=Hooks.driver.findElement(By.id("company"));
        return cmp;
    }
    public WebElement address(){
        WebElement add=Hooks.driver.findElement(By.id("address1"));
        return add;
    }
    public WebElement city(){
        WebElement cit=Hooks.driver.findElement(By.id("city"));
        return cit;
    }
    public WebElement state(){
        WebElement cmp=Hooks.driver.findElement(By.cssSelector("select[id=\"id_state\"]"));
        return cmp;
    }
    public WebElement postalcode(){
        WebElement post=Hooks.driver.findElement(By.id("postcode"));
        return post;
    }
    public WebElement country(){
        WebElement cmp=Hooks.driver.findElement(By.id("id_country"));
        return cmp;
    }
    public WebElement phonemobile(){
        WebElement mobile=Hooks.driver.findElement(By.id("phone_mobile"));
        return mobile;
    }
    public WebElement alias(){
        WebElement als=Hooks.driver.findElement(By.id("alias"));
        return als;
    }
    public WebElement registerBtn(){
        WebElement regist=Hooks.driver.findElement(By.id("submitAccount"));
        return regist;
    }
    public WebElement signOut(){
        WebElement sout=Hooks.driver.findElement(By.cssSelector("a[class=\"logout\"]"));
        return sout;
    }
    public WebElement myAccount(){
        WebElement myac=Hooks.driver.findElement(By.cssSelector("a[title=\"View my customer account\"] span"));
        return myac;
    }
    public WebElement msg(){
        WebElement mesage=Hooks.driver.findElement(By.cssSelector("p[class=\"info-account\"]"));
        return mesage;
    }

}
