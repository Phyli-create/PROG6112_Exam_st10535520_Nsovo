/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesreport;

/**
 *
 * @author emeris
 */



import com.mycompany.productsalesreport.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    // Test 1: Verify total product sales.
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        String[] names = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(names, sales);

        assertEquals(153, product.GetTotalProductsSold());
    }

    // Test 2: Verify average product sales.
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        String[] names = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(names, sales);

        assertEquals(17.0, product.GetAverageProductSold(), 0.001);
    }
}