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

def password = testData.getObjectValue('Password', 1)

Mobile.startApplication('C:\\Users\\THINKPAD\\Documents\\Bhinneka_5.0.0_apkcombo.com.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.TextView -'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile Test/android.widget.EditText'), Email, 0)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.Button - button'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Mobile Test/android.widget.EditText'), password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.Button - button (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.view.View'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.view.View (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Mobile Test/ImageItem'), 0)

Mobile.delay(10)

Mobile.scrollToText('Jumlah')

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.Button - Add to Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.Button - Lanjut ke Keranjang'), 0)

Mobile.closeApplication()

