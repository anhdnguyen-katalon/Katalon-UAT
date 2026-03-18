import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.base_component_aut_katalon_com.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1133, 796)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div basic"

WebUI.enhancedClick(findTestObject('AI-Generated/base-component.aut.katalon.com/Page_home/div_basic'))

"Step 3: Click on div basic"

WebUI.enhancedClick(findTestObject('AI-Generated/base-component.aut.katalon.com/Page_home/div_basic'))

"Step 4: Click on header advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/base-component.aut.katalon.com/Page_home/header_advanced'))

"Step 5: Click on list nativeHtmlElements"

WebUI.enhancedClick(findTestObject('AI-Generated/base-component.aut.katalon.com/Page_home/list_nativeHtmlElements'))

"Step 6: Click on link tables -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/base-component.aut.katalon.com/Page_home/link_tables'))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-anhdnguyen-manual-tc_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}