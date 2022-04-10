package com.java.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		// Location of the feature file folder
		features = "D:\\Workspace\\Eclipse_Workspace1\\Cucumber\\src\\test\\java",
		// Where my definition is written
		glue ={"classpath:com.java.stepDefination","classpath:com.java.pageDefinationModel","classpath:com.java.helper"},
		// Which tag needs to be executed
		tags = "@AllTag",
		// Reports generations
		plugin = { "pretty", "html:src/main/resources/results/" },
		// creates body of the undefined functions
		dryRun = false,
		// To know the pass and fail statics
		monochrome = true)

public class Runner {

}
