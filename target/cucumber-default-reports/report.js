$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add Employee and Create Login Details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I provide \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\", \"\u003cLastName\u003e\" and \"\u003cLocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on create login details",
  "keyword": "And "
});
formatter.step({
  "name": "I provide \"\u003cusername\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I  click on Save Button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName",
        "Location",
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Jane",
        "B",
        "Smith",
        "HQ",
        "user112233",
        "SyntaxUser1!@"
      ]
    },
    {
      "cells": [
        "Jack",
        "F",
        "Cruz",
        "BraRio001",
        "user222233",
        "SyntaxUser2!@"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged into Orange HRM",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeStep.i_logged_into_Orange_HRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add Employee Link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_on_Add_Employee_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee and Create Login Details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I provide \"Jane\", \"B\", \"Smith\" and \"HQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeStep.i_provide_Employee_details(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on create login details",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_on_create_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide \"user112233\",\"SyntaxUser1!@\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_provide(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I  click on Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_on_Save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged into Orange HRM",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeStep.i_logged_into_Orange_HRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add Employee Link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_on_Add_Employee_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee and Create Login Details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I provide \"Jack\", \"F\", \"Cruz\" and \"BraRio001\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeStep.i_provide_Employee_details(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on create login details",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_on_create_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide \"user222233\",\"SyntaxUser2!@\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_provide(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I  click on Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeStep.i_click_on_Save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});