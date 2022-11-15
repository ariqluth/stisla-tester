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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.setText(findTestObject('Object Repository/Teisla/Page_Laravel - Login/input_Email_email'), 'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Teisla/Page_Laravel - Login/input_Forgot Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Teisla/Page_Laravel - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Teisla/Page_Laravel/a_Histories_nav-link nav-link-lg'))

WebUI.click(findTestObject('Object Repository/Teisla/Page_Laravel/span_Users Management'))

WebUI.click(findTestObject('Object Repository/Teisla/Page_Laravel/a_User List'))

WebUI.click(findTestObject('Object Repository/Teisla/Page_Laravel/i_Edit_fas fa-edit'))

WebUI.setText(findTestObject('Object Repository/Teisla/Page_Laravel/input_Your Name_name'), 'Luthfi Mugi3')

WebUI.click(findTestObject('Object Repository/Teisla/Page_Laravel/button_Submit'))

WebUI.closeBrowser()

