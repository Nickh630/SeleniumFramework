package DSAdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage{

    protected final WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void setElementText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}
