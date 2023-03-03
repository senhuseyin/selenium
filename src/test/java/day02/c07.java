package day02;

import com.github.dockerjava.core.command.ListSecretsCmdImpl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.overlay.model.LineStyle;

import java.time.Duration;
import java.util.List;

public class c07 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramaCubugu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaCubugu.sendKeys("samsung headphones"+Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//span[@data-component-type='s-result-info-bar']")).getText());
        WebElement aaa=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        aaa.submit();
       Thread.sleep(5000);
        driver.navigate().back();
        //List<WebElement>basliklar=driver.findElements(By.xpath(""));
        driver.close();

    }
}
