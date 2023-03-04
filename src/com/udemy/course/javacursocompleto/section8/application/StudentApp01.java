package com.udemy.course.javacursocompleto.section8.application;

import com.udemy.course.javacursocompleto.section8.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);
        Student student = new Student();

        student.name = in.nextLine();
        for (int i = 0; i < student.grades.length; i++) {
            student.grades[i] = in.nextDouble();
        }

        System.out.printf("final grade: %.2f\n", student.finalGrade());
        if (student.isApproved()) {
            System.out.println("pass");
        } else {
            System.out.println("failed");
            System.out.printf("missing %.2f points\n", student.missingPoints());
        }
    }
}
