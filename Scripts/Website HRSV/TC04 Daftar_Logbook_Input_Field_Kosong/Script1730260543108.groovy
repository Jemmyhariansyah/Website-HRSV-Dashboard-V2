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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl('http://103.180.125.58:8080/#/login')

//WebUI.maximizeWindow()
CustomKeywords.'loginUtilities.loginKeyword.loginHRSV'(GlobalVariable.username, GlobalVariable.password)

WebUI.verifyElementText(findTestObject('Object Repository/Add_Logbook/span_TestAccountKaryawan1'), 'TestAccountKaryawan1')

WebUI.click(findTestObject('Object Repository/Add_Logbook/button_Tambah Logbook'))

WebUI.setText(findTestObject('Add_Logbook/input_Tanggal_tanggal'), Tanggal)

WebUI.setText(findTestObject('Add_Logbook/input_Jam Mulai'), Jam_Mulai)

WebUI.setText(findTestObject('Add_Logbook/input_jam_selesai'), Jam_Selesai)

WebUI.setText(findTestObject('Add_Logbook/select_--Select--WFOWFH'), Mode_Kerja)

WebUI.setText(findTestObject('Add_Logbook/input_Project_project'), Porject)

WebUI.setText(findTestObject('Add_Logbook/input_Nama Tim_nama_tim'), Nama_Tim)

WebUI.setText(findTestObject('Add_Logbook/input_Use Case_use_case'), Use_Case)

WebUI.setText(findTestObject('Add_Logbook/Select_Kegiatan'), Kegiatan)

WebUI.setText(findTestObject('Add_Logbook/input_Hasil_hasil'), Hasil)

WebUI.setText(findTestObject('Add_Logbook/input_Capaian_capaian'), Capaian)

WebUI.setText(findTestObject('Add_Logbook/select_--Select--ContinuePauseWait ApprovalFinal'), Next_Step)

WebUI.setText(findTestObject('Add_Logbook/input_PathFilename_file_name'), Filename)

WebUI.setText(findTestObject('Add_Logbook/textarea_Detail Pekerjaan_detail_pekerjaan'), Detail_Pekerjaan)

WebUI.setText(findTestObject('Add_Logbook/select_--Select--Jam NormalJam Lembur'), Waktu_Kerja)

