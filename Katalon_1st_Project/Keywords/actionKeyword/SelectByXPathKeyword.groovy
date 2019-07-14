package actionKeyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Desktop.Action

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.remote.server.handler.FindElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class SelectByXPathKeyword {
	/**
	 * Enter text in element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def setTextElementByXPath(String xpath, String text) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath(xpath)).sendKeys(text);
			KeywordUtil.markPassed("Text is inputted successfully")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to enter text")
		}
	}

	/**
	 * Click element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def clickElementByXPath(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath(xpath)).click();
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def clickElementByOffset(String xpath, int x, int y) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			WebElement elem =driver.findElement(By.xpath(xpath));
			Actions build = new Actions(driver);
			build.moveToElement(elem, x, y).click().build().perform();
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}