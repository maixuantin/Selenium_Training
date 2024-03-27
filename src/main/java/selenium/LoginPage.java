package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    /**
     * Login function
     * @param account Account
     */
    void login(WebDriver driver, Account account) {
        String username = account.getUsername();
        String password = account.getPassword();

        WebElement inputUsername = driver.findElement(By.name("username"));
        inputUsername.sendKeys(username);
        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys(password);
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        buttonLogin.click();
    }

    void verifyLoginSuccess(WebDriver driver) {
        System.out.println("Verify Login Success");
        WebElement labelMessage = driver.findElement(By.name("xxxx"));
        labelMessage.getText();
    }

     void verifyLoginUnSuccess() {
         System.out.println("Verify Login UnSuccess");
    }
}
