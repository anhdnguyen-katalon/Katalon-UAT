import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Localhost.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1242, 897)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /nested-text-locator-poc"

TrueTestScripts.navigate("/nested-text-locator-poc")

"Step 2: Click on section howToUse"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/section_howToUse'))

"Step 3: Click on link object -> Navigate to page '/iframes'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_object'))

"Step 4: Click on link iframes"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_iframes/link_iframes'))

"Step 5: Click on link object -> Navigate to page '/scenario-toggle'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_iframes/link_object'))

"Step 6: Click on link dynamicIdLocator -> Navigate to page '/dynamic-id-locator'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_scenario_toggle/link_dynamicIdLocator'))

"Step 7: Click on link nestedTextLocatorPoc -> Navigate to page '/nested-text-locator-poc'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_dynamic_id_locator/link_nestedTextLocatorPoc'))

"Step 8: Click on main nestedTextLocatorPoc"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/main_nestedTextLocatorPoc'))

"Step 9: Click on link relationshipManagement"

TrueTestScripts.navigateIfNeeded("/nested-text-locator-poc")

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement_1'))

"Step 10: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement_1'))

"Step 11: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement_1'))

"Step 12: Click on header nestedSubtitle"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/header_nestedSubtitle'))

"Step 13: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement_1'))

"Step 14: Click on div nestedSubtitlePlusTitle"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedSubtitlePlusTitle'))

"Step 15: Click on div nestedTextOnly"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOnly_1'))

"Step 16: Click on item childSpanOnly"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_childSpanOnly'))

"Step 17: Double-click on item childSpanOnly"

WebUI.doubleClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_childSpanOnly'))

"Step 18: Double-click on item directTextOption"

WebUI.doubleClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption_1'))

"Step 19: Double-click on item childSpanOnly"

WebUI.doubleClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_childSpanOnly'))

"Step 20: Click on div targetTitleDescendant"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_targetTitleDescendant'))

"Step 21: Click on code nestedTitleSubtitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_nestedTitleSubtitleOption'))

"Step 22: Click on div nestedTextOnly2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOnly2_1'))

"Step 23: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_object'))

"Step 24: Click on div object -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_object'))

"Step 25: Click on item directTextOption"

TrueTestScripts.navigateIfNeeded("/nested-text-locator-poc-v2")

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_directTextOption'))

"Step 26: Click on item childSpanOnlyNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_childSpanOnlyNestedTextOption'))

"Step 27: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/link_relationshipManagement'))

"Step 28: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_directTextOption'))

"Step 29: Click on item childSpanOnlyNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_childSpanOnlyNestedTextOption'))

"Step 30: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/link_relationshipManagement'))

"Step 31: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_directTextOption'))

"Step 32: Click on item childSpanOnlyNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_childSpanOnlyNestedTextOption'))

"Step 33: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/link_relationshipManagement'))

"Step 34: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_directTextOption'))

"Step 35: Click on item childSpanOnlyNestedTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/item_childSpanOnlyNestedTextOption'))

"Step 36: Click on link relationshipManagement -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_home/link_relationshipManagement'))

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate and Interact with Nested Text Locator Features_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}