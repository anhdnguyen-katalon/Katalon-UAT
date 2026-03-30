import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Localhost.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1111, 911)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /nested-text-locator-poc with params (clientCode, env)"

TrueTestScripts.navigate("/nested-text-locator-poc", ["clientCode": nested_text_locator_poc_clientCode, "env": nested_text_locator_poc_env])

"Step 2: Click on div directTextOnParent3"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_directTextOnParent3'))

"Step 3: Click on div directTextOnParent"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_directTextOnParent'))

"Step 4: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 5: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 6: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 7: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 8: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 9: Click on div directTextOnParent2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_directTextOnParent'))

"Step 10: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 11: Click on p lastClickedScenario"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_lastClickedScenario'))

"Step 12: Click on span normalizedDescendantTextPredicate"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/span_normalizedDescendantTextPredicate'))

"Step 13: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 14: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 15: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 16: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 17: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 18: Click on div nestedTextOnly"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOnly'))

"Step 19: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 20: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 21: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 22: Click on p nestedTitleSubtitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_nestedTitleSubtitleOption'))

"Step 23: Click on span roleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/span_roleOption'))

"Step 24: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 25: Click on p controlCaseText"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_controlCaseText'))

"Step 26: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 27: Double-click on p primaryRepro"

WebUI.doubleClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_primaryRepro'))

"Step 28: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 29: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 30: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 31: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 32: Click on div nestedTextOnly"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOnly'))

"Step 33: Click on item openPageInstruction"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_openPageInstruction'))

"Step 34: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 35: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 36: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 37: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 38: Click on header capturedObjects"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/header_capturedObjects'))

"Step 39: Click on header howToUseThisPage"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/header_howToUseThisPage'))

"Step 40: Click on header howToUseThisPage"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/header_howToUseThisPage'))

"Step 41: Click on list openPageInstructions"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/list_openPageInstructions'))

"Step 42: Click on div nestedTextOnly2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOnly2'))

"Step 43: Click on div nestedTextOnly2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_nestedTextOnly2'))

"Step 44: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 45: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 46: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 47: Click on span roleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/span_roleOption'))

"Step 48: Click on span roleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/span_roleOption'))

"Step 49: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 50: Click on div brokenParentTextPredicate"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/div_brokenParentTextPredicate'))

"Step 51: Click on code nestedTitleOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_nestedTitleOptionXpath'))

"Step 52: Click on span containsFullDescendantText"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/span_containsFullDescendantText'))

"Step 53: Click on code directTextOptionXpath2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath2'))

"Step 54: Click on item openPageInstruction"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_openPageInstruction'))

"Step 55: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 56: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 57: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 58: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 59: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 60: Click on p controlCaseText2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_controlCaseText2'))

"Step 61: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 62: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 63: Click on code directTextOptionXpath"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/code_directTextOptionXpath'))

"Step 64: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 65: Click on p primaryRepro"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_primaryRepro'))

"Step 66: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 67: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 68: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 69: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 70: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 71: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 72: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 73: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 74: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 75: Click on p controlCaseText2"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_controlCaseText2'))

"Step 76: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 77: Click on p primaryRepro"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/p_primaryRepro'))

"Step 78: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 79: Click on link relationshipManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 80: Click on item directTextOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_directTextOption'))

"Step 81: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 82: Click on item nestedTitleOption"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/item_nestedTitleOption'))

"Step 83: Click on link relationshipManagement -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Localhost/Page_nested_text_locator_poc/link_relationshipManagement'))

"Step 84: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate and Interact with Nested Text Elements_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}