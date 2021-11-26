$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/featureFile/test.feature");
formatter.feature({
  "line": 1,
  "name": "Customer login.",
  "description": "\nAs Customer I need to login onto the filpkart \nto purchase the Mobile product.",
  "id": "customer-login.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Login on flipkart website",
  "description": "",
  "id": "customer-login.;login-on-flipkart-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Login by User",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The profile page displays the user’s personal info",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});