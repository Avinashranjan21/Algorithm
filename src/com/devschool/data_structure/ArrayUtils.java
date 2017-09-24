package com.devschool.data_structure;

/**
 * Created by avinash.ranjan on 24/09/17.
 */
public class ArrayUtils {

    public static double maxInArray(int array[]) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static double averageOfArray(int array[]) {
        int N = array.length;
        double sum = 0.0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum / N;
    }

    public static double[] copyToAnotherArray(int array[]) {
        int N = array.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = array[i];
        }
        return b;
    }

    public static double[] reverseTheElement(double array[]) {
        int N = array.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = array[i];
            array[i] = array[N - 1 - i];
            array[N - i - 1] = temp;
        }
        return array;
    }

    //    a[][]*b[][] = c[][]
    public static double[][] matrixMatrixMultiplication(double a[][], double b[][]) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) { // Compute dot product of row i and column j.
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        return c;
    }
}
