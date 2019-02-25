package Test.Example;

import DSAdminPages.HomePageObjects;
import DSAdminPages.TransmissionDashboardObjects;
import Reports.ExtentReport;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;

public class TransmissionDashboardTest extends BaseTest {

    private HomePageObjects homePage = new HomePageObjects(driver);
    private TransmissionDashboardObjects transDashboard;


    @Test
    public void whenEventIDIsEntered_thenRunSearch(){
        ExtentTest test = extent.createTest("Transmission Dashboard, Event ID", "Event ID Entered");
        homePage.setAnalysisHover(driver);
        test.pass("Analysis Dropdown");
        transDashboard = new TransmissionDashboardObjects(driver);
        test.fail("Navigated to Transmission Dashboard");
        transDashboard.setEventID("1234567");
        test.pass("Event ID Entered- Success");

    }
}
