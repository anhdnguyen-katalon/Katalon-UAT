import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.common.DomClickHelpers
import truetest.manulife_eclaim.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1512, 319)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matSelect language"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matSelect_language'))

"Step 3: Click on matOption english"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matOption_english'))

"Step 4: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 5: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 6: Click on button continue -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 7: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 8: Press key Enter on input phoneNumberInput"

WebUI.sendKeys(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumberInput'), Keys.chord(Keys.ENTER))

"Step 9: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_phoneNumber)

"Step 10: Click on input dateOfBirth"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateOfBirth'))

"Step 11: Press key Enter on input dateInput"

WebUI.sendKeys(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateInput'), Keys.chord(Keys.ENTER))

"Step 12: Enter input value in input dateOfBirth"

WebUI.setText(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateOfBirth'), input_dateOfBirth)

"Step 13: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 14: Click on input radioDisabilityType (outpatientRadio)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioDisabilityType"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioDisabilityType', ['input_radioDisabilityType_InternalLabel_1': input_radioDisabilityType_InternalLabel, 'input_radioDisabilityType_css_value_1': input_radioDisabilityType_css_value]))

"Step 15: Click on input radioMedicalCondition (accidentRadio)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition', ['input_radioMedicalCondition_InternalLabel_1': input_radioMedicalCondition_InternalLabel, 'input_radioMedicalCondition_css_value_1': input_radioMedicalCondition_css_value]))

"Step 16: Click on input radioMedicalCondition (radioMedicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition', ['input_radioMedicalCondition_InternalLabel_1': input_radioMedicalCondition_InternalLabel_1, 'input_radioMedicalCondition_css_value_1': input_radioMedicalCondition_css_value_1]))

"Step 17: Click on input radioMedicalCondition (accidentRadio)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition', ['input_radioMedicalCondition_InternalLabel_1': input_radioMedicalCondition_InternalLabel_2, 'input_radioMedicalCondition_css_value_1': input_radioMedicalCondition_css_value_2]))

"Step 18: Click on input radioDisabilityType (radioDisability)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioDisabilityType"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioDisabilityType', ['input_radioDisabilityType_InternalLabel_1': input_radioDisabilityType_InternalLabel_1, 'input_radioDisabilityType_css_value_1': input_radioDisabilityType_css_value_1]))

"Step 19: Click on input radioDisabilityType (outpatientRadio)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioDisabilityType"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioDisabilityType', ['input_radioDisabilityType_InternalLabel_1': input_radioDisabilityType_InternalLabel_2, 'input_radioDisabilityType_css_value_1': input_radioDisabilityType_css_value_2]))

"Step 20: Click on input radioMedicalCondition (accidentRadio2)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalCondition', ['input_radioMedicalCondition_InternalLabel_1': input_radioMedicalCondition_InternalLabel_3, 'input_radioMedicalCondition_css_value_1': input_radioMedicalCondition_css_value_3]))

"Step 21: Click on input radioYes"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioYes'))

"Step 22: Click on matIcon dateRangeIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_dateRangeIcon'))

"Step 23: Click on matIcon calendarNavigation"

DomClickHelpers.clickByCssFromTestObject(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarNavigation'))

"Step 24: Click on matIcon calendarNavigation"

DomClickHelpers.clickByCssFromTestObject(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarNavigation'))

"Step 25: Click on matIcon calendarMultiYearIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarMultiYearIcon'))

"Step 26: Click on matIcon calendarNavigation"

DomClickHelpers.clickByCssFromTestObject(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarNavigation'))

"Step 27: Click on span calendarDayCell"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarDayCell'))

"Step 28: Click on matIcon calendarMultiYearIcon2"

DomClickHelpers.clickByCssFromTestObject(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarMultiYearIcon2'))

"Step 29: Click on span calendarYearText"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarYearText'))

"Step 30: Click on matIcon calendarMultiYearIcon3"

DomClickHelpers.clickByCssFromTestObject(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarMultiYearIcon3'))

"Step 31: Click on span calendarMonthText"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarMonthText'))

"Step 32: Click on label creditDebitExpiry"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/label_creditDebitExpiry'))

"Step 33: Click on matIcon calendarMultiYearIcon4"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarMultiYearIcon4'))

"Step 34: Click on span calendarDayText (calendarDayText)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDayText"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDayText', ['span_calendarDayText_CdsCalendarItemNthChild_1': span_calendarDayText_CdsCalendarItemNthChild, 'span_calendarDayText_css_value_1': span_calendarDayText_css_value]))

"Step 35: Click on input radioRoadTrafficAccident"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioRoadTrafficAccident'))

"Step 36: Click on div yesNoOptions -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/div_yesNoOptions'))

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Complete Ext Eclaims Submission Form for Disability and Road Traffic Accident Claim_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}