package cts.testing.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningAttributes {
	@Test(priority=1,dependsOnMethods= {"TestB"},alwaysRun=true)
	  public void TestC() {
		  Assert.assertEquals("google", "googleq1");
	  }
	  @Test(priority=2,description="yahoo",invocationCount=7,invocationTimeOut=20)
	  public void TestB() {
		  Assert.assertEquals("yahoo", "yaho1");
	  }
	  @Test(priority=3)
	  public void TestA() {
		  Assert.assertEquals("yahoo", "yahoo");
	  }
	}
