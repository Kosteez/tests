/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;
import java.util.*;
/**
 *
 * @author cstuser
 */
public class Country {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String countryName, firstLetter, restOfCountryName, firstThreeLetters;
        String result = "";
        
        System.out.println("Type the name of the country: ");
        countryName = sc.nextLine();
        
        firstLetter = countryName.substring(0,1).toUpperCase();
        restOfCountryName = countryName.substring(1).toLowerCase();
        firstThreeLetters = countryName.substring(0,3).toUpperCase();
        
        result = firstLetter + restOfCountryName + " (" + firstThreeLetters + ")";
        
        System.out.println("The requested output: " + result);
        
    }
    
    
}
