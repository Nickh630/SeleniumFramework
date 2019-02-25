package DSAdminPages;

import Test.Example.HomePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class HomePageObjects {

    private WebDriver driver;

    //private By eventID = By.cssSelector("#liveblockEventId");



    public HomePageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void setAnalysisHover(WebDriver driver){
        Actions actions = new Actions(driver);
        WebElement analysisHover = driver.findElement(By.cssSelector("#listmenu > li:nth-child(2) > a"));
        actions.moveToElement(analysisHover).build().perform();
        WebElement simulcastTransmissionDashboard = driver.findElement(By.cssSelector("#dropmenu_analysis > a:nth-child(12)"));
        actions.click(simulcastTransmissionDashboard).build().perform();
    }


    /*public  void setEventID(String textEID) {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(eventID).sendKeys(textEID);


    }*/
}
