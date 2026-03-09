package com.acme.basic;

public class Bar {

    int matrix1[][];   // Noncompliant
    int[] matrix2[];   // Noncompliant

    public void barMethod() {
        System.out.println("Bar");

        System.out.println("test-inline");
    }

    public void sumMatrices() {
        int sum = 0;
        if (matrix1 != null) {
            for (int[] row : matrix1) {
                if (row != null) {
                    for (int val : row) {
                        sum += val;
                    }
                }
            }
        }
        if (matrix2 != null) {
            for (int[] row : matrix2) {
                if (row != null) {
                    for (int val : row) {
                        sum += val;
                    }
                }
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
