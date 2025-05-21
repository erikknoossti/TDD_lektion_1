package com.demo.lektion1;

public class Main {

    public static void main(String[] args) {
        // Items
        String item1Name = "Laptop";
        double item1Price = 1000.00;
        int item1Quantity = 1;

        String item2Name = "Phone";
        double item2Price = 500.00;
        int item2Quantity = 2;

        // Discount
        double discount = 10.0;

        // Prices before discount
        double totalBeforeDiscount = calculateTotal(item1Price, item1Quantity, item2Price, item2Quantity);
        printTotals("Total", totalBeforeDiscount, discount);

        // Another method of calculating total for the same items
        double anotherTotalBeforeDiscount = calculateTotal(item1Price, item1Quantity, item2Price, item2Quantity);
        printTotals("Another total", anotherTotalBeforeDiscount, discount);
    }

    public static double calculateTotal(double price1, int quantity1, double price2, int quantity2) {
        return (price1 * quantity1) + (price2 * quantity2);
    }

    public static void printTotals(String label, double totalBeforeDiscount, double discount) {
        double discountAmount = totalBeforeDiscount * (discount / 100);
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;

        System.out.println(label + " before discount: $" + totalBeforeDiscount);
        System.out.println("Discount: $" + discountAmount);
        System.out.println(label + " after discount: $" + totalAfterDiscount);
    }
}