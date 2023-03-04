package com.udemy.course.javacursocompleto.section08.application;

import com.udemy.course.javacursocompleto.section08.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductTestApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Product product = new Product();
        System.out.println("enter product data: ");
        System.out.print("name: ");
        product.name = in.nextLine();
        System.out.print("price: ");
        product.price = in.nextDouble();
        System.out.print("quantity in stock: ");
        product.quantity = in.nextInt();

        System.out.println("\nproduct data: " + product);

        System.out.print("\nenter the number of products to be added in stock: ");
        product.addProducts(in.nextInt());
        System.out.println("\nupdated data: " + product);

        System.out.print("\nenter the number of products to be removed from stock: ");
        product.removeProducts(in.nextInt());
        System.out.println("\nupdated data: " + product);

    }
}
