import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.manulife_eclaim.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(838, 963)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matSelect language"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matSelect_language'))

"Step 3: Click on matOption english"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matOption_english'))

"Step 4: Click on matIcon object"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 5: Click on button ok"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 6: Click on button continue -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 7: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 8: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_phoneNumber)

"Step 9: Click on div customerContactCenter"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/div_customerContactCenter'))

"Step 10: Click on input dateOfBirth"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateOfBirth'))

"Step 11: Enter input value in input dateOfBirth"

WebUI.setText(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateOfBirth'), input_dateOfBirth)

"Step 12: Click on div policyHolderDobText"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/div_policyHolderDobText'))

"Step 13: Click on div policyHolderDobField"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/div_policyHolderDobField'))

"Step 14: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 15: Click on input outpatientRadio"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_outpatientRadio'))

"Step 16: Click on input accidentRadio"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_accidentRadio'))

"Step 17: Click on input yesRadio"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_yesRadio'))

"Step 18: Click on matIcon object2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_object2'))

"Step 19: Click on matIcon object3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_object3'))

"Step 20: Click on span calendarItemDay"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarItemDay'))

"Step 21: Click on span calendarDay"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarDay'))

"Step 22: Click on div claimEventSection"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/div_claimEventSection'))

"Step 23: Click on matRadioGroup claimCauseRadioGroup -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260414/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matRadioGroup_claimCauseRadioGroup'))

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Submit Ext Eclaims form with language selection and claim details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}