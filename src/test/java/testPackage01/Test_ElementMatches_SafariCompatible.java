package testPackage01;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_ElementMatches_SafariCompatible {
    SHAFT.GUI.WebDriver driver;
    String url = "https://duckduckgo.com/";
    By logo = By.id("logo_homepage_link");

    @Test
    public void test(){
        driver.browser().navigateToURL(url);
        driver.assertThat().element(logo).matchesReferenceImage().perform();
    }
    @BeforeMethod
    public void beforeMethod(){
        // remote browserstack server
//        System.setProperty("executionAddress","browserstack");
//        System.setProperty("targetOperatingSystem","Mac-64");
//        System.setProperty("targetBrowserName","Safari");
//        System.setProperty("browserStack.browserVersion","15.3");
//        System.setProperty("browserStack.osVersion", "Monterey");
        driver =  new SHAFT.GUI.WebDriver();
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
