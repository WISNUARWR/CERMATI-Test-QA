# **CERMATI-Test-QA**
* [Q1-Create, Edit and Delete Public Gits](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing).  

* [Q2-Find BUG and Mention all necessary fields](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing).  

* [Q3 CAPTURE API TESTING](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q3-api-testing--scenario-testing).

* [Q4 Positive Test Registration for Cermati Account- Positive Scenarion](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q4-positive-test-registration-for-cermati-account--positive-scenarion--scenario-testing).
 

# **Q1-Create, Edit and Delete Public Gits || Scenario Testing:**  
##### ***![Click Here for Regression Test Capture](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/2)***
#### [• As a user GITHUB, I want to create a public gist.](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#create-a-new-public-gist)
#### [• As a user GITHUB, I want to edit an existing gist.](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#edit-public-gist-existing)
#### [• As a user GITHUB, I want to delete an existing gist.](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#delete-public-gist-existing)



## CREATE a New Public Gist
##### ***[KATALON STUDIO AUTOMATION SCRIPT - Create](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-create-a-new-gist-katalon-studio-automation-script)***
```
1.'OPEN BROWSER'
2.'NAVIGATE TO WEB PAGE'
3.'MAXIMIZE WINDOW WEB PAGE'
4.'CLICK SIGIN BUTTON'
5.'INPUT TEXT USERNAME'
6.'INPUT PASSWORD'
7.'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
8.'CLICK BUTTON PLUS FOR ADD OR CREATE A NEW GITS'
9.'INPUT TEXT FILE NAME'
10.'INPUT TEXT FILL DESCRIPTION GIST'
11.'INPUT TEXT FILE DESCRIPTION'
12.'CLICK BUTTON DROPDOWN SUMMARY TYPE GIST'
13.'CHOOSE CREATE PUBLIC GIST'
14.'CLICK BUTTON CREATE PUBLIC GIST FOR COMMIT CREATE PUBLIC GIST'
15.'DELAY 2 SECOND'
16'CLOSE BROWSER'

```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)***

#### Script Create a new gist (KATALON STUDIO AUTOMATION SCRIPT)
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q1%20CREATE%20Public%20gist%20-%20%20Script1638612925489.groovy)***_
```
'OPEN BROWSER'
WebUI.openBrowser('')

'NAVIGATE TO WEB PAGE'
WebUI.navigateToUrl('https://gist.github.com/WISNUARWR')

'MAXIMIZE WINDOW WEB PAGE'
WebUI.maximizeWindow()

'CLICK SIGIN BUTTON'
WebUI.click(findTestObject('CREATE A NEW GIST/Page_WISNUARWR/a_Signin'))

'INPUT TEXT USERNAME'
WebUI.setText(findTestObject('CREATE A NEW GIST/Page_Sign in/input_Username or email address_login'), 'WISNUARWR')

'INPUT PASSWORD'
WebUI.setText(findTestObject('CREATE A NEW GIST/Page_Sign in input username and password/input_Password_password'), 'Www5432167890')

'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
WebUI.click(findTestObject('CREATE A NEW GIST/Page_Sign in input username and password/input_Password_commit'))

'CLICK BUTTON PLUS FOR ADD OR CREATE A NEW GITS'
WebUI.click(findTestObject('CREATE A NEW GIST/Page_WISNUARWRs ADD or CREATE new gist/svg_Sign out_octicon octicon-plus d-none d-md-inline-block'))

'INPUT TEXT FILE NAME'
WebUI.setText(findTestObject('CREATE A NEW GIST/Page_CREATE a new Gist/input_View your gists_gistcontentsname'), 'Q1 CERMATI TEST-CREATE PUBLIC GIST')

'INPUT TEXT FILL DESCRIPTION GIST'
WebUI.setText(findTestObject('CREATE A NEW GIST/Page_CREATE a new Gist/pre_'), 'DESCRIPTION Q1 CREATE PUBLIC GIST')

'INPUT TEXT FILE DESCRIPTION'
WebUI.setText(findTestObject('CREATE A NEW GIST/Page_CREATE a new Gist/input_View your gists_gistdescription'), 'CREATE PUBLIC GIST')

'CLICK BUTTON DROPDOWN SUMMARY TYPE GIST'
WebUI.click(findTestObject('CREATE A NEW GIST/Page_Create a new Gist button choose ublic or secret gist/summary_Create secret gist_select-menu-button btn-primary btn BtnGroup-item float-none'))

'CHOOSE CREATE PUBLIC GIST'
WebUI.click(findTestObject('CREATE A NEW GIST/Page_CHOOSE Public Gist/span_Create public gist'))

'CLICK BUTTON CREATE PUBLIC GIST FOR COMMIT CREATE PUBLIC GIST'
WebUI.click(findTestObject('CREATE A NEW GIST/Page_CLICK button create public gist/button_Create public gist'))

'DELAY 2 SECOND'
WebUI.delay(2)

'CLOSE BROWSER'
WebUI.closeBrowser()
```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)***

