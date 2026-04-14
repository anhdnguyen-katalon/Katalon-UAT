import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.manulife_eclaim.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(732, 795)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matSelect language"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matSelect_language'))

"Step 3: Click on matOption languageEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matOption_languageEnglish'))

"Step 4: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 5: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 6: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 7: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 8: Press key Enter on input periodOfHospitalizationDateInput"

WebUI.sendKeys(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_periodOfHospitalizationDateInput'), Keys.chord(Keys.ENTER))

"Step 9: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_phoneNumber)

"Step 10: Click on input dateInput"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateInput'))

"Step 11: Press key Enter on input dateInputSecondary"

WebUI.sendKeys(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateInputSecondary'), Keys.chord(Keys.ENTER))

"Step 12: Enter input value in input dateInput"

WebUI.setText(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_dateInput'), input_dateInput)

"Step 13: Click on button continue4 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/button_continue4'))

"Step 14: Click on input radioOutpatient"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioOutpatient'))

"Step 15: Click on input radioAccident"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioAccident'))

"Step 16: Click on input selectYesRadio"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_selectYesRadio'))

"Step 17: Click on matIcon calendarDualTextfield"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarDualTextfield'))

"Step 18: Click on matIcon calendarPrevious"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarPrevious'))

"Step 19: Click on span periodOfHospitalizationDateRangeLabel"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_periodOfHospitalizationDateRangeLabel'))

"Step 20: Click on matIcon calendarPrevious"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarPrevious'))

"Step 21: Click on matIcon calendarNext"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarNext'))

"Step 22: Click on matIcon calendarPrevious"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarPrevious'))

"Step 23: Click on input radioNoOption"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioNoOption'))

"Step 24: Click on input radioYesOption"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioNoOption'))

"Step 25: Click on matIcon calendarDualTextfield"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarDualTextfield'))

"Step 26: Click on matIcon calendarPrevious"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarPrevious'))

"Step 27: Click on matIcon calendarNext2"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarNext2'))

"Step 28: Click on matIcon calendarYearView (calendarYearViewIcon)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_calendarYearView"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_calendarYearView', ['matIcon_calendarYearView_InternalTestidClass_1': matIcon_calendarYearView_InternalTestidClass, 'matIcon_calendarYearView_css_value_1': matIcon_calendarYearView_css_value]))

"Step 29: Click on span calendarMonthCell"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarMonthCell'))

"Step 30: Click on matIcon calendarYearView (calendarYearViewIcon2)"

// Bind values to the variables in the locators of "AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_calendarYearView"
WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_calendarYearView', ['matIcon_calendarYearView_InternalTestidClass_1': matIcon_calendarYearView_InternalTestidClass_1, 'matIcon_calendarYearView_css_value_1': matIcon_calendarYearView_css_value_1]))

"Step 31: Click on span calendarMonthCell2"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarMonthCell2'))

"Step 32: Click on matIcon calendarPrevious"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarPrevious'))

"Step 33: Click on span calendarDayCell"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarDayCell'))

"Step 34: Click on span calendarDayCell2"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarDayCell2'))

"Step 35: Click on appQuestionFormInput accidentDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/appQuestionFormInput_accidentDetails'))

"Step 36: Click on matIcon calendarDateAccident"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matIcon_calendarDateAccident'))

"Step 37: Click on span calendarDayCell3"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/span_calendarDayCell3'))

"Step 38: Click on appQuestionFormItem timeDisplay"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/appQuestionFormItem_timeDisplay'))

"Step 39: Click on input radioPm"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioPm'))

"Step 40: Click on input radioAm"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/input_radioPm'))

"Step 41: Click on matRadioGroup dateTime"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matRadioGroup_dateTime'))

"Step 42: Click on matRadioGroup dateTime"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/matRadioGroup_dateTime'))

"Step 43: Click on div claimInformationSection -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/manulife-eclaim/Page_ext_eclaims_submission_ui_id/div_claimInformationSection'))

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Submit eClaims form with English language and hospitalization period accident details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}