import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'actionKeyword.BrowserKeyword.openBrowser'('https://www.ourbetterworld.org/')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectOptionInNavBar'('Stories', 'Stories by country')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//*[@id="country-list"]/div/div[1]/h1', 'Stories by country')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectStoriesBySection'('Cambodia')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectStoriesInList'('Not all heroes wear capes, some don a fur coat')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//div[@class=\'container\']//h1/span', 'Not all heroes wear capes, some don a fur coat')