## EDIT Public Gist Existing
#####  ***[KATALON STUDIO AUTOMATION SCRIPT - Edit](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-edit-gist-existing-katalon-studio-automation-script)***

```
1.'OPEN BROWSER'
2.'NAVIGATE TO WEB PAGE'
3.'MAXIMIZE WINDOW WEB PAGE'
4.'CLICK SIGIN BUTTON'
5.'INPUT TEXT USERNAME'
6.'INPUT PASSWORD'
7.'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
8.'CLICK GITS EXISTING TO EDIT'
9.'CLICK BUTTON EDIT FOR COMMIT'
10'INPUT TEXT FILE NAME EDIT'
11.'INPUT TEXT FILL DESCRIPTION GIST EDIT'
12.'INPUT TEXT FILE DESCRIPTION EDIT'
13.'CLICK BUTTON UPDATE PUBLIC GIST FOR COMMIT'
14.'DELAY 2 SECOND'
15.'CLOSE BROWSER'
```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)***

#### Script Edit gist existing (KATALON STUDIO AUTOMATION SCRIPT)
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q1%20EDIT%20Public%20gist%20-%20Script1638612969126.groovy)***_
```
'OPEN BROWSER'
WebUI.openBrowser('')

'NAVIGATE TO WEB PAGE'
WebUI.navigateToUrl('https://gist.github.com/WISNUARWR')

'MAXIMIZE WINDOW WEB PAGE'
WebUI.maximizeWindow()

'CLICK SIGIN BUTTON'
WebUI.click(findTestObject('EDIT EXISTING GIST/Page_WISNUARWR/a_Signin'))

'INPUT TEXT USERNAME'
WebUI.setText(findTestObject('EDIT EXISTING GIST/Page_Sign in/input_Username or email address_login'), 'WISNUARWR')

'INPUT PASSWORD'
WebUI.setText(findTestObject('EDIT EXISTING GIST/Page_Sign in/input_Password_password'), 'Www5432167890')

'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
WebUI.click(findTestObject('EDIT EXISTING GIST/Page_Sign in/input_Password_commit'))

'CLICK GITS EXISTING TO EDIT'
WebUI.click(findTestObject('EDIT EXISTING GIST/Page_CLICK existing gist/strong_Q1 CERMATI TEST-EDIT PUBLIC GIST'))

'CLICK BUTTON EDIT FOR COMMIT'
WebUI.click(findTestObject('EDIT EXISTING GIST/Page_EDIT PUBLIC GIST/a_Edit'))

'INPUT TEXT FILE NAME EDIT'
WebUI.setText(findTestObject('EDIT EXISTING GIST/Page_Editing Existing Gist Update Public Gist/input_Delete_gistcontentsname'), 
    'Q1 CERMATI TEST-EDIT PUBLIC GIST')

'INPUT TEXT FILL DESCRIPTION GIST EDIT'
WebUI.setText(findTestObject('EDIT EXISTING GIST/Page_Editing Existing Gist Update Public Gist/span_EDIT Q1 CERMATI TEST-EDIT PUBLIC GISTDESCRIPTION Q1 CREATE PUBLIC GIST'), 
    'Q1 CERMATI TEST-EDIT PUBLIC GIST')

'INPUT TEXT FILE DESCRIPTION EDIT'
WebUI.setText(findTestObject('EDIT EXISTING GIST/Page_Editing Existing Gist Update Public Gist/input_Delete_gistdescription'), 
    'EDIT PUBLIC GIST')

'CLICK BUTTON UPDATE PUBLIC GIST FOR COMMIT'
WebUI.click(findTestObject('EDIT EXISTING GIST/Page_Editing Existing Gist Update Public Gist/button_Update public gist'))

'DELAY 2 SECOND'
WebUI.delay(2)

'CLOSE BROWSER'
WebUI.closeBrowser()
```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)***


