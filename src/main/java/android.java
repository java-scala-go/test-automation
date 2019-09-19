//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class android {
//
//
//    public static void main(String[] args) throws MalformedURLException {
//
//
//        AndroidDriver<AndroidElement>  driver;
//
//        // TODO Auto-generated method stub
//        File appDir = new File("src");
//        File app = new File(appDir, "ApiDemos-debug.apk");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
//        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//
//
//    }
//
//
//}
