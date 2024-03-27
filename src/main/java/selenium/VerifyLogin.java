package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class VerifyLogin {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        navigate(Constant.BASE_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, TestData.accountSuccess());
        loginPage.verifyLoginSuccess(driver);
        closeBrowser();
    }

    /**
     * Navigate to url
     * @param url URL
     */
    static void navigate(String url) {
        System.out.println("Navigate to url: " + url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.TIMEOUT));
        driver.get(url);
    }

    static String getTitle() {
        return driver.getTitle();
    }

    static void closeBrowser() {
        driver.quit();
    }
}
