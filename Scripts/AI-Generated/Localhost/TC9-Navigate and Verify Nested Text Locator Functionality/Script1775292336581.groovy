import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Localhost.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1126, 717)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to / with params (clientCode, env)"

TrueTestScripts.navigate("/", ["clientCode": var_clientCode, "env": var_env])

"Step 2: Click on link navigateNestedTextLocatorPoc -> Navigate to page '/nested-text-locator-poc'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/link_navigateNestedTextLocatorPoc'))

"Step 3: Click on item selectDirectTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_selectDirectTextOption'))

"Step 4: Click on div selectNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_selectNestedTextOption'))

"Step 5: Click on item accountsCrm"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_accountsCrm'))

"Step 6: Click on item accountsCrm"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_accountsCrm'))

"Step 7: Click on div selectNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_selectNestedTextOption'))

"Step 8: Click on item selectDirectTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_selectDirectTextOption'))

"Step 9: Click on link dynamicIdlocator -> Navigate to page '/dynamic-id-locator'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_dynamicIdlocator'))

"Step 10: Click on link nestedTextLocatorPoc -> Navigate to page '/nested-text-locator-poc'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_dynamic_id_locator/link_nestedTextLocatorPoc'))

"Step 11: Click on item selectDirectTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_selectDirectTextOption'))

"Step 12: Click on div selectNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_selectNestedTextOption'))

"Step 13: Click on item accountsCrm -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_accountsCrm'))

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Navigate and Verify Nested Text Locator Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}