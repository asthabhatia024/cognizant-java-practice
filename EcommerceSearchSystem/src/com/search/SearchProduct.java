package com.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchProduct {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {

        for (Product product : products) {

            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }

        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].getProductName().compareToIgnoreCase(name);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Office")
        };

        // Linear Search
        System.out.println("----- Linear Search -----");

        Product result = linearSearch(products, "Keyboard");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        // Sort Array for Binary Search
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        System.out.println("\n----- Binary Search -----");

        result = binarySearch(products, "Keyboard");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

    }

}