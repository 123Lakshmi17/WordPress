package practise;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportDemo {
@Test
public void loginTest() throws Exception {

Assert.assertEquals("loginsucess", "loginsucess");

ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");

ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlReporter);

ExtentTest logger = extent.createTest("loginTest", "Description");

logger.log(Status.INFO, "Login to facebook");
logger.log(Status.PASS, "loginsucess");

ExtentTest logger1 = extent.createTest("LogoffTest", "Description");

logger1.log(Status.FAIL, "logoffFail");

logger1.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("https://in.images.search.yahoo.com/images/view;_ylt=AwrwJTRa3H5eeWwA6TgO9olQ;_ylu=X3oDMTIyb21iMG12BHNlYwNzcgRzbGsDaW1nBG9pZANhNDYxMzBlNDhjYWVkYzkxMTA2NjFkNTk0YzA4YzE2NQRncG9zAzIEaXQDYmluZw--?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fyhs%2Fsearch%3Fp%3Dimages%26fr%3Dyhs-trp-001%26hsimp%3Dyhs-001%26hspart%3Dtrp%26tab%3Dorganic%26ri%3D2&w=1280&h=720&imgurl=i.ytimg.com%2Fvi%2FELCDXFM9fqo%2Fmaxresdefault.jpg&rurl=http%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DELCDXFM9fqo&size=202.4KB&name=AMARAVATHI+EXPRESS%2C+DUDHSAGAR+WATERFALLS%2C+BRAGANZA+GHATS+%7C+Indian+...&p=images&oid=a46130e48caedc9110661d594c08c165&fr2=&fr=yhs-trp-001&tt=AMARAVATHI+EXPRESS%2C+DUDHSAGAR+WATERFALLS%2C+BRAGANZA+GHATS+%7C+Indian+...&b=0&ni=144&no=2&ts=&tab=organic&sigr=11avpclfl&sigb=13f80r1d6&sigi=11ckug6t8&sigt=125h105ms&sign=125h105ms&.crumb=7kxfEEwlyvP&fr=yhs-trp-001&hsimp=yhs-001&hspart=trp").build());

extent.flush();


}
}