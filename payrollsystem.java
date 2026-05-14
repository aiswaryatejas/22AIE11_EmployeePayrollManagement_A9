package Employeepayrollmanagement;
class PayrollSystem {
    int payrollId;
    Employee[] employeeList;

    PayrollSystem(int payrollId,int size) {
        this.payrollId = payrollId;
        employeeList = new Employee[size];
    }
    // Calculate salary
    SalarySlip calculateSalary(Employee emp) {
        
        if (!emp.attendanceApproved) {

            System.out.println("\nAttendance Not Approved");

            return null;
        }

        int totalWorkingDays = 30;

        double dailySalary =emp.basicSalary / totalWorkingDays;

        int absentDays = totalWorkingDays - emp.daysPresent;

        double absenceDeduction =absentDays * dailySalary;
                  
        double netSalary =emp.basicSalary - absenceDeduction;

       
        SalarySlip slip = new SalarySlip(emp.id,emp.basicSalary,emp.daysPresent,absentDays,absenceDeduction, netSalary);

        return slip;
    }

    void generatePayslip(SalarySlip slip) {
        if (slip != null) {
            slip.generateReport();
        }
    }
}
