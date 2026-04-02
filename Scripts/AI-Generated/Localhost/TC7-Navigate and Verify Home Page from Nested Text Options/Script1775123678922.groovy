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

"Step 2: Click on item accountsCrm"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_accountsCrm'))

"Step 3: Click on div nestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOption'))

"Step 4: Click on div nestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOption'))

"Step 5: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 6: Click on item directTextOption -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Navigate and Verify Home Page from Nested Text Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}