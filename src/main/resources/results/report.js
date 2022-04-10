$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Workspace/Eclipse_Workspace1/Cucumber/src/test/java/com/resouces/feature/OpenCart.feature");
formatter.feature({
  "name": "Add a product to OpenCart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllTag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add a product to Cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Navigate to the Homepage URL",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the credentials and login to the application\"\u003cuserEmail\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the string to \"\u003csearchStr\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User opens the product and add the same to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User Logout",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userEmail",
        "password",
        "searchStr"
      ]
    },
    {
      "cells": [
        "vimalrajv08@gmail.com",
        "Admin123",
        "Phone"
      ]
    },
    {
      "cells": [
        "vimalrajv08@gmail.com",
        "Admin123",
        "Mac Book"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a product to Cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AllTag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Navigate to the Homepage URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.navigate_to_the_Homepage_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the credentials and login to the application\"vimalrajv08@gmail.com\" \"Admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.user_enters_the_credentials_and_login_to_the_application(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the string to \"Phone\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_enters_the_string_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the product and add the same to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_opens_the_product_and_add_the_same_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a product to Cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AllTag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Navigate to the Homepage URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.navigate_to_the_Homepage_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the credentials and login to the application\"vimalrajv08@gmail.com\" \"Admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.user_enters_the_credentials_and_login_to_the_application(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the string to \"Mac Book\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_enters_the_string_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the product and add the same to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_opens_the_product_and_add_the_same_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_Logout()"
});
formatter.result({
  "status": "passed"
});
});