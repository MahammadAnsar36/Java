import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        // Variables to temporarily store base salary, performance, and calculated salary
        double baseSalary;
        int performance;
        double salary;

        // Variable to keep track of employee number
        int employeeCount = 1;

        // Loop through each employee, taking input and calculating salary
        while (employeeCount <= numEmployees) {
            System.out.print("Enter base salary for employee " + employeeCount + ": ");
            baseSalary = scanner.nextDouble();

            System.out.print("Enter performance rating for employee " + employeeCount + ": ");
            performance = scanner.nextInt();

            // Calculate salary
            salary = baseSalary + baseSalary * 0.05 * performance;

            // Increment employee count
            employeeCount++;
        }

        // Output: Now print the salaries of all employees after all inputs have been taken
        employeeCount = 1;
        while (employeeCount <= numEmployees) {
            System.out.print("Enter base salary for employee " + employeeCount + ": ");
            baseSalary = scanner.nextDouble();

            System.out.print("Enter performance rating for employee " + employeeCount + ": ");
            performance = scanner.nextInt();

            // Calculate salary
            salary = baseSalary + baseSalary * 0.05 * performance;

            // Print salary for the current employee
            System.out.printf("Employee %d: %.2f\n", employeeCount, salary);

            employeeCount++;
        }

        scanner.close();
    }
}
