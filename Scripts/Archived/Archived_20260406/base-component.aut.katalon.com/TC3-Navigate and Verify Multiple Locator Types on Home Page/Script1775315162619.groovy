import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.base_component_aut_katalon_com.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 896)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link xpathBreakingCharacters -> Navigate to page '/xpath-breaking'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_home/link_xpathBreakingCharacters'))

"Step 3: Click on link unicodeComboBox -> Navigate to page '/unicode-combobox'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_xpath_breaking/link_unicodeComboBox'))

"Step 4: Click on link dynamicIdlocator -> Navigate to page '/dynamic-id-locator'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_unicode_combobox/link_dynamicIdlocator'))

"Step 5: Click on div dynamicIdlocatorIssue"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_dynamic_id_locator/div_dynamicIdlocatorIssue'))

"Step 6: Click on link nestedTextLocatorPoc -> Navigate to page '/nested-text-locator-poc'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_dynamic_id_locator/link_nestedTextLocatorPoc'))

"Step 7: Click on div directTextOnParent"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/div_directTextOnParent'))

"Step 8: Click on item selectDirectTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/item_selectDirectTextOption'))

"Step 9: Click on div nestedTextOnly"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/div_nestedTextOnly'))

"Step 10: Click on div selectNestedTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/div_selectNestedTextOption_1'))

"Step 11: Click on item selectRelationshipManagement"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/item_selectRelationshipManagement_1'))

"Step 12: Click on item selectDirectTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/item_selectDirectTextOption'))

"Step 13: Click on div selectNestedTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/div_selectNestedTextOption_1'))

"Step 14: Click on item selectRelationshipManagement"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/item_selectRelationshipManagement_1'))

"Step 15: Click on item selectDirectTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/item_selectDirectTextOption'))

"Step 16: Click on div selectNestedTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/div_selectNestedTextOption_1'))

"Step 17: Click on item selectRelationshipManagement -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/base-component.aut.katalon.com/Page_nested_text_locator_poc/item_selectRelationshipManagement_1'))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate and Verify Multiple Locator Types on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}