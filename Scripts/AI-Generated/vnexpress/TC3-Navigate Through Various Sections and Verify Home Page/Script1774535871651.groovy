import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.vnexpress.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 897)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link thoiSu -> Navigate to page '/thoi-su'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_thoiSu'))

"Step 3: Navigate to /thoi-su"

TrueTestScripts.navigateIfNeeded("/thoi-su")

"Step 4: Click on link kinhDoanh -> Navigate to page '/kinh-doanh'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_thoi_su/link_kinhDoanh'))

"Step 5: Navigate to /kinh-doanh"

TrueTestScripts.navigateIfNeeded("/kinh-doanh")

"Step 6: Click on link novaland -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh/link_novaland'))

"Step 7: Navigate to /*"

TrueTestScripts.navigateIfNeeded("/${path_param_1}")

"Step 8: Click on link relaxation -> Navigate to page '/thu-gian'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_relaxation'))

"Step 9: Navigate to /thu-gian"

TrueTestScripts.navigateIfNeeded("/thu-gian")

"Step 10: Click on link threeZodiac -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_thu_gian/link_threeZodiac'))

"Step 11: Navigate to /*"

TrueTestScripts.navigateIfNeeded("/${path_param_1}")

"Step 12: Click on link health -> Navigate to page '/suc-khoe'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_health'))

"Step 13: Navigate to /suc-khoe"

TrueTestScripts.navigateIfNeeded("/suc-khoe")

"Step 14: Click on link genderSelection (female)"

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_suc_khoe/link_genderSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_suc_khoe/link_genderSelection', ['link_genderSelection_ATitle_1': link_genderSelection_ATitle, 'link_genderSelection_css_value_1': link_genderSelection_css_value]))

"Step 15: Click on link genderSelection (male)"

// Bind values to the variables in the locators of "AI-Generated/vnexpress/Dynamic Objects/Page_suc_khoe/link_genderSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Dynamic Objects/Page_suc_khoe/link_genderSelection', ['link_genderSelection_ATitle_1': link_genderSelection_ATitle_1, 'link_genderSelection_css_value_1': link_genderSelection_css_value_1]))

"Step 16: Click on link home -> Navigate to page '/the-gioi'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_suc_khoe/link_home'))

"Step 17: Navigate to /the-gioi"

TrueTestScripts.navigateIfNeeded("/the-gioi")

"Step 18: Click on link phanTich -> Navigate to page '/the-gioi/phan-tich'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_the_gioi/link_phanTich'))

"Step 19: Navigate to /the-gioi/phan-tich"

TrueTestScripts.navigateIfNeeded("/the-gioi/phan-tich")

"Step 20: Click on div analysis -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_the_gioi_phan_tich/div_analysis'))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate Through Various Sections and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}