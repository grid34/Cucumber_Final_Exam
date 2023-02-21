@BachGroundColorFeature
Feature: Background color change validation

@Scenario1
Scenario: Sky Blue Background
    Given "Set SkyBlue Background" Blue button exists
    When I click on the Blue "Blue"
    Then the background color will change to blue "blue"

@Scenario2
Scenario: White Background Change
    Given "Set White Background" white button exists
    When I click on the White "White"
    Then the background color will change to white "white"