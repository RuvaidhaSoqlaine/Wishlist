package step_definitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void ScreenShotCapture(WebDriver d,String filename) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot)d;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("./ScreenShots/"+filename+".png"));
    }

}
