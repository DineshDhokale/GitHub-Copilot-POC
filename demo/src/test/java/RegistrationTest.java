import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectModels.LoginPage;
import pageObjectModels.RegistrationPage;

public class RegistrationTest {
    public WebDriver driver;
    private String username;
    private RegistrationPage registrationPage;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testRegistration() {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        username = "testuser" + System.currentTimeMillis();
        registrationPage.register(username, "testpassword");
    }

    @Test(dependsOnMethods = { "testRegistration" })
    public void testLogin() {
        loginPage.login(username, "testpassword");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}