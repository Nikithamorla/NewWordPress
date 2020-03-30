package cts.testing.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidAndinvalid extends BaseClass{

    @Test(description="Valid login",priority=1)
    public void validlogin() {
 	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		   driver.findElement(By.name("Submit")).click();
		   Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard",driver.getCurrentUrl());
		   
    }
    @Test(description="Invalid login",priority=2)
    public void Invalidlogin() {
 	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		   driver.findElement(By.name("Submit")).click();
		   Assert.assertEquals("Invalid credentials",driver.findElement(By.className("spanMessage")).getText());
		   
    }

}
