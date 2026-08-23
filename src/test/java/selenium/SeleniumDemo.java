package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Actions action =new Actions(driver);

        driver.get("https://www.techi.com/why-coreweave-stock-soaring-today/");

        WebElement bodyElement = driver.findElement(By.tagName("body"));
        WriteToFile.writeIntoFile(bodyElement.getText());
        //String allVisibleText = bodyElement.getText(); // Use .getText() in Java

       // System.out.println(allVisibleText);







        driver.findElement(By.id("revealed"));
        WebElement revealed  = driver.findElement(By.xpath("//a"));

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(d -> revealed.isDisplayed());

        //List<WebElement> texts = driver.findElements(By.xpath("//a"));

        System.out.println("Element Visible......");
      /*  for (WebElement ele: texts){
            System.out.println(ele.getText());

        }*/



        List<WebElement> totlWebElements= driver.findElements(By.className("form-control"));

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.xpath("//a/text()"));

        action.sendKeys("hhh").perform();

        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();


        driver.quit();
    }
}
