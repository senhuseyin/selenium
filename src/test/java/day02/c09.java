package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c09 {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("3000");
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("20-11-2023");
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();
        WebElement mesaj= driver.findElement(By.xpath("//div[@id='alert_content']"));
        System.out.println(mesaj.getText());

        driver.close();

    }
}
