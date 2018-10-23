Feature: Student Crud

  Scenario: retrieve all students
    Given the client calls /api/students
    Then the client receives status code of 200
    And the client receives 1 students
	
#	|status|res|
#	|200   |1  |
#	|500   |0  |