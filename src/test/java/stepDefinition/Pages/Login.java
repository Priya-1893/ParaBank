package stepDefinition.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login {
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;

   public static void DriverSetup() throws InterruptedException {

       // Set the driver path
       //System.setProperty("webdriver.chrome.driver", "C://ChromeDriver.exe"); - not req after version 10

       WebDriver wd= new ChromeDriver();
       wd.get("https://rahulshettyacademy.com/locatorspractice/");
       wd.manage().window().maximize();
wd.findElement(By.id("inputUsername")).sendKeys("rahul");
//wd.findElement(By.className("inputPassword")).sendKeys("123");
//wd.wait(1000);
//wd.findElement(By.cssSelector("button.signInBtn")).click();


    }

}
