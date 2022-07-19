package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.IOException;

public class Hooks {

    @Before
    public void setUp(){
    }

    @After
    public void tearDown(Scenario scenario){
//        if (scenario.isFailed()) {
//            try {
//                Driver.getScreenshot("Screenshot");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        Driver.closeDriver();
    }

}