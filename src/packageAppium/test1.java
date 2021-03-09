package packageAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class test1 {
	public static AppiumDriver<WebElement> driverAppium;
		 public static void main(String[] args) throws MalformedURLException {
			
				String apkpath="D:\\Softwares\\Test_apk\\SysmonitorApp.apk";
			    File app = new File (apkpath);
			        DesiredCapabilities caps =new DesiredCapabilities();
			        caps.setCapability( MobileCapabilityType.APP, app );
			        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Lenovo TB-8705F");
			        caps.setCapability(MobileCapabilityType.APP_PACKAGE, "com.dp.sysmonitor.app");
			        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.dp.sysmonitor.app.activities.SplashActivity");
			        //caps.setCapability("avd", "AVD_for_Nexus_6");
			        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,1800);
			        driverAppium = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				
			        System.out.println("Launch success");
			        
					
//					driverAppium.findElementByXPath("//android.widget.ImageButton[@index='0']").click();
					
//					driverAppium.findElementByXPath("//android.widget.ImageButton[@content-desc='Open']").click();
					driverAppium.findElementByXPath("//android.widget.CheckedTextView[@index='0' and @text='Network' ]").click();
					System.out.println("Execution successful");
					
	//				driverAppium.findElementByXPath("//android.widget.CheckedTextView[@index='17' and @text='UPLOAD' ]").isDisplayed();
	//		        System.out.println("Execution successful");

	}

}
