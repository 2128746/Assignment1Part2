/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Nicholas Cosssette
 */
public class BirthYearCalculator {

    /**This program asks the user to input a birth year and extract it and display the year, century, and decade
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please input a digit birth year: ");
        String birthYear = console.nextLine();
        
        int century = (Integer.parseInt(birthYear.substring(0,2)) + 1);
        int decade = Integer.parseInt(birthYear.substring(2,3));
        
        System.out.printf("%-10s : %s\n", "Birth Year", birthYear);
        System.out.printf("%-10s : %d\n", "Century", century);
        System.out.printf("%-10s : %d0\n", "Decade", decade);
    }
    
}
