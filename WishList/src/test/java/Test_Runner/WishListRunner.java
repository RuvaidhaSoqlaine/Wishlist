package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Features\\WishList.feature",
		glue={"step_definitions"}
		//tags="@Smoke and not @regression",
//		plugin= {"pretty", "html:target/SwagReports.html" ,
//				"Json:target/JSON Reports/SwagReports.json", 
//				"Junit:target/JunitReports/SwagReports.xml"}
		)


public class WishListRunner {
	
	

}
