package Employeepayrollmanagement;
import java.util.Scanner;

public class EmployeePayrollManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PayrollSystem payroll = new PayrollSystem(101, 10);

        HR hr = new HR(1, "Aiswarya");
        Manager manager = new Manager(201, "Ananyaa");

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Approve Attendance");
            System.out.println("4. View Salary Slip");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: {

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Designation: ");
                    String des = sc.nextLine();

                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();

                    Employee emp = new Employee(id, name, des, sal);

                    hr.addEmp(payroll, emp);

                    System.out.print("Days Present: ");
                    int days = sc.nextInt();

                    hr.markAttendance(emp, days);

                    break;
                }

                case 2: {

                    payroll.displayAllEmployees();
                    break;
                }

                case 3: {

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    Employee emp = payroll.getEmployeeById(id);

                    if (emp != null) {
                        manager.approveAttendance(emp);
                    } else {
                        System.out.println("Employee not found!");
                    }

                    break;
                }

                case 4: {

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    Employee emp = payroll.getEmployeeById(id);

                    if (emp != null) {
                        payroll.viewSalarySlip(emp);
                    } else {
                        System.out.println("Employee not found!");
                    }

                    break;
                }

                case 5: {

                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                }

                default: {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}
