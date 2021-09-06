package com.bookit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",

        },

        features = "src/test/resources/features",
        glue = "com/bookit/steps_definitions",
        dryRun = true,
        tags = ""

)

public class CukesRunner {
}
