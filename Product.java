/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author emeris
 */

public class Product implements IProduct {

    // One-dimensional array stores product names.
    private String[] productNames;

    // Two-dimensional array stores sales for three months.
    private int[][] monthlySales;

    // Constructor
    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }

    // Calculate total sales for all products.
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int row = 0; row < monthlySales.length; row++) {
            for (int col = 0; col < monthlySales[row].length; col++) {
                total += monthlySales[row][col];
            }
        }

        return total;
    }

    // Calculate average sales per product per month.
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int numberOfSalesEntries = 0;

        for (int row = 0; row < monthlySales.length; row++) {
            numberOfSalesEntries += monthlySales[row].length;
        }

        return (double) total / numberOfSalesEntries;
    }

    // Find the product with the highest total sales.
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int row = 0; row < monthlySales.length; row++) {

            int productTotal = 0;

            for (int col = 0; col < monthlySales[row].length; col++) {
                productTotal += monthlySales[row][col];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = row;
            }
        }

        return productNames[popularIndex] + " (" + highestSales + ")";
    }

    
    }
