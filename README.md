# CERMATI-Test-QA
* [Q1-Create-Edit-and-Delete-Public-Gits](https://github.com/WISNUARWR/Q1-Create-Edit-and-Delete-Public-Gits)

## Scenario Testing:
```
•	As a user, I want to create a public gist.
•	As a user, I want to edit an existing gist.
•	As a user, I want to delete an existing gist.
```

## End to End (e2e) Step:

## CREATE a New Public Gist
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

### Script Create a new gist (KATALON STUDIO AUTOMATION SCRIPT)
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

## EDIT Public Gist Existing
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

### Script Edit gist existing (KATALON STUDIO AUTOMATION SCRIPT)
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
## DELETE Public Gist Existing
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
### Script Delete gist existing (KATALON STUDIO AUTOMATION SCRIPT)
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








