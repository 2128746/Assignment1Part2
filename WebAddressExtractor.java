/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 * This program is designed to extract the Heading, Company, and Extension from a user input web address
 * @author Nicholas Cossette
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please in put a web address: ");
        
        String webAddress = console.nextLine();
        
        int first = webAddress.indexOf('.');
        int second = webAddress.indexOf('.', first + 1);
        
        String heading = webAddress.substring(0, first);
        String company = webAddress.substring(first + 1, second);
        String extension = webAddress.substring(second + 1);
        
        System.out.printf("\n%-10s : %s\n", "Address", webAddress.toLowerCase());
        System.out.printf("%-10s : %s\n", "Heading", heading.toLowerCase());
        System.out.printf("%-10s : %s\n", "Company", company.toLowerCase());
        System.out.printf("%-10s : %s\n", "Extension", extension.toLowerCase());
    }
    
}
