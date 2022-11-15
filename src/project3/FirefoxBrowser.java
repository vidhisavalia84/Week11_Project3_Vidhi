package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);// set url
        //maximise window
        driver.manage().window().maximize();
        //Print title
        System.out.println("Title of the page is : " + driver.getTitle());
        //print url
        System.out.println("Current url is : " + driver.getCurrentUrl());
        //print page source
        System.out.println("The pagesource is : " + driver.getPageSource());
        //Enter email to the email field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(" tomsmith");
        //Enter password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword! ");
driver.close();
    }

}
