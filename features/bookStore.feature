Feature: Book Creating Feature
	 This feature helps admin to create book 
	 
Scenario: Admin is trying to create book using invalid set of details
   Given  Admin is accessing CreateBookPage on Browser
 
 	 When Admin opens the create book form
 	 Then 'Create Book' will be displayed on the title
 		
 	 When  Admin is trying submit data without selecting 'Category' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without entering 'Title' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without entering 'Author' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without entering valid 'ISBN' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without selecting  valid 'Publish Date' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without entering  valid 'Book Image' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without entering  valid 'Price' 
 	 Then  'This is a required field!' alert message should display
 	 
 	 When  Admin is trying to submit request without entering  valid 'Description' 
 	 Then  'This is a required field!' alert message should display
 	 
Scenario: Admin is clicking on Save Button to create using valid set of details
  Given  Admin is accessing CreateBookPage on Browser
  When  Admin is clicking on 'Save' button after entering valid set of information 
  Then 'Book Created Successfully!' alert message should display