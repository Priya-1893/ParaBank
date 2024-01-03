package pageFactory;

import stepDefinition.Pages.Login;
import org.openqa.selenium.WebDriver;


/**
 * This class is used to create page objects using pageFactory
 */
public class PageFactory {

    public  static Login login;
    public void pageSetUp(WebDriver driver) {
        login = org.openqa.selenium.support.PageFactory.initElements(driver, Login.class);
    }
}
