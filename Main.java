/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author emeris
 */




import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Store the names of the three products.
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Store sales for three products over three months.
        int[][] monthlySales = new int[3][3];

        // Get sales information from the user.
        for (int row = 0; row < productNames.length; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print("Enter number of sales for month "
                        + (col + 1) + " for "
                        + productNames[row] + ": ");

                monthlySales[row][col] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object.
        Product product = new Product(productNames, monthlySales);

        // Create PrintProduct object.
        PrintProduct report = new PrintProduct();

        // Display the sales report.
        report.PrintReport(product);

        input.close();
    }
}