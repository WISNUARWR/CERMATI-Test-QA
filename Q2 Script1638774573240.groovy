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

WebUI.navigateToUrl('https://www.shino.de/parkcalc/index.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'))

WebUI.selectOptionByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false)

WebUI.verifyOptionPresentByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false, 2)

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingDate'), 'DARI SIANG')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingDate'), 'HINGGA MALAM')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingTime'), 'JAM 1 SIANG')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingTime'), 'JAM 8 MALAM')

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_StartingTimeAMPM'))

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_LeavingTimeAMPM'))

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_0_Submit'))

WebUI.delay(2)

WebUI.closeBrowser()

