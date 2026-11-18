/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author emeris
 */

public class PrintProduct {

    // Print total product sales.
    public void PrintTotalProductSales(Product product) {
        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Print average product sales.
    public void PrintAverageProductSales(Product product) {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",
                product.GetAverageProductSold());
    }

    // Print the most popular product.
    public void PrintMostPopularProduct(Product product) {
        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    // Print the complete report.
    public void PrintReport(Product product) {

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");

        PrintTotalProductSales(product);
        PrintAverageProductSales(product);
        PrintMostPopularProduct(product);
    }
}