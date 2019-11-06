package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseFunc {

    private WebDriver driver;

    public BaseFunc() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    public void goToUrl(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {

        } else {
            url = "http://" + url;
        }
        driver.get(url);

    }

    public void selectFromDropdown(By locator, String text) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }

    public void clickBtn(By go) {
        driver.findElement(go).click();
    }
}
