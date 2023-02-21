$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/SkyBleuFeature.feature");
formatter.feature({
  "name": "Background color change validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BachGroundColorFeature"
    }
  ]
});
formatter.scenario({
  "name": "Sky Blue Background",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BachGroundColorFeature"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackGroundStepDefinition.button_exists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"button\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BackGroundStepDefinition.i_click_on_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to \"sky blue\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackGroundStepDefinition.the_background_color_will_change_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});