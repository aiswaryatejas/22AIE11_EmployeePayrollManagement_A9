package Employeepayrollmanagement;

class HR extends Person {

    HR(int id, String name) {
        super(id, name);
    }

    @Override
    void displayRole() {
        System.out.println("Role : HR");
    }

    void addEmp(PayrollSystem payroll, Employee emp) {
        payroll.addEmp(emp);
    }

    void markAttendance(Employee emp, int days) {
        emp.daysPresent = days;
        System.out.println("\nAttendance Marked Successfully");
    }
}
