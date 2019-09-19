Feature: Get book by ISBN


  Scenario: Get create and update
    Given  Get a user in service
    Given Create user with name "Jyothi" salary "123" and age "24"
    When Update User userid "16" with name "Test" salary "234" and age "25"