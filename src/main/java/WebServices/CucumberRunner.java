package WebServices;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/jnq4480/test-automation/src/main/java/WebServices/features/test.feature", //the path of the feature files
        glue = {"stepDefinitions"}, //the path of the step definition files
        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting

)
public class CucumberRunner {

}

