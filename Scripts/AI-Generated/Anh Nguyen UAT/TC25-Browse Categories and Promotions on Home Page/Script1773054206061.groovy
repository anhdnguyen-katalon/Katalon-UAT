import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Anh_Nguyen_UAT.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 882)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on div quicklinks"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_quicklinks'))

"Step 3: Click on input freeship"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/input_freeship'))

"Step 4: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_object'))

"Step 5: Click on link nhaSachTiki -> Navigate to page '/nha-sach-tiki/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_nhaSachTiki'))

"Step 6: Click on div categoryExplore"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_nha_sach_tiki/div_categoryExplore'))

"Step 7: Click on div categoryExplore"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_nha_sach_tiki/div_categoryExplore'))

"Step 8: Click on link dienGiaDung -> Navigate to page '/dien-gia-dung/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_nha_sach_tiki/link_dienGiaDung'))

"Step 9: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/input_search'))

"Step 10: Click on link searchSuggestion -> Navigate to page '/san-pham-so/the-cao-dien-thoai'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/link_searchSuggestion'))

"Step 11: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_san_pham_so_the_cao_dien_thoai/button_close'))

"Step 12: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_san_pham_so_the_cao_dien_thoai/button_close'))

"Step 13: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_san_pham_so_the_cao_dien_thoai/button_close'))

"Step 14: Click on div loginModal -> Navigate to page '/dien-gia-dung/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_san_pham_so_the_cao_dien_thoai/div_loginModal'))

"Step 15: Click on div productDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/div_productDetails'))

"Step 16: Click on div companyInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/div_companyInfo'))

"Step 17: Click on div viewMore"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/div_viewMore'))

"Step 18: Click on div exploreCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/div_exploreCategories'))

"Step 19: Click on link tikiLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_dien_gia_dung/link_tikiLogo'))

"Step 20: Click on div tikiVippromotion"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_tikiVippromotion'))

"Step 21: Click on div object2"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_object2'))

"Step 22: Click on link sportsCategory -> Navigate to page '/the-thao-da-ngoai/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_sportsCategory'))

"Step 23: Click on div exploreByCategory"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_the_thao_da_ngoai/div_exploreByCategory'))

"Step 24: Click on link freeshipPromotion -> Navigate to page '/khuyen-mai/ngay-hoi-freeship'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_the_thao_da_ngoai/link_freeshipPromotion'))

"Step 25: Click on link tikiLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_khuyen_mai_ngay_hoi_freeship/link_tikiLogo'))

"Step 26: Click on div categoryList"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_categoryList'))

"Step 27: Click on link promiseDetails -> Navigate to page '/thong-tin/tiki-doi-tra-de-dang-an-tam-mua-sam'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_promiseDetails'))

"Step 28: Click on link tikiLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_thong_tin_tiki_doi_tra_de_dang_an_tam_mua_sam/link_tikiLogo'))

"Step 29: Click on div categoryList"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_categoryList'))

"Step 30: Click on main home"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/main_home'))

"Step 31: Click on link tikiLogo"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_tikiLogo'))

"Step 32: Click on link nhaSachTiki"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_nhaSachTiki'))

"Step 33: Click on link nhaSachTiki -> Navigate to page '/nha-sach-tiki/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_nhaSachTiki'))

"Step 34: Click on link tikiLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_nha_sach_tiki/link_tikiLogo'))

"Step 35: Click on link bachHoaOnline -> Navigate to page '/bach-hoa-online/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_bachHoaOnline'))

"Step 36: Click on div breadcrumb"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_bach_hoa_online/div_breadcrumb'))

"Step 37: Click on div exploreCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_bach_hoa_online/div_exploreCategories'))

"Step 38: Click on div breadcrumb"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_bach_hoa_online/div_breadcrumb'))

"Step 39: Click on div breadcrumb"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_bach_hoa_online/div_breadcrumb'))

"Step 40: Click on link tikiLogo -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_bach_hoa_online/link_tikiLogo'))

"Step 41: Click on div mainMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_mainMenu'))

"Step 42: Click on div categoryList2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_categoryList2'))

"Step 43: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Browse Categories and Promotions on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}