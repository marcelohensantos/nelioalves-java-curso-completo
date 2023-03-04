package com.udemy.course.javacursocompleto.section10.application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixApp01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("m[%d][%d]: ", i, j);
                matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }

        int negativeNumbers = 0;
        System.out.println("main diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    negativeNumbers++;
                }

                if (i == j) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.printf("\nnegative numbers: %d\n", negativeNumbers);
    }
}
