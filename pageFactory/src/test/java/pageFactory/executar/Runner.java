package pageFactory.executar;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = "src/test/resources/Features/", 
		glue = {""}, 
		tags = "@Ctag1",
		monochrome = true,
		snippets = SnippetType.CAMELCASE)
public class Runner {
	
}
