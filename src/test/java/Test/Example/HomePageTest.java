package Test.Example;


import DSAdminPages.HomePageObjects;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePageObjects homePage = new HomePageObjects(driver);

    @Test
    public void givenHomePage_thenHoverOverAnalysisDropdown()throws Exception{
        ExtentTest test = extent.createTest("Navigate to Transmission Dashboard", "Navigation Successful");
        homePage.setAnalysisHover(driver);
        test.pass("Analysis Dropdown");
    }
    /*@Test
    public void givenDashboardPage_thenEnterEventID()throws Exception{
        //HomePageObjects homePageObjects = new HomePageObjects(driver);
        ExtentTest test = extent.createTest("Transmission Dashboard, Event ID", "Event ID Entered");
        homePage.setAnalysisHover(driver);
        homePage.setEventID("11111111");
        test.pass("Event ID Entered- Success");
    }*/
}

