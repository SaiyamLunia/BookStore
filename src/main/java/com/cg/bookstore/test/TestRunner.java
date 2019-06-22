package com.cg.bookstore.test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/* import statement �org.junit.runner.RunWith� imports @RunWith annotation from the Junit class. 
 * @RunWith annotation tells JUnit that tests should run 
 * using Cucumber class present in �Cucumber.api.junit� package.
 
 * import statement �cucumber.api.CucumberOptions� imports the @CucumberOptions annotation.
 * @CucumberOptions annotation tells Cucumber a lot of things like where to look for feature files,
 * what reporting system to use and some other things also.
 * But as of now in the above test we have just told it for the Feature file folder.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.cg.bookstore.stepdefinations"}
		)
public class TestRunner {

}
