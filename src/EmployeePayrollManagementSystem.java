package Employeepayrollmanagement;
import java.util.Scanner;

public class EmployeePayrollManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PayrollSystem payroll =new PayrollSystem(101, 10);
        HR hr =new HR(1, "Aiswarya");
        Manager manager =new Manager(201, "Ananyaa");

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Employee emp =new Employee(empId,empName,designation,salary);

        hr.addEmp(payroll.employeeList,emp,0);

        System.out.print("Enter Days Present: ");

        int days = sc.nextInt();

        // Mark attendance
        hr.markAttendance(emp, days);

        // Display employee details
        emp.displayEmployee();

        // Manager approves attendance
        manager.approveAttendance(emp);

        // Salary calculation
        SalarySlip slip = payroll.calculateSalary(emp);

        // Generate payslip
        payroll.generatePayslip(slip);

        sc.close();
    }
}
