package com.java.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helperClass {
	static WebDriver driver;

	public helperClass(WebDriver driver) {
		helperClass.driver = driver;
	}

	public static void takeScreenShot(String str) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_hh_mm_ss");
		// Move image file to new destination
		File DestFile = new File(System.getProperty("user.dir") + "/src/test/java/com/resouces/screenshots/" + str
				+ "_" + dateFormat.format(new Date()) + ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
