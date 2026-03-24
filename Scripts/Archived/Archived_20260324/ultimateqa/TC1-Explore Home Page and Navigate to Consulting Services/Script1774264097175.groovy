import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ultimateqa.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 963)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div realWorldOutcomes"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/div_realWorldOutcomes'))

"Step 3: Click on div homePageIntroduction"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/div_homePageIntroduction'))

"Step 4: Click on link projects"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/link_projects'))

"Step 5: Click on link home"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/link_home'))

"Step 6: Click on link caseStudies -> Navigate to page '/case-studies'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/link_caseStudies'))

"Step 7: Click on link caseStudy -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_case_studies/link_caseStudy'))

"Step 8: Click on link aboutPage -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/link_aboutPage'))

"Step 9: Click on div logoWrap"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_about/div_logoWrap'))

"Step 10: Click on link about -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_about/link_about'))

"Step 11: Click on div homePageIntroduction"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/div_homePageIntroduction'))

"Step 12: Click on div homePageIntroduction"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/div_homePageIntroduction'))

"Step 13: Click on header pushHigherQualitySoftware"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/header_pushHigherQualitySoftware'))

"Step 14: Click on div testStrategyConsultation"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/div_testStrategyConsultation'))

"Step 15: Click on image testing -> Navigate to page '/consulting'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_home/image_testing'))

"Step 16: Click on div automatedTesting"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_consulting/div_automatedTesting'))

"Step 17: Click on div consultingResults"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_consulting/div_consultingResults'))

"Step 18: Click on div consultingHighlights (clientFeedback)"

// Bind values to the variables in the locators of "Archived/Archived_20260324/ultimateqa/Dynamic Objects/Page_consulting/div_consultingHighlights"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Dynamic Objects/Page_consulting/div_consultingHighlights', ['div_consultingHighlights_EtBuilderInnerContentDivNthChild_1': div_consultingHighlights_EtBuilderInnerContentDivNthChild, 'div_consultingHighlights_css_value_1': div_consultingHighlights_css_value]))

"Step 19: Click on div npsScore"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_consulting/div_npsScore'))

"Step 20: Click on div consultingHighlights (pushHigherQualitySoftware)"

// Bind values to the variables in the locators of "Archived/Archived_20260324/ultimateqa/Dynamic Objects/Page_consulting/div_consultingHighlights"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Dynamic Objects/Page_consulting/div_consultingHighlights', ['div_consultingHighlights_EtBuilderInnerContentDivNthChild_1': div_consultingHighlights_EtBuilderInnerContentDivNthChild_1, 'div_consultingHighlights_css_value_1': div_consultingHighlights_css_value_1]))

"Step 21: Click on div consultingResults"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_consulting/div_consultingResults'))

"Step 22: Click on div professionalServices -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260324/ultimateqa/Page_consulting/div_professionalServices'))

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Home Page and Navigate to Consulting Services_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}