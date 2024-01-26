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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home  Elearning CMS/a_Master Question'))

WebUI.navigateToUrl('http://130.211.243.37:96/question')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/button_Tambah                              _531150'))

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/span_select2-selection__arrow'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Sebelum Isi Data', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/span_select2-selection__arrow'))

WebUI.setText(findTestObject(null), '')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/span_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/textarea_desc'), 'Ask')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/textarea_optA'), 'Ask A')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/textarea_optB'), 'Ask B')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/textarea_optC'), 'Ask C')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/textarea_optD'), 'Ask D')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/input_correctAnswer'))

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/input_isActive'))

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/button_Save'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Sesudah Isi Data')

