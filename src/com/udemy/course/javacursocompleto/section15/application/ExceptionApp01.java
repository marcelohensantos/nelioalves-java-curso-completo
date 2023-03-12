package com.udemy.course.javacursocompleto.section15.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            String[] vect = in.nextLine().split(" ");
            int position = in.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("input error!");
        }
        System.out.println("end of program!");
    }
}
