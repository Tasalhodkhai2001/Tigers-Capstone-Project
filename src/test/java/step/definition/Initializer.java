package step.definition;

import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {
	@Before
	public void beforeHooks(Scenario scenario) {

		logger.info("Scenario " + scenario.getName() + " started");

		browser();

		openBrowser();
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test");
		} else {
			tearDown();
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());

		}
	}
}
