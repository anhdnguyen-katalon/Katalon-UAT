import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.udemycom.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 897)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to / with params (funnel, gad campaignid, gad source, gbraid, gclid, portfolio, test, utm audience, utm campaign, utm content, utm medium, utm source, utm tactic, utm term)"

TrueTestScripts.navigate("/", ["funnel": var_funnel, "gad_campaignid": var_gad_campaignid, "gad_source": var_gad_source, "gbraid": var_gbraid, "gclid": var_gclid, "portfolio": var_portfolio, "test": var_test, "utm_audience": var_utm_audience, "utm_campaign": var_utm_campaign, "utm_content": var_utm_content, "utm_medium": var_utm_medium, "utm_source": var_utm_source, "utm_tactic": var_utm_tactic, "utm_term": var_utm_term])

"Step 2: Click on link promptEngineering -> Navigate to page '/topic/prompt-engineering'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_home/link_promptEngineering'))

"Step 3: Click on link largeLanguageModels -> Navigate to page '/topic/large-language-models'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_prompt_engineering/link_largeLanguageModels'))

"Step 4: Click on main largeLanguageModels"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_large_language_models/main_largeLanguageModels'))

"Step 5: Click on main largeLanguageModels2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_large_language_models/main_largeLanguageModels2'))

"Step 6: Click on main largeLanguageModels3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_large_language_models/main_largeLanguageModels3'))

"Step 7: Click on label ratings"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_large_language_models/label_ratings'))

"Step 8: Click on link generativeAi -> Navigate to page '/topic/generative-ai'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_large_language_models/link_generativeAi'))

"Step 9: Click on main generativeAi"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_generative_ai/main_generativeAi'))

"Step 10: Click on main generativeAi"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_generative_ai/main_generativeAi'))

"Step 11: Click on header generativeAi"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_generative_ai/header_generativeAi'))

"Step 12: Click on main generativeAi -> Navigate to page '/mobile'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260328/udemycom/Page_topic_generative_ai/main_generativeAi'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Explore Topics Related to Prompt Engineering and Generative AI_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}