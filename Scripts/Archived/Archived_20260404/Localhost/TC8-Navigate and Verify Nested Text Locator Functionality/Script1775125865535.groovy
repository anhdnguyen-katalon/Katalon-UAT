import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Localhost.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(800, 636)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /nested-text-locator-poc"

TrueTestScripts.navigate("/nested-text-locator-poc")

"Step 2: Click on link dynamicIdlocator -> Navigate to page '/dynamic-id-locator'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/link_dynamicIdlocator'))

"Step 3: Click on link nestedTextLocatorPoc -> Navigate to page '/nested-text-locator-poc'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_dynamic_id_locator/link_nestedTextLocatorPoc'))

"Step 4: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 5: Click on div nestedTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/div_nestedTextOption_1'))

"Step 6: Click on item accountsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/item_accountsCrm_1'))

"Step 7: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 8: Click on div nestedTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/div_nestedTextOption_1'))

"Step 9: Click on item accountsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/item_accountsCrm_1'))

"Step 10: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 11: Click on div nestedTextOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/div_nestedTextOption_1'))

"Step 12: Click on item accountsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/item_accountsCrm_1'))

"Step 13: Click on header selectedTarget -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260404/Localhost/Page_nested_text_locator_poc/header_selectedTarget'))

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Navigate and Verify Nested Text Locator Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}