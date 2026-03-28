import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.udemycom.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1464, 882)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on div fullViewport"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/div_fullViewport'))

"Step 3: Click on div lohpBody"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/div_lohpBody'))

"Step 4: Click on div fullViewport"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/div_fullViewport'))

"Step 5: Click on link timHieuThem -> Navigate to page '/personal-plan'"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/link_timHieuThem'))

"Step 6: Click on link udemyLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_personal_plan/link_udemyLogo'))

"Step 7: Click on link hocAi -> Navigate to page '/topic/artificial-intelligence'"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/link_hocAi'))

"Step 8: Click on link udemyLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_artificial_intelligence/link_udemyLogo'))

"Step 9: Click on button explore"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_explore'))

"Step 10: Click on link udemyLogo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/link_udemyLogo'))

"Step 11: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 12: Click on div fullViewport"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/div_fullViewport'))

"Step 13: Click on button truoc"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_truoc'))

"Step 14: Click on section enrichedSkills"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/section_enrichedSkills'))

"Step 15: Click on div icon -> Navigate to page '/topic/generative-ai'"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/div_icon'))

"Step 16: Click on link udemyLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_generative_ai/link_udemyLogo'))

"Step 17: Click on button tiepTheo2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo2'))

"Step 18: Click on button tiepTheo2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo2'))

"Step 19: Click on button tiepTheo2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo2'))

"Step 20: Click on button truoc2"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_truoc2'))

"Step 21: Click on button truoc2"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_truoc2'))

"Step 22: Click on button tiepTheo2"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo2'))

"Step 23: Click on button tiepTheo2"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo2'))

"Step 24: Click on link udemyLogo"

WebUI.doubleClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/link_udemyLogo'))

"Step 25: Click on link udemyLogo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/link_udemyLogo'))

"Step 26: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 27: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 28: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 29: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 30: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 31: Click on button tiepTheo"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/button_tiepTheo'))

"Step 32: Click on div fullViewport -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/div_fullViewport'))

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate and Explore Topics on Udemy Platform_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}