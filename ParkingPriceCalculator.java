/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *This program will ask the user to input the number of minutes their car was parked and the program will calculate the hour and price and output the minutes, hours, and price
 * @author Nicholas Cossette
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int hourlyRate = 2;
        
        System.out.print("Please input the number of minutes your car has parked: ");
        double minutes = console.nextDouble();
        
        double hours = Math.ceil(minutes / 60);
        double price = hours * hourlyRate;
        
        System.out.printf("%-24s : %.0f\n", "Parking time (minutes)", minutes);
        System.out.printf("%-24s : %.0f\n", "Parking time (hour)", hours);
        System.out.printf("%-24s : %.2f\n", "Price", price);
    }
    
}
