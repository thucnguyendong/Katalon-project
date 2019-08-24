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

CustomKeywords.'actionKeyword.MouseHoverKeyword.moveMouseToObject'('//div[@class=\'navigation float-left\']//li//a[text()=\'About Us\']')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//div[@class=\'navigation float-left\']//li//li/a[text()=\'Contact us\']')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectSubjectDropDownList'('Create stories with us')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_About_US/AboutUs_Contact_FillInData'), [('varFirstname') : 'Thuc'
        , ('varLastname') : 'Nguyen', ('varEmail') : 'nguyendongthuc13', ('varContact') : '579135', ('varCountry') : 'Vietnam'
        , ('varCity') : 'Ho Chi Minh', ('varNation') : 'Vietnam', ('varMessage') : 'Test'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectSkillByXpath'('Writer')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-link-to-your-cv\']', 'Test')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-link-to-showreel-portfolio\']', 
    'Test')

