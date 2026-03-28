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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Navigate to /"

TrueTestScripts.navigateIfNeeded("/")

"Step 3: Click on button explore"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/button_explore'))

"Step 4: Click on link browseAwsarchitectAssociate -> Navigate to page '/topic/aws-certified-solutions-architect-associate'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_home/link_browseAwsarchitectAssociate'))

"Step 5: Navigate to /topic/aws-certified-solutions-architect-associate"

TrueTestScripts.navigateIfNeeded("/topic/aws-certified-solutions-architect-associate")

"Step 6: Click on link browseAwscertifications"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_aws_certified_solutions_architect_associate/link_browseAwscertifications'))

"Step 7: Click on link browseAwscloudPractitioner -> Navigate to page '/topic/aws-certified-cloud-practitioner'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_aws_certified_solutions_architect_associate/link_browseAwscloudPractitioner'))

"Step 8: Navigate to /topic/aws-certified-cloud-practitioner"

TrueTestScripts.navigateIfNeeded("/topic/aws-certified-cloud-practitioner")

"Step 9: Click on link browseAwsarchitectProfessional -> Navigate to page '/topic/aws-certified-solutions-architect-professional'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_aws_certified_cloud_practitioner/link_browseAwsarchitectProfessional'))

"Step 10: Navigate to /topic/aws-certified-solutions-architect-professional"

TrueTestScripts.navigateIfNeeded("/topic/aws-certified-solutions-architect-professional")

"Step 11: Click on link browseCompTiaPenTest -> Navigate to page '/topic/comptia-pentest'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_aws_certified_solutions_architect_professional/link_browseCompTiaPenTest'))

"Step 12: Navigate to /topic/comptia-pentest"

TrueTestScripts.navigateIfNeeded("/topic/comptia-pentest")

"Step 13: Click on link browseMicrosoftDp203 -> Navigate to page '/topic/microsoft-dp-203'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_comptia_pentest/link_browseMicrosoftDp203'))

"Step 14: Navigate to /topic/microsoft-dp-203"

TrueTestScripts.navigateIfNeeded("/topic/microsoft-dp-203")

"Step 15: Click on main content"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic/main_content'))

"Step 16: Click on button addAllToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic/button_addAllToCart'))

"Step 17: Navigate to /cart"

TrueTestScripts.navigateIfNeeded("/cart")

"Step 18: Click on main object"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_communication_skills/main_object'))

"Step 19: Click on button goToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/udemycom/Page_topic_communication_skills/button_goToCart'))

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Explore and Add Certifications to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}