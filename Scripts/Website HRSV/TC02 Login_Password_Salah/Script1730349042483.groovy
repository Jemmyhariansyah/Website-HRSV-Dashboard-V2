import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.remote.server.handler.MaximizeWindow as Keys

//Open Browser
WebUI.openBrowser('')

WebUI.navigateToUrl('http://103.180.125.58:8080/')

WebUI.maximizeWindow()

// Input Username
WebUI.setText(findTestObject('Object Repository/Login HR SV Jakarta/input_text'), Username)

//Input Password
WebUI.setText(findTestObject('Object Repository/Login HR SV Jakarta/input_password'), Password)

//Button Clik
WebUI.click(findTestObject('Object Repository/Login HR SV Jakarta/button_Login'))

//Verifikasi bahwa password salah
WebUI.verifyElementText(findTestObject('Login HR SV Jakarta/div_Username andor Password is invalid'), 'Username and/or Password is invalid')

WebUI.closeBrowser()

