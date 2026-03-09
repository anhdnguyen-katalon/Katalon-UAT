import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.vnexpress.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1339, 882)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on section topStories (topStory)"

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_1': section_topStories_css_value]), Keys.chord(Keys.CONTROL))

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_1': section_topStories_css_value]))

"Step 3: Click on section topStories (topStory)"

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_1': section_topStories_css_value_1]), Keys.chord(Keys.CONTROL))

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_1': section_topStories_css_value_1]))

"Step 4: Click on link logo"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_logo'))

"Step 5: Click on link itemBoTruong"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_itemBoTruong'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_itemBoTruong'))

"Step 6: Click on header topHeader"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/header_topHeader'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/header_topHeader'))

"Step 7: Click on section topStories (boTruong)"

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_3': section_topStories_css_value_2]), Keys.chord(Keys.CONTROL))

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_3': section_topStories_css_value_2]))

"Step 8: Click on link itemLoatMay"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_itemLoatMay'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_itemLoatMay'))

"Step 9: Click on link itemDanQuan"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_itemDanQuan'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_itemDanQuan'))

"Step 10: Click on link itemSucKhoe"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_itemSucKhoe'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_itemSucKhoe'))

"Step 11: Click on link scrollToTop"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_scrollToTop'))

"Step 12: Click on link scrollToTop"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_scrollToTop'))

"Step 13: Click on html object"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/html_object'))

"Step 14: Click on link scrollToTop2"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_scrollToTop2'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_scrollToTop2'))

"Step 15: Click on link itemMoiNhat"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_itemMoiNhat'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_itemMoiNhat'))

"Step 16: Click on link logo2"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/link_logo2'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_logo2'))

"Step 17: Click on section topStories (topStory2)"

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_4': section_topStories_css_value_3]), Keys.chord(Keys.CONTROL))

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories"
WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_home/section_topStories', ['section_topStories_css_value_4': section_topStories_css_value_3]))

"Step 18: Click on section streamHome"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/section_streamHome'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/section_streamHome'))

"Step 19: Click on body darkTheme"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/body_darkTheme'))

"Step 20: Click on section photo"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/section_photo'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/section_photo'))

"Step 21: Click on section photo -> Navigate to page ''"

WebUI.sendKeys(findTestObject('AI-Generated/vnexpress/Page_home/section_photo'), Keys.chord(Keys.CONTROL))

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/section_photo'))

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Explore Top Stories on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}