/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age.calculator;
import java.util.*;
/**
 *
 * @author cstuser
 */
public class AgeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int yearOfBirth, currentYear, age;
        Date today = new Date();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your year of birth? ");
        
        yearOfBirth = sc.nextInt();
        currentYear = today.getYear();
        age = currentYear - yearOfBirth + 1900;
        
        System.out.println("Your age is: " + age);
        
        
        
        
    }
    
}
