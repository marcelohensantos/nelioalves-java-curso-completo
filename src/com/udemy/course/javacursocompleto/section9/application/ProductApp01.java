package com.udemy.course.javacursocompleto.section9.application;

import com.udemy.course.javacursocompleto.section9.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("enter product data: ");
        System.out.print("name: ");
        String name = in.nextLine();
        System.out.print("price: ");
        double price = in.nextDouble();

        Product product = new Product(name, price);
        System.out.println("\nproduct data: " + product);

        System.out.print("\nenter the number of products to be added in stock: ");
        product.addProducts(in.nextInt());
        System.out.println("\nupdated data: " + product);

        System.out.print("\nenter the number of products to be removed from stock: ");
        product.removeProducts(in.nextInt());
        System.out.println("\nupdated data: " + product);
    }
}
