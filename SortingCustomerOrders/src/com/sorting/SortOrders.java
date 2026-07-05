package com.sorting;

public class SortOrders {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;

                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(orders, low, high);

            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);

        }
    }

    private static int partition(Order[] orders, int low, int high) {

        double pivot = orders[high].getTotalPrice();

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (orders[j].getTotalPrice() < pivot) {

                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;

            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void display(Order[] orders) {

        for (Order order : orders) {
            System.out.println(order);
        }

    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Rahul", 2500),
                new Order(102, "Priya", 1200),
                new Order(103, "Aman", 5000),
                new Order(104, "Sneha", 1800),
                new Order(105, "Rohit", 3000)
        };

        System.out.println("Original Orders");

        display(orders);

        bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort");

        display(orders);

        Order[] orders2 = {
                new Order(101, "Rahul", 2500),
                new Order(102, "Priya", 1200),
                new Order(103, "Aman", 5000),
                new Order(104, "Sneha", 1800),
                new Order(105, "Rohit", 3000)
        };

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort");

        display(orders2);

    }
}