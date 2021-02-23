package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
import pageObjects.ProductManagement_page;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage loginpage;
	public static ProductManagement_page pmpage;
	public static Properties TestDataProperties;
	public static String AppUrl;
	public static String Email;
	public static String Password;
	public static String InvalidEmail;

	public void setupSuite() throws IOException {

		String path = "D:\\SampleProject\\Nhance_WebApp_Cucumber\\TestData\\TestData.properties";

		TestDataProperties = new Properties();
		File testdatafile = new File(path);
		FileInputStream fileInput = new FileInputStream(testdatafile);
		TestDataProperties.load(fileInput);
		fileInput.close();

		AppUrl = TestDataProperties.getProperty("Nhancenow.URL");
		Email = TestDataProperties.getProperty("Nhancenow.Email");
		Password = TestDataProperties.getProperty("Nhancenow.Password");
		InvalidEmail = TestDataProperties.getProperty("Nhancenow.InvalidEmail");

	}

	public static WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	/*
	 * public void fetchData_From_DataTable(DataTable data) {
	 * 
	 * List<List<String>> obj = data.raw();
	 * 
	 * }
	 */

}
