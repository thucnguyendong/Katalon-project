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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'actionKeyword.BrowserKeyword.openBrowser'('https://www.ourbetterworld.org/')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//div[@class=\'navigation float-left\']//li//a[text()=\'Work With Us\']')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//div[@class=\'navigation float-left\']//li//li/a[text()=\'Partner us\']')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//div[@id="block-obw-theme-content"]/article/div/div[1]/div/div[2]/h1/div', 
    'Partner Us')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//*[@id="block-obw-theme-content"]//div[@class=\'button-group\']/a[text()=\'Get in touch\']')

WebUI.waitForPageLoad(10)

CustomKeywords.'actionKeyword.VerifyKeyword.verifyURLInTheSameTab'('contact-us?purpose=partnership')

