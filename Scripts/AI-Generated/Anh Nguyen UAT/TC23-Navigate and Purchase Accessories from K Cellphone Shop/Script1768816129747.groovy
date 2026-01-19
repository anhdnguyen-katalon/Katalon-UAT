import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Anh_Nguyen_UAT.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(663, 883)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /product/*"

TrueTestScripts.navigate("product/${product_id}")

"Step 2: Click on main product"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_product/main_product'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on main product.png')

"Step 3: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_product/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on link kCellphoneShop - Navigate to page .png')

"Step 4: Click on div kCellphoneShop"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on div kCellphoneShop.png')

"Step 5: Click on div kCellphoneShop"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/div_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on div kCellphoneShop.png')

"Step 6: Click on link kCellphoneShopLogo"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_kCellphoneShopLogo'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on link kCellphoneShopLogo.png')

"Step 7: Click on button hamburgerMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/button_hamburgerMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on button hamburgerMenu.png')

"Step 8: Click on link accessories"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_accessories'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on link accessories.png')

"Step 9: Click on link apple -> Navigate to page '/category/accessories-apple'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_home/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Click on link apple - Navigate to page categoryaccessories-apple.png')

"Step 10: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_category_accessories_apple/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on button addToCart.png')

"Step 11: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_category_accessories_apple/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on link placeOrder - Navigate to page cart.png')

"Step 12: Click on div quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_cart/div_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on div quantity.png')

"Step 13: Click on button increaseQuantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_cart/button_increaseQuantity'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on button increaseQuantity.png')

"Step 14: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 15: Click on div logoWrapper"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_checkout_info/div_logoWrapper'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on div logoWrapper.png')

"Step 16: Click on link backToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_checkout_info/link_backToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on link backToCart - Navigate to page cart.png')

"Step 17: Click on link accessoriesFooter -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Anh Nguyen UAT/Page_cart/link_accessoriesFooter'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on link accessoriesFooter - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Navigate and Purchase Accessories from K Cellphone Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}