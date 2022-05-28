package untils;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot() {
		// TODO Auto-generated method stub
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MM-dd HH-MM-SS");
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       LocalDateTime now = LocalDateTime.now();
       File dest = new File ("path" + "jpg");
       FileHandler.copy(src, dest);
	}

}
