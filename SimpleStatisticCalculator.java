/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**This program asks the user to input 5 numbers and the program will calculate the numbers, mean, minimum, maximum, and the standard deviation
 *
 * @author Nicholas Cossette
 */
public class SimpleStatisticCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please input 5 numbers seperated by a space: ");
        double num1 = console.nextDouble();
        double num2 = console.nextDouble();
        double num3 = console.nextDouble();
        double num4 = console.nextDouble();
        double num5 = console.nextDouble();
        
        double mean = (num1 + num2 + num3 + num4 + num5)/5;
        double minimum = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);
        double maximum = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
        double standardDeviation = Math.sqrt((Math.pow((num1 - mean), 2) + Math.pow((num2 - mean), 2) + Math.pow((num3 - mean), 2) + Math.pow((num4 - mean), 2) + Math.pow((num5 - mean), 2))/5);
        
        System.out.printf("%-19s : %.2f, %.2f, %.2f, %.2f, %.2f\n", "Numbers", num1, num2, num3, num4, num5);
        System.out.printf("%-19s : %.2f\n", "Mean", mean);
        System.out.printf("%-19s : %.2f\n", "Minimum", minimum);
        System.out.printf("%-19s : %.2f\n", "Maximum", maximum);
        System.out.printf("%-19s : %.2f\n", "Standard Deviation", standardDeviation);
    }
    
}
