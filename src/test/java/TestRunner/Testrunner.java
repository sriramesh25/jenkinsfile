package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/Features"},
        format = {"json:target/cucumber.json","html:target/site/LoginFeature-pretty"},glue="LoginSteps")
public class Testrunner extends AbstractTestNGCucumberTests {

}
