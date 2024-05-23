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

WebUI.navigateToUrl('https://pokedex-react-mui.netlify.app/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PokDex/select_Kanto(1-151)Johto(152-251)Hoenn(252-_77ee5a (1)'), 
    'Hoenn', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PokDex/select_all typesgrassbugdarkdragonelectricf_eb8624 (2)'), 
    'ghost', true)

WebUI.click(findTestObject('Object Repository/Page_PokDex/path (2)'))

WebUI.rightClick(findTestObject('Object Repository/Page_PokDex/div_Beckon Pokmon'))

WebUI.rightClick(findTestObject('Object Repository/Page_PokDex/div_About'))

WebUI.rightClick(findTestObject('Object Repository/Page_PokDex/div_356dusclopsBeckon PokmonHeight 1.6 m53 _f8326e'))

WebUI.rightClick(findTestObject('Object Repository/Page_PokDex/div_356dusclopsBeckon PokmonHeight 1.6 m53 _b418ca'))

WebUI.click(findTestObject('Object Repository/Page_PokDex/div_356dusclopsBeckon PokmonHeight 1.6 m53 _b418ca'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PokDex/div_356dusclopsBeckon PokmonHeight 1.6 m53 _b418ca'), 
    0)

WebUI.closeBrowser()

