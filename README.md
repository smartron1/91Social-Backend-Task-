# 91Social-Backend-Task-
The module developed is a loan management system for any type loan.
The loan is considered as a high-level module. 
The objective of the program is to provide the details of the loan once the loan is disbursed. 
It provides all the details with the following components.
1. Principal amount
2. Loan creation date
3. No of EMI’s (should be an array)
4. Each EMI should have the following
a. Principal EMI amount
b. Interest EMI amount
c. Total EMI amount
d. EMI date (period 30 days for every EMI since the creation date)
e. Principal amount remaining from the main loan account.
5. Total Payable amount

The input can be given as command line arguments or by using standard I/O

# Details of the classes created are as follows:

# Loan.class :
  This class is the high level class which contains the instance of the EMI class.
  This class accepts input from the user via command line args or std I/O.
 
# EMI.class : 
  This class is instantiated by the Loan class.
  The loan class provides the Principal Amount and the number of EMI's as arguments.
  The class calculates the Principal EMI's and Interest EMI's and also the total and remaining amount to be paid.
  The class stores the details of each EMI's in an ArrayList<EMIDetails> by using EMIDetails objects.
  
# EMIDetails.class : 
  This class is the lowest level of component which is used by the EMI class to store the details of all the EMI'S
  Class uses another class LocalDate from java.time libreary to create Date objects (to store the date).
  plusMonths() method is used on LocalDate objects to add month for each successive EMIDetails Object.
