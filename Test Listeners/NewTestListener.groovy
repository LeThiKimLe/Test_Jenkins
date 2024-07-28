import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class NewTestListener {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def closeBrowser(TestCaseContext testCaseContext) {
		WebUI.closeBrowser()
//		String[] commands = ["cmd.exe", "/c", "taskkill /f /im chrome.exe && taskkill /f /im chromedriver.exe"]
//		Process chromeDriverProcess = Runtime.getRuntime().exec(commands)
//		chromeDriverProcess.waitFor()
//		KeywordUtil.logInfo('Close browser successfully')
	}
}