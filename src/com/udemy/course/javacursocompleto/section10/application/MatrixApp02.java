package com.udemy.course.javacursocompleto.section10.application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixApp02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("mat[%d][%d]: ", i, j);
                matrix[i][j] = in.nextInt();
            }
        }

        for (int[] vector : matrix) {
            for (int element : vector) {
                System.out.printf(element + " ");
            }
            System.out.println();
        }

        int x = in.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.printf("position %d,%d\n", i, j);

                    if (j - 1 >= 0) {
                        System.out.println("left: " + matrix[i][j - 1]);
                    }

                    if (j + 1 < n) {
                        System.out.println("right: " + matrix[i][j + 1]);
                    }

                    if (i - 1 >= 0) {
                        System.out.println("up: " + matrix[i - 1][j]);
                    }

                    if (i + 1 < m) {
                        System.out.println("down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
