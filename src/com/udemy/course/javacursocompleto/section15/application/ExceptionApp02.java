package com.udemy.course.javacursocompleto.section15.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp02 {
    public static void main(String[] args) {
        method1();
        System.out.println("end of program!");
    }

    public static void method1() {
        System.out.println("*** method1 start ***");
        method2();
        System.out.println("*** method1 end ***");
    }

    public static void method2() {
        System.out.println("*** method2 start ***");
        Scanner in = new Scanner(System.in);

        try {
            String[] vect = in.nextLine().split(" ");
            int position = in.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("input error!");
            e.printStackTrace();
        }
        System.out.println("*** method2 end ***");
    }
}
