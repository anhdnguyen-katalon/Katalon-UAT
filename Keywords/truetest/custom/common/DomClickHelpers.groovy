package truetest.custom.common

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

public class DomClickHelpers {

    // [TrueTest][AI-Generated][CSID:882e1132-0ba4-4606-b2de-9708e25d7a9b] Custom Script: clickByCssFromTestObject, updated: 2026-04-15
    @Keyword
    public static void clickByCssFromTestObject(TestObject testObject) {
        assert testObject != null : "TestObject is required"

        def selectorCollection = testObject.getSelectorCollection()
        def cssSelector = selectorCollection?.get(SelectorMethod.CSS)

        assert cssSelector != null && cssSelector.toString().trim() : "CSS selector not found in TestObject"

        WebDriver driver = DriverFactory.getWebDriver()
        JavascriptExecutor js = (JavascriptExecutor) driver

        def element = js.executeScript(
            "return document.querySelector(arguments[0]);",
            cssSelector.toString()
        )

        assert element != null : "Element not found for CSS selector: ${cssSelector}"
        js.executeScript("arguments[0].click();", element)
    }

}
