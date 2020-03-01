package com.qshore.QshoreJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QshoreMethods {
	
	public WebDriver driver;
	public void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp(){
		driver.close();
	}
	public void sample(){
		System.out.println("Sample");
	}

}
