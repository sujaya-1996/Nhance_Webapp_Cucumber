package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductManagement_page;

public class Product_Management_StepDefinition extends BaseClass {
	
	// Product management step definitions..

		@When("^User clicks on Product management$")
		public void user_clicks_on_Product_management() throws Throwable {

			pmpage = new ProductManagement_page(driver);
			pmpage.click_On_Product_Management_Module();

		}

		@Then("^Product management listing screen should show$")
		public void product_management_listing_screen_should_show() throws Throwable {

			String value_For_Product_Management_Screen_Header = pmpage.read_Value_For_Product_Management_Screen_Header();
			String expected_Value = "Product Management";
			String actual_Value = value_For_Product_Management_Screen_Header;
			if (actual_Value.contains(expected_Value)) {
				System.out.println("Asserstion passed, because actual value contains the expected value." + actual_Value);
			}

			String value_For_Model_Number_Column_Header = pmpage.read_Value_For_Model_Number_Column_Header();
			String expected_Value1 = "Model Number";
			String actual_Value1 = value_For_Model_Number_Column_Header;
			if (actual_Value1.contains(expected_Value1)) {
				System.out.println("Asserstion passed, because actual value contains the expected value." + actual_Value1);
			}
			System.out.println("Its showing the Product management listing screen properly.");
			Thread.sleep(4000);

		}

		// Add product in product management step definitions ....

		@Then("^User clicks on Add product button$")
		public void user_clicks_on_Add_product_button() throws Throwable {
			pmpage.click_On_AddProduct_Button();
			System.out.println("Add product button has been clicked.");

		}

		@Then("^Product Details screen header should show$")
		public void product_Details_screen_header_should_show() throws Throwable {
			String value_For_Product_Details_Screen_Header = pmpage.read_Value_For_Product_Details_Screen_Header();
			String expected_Value2 = "Product Details";
			String actual_Value2 = value_For_Product_Details_Screen_Header;
			if (actual_Value2.contains(expected_Value2)) {
				System.out.println("Asserstion passed, because actual value contains the expected value." + actual_Value2);
			}
			System.out.println("Product Details Header Showing.");
		}

		@Then("^Select Value from dropdown for Product category$")
		public void select_Value_from_dropdown_for_Product_category() throws Throwable {

			pmpage.clicking_On_Product_Category_Dropdown();
			pmpage.input_In_Search_Product_Category_Dropdown("Health");
			pmpage.select_CategoryFromSearch("Health");
			System.out.println("Health category has been selected Successfully.");

		}

		@Then("^Select Value from dropdown for Product subcategory$")
		public void select_Value_from_dropdown_for_Product_subcategory() throws Throwable {

			pmpage.clicking_On_Product_SubCategory_Dropdown();
			pmpage.input_In_Search_Product_SubCategory_Dropdown("General Health care");
			pmpage.select_SubCategoryFromSearch("General Health care");
			System.out.println("General Health care Subcategory has been selected Successfully.");

		}

		@Then("^Select Value from dropdown for Product Manufacturer$")
		public void select_Value_from_dropdown_for_Product_Manufacturer() throws Throwable {

			pmpage.clicking_On_Product_Manufacturer_Dropdown();
			pmpage.input_In_Search_Product_Manufacturer_Dropdown("Doctor");
			pmpage.select_ManufacturerFromSearch("Doctor");
			System.out.println("Doctor Manufacturer has been selected Successfully.");

		}

		/*
		 * @Then("^Input value in Model Number field$") public void
		 * input_value_in_Model_Number_field() throws Throwable {
		 * 
		 * pmpage.input_In_ModelNumber_Field("");
		 * 
		 * }
		 * 
		 * @Then("^Input value in Warranty period field$") public void
		 * input_value_in_Warranty_period_field() throws Throwable {
		 * 
		 * pmpage.input_In_WarrantyPeriod_Field("");
		 * 
		 * }
		 * 
		 * @Then("^Input value in Description field$") public void
		 * input_value_in_Description_field() throws Throwable {
		 * 
		 * pmpage.input_In_Description_Field("");
		 * 
		 * }
		 */

		@Then("^Input below values for Model Number, Warranty period and Description field$")
		public void input_below_values_for_Model_Number_Warranty_period_and_Description_field(DataTable data)
				throws Throwable {

			List<List<String>> obj = data.raw();
			pmpage.input_In_ModelNumber_Field(obj.get(0).get(0));
			pmpage.input_In_WarrantyPeriod_Field(obj.get(0).get(1));
			pmpage.input_In_Description_Field(obj.get(0).get(2));

		}

		@When("^User clicks the save button$")
		public void user_clicks_the_save_button() throws Throwable {

			pmpage.click_On_Save_Button();

		}

		@Then("^Successfull addition of product message should show$")
		public void successfull_addition_of_product_message_should_show() throws Throwable {

			String value_For_SuccessMessageText_On_Popup = pmpage.read_Value_For_SuccessMessageText_On_Popup();
			String expected_Value3 = "Done! Product details have been added to our database";
			String actual_Value3 = value_For_SuccessMessageText_On_Popup;
			if (actual_Value3.contains(expected_Value3)) {
				System.out.println("Asserstion passed, because actual value contains the expected value." + actual_Value3);
			}
			Thread.sleep(2000);

		}

		@Then("^User clicks on the ok button the pop-up$")
		public void user_clicks_on_the_ok_button_the_pop_up() throws Throwable {
			//pmpage = new ProductManagement_page(driver);
			pmpage.click_On_Ok_Button_On_Popup();
		}

	}


	
	
	
	



