package Selenium.Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "D:\\Selenium\\Workspace\\Cucumber\\src\\main\\java\\Selenium\\Cucumber\\MyTest.features"
 ,glue={"D:\\Selenium\\Workspace\\Cucumber\\src\\main\\java\\Selenium\\Cucumber\\annotation.java"} 
 ,plugin = {"pretty", "html:target/cucumber"}
 )

public class Runner {

}
