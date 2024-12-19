import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService { CONSOLE_IO, FILE_IO, DB_IO, REST_IO }

    private List<EmployeePayrollData> employeePayrollList;

    // Default constructor
    public EmployeePayrollService() {
        this.employeePayrollList = new ArrayList<>();
    }

    // Constructor with an existing list
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    // Method to read employee payroll data from the console
    public void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();

        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();

        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    // Method to write employee payroll data to the console
    public void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roster to Console\n");
        for (EmployeePayrollData employee : employeePayrollList) {
            System.out.println(employee);
        }
    }
}
