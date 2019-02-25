package DSAdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransmissionDashboardObjects extends BasePage {


    @FindBy(css = "#liveblockEventId")
    WebElement eventIDElement;

    public TransmissionDashboardObjects(WebDriver driver){
       super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setEventID(String text) {
        setElementText(eventIDElement, text);
    }
}
