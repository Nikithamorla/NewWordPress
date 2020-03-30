package cts.testing.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSelinium {
@Test
public void testConfig() throws Exception {
	
	  File src=new File("./Configuration1/Config.property");
	  
	  FileInputStream fis=new FileInputStream(src);
	  
	  Properties pro=new Properties();
	  
	  pro.load(fis);
	  String chromepath=pro.getProperty("chromeDriver");
	  
	  System.out.println("Hey chrome path is " + chromepath);
	  
}
}
