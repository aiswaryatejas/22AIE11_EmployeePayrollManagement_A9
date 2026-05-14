package Employeepayrollmanagement;

class HR extends Person {
    HR(int id, String name) {
        super(id, name);
    }
    @Override
    void displayRole() {

        System.out.println("Role : HR");
    }
    // Add employee
    void addEmp(Employee[] employeeList,Employee emp,int index) {

        employeeList[index] = emp;

        System.out.println("\nEmployee Added Successfully");
    }

    // Update employee
    void updateEmp(Employee emp,String designation,double salary) {

        emp.updateDetails(designation, salary);
          System.out.println("\nEmployee Updated Successfully");
    }

    // Mark attendance
    void markAttendance(Employee emp, int days) {

        emp.daysPresent = days;

        System.out.println("\nAttendance Marked Successfully");
    }
}
