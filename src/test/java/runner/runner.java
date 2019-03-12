package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "classpath:features",
            plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
            glue= {"/Users/shivahosur/develop/workspace/RbsTest/src/Orderpage/java/stepDefinitions/Orderpage.java"}
    )

    public class runner {

    }
