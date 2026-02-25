import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.oneshield.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(907, 702)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /oneshield/sso with params (osst)"

TrueTestScripts.navigate("oneshield/sso", ["osst": sso_osst])

"Step 2: Click on div transactionInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_transactionInfo'))

"Step 3: Click on div navigationMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_navigationMenu'))

"Step 4: Click on link closeMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/link_closeMessage'))

"Step 5: Click on link newQuote"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/link_newQuote'))

"Step 6: Click on link directBusiness"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/link_directBusiness'))

"Step 7: Click on link newCustomer"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/link_newCustomer'))

"Step 8: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_object'))

"Step 9: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_object'))

"Step 10: Click on div riskAddressDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_riskAddressDetails'))

"Step 11: Click on input customerType"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType'))

"Step 12: Click on input customerType"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType'))

"Step 13: Enter input value in input customerType2"

WebUI.setText(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'), input_customerType2)

"Step 14: Click on input customerType2"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 15: Click on div usernameTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_usernameTrigger'))

"Step 16: Click on div addNewCustomer"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_addNewCustomer'))

"Step 17: Click on input customerType2"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 18: Click on div usernameTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_usernameTrigger'))

"Step 19: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 20: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 21: Click on div addNewCustomerTitle"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_addNewCustomerTitle'))

"Step 22: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 23: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 24: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 25: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 26: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 27: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 28: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 29: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 30: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 31: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 32: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 33: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 34: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 35: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 36: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 37: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 38: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 39: Click on label customerType"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/label_customerType'))

"Step 40: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 41: Click on div addNewCustomerHeader"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_addNewCustomerHeader'))

"Step 42: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 43: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 44: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 45: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 46: Click on div businessTypeTrigger2"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger2'))

"Step 47: Click on div riskAddressDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_riskAddressDetails'))

"Step 48: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 49: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 50: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 51: Click on div customerTypeSection"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_customerTypeSection'))

"Step 52: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 53: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 54: Click on td object"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/td_object'))

"Step 55: Click on div businessTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 56: Click on item accountTypes (businessOption)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes', ['item_accountTypes_css_value_1': item_accountTypes_css_value_1]))

"Step 57: Click on div customerTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_customerTypeTrigger'))

"Step 58: Click on item accountTypes (corporationOption)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes', ['item_accountTypes_css_value_2': item_accountTypes_css_value_2]))

"Step 59: Click on div customerTypeTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_customerTypeTrigger'))

"Step 60: Click on item other"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/item_other'))

"Step 61: Click on input businessType"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_businessType'))

"Step 62: Enter input value in input businessType"

WebUI.setText(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_businessType'), input_businessType)

"Step 63: Click on div riskDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_riskDetails'))

"Step 64: Click on input customerType4"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType4'))

"Step 65: Enter input value in input customerType3"

WebUI.setText(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'), input_customerType3)

"Step 66: Press key Enter on input customerType3"

WebUI.sendKeys(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'), Keys.chord(Keys.ENTER))

"Step 67: Click on div riskAddressDetailsHeader"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_riskAddressDetailsHeader'))

"Step 68: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_email'))

"Step 69: Click on input personalInformation (firstName)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation', ['input_personalInformation_InternalLabel_1': input_personalInformation_InternalLabel_1, 'input_personalInformation_css_value_1': input_personalInformation_css_value_1]))

"Step 70: Enter input value in input personalInformation (firstNameRequired)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation"
WebUI.setText(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation', ['input_personalInformation_InternalLabel_4': input_personalInformation_InternalLabel_4, 'input_personalInformation_css_value_2': input_personalInformation_css_value_2]), input_personalInformation)

"Step 71: Click on td object"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/td_object'))

"Step 72: Click on input personalInformation (lastName)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation', ['input_personalInformation_InternalLabel_7': input_personalInformation_InternalLabel_7, 'input_personalInformation_css_value_3': input_personalInformation_css_value_3]))

"Step 73: Enter input value in input personalInformation (lastName2)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation"
WebUI.setText(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation', ['input_personalInformation_InternalLabel_10': input_personalInformation_InternalLabel_10, 'input_personalInformation_css_value_4': input_personalInformation_css_value_4]), input_personalInformation_1)

"Step 74: Click on input customerType4"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType4'))

"Step 75: Click on td object2"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/td_object2'))

"Step 76: Click on input customerType4"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType4'))

"Step 77: Click on item select"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/item_select'))

"Step 78: Click on input customerType3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/input_customerType2'))

"Step 79: Click on div businessTypeTrigger2"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger2'))

"Step 80: Click on item accountTypes (individualOption)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes', ['item_accountTypes_css_value_3': item_accountTypes_css_value_3]))

"Step 81: Click on div businessTypeTrigger3"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_businessTypeTrigger'))

"Step 82: Click on item accountTypes (addressOption)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/item_accountTypes', ['item_accountTypes_css_value_4': item_accountTypes_css_value_4]))

"Step 83: Click on div riskAddressDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_riskAddressDetails'))

"Step 84: Click on label registration"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/label_registration'))

"Step 85: Click on input personalInformation (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Dynamic Objects/Page_oneshield_sso/input_personalInformation', ['input_personalInformation_InternalLabel_13': input_personalInformation_InternalLabel_13, 'input_personalInformation_css_value_5': input_personalInformation_css_value_5]))

"Step 86: Click on div backNext"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/div_backNext'))

"Step 87: Click on link back -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/oneshield/Page_oneshield_sso/link_back'))

"Step 88: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Create New Customer and Navigate through Business Type Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}