package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c04 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        String sayfaBasligi=driver.getTitle();

        if (sayfaBasligi.contains("Spend less")) System.out.println("sayfa baslıgı testi PASSED");
        else System.out.println("sayafa baslıgı testi FAİLED");

        driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        driver.findElement(By.xpath("//div[@data-asin='B0BRS4FNBY']")).click();
        driver.findElement(By.xpath("//span[@id='a-autoid-28']")).click();

        String expected="$25.00";
        WebElement actual =driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));
        String actualUcret=actual.getText();
        if (expected.equals(actualUcret)) System.out.println("test passed");
        else System.out.println("test failed");
        System.out.println(actualUcret);


        driver.close();

    }
}
