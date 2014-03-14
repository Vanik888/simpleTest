import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by vanik on 14.03.14.
 */
public class Example {

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("vk");
        element.submit();
        System.out.println("suggests = " + driver.getTitle());

        driver = new FirefoxDriver();
        driver.get("http://google.com");
        element = driver.findElement(By.name("q"));
        element.sendKeys("vk");
        element.submit();
        System.out.println("suggests = " + driver.getTitle());

    }
}
//<input class="gbqfif" disabled="" autocomplete="off" aria-hidden="true" id="gs_htif0" dir="ltr" style="border: none; padding: 0px; margin: 0px; height: auto; width: 100%; position: absolute; z-index: 1; background-color: transparent; -webkit-text-fill-color: silver; color: silver; transition: all 0.218s; -webkit-transition: all 0.218s; opacity: 0; left: 0px; text-align: left;">