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
	WebUI.setViewPortSize(885, 713)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link dynamicObject (viewDetails) -> Navigate to page '/*'"

// Bind values to the variables in the locators of "Archived/Archived_20260116/Anh Nguyen UAT/Dynamic Objects/Page_home/link_dynamicObject"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Dynamic Objects/Page_home/link_dynamicObject', ['link_dynamicObject_AInternalText_1': link_dynamicObject_AInternalText]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link dynamicObject viewDetails - Navigate to page .png')

"Step 3: Click on link business -> Navigate to page '/kinh-doanh'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_home/link_business'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link business - Navigate to page kinh-doanh.png')

"Step 4: Click on link propertyDetails -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_kinh_doanh/link_propertyDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link propertyDetails - Navigate to page .png')

"Step 5: Click on link vnExpress -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_home/link_vnExpress'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link vnExpress - Navigate to page .png')

"Step 6: Click on link dynamicObject (thuTuongNghienCuu) -> Navigate to page '/*'"

// Bind values to the variables in the locators of "Archived/Archived_20260116/Anh Nguyen UAT/Dynamic Objects/Page_home/link_dynamicObject"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Dynamic Objects/Page_home/link_dynamicObject', ['link_dynamicObject_AInternalText_1': link_dynamicObject_AInternalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link dynamicObject thuTuongNghienCuu - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate through Dynamic Links and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}