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

WebUI.navigateToUrl('https://www.cermati.com/gabung-v2?')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_OBJECTCermati.com/input__email'), 'wisnuadiramadhan.12@gmail.com')

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_OBJECTCermati.com/input__password'), 'Www5432167890')

WebUI.click(findTestObject('CERMATI-JOINT-OBJECT/Page_EYE PASS/i__fa fa-eye-slash icon-eye'))

WebUI.delay(2)

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/input__confirmPassword'), 'Www5432167890')

WebUI.click(findTestObject('Page_Eye Confrm-Pass/i__fa fa-eye-slash icon-eye'))

WebUI.delay(2)

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/input__firstName'), 'WISNU')

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/input__lastName'), 'AR')

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/input__mobilePhone'), '081296071105')

WebUI.setText(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/input__residenceCity'), 'KOTA JAKARTA SELATAN')

WebUI.check(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/input__residenceCity'))

WebUI.click(findTestObject('CERMATI-JOINT-OBJECT/Page_1638934811147/button_Daftar Akun'))

WebUI.delay(2)
