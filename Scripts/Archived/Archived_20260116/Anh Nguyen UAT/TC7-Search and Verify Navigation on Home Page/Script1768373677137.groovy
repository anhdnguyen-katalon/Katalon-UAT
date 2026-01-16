import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Anh_Nguyen_UAT.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1440, 703)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link showAll"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_home/link_showAll'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link showAll.png')

"Step 3: Click on link spotlight -> Navigate to page '/spotlight'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_home/link_spotlight'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on link spotlight - Navigate to page spotlight.png')

"Step 4: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_spotlight/button_search'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on button search.png')

"Step 5: Click on input search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_spotlight/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on input search.png')

"Step 6: Enter input value in input search"

WebUI.setText(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_spotlight/input_search'), input_search)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Enter input value in input search.png')

"Step 7: Press key Enter on input search"

WebUI.sendKeys(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_spotlight/input_search'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Press key Enter on input search.png')

"Step 8: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_spotlight/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on link home - Navigate to page .png')

"Step 9: Click on link showAll"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_home/link_showAll'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on link showAll.png')

"Step 10: Click on link moiNhat -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260116/Anh Nguyen UAT/Page_home/link_moiNhat'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on link moiNhat - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Search and Verify Navigation on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}