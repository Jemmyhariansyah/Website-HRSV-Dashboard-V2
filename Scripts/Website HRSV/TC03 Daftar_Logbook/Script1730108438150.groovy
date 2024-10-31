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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://103.180.125.58:8080/#/login')

//WebUI.maximizeWindow()
CustomKeywords.'loginUtilities.loginKeyword.loginHRSV'(GlobalVariable.username, GlobalVariable.password)

WebUI.verifyElementText(findTestObject('Object Repository/Add_Logbook/span_TestAccountKaryawan1'), 'TestAccountKaryawan1')

WebUI.click(findTestObject('Object Repository/Add_Logbook/button_Tambah Logbook'))

// Get the current date in YYYY-MM-DD format
String currentDate = new Date().format('2024-10-31')

// Parse the date into a Date object
Date date = new SimpleDateFormat('2024-10-31').parse(currentDate)

// Format the date as MM-DD-YYYY
SimpleDateFormat formatter = new SimpleDateFormat('10-31-2024')

String formattedDate = formatter.format(date)

// Set the formatted date to the input field
WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_Tanggal_tanggal'), formattedDate)

//Set Jam Mulai 
WebUI.click(findTestObject('Object Repository/Add_Logbook/input_Jam Mulai'))

WebUI.click(findTestObject('Add_Logbook/Choose_700 AM'))

//Set Jam Selesai
WebUI.click(findTestObject('Object Repository/Add_Logbook/input_jam_selesai'))

WebUI.click(findTestObject('Object Repository/Add_Logbook/li_800 AM'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Add_Logbook/select_--Select--WFOWFH'), 1)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_Project_project'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_Nama Tim_nama_tim'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_Use Case_use_case'), 'Testing')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Add_Logbook/Select_Kegiatan'), 12)

WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_Hasil_hasil'), '100')

WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_Capaian_capaian'), '100')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Add_Logbook/select_--Select--ContinuePauseWait ApprovalFinal'), 
    4)

WebUI.setText(findTestObject('Object Repository/Add_Logbook/input_PathFilename_file_name'), 'QA/Tester')

WebUI.setText(findTestObject('Object Repository/Add_Logbook/textarea_Detail Pekerjaan_detail_pekerjaan'), 'Testing')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Add_Logbook/select_--Select--Jam NormalJam Lembur'), 1)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Add_Logbook/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Add_Logbook/button_OK'))

WebUI.closeBrowser()

