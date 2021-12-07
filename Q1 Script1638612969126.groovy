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

'OPEN BROWSER'
WebUI.openBrowser('')

'NAVIGATE TO WEB PAGE'
WebUI.navigateToUrl('https://gist.github.com/WISNUARWR')

'MAXIMIZE WINDOW WEB PAGE'
WebUI.maximizeWindow()

'CLICK SIGIN BUTTON'
WebUI.click(findTestObject('GISTGITHUB-OBJECT/Page_SIG IN GISTSGITHUB/a_Signin'))

'INPUT TEXT USERNAME'
WebUI.setText(findTestObject('GISTGITHUB-OBJECT/Page_INPUT Sign in to GitHub GitHub/input_Username or email address_login'), 
    'WISNUARWR')

'INPUT PASSWORD'
WebUI.setText(findTestObject('GISTGITHUB-OBJECT/Page_INPUT Sign in to GitHub GitHub/input_Password_password'), 'War12122014')

'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
WebUI.click(findTestObject('GISTGITHUB-OBJECT/Page_INPUT Sign in to GitHub GitHub/input_Password_commit'))

'CLICK GITS EXISTING TO EDIT'
WebUI.click(findTestObject('GISTGITHUB-OBJECT/Page_Editing CERMATI TEST/Page_GIST EXISTING_CERMATI TEST GIST/strong_Q1 CERMATI TEST-CREATE PUBLIC GIST'))

'CLICK BUTTON EDIT FOR COMMIT'
WebUI.click(findTestObject('GISTGITHUB-OBJECT/Page_Editing CERMATI TEST/Page_GIST EXISTING_EDIT/a_Edit'))

'INPUT TEXT FILE NAME EDIT'
WebUI.setText(findTestObject('GISTGITHUB-OBJECT/Page_Editing CERMATI TEST/Page_Editing Q1 CERMATI TEST-EDIT PUBLIC GIST/input_Delete_gistcontentsname'), 
    'Q1 CERMATI TEST-EDIT PUBLIC GIST')

'INPUT TEXT FILL DESCRIPTION GIST EDIT'
WebUI.setText(findTestObject('GISTGITHUB-OBJECT/Page_Editing CERMATI TEST/Page_Editing Q1 CERMATI TEST-EDIT PUBLIC GIST/pre_DESCRIPTION Q1 CREATE PUBLIC GIST'), 
    'Q1 CERMATI TEST-EDIT PUBLIC GIST')

'INPUT TEXT FILE DESCRIPTION EDIT'
WebUI.setText(findTestObject('GISTGITHUB-OBJECT/Page_Editing CERMATI TEST/Page_Editing Q1 CERMATI TEST-EDIT PUBLIC GIST/input_Delete_gistdescription'), 
    'EDIT PUBLIC GIST')

'CLICK BUTTON UPDATE PUBLIC GIST FOR COMMIT'
WebUI.click(findTestObject('GISTGITHUB-OBJECT/Page_Editing CERMATI TEST/button_Update public gist'))

'DELAY 2 SECOND'
WebUI.delay(2)

'CLOSE BROWSER'
WebUI.closeBrowser()

