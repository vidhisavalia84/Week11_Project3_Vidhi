package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        //set url
        driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //Print title of the page
        System.out.println("Title of the page is : "+driver.getTitle());
        //Print current url
        System.out.println("Tke current url is: "+driver.getCurrentUrl());
        //Print pagesource
        System.out.println("Current pagesource is : "+driver.getPageSource());
        //Enter the email to email field
        WebElement email=driver.findElement(By.name("username"));
        email.sendKeys(" tomsmith");
        //Enter password to password field
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        driver.close();
    }
}
