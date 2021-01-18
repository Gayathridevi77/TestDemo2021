package com.demo.test;

import java.io.FileInputStream;
import java.util.Properties;

public class DemoTest {

public static Properties prop;
	
	public DemoTest(){
		try {
			prop= new Properties();
		FileInputStream ip=new FileInputStream("/Users/Welcome/eclipse-workspace/BpaAutfraTest/src/main/java/com/bpa/qa/config/config.properties");
			prop.load(ip);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("gayathri");
		}
		}
}
