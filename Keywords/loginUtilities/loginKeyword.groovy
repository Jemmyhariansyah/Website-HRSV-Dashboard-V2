package loginUtilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import internal.GlobalVariable


public class loginKeyword {

	@Keyword
	def loginHRSV(String username, String password ) {
		// Input Username
		WebUI.setText(findTestObject('Object Repository/Login HR SV Jakarta/input_text'), 'TestAccountKaryawan1')
		
		//Input Password
		WebUI.setText(findTestObject('Object Repository/Login HR SV Jakarta/input_password'), 'P@sswordK1')
		
		//Button Clik
		WebUI.click(findTestObject('Object Repository/Login HR SV Jakarta/button_Login'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Add_Logbook/img_TestAccountKaryawan1_c-avatar-img'),0)
		
//		WebUI.verifyElementText(findTestObject('Object Repository/Add_Logbook/span_Full Stack Engineer'), '')
		
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Login HR SV Jakarta/span_TestAccountKaryawan1'), 1)
	}
}
