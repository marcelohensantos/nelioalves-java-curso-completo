package com.udemy.course.javacursocompleto.section15.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionApp03 {
    public static void main(String[] args) {
        File file = new File("in.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("error opening file: " + e.getMessage());
        } finally {
            if (in != null) in.close();
        }
    }
}
