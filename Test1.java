import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

    @Test
    public void locked_out_userP() throws InterruptedException {

        String url = "https://www.saucedemo.com";
        Project3 selenium = new Project3();
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();


        Thread.sleep(2000);


        WebElement locked_out_User = selenium.driver.findElement(By.cssSelector("#user-name"));
        locked_out_User.sendKeys("locked_out_user");

        WebElement password = selenium.driver.findElement(By.cssSelector("#password"));
        String expected = "#header_container > div.header_secondary_container > span";
        password.sendKeys("#secret_sauce");
        password.sendKeys(Keys.ENTER);
        String actualValue = selenium.getElement("#login_button_container > div > form > div.error-message-container.error > h3").getText();
        Assert.assertEquals(expected, actualValue);

    }

    @Test

    public void problem_user() throws InterruptedException {





        Project3 selenium = new Project3();
        String expected = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
        String url2 = "https://www.saucedemo.com";
        selenium.driver.manage().window().maximize();
        selenium.driver.get(url2);
            Thread.sleep(1500);

        String UsernameSelector = "#user-name";
        String PasswordSelector = "#password";
        String UsernameInput = "problem_user";
        String PasswordInput = "secret_sauce";
        String BtLogin = "#login-button";
        selenium.getElement(UsernameSelector).sendKeys(UsernameInput);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(BtLogin).click();
        String actualValue = selenium.getElement( "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg").getText();
        Assert.assertNotEquals(expected,actualValue);



    }
}