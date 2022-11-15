package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static WebDriver driver;
    static String baseUrl="http://the-internet.herokuapp.com/login";
    static  String browser="Firefox";


    public static void main(String[] args) {
if(browser.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver=new ChromeDriver();

} else if (browser.equalsIgnoreCase("Edge")) {
    System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
    driver=new EdgeDriver();
} else if (browser.equalsIgnoreCase("Firefox")) {
    System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
    driver=new FirefoxDriver();
}else {
    System.out.println("Enter valid browser");
}
//set url
        driver.get(baseUrl);
//maximise window
        driver.manage().window().maximize();
        //Print title
        System.out.println("Title of the page is : "+driver.getTitle());
        //Print current url
        System.out.println("Current url is : "+driver.getCurrentUrl());
        //print page source
        System.out.println("The page source is : "+driver.getPageSource());
        //Enter email to email field
        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        //enter password
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");



driver.close();

    }
}
