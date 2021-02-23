package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class ProductManagement_page {

	public WebDriver driver;
	public WaitHelper waithelper;

	public ProductManagement_page(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
		waithelper = new WaitHelper(driver);
	}

	// To click on product management module, from the left menu
	@FindBy(xpath = "//span[contains(text(), 'Product Managment')]")
	public WebElement product_Management_Module;

	public void click_On_Product_Management_Module() {
		waithelper.WaitForElement(product_Management_Module, 10);
		product_Management_Module.click();

	}

	// To verify if the product management screen header is showing or not!!
	@FindBy(xpath = "//h1[contains(text(), 'Product Management')]")
	public WebElement product_Management_Screen_Header;

	public String read_Value_For_Product_Management_Screen_Header() {
		waithelper.WaitForElement(product_Management_Screen_Header, 10);
		String value_For_Product_Management_Screen_Header = product_Management_Screen_Header.getText();
		return value_For_Product_Management_Screen_Header;

	}

	// To verify if the model number column header is showing or not, in product
	// management screen!
	@FindBy(xpath = "//input[@placeholder= 'Model Number']")
	public WebElement model_Number_Column_Header;

	public String read_Value_For_Model_Number_Column_Header() {
		waithelper.WaitForElement(model_Number_Column_Header, 10);
		String value_For_Model_Number_Column_Header = model_Number_Column_Header.getText();
		return value_For_Model_Number_Column_Header;

	}

	// Add product Screen Page elements written below

	// To click on the Add product "+" button
	@FindBy(xpath = "//img[@class= 'create']")
	public WebElement addProduct_Button;

	public void click_On_AddProduct_Button() {
		waithelper.WaitForElement(addProduct_Button, 10);
		addProduct_Button.click();

	}

	// To verify if the product Details screen header is showing or not!!
	@FindBy(xpath = "//div[contains(text(), 'Product Details')]")
	public WebElement product_Details_Screen_Header;

	public String read_Value_For_Product_Details_Screen_Header() {
		waithelper.WaitForElement(product_Details_Screen_Header, 10);
		String value_For_Product_Details_Screen_Header = product_Details_Screen_Header.getText();
		return value_For_Product_Details_Screen_Header;

	}

	// To click on dropdown for Product category
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productCatName']//div[@class='c-btn']  ")
	public WebElement product_Category_Dropdown;

	public void clicking_On_Product_Category_Dropdown() {
		waithelper.WaitForElement(product_Category_Dropdown, 10);
		product_Category_Dropdown.click();

	}

	// To give input in search field of the dropdown -- Health
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productCatName']//input[@placeholder='Search']")
	public WebElement search_Product_Category_Dropdown;

	public void input_In_Search_Product_Category_Dropdown(String categoryName) {
		waithelper.WaitForElement(search_Product_Category_Dropdown, 10);
		search_Product_Category_Dropdown.sendKeys(categoryName);
		// Select dropdown = new Select(search_Product_Category_Dropdown);
		// dropdown.selectByIndex(index);

	}

	// To select the value from the dropdown (Select "Health") -- Product category
	@FindBy(xpath = "//ul[@class='lazyContainer']/li/label")
	private List<WebElement> categoryList;

	public void select_CategoryFromSearch(String categoryName) throws InterruptedException {

		for (int i = 0; i < categoryList.size();) {
			if (categoryList.get(i).getText().equals(categoryName)) {
				categoryList.get(i).click();
				break;
			}

		}
	}

	// To click on dropdown for Product sub-category
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//div[@class='c-btn']  ")
	public WebElement product_SubCategory_Dropdown;

	public void clicking_On_Product_SubCategory_Dropdown() {
		waithelper.WaitForElement(product_SubCategory_Dropdown, 10);
		product_SubCategory_Dropdown.click();

	}

	// To give input in search field of the dropdown -- General Health Care
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//input[@placeholder='Search']")
	public WebElement search_Product_SubCategory_Dropdown;

	public void input_In_Search_Product_SubCategory_Dropdown(String subCategoryName) {
		waithelper.WaitForElement(search_Product_SubCategory_Dropdown, 10);
		search_Product_SubCategory_Dropdown.sendKeys(subCategoryName);
		// Select dropdown = new Select(search_Product_Category_Dropdown);
		// dropdown.selectByIndex(index);

	}

	// To select the value from the dropdown (Select "General Health Care") --
	// Product
	// Subcategory
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//ul[@class='lazyContainer']/li/label")
	private WebElement subCategory_List;

	public void select_SubCategoryFromSearch(String subCategoryName) throws InterruptedException {

		subCategory_List.click();

	}

	// To click on dropdown for Product manufacturer
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//div[@class='c-btn']  ")
	public WebElement product_Manufaturer_Dropdown;

	public void clicking_On_Product_Manufacturer_Dropdown() {
		waithelper.WaitForElement(product_Manufaturer_Dropdown, 10);
		product_Manufaturer_Dropdown.click();

	}

	// To give input in search field of the dropdown -- Doctor
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//input[@placeholder='Search']")
	public WebElement search_Product_Manufacturer_Dropdown;

	public void input_In_Search_Product_Manufacturer_Dropdown(String manufacturerName) {
		waithelper.WaitForElement(search_Product_Manufacturer_Dropdown, 10);
		search_Product_Manufacturer_Dropdown.sendKeys(manufacturerName);
		// Select dropdown = new Select(search_Product_Category_Dropdown);
		// dropdown.selectByIndex(index);

	}

	// To select the value from the dropdown (Select "Doctor") --
	// Product_Manufacturer
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//ul[@class='lazyContainer']/li/label")
	private WebElement manufacturer_List;

	public void select_ManufacturerFromSearch(String manufacturerName) throws InterruptedException {

		manufacturer_List.click();

	}

	// To give input in model Number field
	@FindBy(xpath = "//input[@placeholder='Enter Model Number']")
	public WebElement input_In_ModelNumber_Field;

	public void input_In_ModelNumber_Field(String modelNumber) {
		waithelper.WaitForElement(input_In_ModelNumber_Field, 10);
		input_In_ModelNumber_Field.sendKeys(modelNumber);

	}

	// To give input in warranty PEriod field
	@FindBy(xpath = "//input[@placeholder='Enter in months']")
	public WebElement input_In_WarrantyPeriod_Field;

	public void input_In_WarrantyPeriod_Field(String WarrantyPeriod) {
		waithelper.WaitForElement(input_In_WarrantyPeriod_Field, 10);
		input_In_WarrantyPeriod_Field.sendKeys(WarrantyPeriod);

	}

	// To give input in warranty PEriod field
	@FindBy(xpath = "//textarea[@class='textArea']")
	public WebElement input_In_Description_Field;

	public void input_In_Description_Field(String Description) {
		waithelper.WaitForElement(input_In_Description_Field, 10);
		input_In_Description_Field.sendKeys(Description);

	}

	// To click on the save button
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement save_Button;

	public void click_On_Save_Button() {
		waithelper.WaitForElement(save_Button, 10);
		save_Button.click();

	}

	// To verify if the Successful saved text message is showing or not!
	// (Successfull saving of product in Product management)
	@FindBy(xpath = "//div[contains(text(),'Done! Product details have been added to our database')]")
	public WebElement successMessageText_On_Popup;

	public String read_Value_For_SuccessMessageText_On_Popup() {
		waithelper.WaitForElement(successMessageText_On_Popup, 10);
		String value_For_SuccessMessageText_On_Popup = successMessageText_On_Popup.getText();
		return value_For_SuccessMessageText_On_Popup;

	}

	// To click on the Ok button, on the pop-up
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	public WebElement ok_Button_On_Popup;

	public void click_On_Ok_Button_On_Popup() {
		waithelper.WaitForElement(ok_Button_On_Popup, 10);
		ok_Button_On_Popup.click();

	}

}
