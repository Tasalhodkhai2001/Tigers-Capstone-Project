package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class Utils extends Base {

	          // Click on radio Button 
				public static void clickOnRadioButton(WebElement element) {
					try {
						if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
							element.click();
						}else {
						System.out.println("One of the conditions did not return expected value");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				public static void selectByVisibleText(WebElement element, String text) {
					Select select = new Select(element);
					select.selectByVisibleText(text);
				}

				
				public static String getTextFromUI(WebElement element) {
					String textFromUI = element.getText();
					return textFromUI;
				}
				

				public static void slectByindex(WebElement element) {
					Select select = new Select(element) ;
						select.selectByIndex(0);
						
					}
				// Action hover on WebElement 
				public static void hoverOn(WebElement element ) {
					Actions action = new Actions(driver);
					action.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
				}
				public void hoverMouseOverElement(WebElement element) {
					Actions actions = new Actions(driver);
					actions.moveToElement(element).build().perform();;

			}
				
				// Wait Method 
				public static void hardWait(int timeUnit) {
					try {
						Thread.sleep(timeUnit);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		
			    // Take Screen Shot Method 
			    public static String screenShotName() {

			        Date date = new Date();
			        String screenShot = date.toString().replace(":", "_").replace(" ", "_");
			        return screenShot;
			    }

			    public static void takeStepScreenShot() {

			        String location = System.getProperty("user.dir") + "\\output\\screenshots\\";
			        String screenShotFileName = screenShotName() + ".png";

			        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			        try {
			            FileUtils.copyFile(file, new File(location + screenShotFileName));
			        } catch (IOException e) {

			            e.printStackTrace();
			            System.out.println("Exception in execution");
			        }

			    }


				}
				

