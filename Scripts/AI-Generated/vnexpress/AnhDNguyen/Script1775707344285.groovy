import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.vnexpress.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1541, 896)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on section topstory"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/section_topstory'))

"Step 3: Click on link baiToanChonDoiTen -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_baiToanChonDoiTen'))

"Step 4: Click on p newsDate"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/p_newsDate'))

"Step 5: Click on link trangChu -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_trangChu'))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('AnhDNguyen_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}