package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class c02 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement arama= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        arama.sendKeys("apple");
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
