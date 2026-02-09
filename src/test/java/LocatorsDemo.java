import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

    /*
        1) Open Chrome Browser
        2) Open URL https://mabanque.bnpparibas/
        3) Validate that title equals to BNP Paribas: Leader européen des services bancaires et financiers | BNP Paribas
        4) Close Browser

     */
    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();

        //2) Open URL https://mabanque.bnpparibas/

        chrome.get("https://mabanque.bnpparibas/");

        chrome.manage().window().maximize();

        // popup accepted
        chrome.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement link = chrome.findElement(By.linkText("Banque privée"));

        ((JavascriptExecutor) chrome)
                .executeScript("arguments[0].click();", link);

        //chrome.findElement(By.cssSelector(".cpm-header_icon.search.picto-search")).click();

        //WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(10));

        //chrome.findElement(By.className("search-input-field")).sendKeys("Hello");

        //4) Close Browser you can use two methodes chrome.quit(); chrome.close();
        //chrome.close();
    }
}
