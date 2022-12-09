import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {
    WebDriver driver;

    public Project3() {
        System.setProperty("webdriver.chrome.driver" ,
                "C:/Users/Agrow/OneDrive/Desktop/chromedriver.exe");
        this.driver = new ChromeDriver();

    }

    public WebElement getElement( String selector){

        WebElement element = this.driver.findElement(By.cssSelector(selector));
        return element;

    }

}
