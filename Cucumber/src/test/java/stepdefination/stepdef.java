package test.java.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import cucumber.annotation.en.Then;


public class stepdef{
    
    WebDriver driver=null;

    @Given("^User searches for HP Pen Drive$")
    public void searchProduct(){
        driver = new FirefoxDriver(); 
      driver.navigate().to("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hp Pen Drive");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @When("^Add the first result on the page with some quantity$")

