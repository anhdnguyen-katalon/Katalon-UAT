import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ultimateqa.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1512, 349)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div pushHigherQualitySoftware"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/div_pushHigherQualitySoftware'))

"Step 3: Click on div newGoldStandardQa"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/div_newGoldStandardQa'))

"Step 4: Click on span servicePromotion (getCustomQuote)"

// Bind values to the variables in the locators of "AI-Generated/ultimateqa/Dynamic Objects/Page_home/span_servicePromotion"
WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Dynamic Objects/Page_home/span_servicePromotion', ['span_servicePromotion_Key_1': span_servicePromotion_Key, 'span_servicePromotion_css_value_1': span_servicePromotion_css_value]))

"Step 5: Click on div scheduleFreeDiscoverySession"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/div_scheduleFreeDiscoverySession'))

"Step 6: Click on span servicePromotion (getHigherQualitySoftware)"

// Bind values to the variables in the locators of "AI-Generated/ultimateqa/Dynamic Objects/Page_home/span_servicePromotion"
WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Dynamic Objects/Page_home/span_servicePromotion', ['span_servicePromotion_Key_1': span_servicePromotion_Key_1, 'span_servicePromotion_css_value_1': span_servicePromotion_css_value_1]))

"Step 7: Click on div homeSection"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/div_homeSection'))

"Step 8: Click on header pushHigherQualitySoftware"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/header_pushHigherQualitySoftware'))

"Step 9: Click on link seeFullStory -> Navigate to page '/daily-time-savings'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/link_seeFullStory'))

"Step 10: Click on link dailyTimeSavings -> Navigate to page '/consulting'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_daily_time_savings/link_dailyTimeSavings'))

"Step 11: Click on div consultingRow -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_consulting/div_consultingRow'))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Services and Verify Home Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}