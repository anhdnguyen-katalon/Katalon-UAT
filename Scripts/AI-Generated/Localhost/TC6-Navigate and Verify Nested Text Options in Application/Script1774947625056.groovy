import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Localhost.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1378, 897)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /nested-text-locator-poc with params (clientCode, env)"

TrueTestScripts.navigate("/nested-text-locator-poc", ["clientCode": nested_text_locator_poc_clientCode, "env": nested_text_locator_poc_env])

"Step 2: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 3: Click on header howToUseThisPage"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/header_howToUseThisPage'))

"Step 4: Click on div nestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOption'))

"Step 5: Click on item relationshipManagementOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_relationshipManagementOption'))

"Step 6: Click on item relationshipManagementOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_relationshipManagementOption'))

"Step 7: Click on item relationshipManagementOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_relationshipManagementOption'))

"Step 8: Click on item relationshipManagementOption -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_relationshipManagementOption'))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Navigate and Verify Nested Text Options in Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}