import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.udemycom.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1365, 963)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on link login -> Navigate to page '/join/passwordless-auth'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_login'))

"Step 3: Click on link logo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_join_passwordless_auth/link_logo'))

"Step 4: Click on div carousel -> Navigate to page '/topic/generative-ai'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_carousel'))

"Step 5: Click on label toggle"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_generative_ai/label_toggle'))

"Step 6: Click on label toggle2"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_generative_ai/label_toggle2'))

"Step 7: Click on label ratings"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_generative_ai/label_ratings'))

"Step 8: Click on button topic"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_generative_ai/button_topic'))

"Step 9: Click on label generativeAi"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_generative_ai/label_generativeAi'))

"Step 10: Click on link instructorTitle -> Navigate to page '/user/aakritielearning'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_generative_ai/link_instructorTitle'))

"Step 11: Click on link logo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_user_aakritielearning/link_logo'))

"Step 12: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/input_search'))

"Step 13: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/udemycom/Page_home/input_search'), input_search)

"Step 14: Press key Enter on input search -> Navigate to page '/courses/search'"

WebUI.sendKeys(findTestObject('AI-Generated/udemycom/Page_home/input_search'), Keys.chord(Keys.ENTER))

"Step 15: Click on link completeCourse"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_courses_search/link_completeCourse'))

"Step 16: Click on button generativeAiforBeginners"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_courses_search/button_generativeAiforBeginners'))

"Step 17: Click on link logo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_courses_search/link_logo'))

"Step 18: Click on image rolePlayInterface"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/image_rolePlayInterface'))

"Step 19: Click on link udemyLogo"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_udemyLogo'))

"Step 20: Click on header desktop"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/header_desktop'))

"Step 21: Click on link completeCourse"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_completeCourse'))

"Step 22: Click on div enrichedSkillsPlaceholder"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_enrichedSkillsPlaceholder'))

"Step 23: Click on div mobileHeader"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/div_mobileHeader'))

"Step 24: Click on section enrichedSkills"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/section_enrichedSkills'))

"Step 25: Click on link chatGpt -> Navigate to page '/topic/chatgpt'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_chatGpt'))

"Step 26: Click on p courseDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_chatgpt/p_courseDescription'))

"Step 27: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_chatgpt/link_home'))

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Generative AI Topics and Courses on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}