package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class c06 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement aramaCubugu=driver.findElement(By.xpath("//input[@name='q']"));
        aramaCubugu.sendKeys("java"+ Keys.ENTER);
        WebElement sonucYazisi=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucYazisi.getText());
        String sonuc=sonucYazisi.getText();
        String[] sonucYazisiArr=sonuc.split(" ");
        String sonucStr=sonucYazisiArr[1];
        sonucStr=sonucStr.replaceAll("\\D","");
        int sonucYazisiactual=Integer.parseInt(sonucStr);
        System.out.println(sonucYazisiactual);

        driver.close();


    }
}
