package Reports;

public class ExtentReport {

  /*  @Test
    public void test1() throws Exception{

        ExtentTest test = extent.createTest("DSAdmin Login", "User Login successful");
        driver.get("https://dsadmin.test2.adesa.com/adminapp/home.htm?SAMLResponse=eJylVO9v2jAQ%2FVeifCcFtlbUgmgINAlppVupOmnfnPhMHPxLPqftnz%2BbkihlGZs25dM93707v3fOHKmSljwAWqMRks16kdLK2ppVmgEcFGU155WohNxDTYW2UlldFLLeQ5o8gUNh9CKdZuM02SA2sNHoqfYBGk9uR%2BPpaDx7nFyT6xvy4Ta7mX38kSavSmoksfEibZwmhqJAoqkCJL4ku%2BXdFxIICUUE5wN%2Fv8RerrHOeFMamebzmE2OM7kc0QSuZ3CfPKCfZpQB0qw0an7VT5u%2FqbHz1Df4PloZBskTlQ1cHgCP2SdBGbj0v2i25mtQQTxDepW%2FjdonOoNOV162sv21IdF0KJi2TFhdA1h%2BsHbPD4YLKm3JDuEDBhU3sj4z%2Fd9lJrumqKH0p2gbJNisk8%2FGKep%2Fr80kmxwRwUb8mEq%2BC83MC66NCtv5raFScAEs0kXN%2Bp1WRnMRa6I2d%2BArwy6bUCpSAHWdiUNEa%2BppsjX%2BXt%2B7JffgfhF61gndejjEc3bUetn4Skd3QYH2yTH8s6H94tDDw6sfgFYyrNYD8PziGyxJGfMCHDfxxTh2GnSQauDsHdZdpUPbZe12uf0V5T8BzMufGA%3D%3D");

        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
        }*/
    }


/*
    private static WebDriver driver = null;

    public static void main(String[] args) {
        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("DSAdmin Login", "User Login successful");

        String projectPath = System.getProperty("user.dir");
        //System.setProperty("webdriver.gecko.driver", projectPath+ "\\Drivers\\Geckodriver\\geckodriver.exe" );
        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );
        driver = new ChromeDriver();

        test.log(Status.INFO, "Test Run");
        driver.get("https://dsadmin.test2.adesa.com/adminapp/home.htm?SAMLResponse=eJylVO9v2jAQ%2FVeifCcFtlbUgmgINAlppVupOmnfnPhMHPxLPqftnz%2BbkihlGZs25dM93707v3fOHKmSljwAWqMRks16kdLK2ppVmgEcFGU155WohNxDTYW2UlldFLLeQ5o8gUNh9CKdZuM02SA2sNHoqfYBGk9uR%2BPpaDx7nFyT6xvy4Ta7mX38kSavSmoksfEibZwmhqJAoqkCJL4ku%2BXdFxIICUUE5wN%2Fv8RerrHOeFMamebzmE2OM7kc0QSuZ3CfPKCfZpQB0qw0an7VT5u%2FqbHz1Df4PloZBskTlQ1cHgCP2SdBGbj0v2i25mtQQTxDepW%2FjdonOoNOV162sv21IdF0KJi2TFhdA1h%2BsHbPD4YLKm3JDuEDBhU3sj4z%2Fd9lJrumqKH0p2gbJNisk8%2FGKep%2Fr80kmxwRwUb8mEq%2BC83MC66NCtv5raFScAEs0kXN%2Bp1WRnMRa6I2d%2BArwy6bUCpSAHWdiUNEa%2BppsjX%2BXt%2B7JffgfhF61gndejjEc3bUetn4Skd3QYH2yTH8s6H94tDDw6sfgFYyrNYD8PziGyxJGfMCHDfxxTh2GnSQauDsHdZdpUPbZe12uf0V5T8BzMufGA%3D%3D");
        test.pass("URL Nav");

        driver.findElement(By.cssSelector("#yahoo-com > table > tbody > tr > td > form > div > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > input")).sendKeys("stephanieminor");
        driver.findElement(By.cssSelector("#yahoo-com > table > tbody > tr > td > form > div > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input")).sendKeys("atctest0");
        driver.findElement(By.cssSelector("#yahoo-com > table > tbody > tr > td > form > div > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(3) > td > input")).click();
        test.pass("User Logged in");
        // calling flush writes everything to the log file
        driver.quit();
        test.pass("Session Ended");
        test.info("Test complete");
        extent.flush();
    }*/


