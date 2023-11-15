*Calvin Rhodes
 * Chapter 7
 * Programming Challenge 2
 * Payroll Class
 */

import java.util.Scanner;

public class Payroll {
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    // Constructor
    public Payroll() {
        // Initialize arrays with default values
        for (int i = 0; i < 7; i++) {
            hours[i] = 0;
            payRate[i] = 0.0;
            wages[i] = 0.0;
        }
    }

    // Accessor methods
    public int getEmployeeId(int index) {
        return employeeId[index];
    }

    public int getHours(int index) {
        return hours[index];
    }

    public double getPayRate(int index) {
        return payRate[index];
    }

    public double getWages(int index) {
        return wages[index];
    }

    // Mutator methods
    public void setHours(int index, int hoursWorked) {
        if (hoursWorked >= 0) {
            hours[index] = hoursWorked;
        } else {
            System.out.println("Error: Hours worked cannot be negative.");
        }
    }

    public void setPayRate(int index, double payRateValue) {
        if (payRateValue >= 6.00) {
            payRate[index] = payRateValue;
        } else {
            System.out.println("Error: Pay rate must be at least 6.00.");
        }
    }

    // Method to calculate gross wages for a given employee ID
    public double calculateGrossPay(int employeeId) {
        int index = findEmployeeIndex(employeeId);
        if (index != -1) {
            wages[index] = hours[index] * payRate[index];
            return wages[index];
        } else {
            System.out.println("Error: Employee not found.");
            return 0.0;
        }
    }

    // Helper method to find the index of an employee in the arrays
    private int findEmployeeIndex(int employeeId) {
        for (int i = 0; i < 7; i++) {
            if (this.employeeId[i] == employeeId) {
                return i;
            }
        }
        return -1; // Employee not found
    }

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
