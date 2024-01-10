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

WebUI.navigateToUrl('https://ujian2.elearning.unair.ac.id/hebat-v2/')

WebUI.click(findTestObject('Object Repository/Page_Hebat - Elearning Universitas Airlangga/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to the site  HEBAT/input_Username_username'), '434231023')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to the site  HEBAT/input_Password_password'), 'foJ9Tku5ZBYFwYYqxIRuxsuIULBFV8kn')

WebUI.click(findTestObject('Object Repository/Page_Log in to the site  HEBAT/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My courses  HEBAT/a_Course is starred                        _306d97'))

WebUI.verifyEqual(WebUI.getUrl(), "https://ujian2.elearning.unair.ac.id/course/view.php?id=6520")

WebUI.closeBrowser()


