import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class CssSlectorDemo {

    /*
        1) Open Chrome Browser
        2) Open URL https://mabanque.bnpparibas/
        3) Validate that title equals to BNP Paribas: Leader européen des services bancaires et financiers | BNP Paribas
        4) Close Browser
     */
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.google.com/");

        chromeDriver.findElement(By.cssSelector("#L2AGLb")).click();

        WebElement element = chromeDriver.findElement(By.cssSelector("textarea.gLFyf"));

        new Actions(chromeDriver)
                .click(element)
                .sendKeys("facebook.com")
                .sendKeys(Keys.ENTER)
                .perform();

        //chromeDriver.findElement(By.cssSelector("a.zReHs.seoquake-params-link")).click();

        //chromeDriver.findElement(By.id("recaptcha")).click();

    }
}
