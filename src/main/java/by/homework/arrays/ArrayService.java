package by.homework.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayService {

    public static int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public static void fillRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 0)) + 0;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double avg(int[] array) {
        if (array == null) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (double) sum / array.length;
        }
    }

    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void swap(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
