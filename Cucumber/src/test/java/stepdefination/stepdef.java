package test.java.stepdefination;

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
    public void addQuantity(){
        driver.findElement(By.className("a-size-mini")).click();
        Select drop = new Select(driver.findElement(By.id("quantity")));
        drop.selectByVisibleText("4");
        driver.findElement(By.id("add-to-cart-button")).click();
    }
    @Then("^Cart display quantity of pendrivers")
    public void cart(){
        String a = driver.findElement(By.className("a-dropdown-prompt")).getText();
        if(a.equals("3")){
            System.out.println("Cart quantity equals given quantity");
               }
    }
}
