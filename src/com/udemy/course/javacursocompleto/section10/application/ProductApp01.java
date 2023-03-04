package com.udemy.course.javacursocompleto.section10.application;

import com.udemy.course.javacursocompleto.section10.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            in.nextLine();

            String name = in.nextLine();
            double price = in.nextDouble();

            products[i] = new Product(name, price);
        }

        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        System.out.printf("AVERAGE PRICE: %.2f\n", (sum / products.length));
    }
}
