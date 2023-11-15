import java.util.Scanner;

public class PayrollDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll();

        // Input hours and pay rate for each employee
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter hours worked for employee " + payroll.getEmployeeId(i) + ": ");
            int hoursWorked = scanner.nextInt();
            payroll.setHours(i, hoursWorked);

            System.out.print("Enter pay rate for employee " + payroll.getEmployeeId(i) + ": $");
            double payRate = scanner.nextDouble();
            payroll.setPayRate(i, payRate);

            System.out.println();
        }

        // Display identification number and gross wages for each employee
        System.out.println("Employee Gross Wages:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee ID: " + payroll.getEmployeeId(i));
            System.out.println("Gross Wages: $" + payroll.calculateGrossPay(payroll.getEmployeeId(i)));
            System.out.println();
        }
    }
}