## DELETE Public Gist Existing
#####  ***[KATALON STUDIO AUTOMATION SCRIPT - Delete](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-delete-gist-existing-katalon-studio-automation-script)***

```
1.'OPEN BROWSER'
2.'NAVIGATE TO WEB PAGE'
3.'MAXIMIZE WINDOW WEB PAGE'
4.'CLICK SIGIN BUTTON'
5.'INPUT TEXT USERNAME'
6.'INPUT PASSWORD'
7.'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
8.'CLICK GITS EXISTING TO DELETE'
9.'CLICK BUTTON DELETE FOR DELETE GITS EXISTING'
10.'ACCEPT ALERT FOR COMMIT POPUP'
11.'DELAY 4 SECOND FOR VIEW UPDATE LIST GIST EXISTING'
12.'CLOSE BROWSER'
```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)***

#### Script Delete gist existing (KATALON STUDIO AUTOMATION SCRIPT)
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q1%20DELETE%20Public%20gist%20%20-%20Script1638613009749.groovy)***_
```

'OPEN BROWSER'
WebUI.openBrowser('')

'NAVIGATE TO WEB PAGE'
WebUI.navigateToUrl('https://gist.github.com/WISNUARWR')

'MAXIMIZE WINDOW WEB PAGE'
WebUI.maximizeWindow()

'CLICK SIGIN BUTTON'
WebUI.click(findTestObject('DELETE EXISTING GIST/Page_WISNUARWR/a_Signin'))

'INPUT TEXT USERNAME'
WebUI.setText(findTestObject('DELETE EXISTING GIST/Page_Sign in/input_Username or email address_login'), 'WISNUARWR')

'INPUT PASSWORD'
WebUI.setText(findTestObject('DELETE EXISTING GIST/Page_Sign in/input_Password_password'), 'Www5432167890')

'CLICK BUTTON SIGNIN FOR COMMIT USERNAME AND PASSWORD'
WebUI.click(findTestObject('DELETE EXISTING GIST/Page_Sign in/input_Password_commit'))

'CLICK GITS EXISTING TO DELETE'
WebUI.click(findTestObject('DELETE EXISTING GIST/Page_CLICK existing gist/strong_EDIT Q1 CERMATI TEST-EDIT PUBLIC GIST'))

'CLICK BUTTON DELETE FOR DELETE GITS EXISTING'
WebUI.click(findTestObject('DELETE EXISTING GIST/Page_CLICK button delete/button_Delete'))

'ACCEPT ALERT FOR COMMIT POPUP'
WebUI.acceptAlert()

'DELAY 4 SECOND FOR VIEW UPDATE LIST GIST EXISTING'
WebUI.delay(4)

'CLOSE BROWSER'
WebUI.closeBrowser()
```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)***
#####  ***[BACK to TOP](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#cermati-test-qa)***



