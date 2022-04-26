package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/FeatureWithTags",
        glue={"Steps"},
        monochrome = true,
        plugin = {"pretty","html:target/Html/Reports.html", "json:target/JSONReports/report.json", "junit:target/JUnit/reports.xml"},
        tags = "@regression and not @smoke"

)

public class TestRunner_RunWithSingleTag {
}
