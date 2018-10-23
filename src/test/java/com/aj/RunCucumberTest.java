package com.aj;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue={"com.aj.cucumer"})
//        plugin = {"pretty:build/cucumber/cucumber-pretty.txt", "html:build/reports/cucumber/html",
//        "json:build/cucumber/cucumber.json", "usage:build/cucumber/usage.json", "junit:build/test-results/test/cucumber.xml"})
public class RunCucumberTest {

}