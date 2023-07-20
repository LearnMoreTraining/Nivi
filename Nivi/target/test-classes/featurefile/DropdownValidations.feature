Feature: To validate the dropdown values

  @StaticDrop
  Scenario: Handle the static dropdown
    Given Select the dropdwon value from currency dropdown
    When Iterate the dropdown values

    @Dynamic
  Scenario: Handle Dynamic Dropdown
    Given user handles the dynamic dropdown

  @Auto
  Scenario: Handle Auto Suggestive Dropdown
    Given user handles the auto suggestive dropdown




