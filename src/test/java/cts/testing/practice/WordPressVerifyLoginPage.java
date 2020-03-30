package cts.testing.practice;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WordPressVerifyLoginPage {

public static void main(String[] args) {
// TODO Auto-generated method stub
Logger logger=Logger.getLogger("LogDemo");
PropertyConfigurator.configure("Log4j.properties");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\kiddoo\\src\\test\\resources\\Binaries\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
logger.info("Chrome Driver Opened");


driver.get("https://www.facebook.com");

logger.info("Navigated to URL");

driver.manage().window().maximize();

logger.info("Browser Maximized");



  driver.close();

}

}


