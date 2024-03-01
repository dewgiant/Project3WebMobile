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

def testData = findTestData('Data Files/excelEmail')
def Email = testData.getObjectValue('Email', 1)
def Password = testData.getObjectValue('Password', 1)

WebUI.callTestCase(findTestCase('Test Cases/Web Test/Common Login'), [('Email') : Email, ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Web Test/Page_Bhinneka Toko Online B2B Terlengkap untuk Kebutuhan Bisnis (1)/a_Technology  CommunicationComputer  Accessories, Networking, UPS, Server, Software, Gadget, Gadget  Accessory'))

WebUI.click(findTestObject('Object Repository/Web Test/Page_Produk Technology  Communication Terbaik  Bhinneka/p_Computer Accessories'))

WebUI.click(findTestObject('Object Repository/Web Test/Page_Aksesoris Komputer/a_SEAGATE Hard Disk Enterprise Performance 10K HDD 300GB ST300MM0058'))

WebUI.click(findTestObject('Object Repository/Web Test/Page_PLATINUM Protective Goggle/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Web Test/Page_PLATINUM Protective Goggle/button_Lanjut ke Keranjang'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Test/Page_Cart/h1_Keranjang Belanja'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()