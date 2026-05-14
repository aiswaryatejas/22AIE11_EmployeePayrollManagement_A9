# 22AIE111_EmployeePayrollManagement_A9
# Employee Payroll Management System (Java)

---

## Team Members

### 1. Aiswarya Tejas
- Contribution: Created class Employee and EmployeePayrollManagementSystem class(Main class).

### 2. Ananyaa S Pillai
- Contribution: Created class Manager and PayrollSystem class.
  
### 3. Avanthika Binu 
- Contribution: Created class HR and Salaryslip class.
  
### 4.Achyuth Narayanan
- Contribution: Created Person class.
  
## Project Title

**Employee Payroll Management System **

---

## Problem Description
Managing payroll manually takes a lot of me and is prone to mistakes. The proposed system automates salary calcula ons, payroll processing, and report genera on to improve efficiency and reduce errors. 

So, we created this project to automate the process of:
- Adding employee details
- Marking attendance
- Approving attendance
- Calculating salary based on attendance
- Generating salary slips
  
---
## How to Run the Code

### Step 1: Compile the program
```
javac EmployeePayrollManagementSystem.java
```
###   Step 2: Run the program
```
java EmployeePayrollManagementSystem
```
## Sample Input/Output code
```
===== MENU =====
1. Add Employee
2. Display All Employees
3. Approve Attendance
4. View Salary Slip
5. Exit
Enter choice: 1

ID: 12
Name: Kavya
Designation: Backend developer
Salary: 85000

Employee Added Successfully
Days Present: 29

Attendance Marked Successfully


===== MENU =====
1. Add Employee
2. Display All Employees
3. Approve Attendance
4. View Salary Slip
5. Exit
Enter choice: 2

===== ALL EMPLOYEES =====

====== EMPLOYEE DETAILS ======
ID   : 12
Name : Kavya
Role : Employee
Designation         : Backend developer
Basic Salary        : 85000.0
Days Present        : 29
==============================


===== MENU =====
1. Add Employee
2. Display All Employees
3. Approve Attendance
4. View Salary Slip
5. Exit
Enter choice: 3

Enter Employee ID: 12

Attendance Approved for Kavya


===== MENU =====
1. Add Employee
2. Display All Employees
3. Approve Attendance
4. View Salary Slip
5. Exit
Enter choice: 4

Enter Employee ID: 12

========= SALARY SLIP =========
Employee ID        : 12
Basic Salary       : 85000.0
Days Present       : 29
Absent Days        : 1
Absence Deduction  : 2833.3333333333335
Net Salary         : 82166.66666666667
===============================


===== MENU =====
1. Add Employee
2. Display All Employees
3. Approve Attendance
4. View Salary Slip
5. Exit
Enter choice: 5

Exiting system...
```
## Tool or Technologies used
- Java (Core Java)
- Console-based Application
- Scanner class (for user input)
- Arrays (for data storage)
