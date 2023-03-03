package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
       WebElement deleteButonu= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
       // text ile kısayolu //*[text()='Add Element']

       if (deleteButonu.isDisplayed()) System.out.println("delete butonu test PASSED");
        else System.out.println("test FAİLED");
        deleteButonu.click();
        WebElement ustButton=driver.findElement(By.xpath("//h3"));
        if (ustButton.isDisplayed()) System.out.println("ust butonu test PASSED");
        else System.out.println("ust butonu test FAİLED");

    }
}
