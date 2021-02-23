$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SampleProject/Nhance_WebApp_Cucumber/src/test/java/Features/ProductManagement.feature");
formatter.feature({
  "line": 1,
  "name": "Product Management",
  "description": "",
  "id": "product-management",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1548600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Opens URL",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters email \"emailId\" and Password as \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 4194998100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.uset_Opens_URL()"
});
formatter.result({
  "duration": 31553987700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailId",
      "offset": 19
    },
    {
      "val": "password",
      "offset": 45
    }
  ],
  "location": "StepDefinitions.user_enters_email_and_Password_as(String,String)"
});
formatter.result({
  "duration": 579611100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_Login()"
});
formatter.result({
  "duration": 109245800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.dashboard_page_should_be_shown()"
});
formatter.result({
  "duration": 2429573700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify Product Management listing screen",
  "description": "",
  "id": "product-management;verify-product-management-listing-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User clicks on Product management",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Product management listing screen should show",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Logout button and Clicking on confirm button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Login page should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Product_management()"
});
formatter.result({
  "duration": 397192200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.product_management_listing_screen_should_show()"
});
formatter.result({
  "duration": 4213299000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Logout_button_and_Clicking_on_confirm_button()"
});
formatter.result({
  "duration": 340483000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.login_page_should_be_shown()"
});
formatter.result({
  "duration": 79026600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.close_browser()"
});
formatter.result({
  "duration": 169547300,
  "status": "passed"
});
formatter.before({
  "duration": 367400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Opens URL",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters email \"emailId\" and Password as \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 1959904400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.uset_Opens_URL()"
});
formatter.result({
  "duration": 29921948400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailId",
      "offset": 19
    },
    {
      "val": "password",
      "offset": 45
    }
  ],
  "location": "StepDefinitions.user_enters_email_and_Password_as(String,String)"
});
formatter.result({
  "duration": 432739400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_Login()"
});
formatter.result({
  "duration": 100538300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.dashboard_page_should_be_shown()"
});
formatter.result({
  "duration": 2389449100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Add product in Product Management",
  "description": "",
  "id": "product-management;add-product-in-product-management",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User clicks on Product management",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Product management listing screen should show",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User clicks on Add product button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Product Details screen header should show",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select Value from dropdown for Product category",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Select Value from dropdown for Product subcategory",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select Value from dropdown for Product Manufacturer",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Input below values for Model Number, Warranty period and Description field",
  "rows": [
    {
      "cells": [
        "HealthInsuranceCardFour",
        "12",
        "Test Description"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User clicks the save button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Successfull addition of product message should show",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User clicks on the ok button the pop-up",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User clicks on Logout button and Clicking on confirm button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Login page should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Product_management()"
});
formatter.result({
  "duration": 447073800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.product_management_listing_screen_should_show()"
});
formatter.result({
  "duration": 4198790000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Add_product_button()"
});
formatter.result({
  "duration": 653799600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.product_Details_screen_header_should_show()"
});
formatter.result({
  "duration": 399348400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.select_Value_from_dropdown_for_Product_category()"
});
formatter.result({
  "duration": 839016000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.select_Value_from_dropdown_for_Product_subcategory()"
});
formatter.result({
  "duration": 1044674300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.select_Value_from_dropdown_for_Product_Manufacturer()"
});
formatter.result({
  "duration": 805785300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.input_below_values_for_Model_Number_Warranty_period_and_Description_field(DataTable)"
});
formatter.result({
  "duration": 1155847100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_save_button()"
});
formatter.result({
  "duration": 257058000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.successfull_addition_of_product_message_should_show()"
});
formatter.result({
  "duration": 5940186500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_the_ok_button_the_pop_up()"
});
formatter.result({
  "duration": 147168300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Logout_button_and_Clicking_on_confirm_button()"
});
formatter.result({
  "duration": 402982800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.login_page_should_be_shown()"
});
formatter.result({
  "duration": 79570500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.close_browser()"
});
formatter.result({
  "duration": 173376200,
  "status": "passed"
});
});