# **Q2-Find BUG and Mention all necessary fields ||Scenario Testing:**
##### ***![Click Here for Regression Test Capture](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/3)***
#### [• Test Case "MANDATORY TEST - Input text null"](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#text-case--mandatory-test---input-text-null--bug-because-passed)
#### [• Test Case "Input text SPACE"](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#text-case--mandatory-test---input-text-space-bug-because-passed)
#### [• Test Case "Input text another format"](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#text-case--mandatory-test---input-text-another-format-bug-because-passed)



## Text Case  "MANDATORY TEST - INPUT TEXT NULL"  ***BUG because PASSED***
#####  ***[KATALON STUDIO AUTOMATION SCRIPT - MANDATORY TEST - INPUT TEXT NULL](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-mandatory-test---input-text-null)***


#### Necessary fields which should be included in a bug.
```
• For Parameter Date and Time Start or Leave, should be MANDATORY and DISABLE Input Text.
```

#### SCRIPT MANDATORY TEST - INPUT TEXT NULL 
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q2%20Input%20Text%20Null%20-%20Script1638774604092.groovy)***_
```
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.shino.de/parkcalc/index.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'))

WebUI.selectOptionByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false)

WebUI.verifyOptionPresentByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false, 2)

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingDate'), '')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingDate'), '')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingTime'), '')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingTime'), '')

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_StartingTimeAMPM'))

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_LeavingTimeAMPM'))

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_0_Submit'))

WebUI.delay(2)

WebUI.closeBrowser()
```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)***



## Text Case  "MANDATORY TEST - Input text SPACE" ***BUG because PASSED***
#####  ***[KATALON STUDIO AUTOMATION SCRIPT - MANDATORY TEST - Input text SPACE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-mandatory-test---input-text-space)***


#### Necessary fields which should be included in a bug.
```
• For Parameter Date and Time Start or Leave, should be MANDATORY and MANDATORY fromat Input Text.
• For Parameter Date and Time Start or Leave, should be VALIDATION for appropriate format.
• For Parameter Date and Time Start or Leave, there should be Pop Up Notification "MANDATORY and appropriate format".
```

#### SCRIPT MANDATORY TEST - Input text SPACE
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q2%20Input%20Text%20Space%20-%20%20Script1638774541484.groovy)***_
```

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.shino.de/parkcalc/index.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'))

WebUI.selectOptionByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false)

WebUI.verifyOptionPresentByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false, 2)

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingDate'), ' ')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingDate'), ' ')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingTime'), ' ')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingTime'), ' ')

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_StartingTimeAMPM'))

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_LeavingTimeAMPM'))

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_0_Submit'))

WebUI.delay(2)

WebUI.closeBrowser()

```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)***


## Text Case  "MANDATORY TEST - Input text another format" ***BUG because PASSED***
#####  ***[KATALON STUDIO AUTOMATION SCRIPT - MANDATORY TEST - Input text another format](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-mandatory-test---input-text-another-format)***

#### Necessary fields which should be included in a bug.
```
• For Parameter Date and Time Start or Leave, should be MANDATORY and MANDATORY fromat Input Text.
• For Parameter Date and Time Start or Leave, should be VALIDATION for appropriate format.
• For Parameter Date and Time Start or Leave, there should be Pop Up Notification "MANDATORY and appropriate format".
```

#### SCRIPT MANDATORY TEST - Input text another format
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q2%20Input%20Text%20Another%20Format%20-%20Script1638774573240.groovy)***_
```

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.shino.de/parkcalc/index.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'))

WebUI.selectOptionByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false)

WebUI.verifyOptionPresentByLabel(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/DROP DOWN BUTTON CHOOSE PARKING LOT'), 
    'Economy Parking', false, 2)

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingDate'), 'DARI SIANG')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingDate'), 'SAMPAI MALAM')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_StartingTime'), 'JAM 1 SIANG')

WebUI.setText(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_AMPM_LeavingTime'), 'JAM 8 MALAM')

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_StartingTimeAMPM'))

WebUI.check(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/AMPM RADIO BUTTON START TIME/RADIO BUTTON START PM AND LEAVE PM/input_AMPM_LeavingTimeAMPM'))

WebUI.click(findTestObject('PARKCALC-OBJECT/Page_Parking Cost Calculator/input_0_Submit'))

WebUI.delay(2)

WebUI.closeBrowser()

```
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)***
#####  ***[BACK to TOP](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#cermati-test-qa)***



