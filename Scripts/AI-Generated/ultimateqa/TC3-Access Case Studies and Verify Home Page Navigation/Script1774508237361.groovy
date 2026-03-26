import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ultimateqa.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 450)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div thoughtLeadership"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/div_thoughtLeadership'))

"Step 3: Click on link caseStudies -> Navigate to page '/case-studies'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/link_caseStudies'))

"Step 4: Click on div caseStudies"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_case_studies/div_caseStudies'))

"Step 5: Click on link caseStudy -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_case_studies/link_caseStudy'))

"Step 6: Click on link newsletter"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/link_newsletter'))

"Step 7: Click on div homePageIntroduction"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/div_homePageIntroduction'))

"Step 8: Click on link caseStudies -> Navigate to page '/case-studies'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/link_caseStudies'))

"Step 9: Click on div caseStudies"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_case_studies/div_caseStudies'))

"Step 10: Click on link caseStudy2 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_case_studies/link_caseStudy'))

"Step 11: Click on link seeFullStory -> Navigate to page '/daily-time-savings'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_home/link_seeFullStory'))

"Step 12: Click on link dailyTimeSavings -> Navigate to page '/consulting'"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_daily_time_savings/link_dailyTimeSavings'))

"Step 13: Click on div bestTestAutomationSolutions"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_consulting/div_bestTestAutomationSolutions'))

"Step 14: Click on div consultingContent"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_consulting/div_consultingContent'))

"Step 15: Click on span serviceType (webMobileApiAutomation)"

// Bind values to the variables in the locators of "AI-Generated/ultimateqa/Dynamic Objects/Page_consulting/span_serviceType"
WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Dynamic Objects/Page_consulting/span_serviceType', ['span_serviceType_DivNthChild_1': span_serviceType_DivNthChild, 'span_serviceType_css_value_1': span_serviceType_css_value]))

"Step 16: Click on span serviceType (webDevelopment)"

// Bind values to the variables in the locators of "AI-Generated/ultimateqa/Dynamic Objects/Page_consulting/span_serviceType"
WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Dynamic Objects/Page_consulting/span_serviceType', ['span_serviceType_DivNthChild_1': span_serviceType_DivNthChild_1, 'span_serviceType_css_value_1': span_serviceType_css_value_1]))

"Step 17: Click on div bestTestAutomationSolutions"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_consulting/div_bestTestAutomationSolutions'))

"Step 18: Click on div bestTestAutomationSolutions -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ultimateqa/Page_consulting/div_bestTestAutomationSolutions'))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Access Case Studies and Verify Home Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}