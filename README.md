# **CERMATI-Test-QA**
* [Q1-Create-Edit-and-Delete-Public-Gits](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#scenario-testing) 
#gh-dark-mode-only ***![This is an image](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/2)***
* [Regression Test Capture](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/2)


* [Q2-Find BUG and Mention all necessary fields](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)
* [Regression Test Capture](https://github.com/WISNUARWR/CERMATI-Test-QA/issues/3)


# **Q1-Create-Edit-and-Delete-Public-Gits || Scenario Testing:**
* [•	As a user GITHUB, I want to create a public gist.](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#create-a-new-public-gist)
* [•	As a user GITHUB, I want to edit an existing gist.](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#edit-public-gist-existing)
* [•	As a user GITHUB, I want to delete an existing gist.](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#delete-public-gist-existing)


## End to End (e2e) Step:
## CREATE a New Public Gist
* [KATALON STUDIO AUTOMATION SCRIPT - Create](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-create-a-new-gist-katalon-studio-automation-script)
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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)

#### Script Create a new gist (KATALON STUDIO AUTOMATION SCRIPT)

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)

## EDIT Public Gist Existing
* [KATALON STUDIO AUTOMATION SCRIPT - Edit](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-edit-gist-existing-katalon-studio-automation-script)

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)

#### Script Edit gist existing (KATALON STUDIO AUTOMATION SCRIPT)

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)


## DELETE Public Gist Existing
* [KATALON STUDIO AUTOMATION SCRIPT - Delete](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-delete-gist-existing-katalon-studio-automation-script)

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)

#### Script Delete gist existing (KATALON STUDIO AUTOMATION SCRIPT)

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q1-create-edit-and-delete-public-gits--scenario-testing)
* [BACK to TOP](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#cermati-test-qa)



# **Q2-Find BUG and Mention all necessary fields ||Scenario Testing:**
* [• Test Case "MANDATORY TEST - Input text null"](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#text-case--mandatory-test---input-text-null--bug-because-passed)
* [• Input text SPACE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#text-case--mandatory-test---input-text-space-bug-because-passed)
* [• Input text another format](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#text-case--mandatory-test---input-text-another-format-bug-because-passed)



## Text Case  "MANDATORY TEST - INPUT TEXT NULL"  ***BUG because PASSED***
* [KATALON STUDIO AUTOMATION SCRIPT - MANDATORY TEST - INPUT TEXT NULL](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-mandatory-test---input-text-null)


#### Necessary fields which should be included in a bug.
```
• For Parameter Date and Time Start or Leave, should be MANDATORY and DISABLE Input Text.
```

#### SCRIPT MANDATORY TEST - INPUT TEXT NULL 

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)



## Text Case  "MANDATORY TEST - Input text SPACE" ***BUG because PASSED***
* [KATALON STUDIO AUTOMATION SCRIPT - MANDATORY TEST - Input text SPACE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-mandatory-test---input-text-space)


#### Necessary fields which should be included in a bug.
```
• For Parameter Date and Time Start or Leave, should be MANDATORY and DISABLE Input Text.
***OR***
• For Parameter Date and Time Start or Leave, should be VALIDATION for appropriate format.
```

#### SCRIPT MANDATORY TEST - Input text SPACE

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)


## Text Case  "MANDATORY TEST - Input text another format" ***BUG because PASSED***
* [KATALON STUDIO AUTOMATION SCRIPT - MANDATORY TEST - Input text SPACE](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#script-mandatory-test---input-text-another-format)

#### Necessary fields which should be included in a bug.
```
• For Parameter Date and Time Start or Leave, should be MANDATORY and DISABLE Input Text.
***OR***
• For Parameter Date and Time Start or Leave, should be VALIDATION for appropriate format.
• For Parameter Date and Time Start or Leave, there should be Pop Up Notification "MANDATORY and appropriate format".
```

#### SCRIPT MANDATORY TEST - Input text another format

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
* [BACK to Scenario](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#q2-find-bug-and-mention-all-necessary-fields-scenario-testing)
* [BACK to TOP](https://github.com/WISNUARWR/CERMATI-Test-QA/blob/main/README.md#cermati-test-qa)





