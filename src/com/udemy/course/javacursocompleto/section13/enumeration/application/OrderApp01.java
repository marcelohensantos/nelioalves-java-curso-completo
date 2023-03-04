package com.udemy.course.javacursocompleto.section13.enumeration.application;

import com.udemy.course.javacursocompleto.section13.enumeration.model.entities.Order;
import com.udemy.course.javacursocompleto.section13.enumeration.model.enums.OrderStatus;

import java.util.Date;

public class OrderApp01 {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
