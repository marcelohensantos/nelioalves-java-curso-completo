package com.udemy.course.javacursocompleto.section13.composition.application;

import com.udemy.course.javacursocompleto.section13.composition.model.entities.Client;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.Order;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.OrderItem;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.Product;
import com.udemy.course.javacursocompleto.section13.composition.model.enums.OrderStatus;
import com.udemy.course.javacursocompleto.section13.composition.service.OrderReportService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderApp01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("enter client data:");
        System.out.print("name: ");
        String clientName = in.nextLine();
        System.out.print("email: ");
        String clientEmail = in.nextLine();
        System.out.print("birth date (dd/mm/yyyy): ");
        Date clientBirthDate = fmt.parse(in.nextLine());
        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("enter order data: ");
        System.out.print("status: ");
        Order order = new Order(new Date(), OrderStatus.valueOf(in.nextLine()), client);

        System.out.print("how many items to this order? ");
        int numItems = in.nextInt();
        for (int i = 0; i < numItems; i++) {
            System.out.printf("enter #%d item data: \n", (i + 1));

            in.nextLine();
            System.out.print("product name: ");
            String productName = in.nextLine();

            System.out.print("product price: ");
            Double productPrice = in.nextDouble();

            System.out.print("quantity: ");
            Integer quantity = in.nextInt();

            order.addItem(new OrderItem(quantity, new Product(productName, productPrice)));
        }
        OrderReportService.generateOrderReport(order);
    }
}
