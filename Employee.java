package Employeepayrollmanagement;

class Employee extends Person {

    String designation;
    double basicSalary;
    int daysPresent;
    boolean attendanceApproved;

    Employee(int id,String name,String designation,double basicSalary) {

        super(id, name);

        this.designation = designation;
        this.basicSalary = basicSalary;

        this.daysPresent = 0;

        this.attendanceApproved = false;
    }
     // Method overriding (Polymorphism)
    @Override
    void displayRole() {

        System.out.println("Role : Employee");
    }
    // Display employee details
    void displayEmployee() {

        System.out.println("\n====== EMPLOYEE DETAILS ======");

        displayBasicInfo();

        displayRole();

        System.out.println("Designation         : "+ designation);

        System.out.println("Basic Salary        : "+ basicSalary);

        System.out.println("Days Present        : "+ daysPresent);


        System.out.println("==============================");
    }

    // Update details
    void updateDetails(String designation,double basicSalary) {

        this.designation = designation;

        this.basicSalary = basicSalary;
    }
}