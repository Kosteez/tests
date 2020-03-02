/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary.calculator;
import java.util.*;
/**
 *
 * @author cstuser
 */
public class SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hoursWorked, hourlyWage, salary, netPay;
        final double TAX;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the amount of hours worked per week: ");
        hoursWorked = sc.nextDouble();
        System.out.println("Enter your hourly wage: ");
        hourlyWage = sc.nextDouble();
        TAX = 0.7;
        salary = hoursWorked * hourlyWage;
        netPay = (hoursWorked * hourlyWage) * 0.7;
        
        System.out.println("You net pay before tax deduction is: " + salary);
        System.out.println("Your net pay after tax deduction is: " + netPay);
    }
    
}
