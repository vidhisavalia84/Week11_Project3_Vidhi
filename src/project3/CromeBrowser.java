package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //Print title of the page
        System.out.println("Title of the page is :  "+driver.getTitle());
        //Print current url
        System.out.println("The current url is : "+driver.getCurrentUrl());
        //Print page source
        System.out.println("The page source is : "+driver.getPageSource());
        //Enter email to the email field
        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        //Enter password to the password field
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
//close the driver
driver.close();


    }

}
