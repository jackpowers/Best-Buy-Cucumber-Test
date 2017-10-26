package annotation;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/Destination"})
@Cucumber.Options( format={"json:target/Destination/cucumber.json"}) 

public class JSONRunner {

}
