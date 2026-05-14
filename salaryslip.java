package Employeepayrollmanagement;

class SalarySlip {

    int empId;
    double basicSalary;
    int daysPresent;
    int absentDays;
    double absenceDeduction;
    double netSalary;
    SalarySlip(int empId,double basicSalary,int daysPresent,int absentDays,double absenceDeduction,double netSalary) {
        this.empId = empId;
        this.basicSalary = basicSalary;
        this.daysPresent = daysPresent;
        this.absentDays = absentDays;
        this.absenceDeduction = absenceDeduction;
        this.netSalary = netSalary;
    }
    // Generate report
    void generateReport() {
        System.out.println("\n========= SALARY SLIP =========");

        System.out.println("Employee ID        : "+ empId);
        System.out.println("Basic Salary       : "+ basicSalary);

        System.out.println("Days Present       : "+ daysPresent);

        System.out.println("Absent Days        : "+ absentDays);

        System.out.println("Absence Deduction  : "+ absenceDeduction);

        System.out.println("Net Salary         : "+ netSalary);

        System.out.println("===============================");
    }
}

