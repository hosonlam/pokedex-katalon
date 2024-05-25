import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.kbb.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kelley Blue Book  New and Used Car Pri_e90311/div_Shop SmartLet Kelley Help You Shop Like_3c8d09'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kelley Blue Book  New and Used Car Pri_e90311/div_Start with Your Current Car Get an esti_fc61f8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kelley Blue Book  New and Used Car Pri_e90311/div_Recommended for You2024 Chevrolet Silve_87628b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kelley Blue Book  New and Used Car Pri_e90311/div_Get an Instant Cash OfferUse it to purc_7f8737'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kelley Blue Book  New and Used Car Pri_e90311/div_Know Your ScoreCar shopping Check your _71532d'), 
    0)

WebUI.closeBrowser()

