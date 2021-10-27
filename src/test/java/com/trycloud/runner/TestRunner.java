package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class has purpose of instructing how and what kind of feature we want to run

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // -> or: "classpath:features"
                 glue = "com/trycloud/step_definitions", // -> which part to connect (step defs)
                 publish = false, // -> it will give you public link for your local report
                 plugin = { "html:target/cucumber.html", // -> creates a report (.html)
                            "rerun:target/rerun.txt", // -> creates a report (.txt)
                            "json:target/cucumber.json", // -> report for unused import statements
                            "me.jvt.cucumber.report.PrettyReports:target"},
                 dryRun = false, // -> checks if codes will run before actual run (quick scan)
                 tags = "@us_10" // -> run codes with that specific tag
         )
public class TestRunner {
}
