package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this test runner has a purpose to run failed scenario that is stored inside rerun.txt

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt",
                    glue = "com/trycloud/step_definitions"
                    )
public class FailedTestRunner {
}
