package packageAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NixPractise 
{

public static AppiumDriver<WebElement> driverAppium;

public static void main(String[] args) throws MalformedURLException, InterruptedException 
{
	
	String apkpath="D:\\APKs\\Market Nix_26.00.16\\nixagent.apk";
    File app = new File (apkpath);
        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability( MobileCapabilityType.APP, app );
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy J7 Prime");
        caps.setCapability(MobileCapabilityType.APP_PACKAGE, "com.nix");
        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.nix.ui.SureMdmNixSplashScreen");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,1800);
        driverAppium = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	
        System.out.println("Launch success");
        Thread.sleep(10000L);
  //      driverAppium.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, Duration.ofSeconds(5));
     
        driverAppium.findElementByXPath("//android.widget.Button[@text='Get Started']").click();
        System.out.println("Clicked on get Started");
        Thread.sleep(10000L);
        driverAppium.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
        driverAppium.findElementByXPath("//android.widget.Button[@index='1' and @text='ALLOW']").click();
        driverAppium.findElementByXPath("//android.widget.Button[@index='1' and @text='ALLOW']").click();
        driverAppium.findElementByXPath("//android.widget.Button[@index='1' and @text='ALLOW']").click();
        driverAppium.findElementByXPath("//android.widget.Button[@index='1' and @text='ALLOW']").click();
        driverAppium.findElementByXPath("//android.widget.Button[@index='1' and @text='ALLOW']").click();
        Thread.sleep(10000L);
        driverAppium.findElementByXPath("//android.widget.Button[@text ='ACTIVATE']").click();
        Thread.sleep(20000L);
        driverAppium.findElementByXPath("//android.widget.Button[@text='CANCEL']").click();
        Thread.sleep(10000L);
 //     driverAppium.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
        driverAppium.findElementByXPath("//android.widget.Button[@text='Continue']").click();
        Thread.sleep(10000L);
        driverAppium.findElementById("com.nix:id/editTextCustID").sendKeys("021900297");
        Thread.sleep(10000L);
        driverAppium.findElementByXPath("//android.widget.Button[@text='Register']").click();
        Thread.sleep(10000L);
        driverAppium.findElementByXPath("//android.widget.RadioButton[@text='Set Device Name manually']").click();
        driverAppium.findElementById("com.nix:id/deviceName").sendKeys("Samsung J7 Prime");
        driverAppium.findElementById("com.nix:id/chgDeviceName").click();
}     
        
}

