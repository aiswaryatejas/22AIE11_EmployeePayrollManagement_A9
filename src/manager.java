package Employeepayrollmanagement;

class Manager extends Person {

    Manager(int id, String name) {

        super(id, name);
    }

    // Method overriding (Polymorphism)
    @Override
    void displayRole() {

        System.out.println("Role : Manager");
    }

    // Approve attendance
    void approveAttendance(Employee emp) {

        emp.attendanceApproved = true;

        System.out.println("\nAttendance Approved for "+ emp.name);
    }
}
