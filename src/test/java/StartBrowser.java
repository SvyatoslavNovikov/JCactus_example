import jcactus.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StartBrowser {

    WebDriver driver;

    @Test
    public void testDriverFactoryChrome() throws InterruptedException {
        DriverFactory obj = new DriverFactory() {};
        driver = obj.getDriver("chrome");
        driver.get("http://www.google.co.in");
        synchronized (driver) { driver.wait(2000);
        driver.quit();
        }
    }

}
