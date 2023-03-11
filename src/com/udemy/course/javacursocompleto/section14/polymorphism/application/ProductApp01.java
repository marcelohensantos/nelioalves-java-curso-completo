package com.udemy.course.javacursocompleto.section14.polymorphism.application;

import com.udemy.course.javacursocompleto.section14.polymorphism.entities.ImportedProduct;
import com.udemy.course.javacursocompleto.section14.polymorphism.entities.Product;
import com.udemy.course.javacursocompleto.section14.polymorphism.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("enter the number of products: ");
        int numProducts = in.nextInt();

        for (int i = 0; i < numProducts; i++) {
            in.nextLine();

            System.out.printf("product #%d data:\n", (i + 1));
            Product product = null;

            System.out.print("common, used or imported (c/u/i)? ");
            char opt = in.nextLine().toLowerCase().charAt(0);

            System.out.print("name: ");
            String name = in.nextLine();

            System.out.print("price: ");
            double price = in.nextDouble();

            if (opt == 'c') {
                product = new Product(name, price);
            } else if (opt == 'u') {
                in.nextLine();
                System.out.print("manufacture date (dd/mm/yyyy): ");
                product = new UsedProduct(name, price, LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            } else if (opt == 'i') {
                System.out.print("custom fee: ");
                product = new ImportedProduct(name, price, in.nextDouble());
            }
            products.add(product);
        }

        System.out.println("\nprice tags");
        for (Product product : products) {
            if (product == null) continue;
            System.out.println(product.priceTag());
        }
    }
}
