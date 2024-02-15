package Test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class1 {
	public static WebDriver driver;
	public static void Dipali(String ScreenshotB) throws Throwable {
		
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("../TESTng_p/P_newScreenshort/"+ScreenshotB+".png"));
	
}
}