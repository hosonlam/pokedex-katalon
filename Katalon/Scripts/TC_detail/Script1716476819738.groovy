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

WebUI.click(findTestObject('Object Repository/Page_PokDex/path (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_PokDex/div_A strange seed wasplanted on itsback at_a62a41'), 
    'A strange seed was\nplanted on its\nback at birth.\fThe plant sprouts\nand grows with\nthis POKéMON.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PokDex/div_overgrowchlorophyll'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PokDex/div_hp45attack49defense49special-attack65sp_b6ee88'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PokDex/div_bulbasaurivysaurvenusaur'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PokDex/div_001bulbasaurSeed PokmonHeight 0.7 m24  _767fdd'), 
    0)

WebUI.closeBrowser()
