import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Anh_Nguyen_UAT.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 963)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on html home"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/html_home'))

"Step 3: Click on footer home"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/footer_home'))

"Step 4: Click on html home"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/html_home'))

"Step 5: Click on div homeDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_homeDescription'))

"Step 6: Click on html home"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/html_home'))

"Step 7: Click on html home"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/html_home'))

"Step 8: Click on link katalonStudio -> Navigate to page '/katalon-studio'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_katalonStudio'))

"Step 9: Click on link manualTesting -> Navigate to page '/testops'"

TrueTestScripts.navigateIfNeeded("/katalon-studio")

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_katalon_studio/link_manualTesting'))

"Step 10: Click on link testManagement -> Navigate to page '/resources-center/blog'"

TrueTestScripts.navigateIfNeeded("/testops")

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_testops/link_testManagement'))

"Step 11: Click on div blogHeader"

TrueTestScripts.navigateIfNeeded("/testops")

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_resources_center_blog/div_blogHeader'))

"Step 12: Click on main blogContent -> Navigate to page ''"

TrueTestScripts.navigateIfNeeded("/resources-center/blog")

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_resources_center_blog/main_blogContent'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Navigate and Verify Home Page and Related Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}