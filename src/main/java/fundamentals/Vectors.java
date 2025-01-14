package fundamentals;

import poo.Product;

import java.util.Scanner;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {
        System.out.println("HADOUKEN VECTORS");
    }

    public int loadNumberOfProducts() {
        int numberOfProducts = 0;
        Scanner numberOfProductsScanner = new Scanner(System.in);
        System.out.println("Type the number of products");
        numberOfProducts = numberOfProductsScanner.nextByte();
        return numberOfProducts;
    }

    public int loadProducts(int numberOfProducts) {
        Vector<Product> productVector = new Vector<Product>(numberOfProducts);

        for (int i = 0; i < numberOfProducts; i++) {
            Product newProduct = new Product("new name" + numberOfProducts, 1000, 20);
            productVector.add(newProduct);
        }


        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("PRODUCT:");
            System.out.println(productVector.get(i));
        }

        return 0;
    }
}
