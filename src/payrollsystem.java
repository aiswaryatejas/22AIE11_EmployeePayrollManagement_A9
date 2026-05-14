package Employeepayrollmanagement;
class PayrollSystem {

    int payrollId;
    Employee[] employeeList;
    int empCount;

    PayrollSystem(int payrollId, int size) {

        this.payrollId = payrollId;
        employeeList = new Employee[size];
        empCount = 0;
    }

    void addEmp(Employee emp) {

        if (empCount < employeeList.length) {

            employeeList[empCount] = emp;
            empCount++;

            System.out.println("\nEmployee Added Successfully");
        } else {
            System.out.println("Employee list is full!");
        }
    }

    Employee getEmployeeById(int id) {

        for (int i = 0; i < empCount; i++) {

            if (employeeList[i].id == id) {
                return employeeList[i];
            }
        }

        return null;
    }

    SalarySlip calculateSalary(Employee emp) {

        if (!emp.attendanceApproved) {
            System.out.println("\nAttendance Not Approved");
            return null;
        }

        int totalWorkingDays = 30;

        double dailySalary = emp.basicSalary / totalWorkingDays;

        int absentDays = totalWorkingDays - emp.daysPresent;

        double deduction = absentDays * dailySalary;

        double netSalary = emp.basicSalary - deduction;

        return new SalarySlip(
                emp.id,
                emp.basicSalary,
                emp.daysPresent,
                absentDays,
                deduction,
                netSalary
        );
    }

    void viewSalarySlip(Employee emp) {

        SalarySlip slip = calculateSalary(emp);

        if (slip != null) {
            slip.generateReport();
        }
    }

    void displayAllEmployees() {

        System.out.println("\n===== ALL EMPLOYEES =====");

        for (int i = 0; i < empCount; i++) {
            employeeList[i].displayEmployee();
        }

        System.out.println("=========================");
    }
}
