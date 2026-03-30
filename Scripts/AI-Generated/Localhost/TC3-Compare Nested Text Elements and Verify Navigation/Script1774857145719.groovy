import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Localhost.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1111, 744)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /nested-text-locator-poc with params (clientCode, env)"

TrueTestScripts.navigate("/nested-text-locator-poc", ["clientCode": nested_text_locator_poc_clientCode, "env": nested_text_locator_poc_env])

"Step 2: Click on item compareXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_compareXpath'))

"Step 3: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 4: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 5: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 6: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 7: Click on item nestedTitleOption -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Compare Nested Text Elements and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}