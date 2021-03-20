package com.crm.cogmento.genericUtilities;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenshotGenerics{
	public static void getSreenshot(String methodname) throws Throwable {
		EventFiringWebDriver driver=new EventFiringWebDriver(Base_Class.driver);
		Date d=new Date();
		String d2 = d.toString();
		String date = d2.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path="./Screenshots/"+methodname+date+".jpeg";
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}
}
