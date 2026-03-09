import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.udemycom.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1160, 882)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on section enrichedSkills"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/section_enrichedSkills'))

"Step 3: Click on div placeholder"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_placeholder'))

"Step 4: Click on div placeholder"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_placeholder'))

"Step 5: Click on div enrichedSkillsDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_enrichedSkillsDescription'))

"Step 6: Click on link dataScienceTopic -> Navigate to page '/topic/data-science'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_dataScienceTopic'))

"Step 7: Click on link udemyLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_data_science/link_udemyLogo'))

"Step 8: Click on div trendingSkills"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_trendingSkills'))

"Step 9: Click on div businessIntelligence"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_businessIntelligence'))

"Step 10: Click on link udemyLogo"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_udemyLogo'))

"Step 11: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 12: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 13: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 14: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 15: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 16: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 17: Click on button follow"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_follow'))

"Step 18: Click on section enrichedSkills2"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/section_enrichedSkills2'))

"Step 19: Click on link object -> Navigate to page '/topic/autocad'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_object'))

"Step 20: Click on link udemyLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_autocad/link_udemyLogo'))

"Step 21: Click on div placeholder -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_placeholder'))

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Enriched Skills and Follow Topics on Learning Platform_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}