import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    /*
        1) Open Chrome Browser
        2) Open URL https://mabanque.bnpparibas/
        3) Validate that title equals to BNP Paribas: Leader européen des services bancaires et financiers | BNP Paribas
        4) Close Browser

     */
    public static void main(String[] args) {

        //ChromeDriver chrome = new ChromeDriver();
        //ChromeDriver chrome = new EdgeDriver();
        //ChromeDriver chrome = new FirefoxDriver();
        WebDriver chrome = new ChromeDriver();

        //2) Open URL https://mabanque.bnpparibas/

        chrome.get("https://mabanque.bnpparibas/");

        //3) Validate that title equals to BNP Paribas: Leader européen des services bancaires et financiers | BNP Paribas

        String title = chrome.getTitle();

        if (title.equalsIgnoreCase("BNP Paribas: Leader européen des services bancaires et financiers | BNP Paribas")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //4) Close Browser you can use two methodes chrome.quit(); chrome.close();
        chrome.close();
    }
}
