package com.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {

    // HashMap to store products
    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully!");
    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {

        if (inventory.containsKey(productId)) {

            Product product = inventory.get(productId);

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Display All Products
    public void displayProducts() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty!");
            return;
        }

        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {

        InventoryManagement inventory = new InventoryManagement();

        // Adding Products
        inventory.addProduct(new Product(101, "Laptop", 20, 65000));
        inventory.addProduct(new Product(102, "Mouse", 100, 500));
        inventory.addProduct(new Product(103, "Keyboard", 50, 1200));

        System.out.println("\nInventory:");

        inventory.displayProducts();

        // Update Product
        inventory.updateProduct(102, 120, 550);

        System.out.println("\nAfter Update:");

        inventory.displayProducts();

        // Delete Product
        inventory.deleteProduct(103);

        System.out.println("\nAfter Deletion:");

        inventory.displayProducts();
    }
}