# **Q3-API TESTING || Scenario Testing:**

#### [• How many data entries are available for the category - Animals](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#how-many-data-entries-are-available-for-the-category---animals)
#### [• Return the link/URL of any website related to holidays](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#return-the-linkurl-of-any-website-related-to-holidays)


## How many data entries are available for the category - Animals
### Step for API Testing:
```
1. Open POSTMAN APP
2. Login POSTMAN if you have account
3. Click menu workspace
4. Click button Create a new workspace if you don't have a workspace
5. INPUT TEXT:
	- Name workspace
	- Summary
6. Choose Visibility: (Personal, Private, Team, Public)
7. Click button Create workspace
8. Click Button + Create a new collection
9. Click Button + Create a new tab
10. Next Step you can see the Capture "Click Text Link "Click Here for APT Test Capture"
```
#####  ***![Click Here for API Test Capture - ANIMALS](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/1)***
 
#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q3-api-testing--scenario-testing)***

## Return the link/URL of any website related to holidays
### Step for API Testing:
```
1. Open POSTMAN APP
2. Login POSTMAN if you have account
3. Click menu workspace
4. Click button Create a new workspace if you don't have a workspace
5. INPUT TEXT:
	- Name workspace
	- Summary
6. Choose Visibility: (Personal, Private, Team, Public)
7. Click button Create workspace
8. Click Button + Create a new collection
9. Click Button + Create a new tab
10. Next Step you can see the Capture "Click Text Link "Click Here for APT Test Capture"
```

#####  ***![Click Here for API Test Capture - HOLIDAYS](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/4)***

#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q3-api-testing--scenario-testing)***
#####  ***[BACK to TOP](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#cermati-test-qa)***


# **Q4 Positive Test Registration for Cermati Account- Positive Scenarion || Scenario Testing:**

#### [• Registration for Cermati Account](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#registration-for-cermati-account)

## Registration for Cermati Account
#####  ***[KATALON STUDIO AUTOMATION SCRIPT - Registration for Cermati Account](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-registration-for-cermati-account)***
```
1.'OPEN BROWSER'
2.'NAVIGATE TO WEB PAGE REGISTRATION'
3.'MAXIMIZE WINDOW WEB PAGE'
4.'INPUT TEXT EMAIL'
5.'INPUT PASSWORD'
6.'INPUT CONFIRM PASSWORD'
7.'INPUT TEXT FIRST NAME'
8.'INPUT TEXT LAST NAME'
9.'INPUT TEXT MOBILE PHONE NUMBER'
10.'INPUT TEXT RESIDENCE CITY'
11.'CHECK BUTTON AGREEMENT'
12.'CLICK REGISTRATION ACCOUNT BUTTON'
13.'CHECK INBOX EMAIL FOR VERIFY REGISTRATION'
14.'INPUT OTP'
15. 'CLICK B UTTON SUBMIT'

```

#### Script Registration for Cermati Account
#####  _***[GROOVY FILE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/Q4%20-%20Script1638934402444.groovy)***_
```

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


```
#####  ***![Click Here for Regression Test - Registration for Cermati Account](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/5)***
#####  ***![Click Here for Regression Test - CAPTURE VERIFY ACCOUNT REGISTRATION](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/6)***

#####  ***[BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q4-positive-test-registration-for-cermati-account--positive-scenarion--scenario-testing)***
#####  ***[BACK to TOP](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#cermati-test-qa)***
