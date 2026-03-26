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

"Step 1: Navigate to /vne-go"

TrueTestScripts.navigate("/vne-go")

"Step 2: Click on link vnExpress -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_vne_go/link_vnExpress'))

"Step 3: Navigate to /"

TrueTestScripts.navigateIfNeeded("/")

"Step 4: Click on link international -> Navigate to page '/kinh-doanh/quoc-te'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_international'))

"Step 5: Navigate to /kinh-doanh/quoc-te"

TrueTestScripts.navigateIfNeeded("/kinh-doanh/quoc-te")

"Step 6: Click on header interestRate"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh_quoc_te/header_interestRate'))

"Step 7: Click on link addToCart -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh_quoc_te/link_addToCart'))

"Step 8: Navigate to /*"

TrueTestScripts.navigateIfNeeded("/${path_param_1}")

"Step 9: Click on link business -> Navigate to page '/kinh-doanh'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_business'))

"Step 10: Navigate to /kinh-doanh"

TrueTestScripts.navigateIfNeeded("/kinh-doanh")

"Step 11: Click on header investmentTitle"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh/header_investmentTitle'))

"Step 12: Click on link myMoney -> Navigate to page '/kinh-doanh/tien-cua-toi'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh/link_myMoney'))

"Step 13: Navigate to /kinh-doanh/tien-cua-toi"

TrueTestScripts.navigateIfNeeded("/kinh-doanh/tien-cua-toi")

"Step 14: Click on link goods -> Navigate to page '/kinh-doanh/hang-hoa'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh_tien_cua_toi/link_goods'))

"Step 15: Navigate to /kinh-doanh/hang-hoa"

TrueTestScripts.navigateIfNeeded("/kinh-doanh/hang-hoa")

"Step 16: Click on link economyRegion -> Navigate to page '/the-gioi'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh_hang_hoa/link_economyRegion'))

"Step 17: Navigate to /the-gioi"

TrueTestScripts.navigateIfNeeded("/the-gioi")

"Step 18: Click on link transferInfo -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_the_gioi/link_transferInfo'))

"Step 19: Navigate to /*"

TrueTestScripts.navigateIfNeeded("/${path_param_1}")

"Step 20: Click on p natoStatement -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/p_natoStatement'))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Explore Business and Economy Sections on News Portal_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}