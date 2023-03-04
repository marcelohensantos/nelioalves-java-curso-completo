package com.udemy.course.javacursocompleto.section13.composition.service;

import com.udemy.course.javacursocompleto.section13.composition.model.entities.Order;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.OrderItem;

import java.text.SimpleDateFormat;

public class OrderReportService {
    private static final SimpleDateFormat fmtMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final SimpleDateFormat fmtBirthDate = new SimpleDateFormat("dd/MM/yyyy");

    public static void generateOrderReport(Order order) {
        if (order == null) return;
        System.out.println("\norder summary:");
        System.out.println("order moment: " + fmtMoment.format(order.getMoment()));
        System.out.println("order status: " + order.getStatus());
        System.out.printf("client: %s (%s) - %s\n", order.getClient().getName(), fmtBirthDate.format(order.getClient().getBirthDate()), order.getClient().getEmail());

        if (order.getItems().isEmpty()) return;
        System.out.println("Order items:");
        for (OrderItem item : order.getItems()) {
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f\n", item.getProduct().getName(), item.getProduct().getPrice(), item.getQuantity(), item.subTotal());
        }
        System.out.printf("total price: $%.2f\n", order.total());
    }
}
