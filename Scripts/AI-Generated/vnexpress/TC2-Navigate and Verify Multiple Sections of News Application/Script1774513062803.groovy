import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.vnexpress.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1512, 796)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link thoiSu -> Navigate to page '/thoi-su'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_thoiSu'))

"Step 3: Click on link hanCheXe -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_thoi_su/link_hanCheXe'))

"Step 4: Click on link kinhDoanh -> Navigate to page '/kinh-doanh'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_kinhDoanh'))

"Step 5: Click on link khoaHocCongNghe -> Navigate to page '/goc-nhin'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh/link_khoaHocCongNghe'))

"Step 6: Click on link spotlight -> Navigate to page '/spotlight'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_goc_nhin/link_spotlight'))

"Step 7: Click on link logo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_spotlight/link_logo'))

"Step 8: Click on link thoiSu -> Navigate to page '/thoi-su'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_home/link_thoiSu'))

"Step 9: Click on link kinhDoanh -> Navigate to page '/kinh-doanh'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_thoi_su/link_kinhDoanh'))

"Step 10: Click on div boxCategory -> Navigate to page '/the-gioi'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_kinh_doanh/div_boxCategory'))

"Step 11: Click on link phanTich -> Navigate to page '/the-gioi/phan-tich'"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_the_gioi/link_phanTich'))

"Step 12: Click on div container -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/vnexpress/Page_the_gioi_phan_tich/div_container'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate and Verify Multiple Sections of News Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}