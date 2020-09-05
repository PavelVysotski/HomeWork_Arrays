package by.homework.arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LookupArrayService {

    public static int findMax(int[] array) {
        if (array == null) {
            return 0;
        } else {
            int tempMax = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > tempMax) {
                    tempMax = array[i];
                }
            }
            return tempMax;
        }
    }

    public static int findMin(int[] array) {
        if (array == null) {
            return 0;
        } else {
            int tempMin = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < tempMin) {
                    tempMin = array[i];
                }
            }
            return tempMin;
        }
    }

    public static int indexOfMax(int[] array) {
        if (array == null) {
            return -1;
        } else {
            int tempMax = array[0];
            int indexMax = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > tempMax) {
                    tempMax = array[i];
                    indexMax = i;
                }
            }
            return indexMax;
        }
    }

    public static int indexOfMin(int[] array) {
        if (array == null) {
            return -1;
        } else {
            int tempMin = array[0];
            int indexMin = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < tempMin) {
                    tempMin = array[i];
                    indexMin = i;
                }
            }
            return indexMin;
        }
    }

    public static int indexOf(int[] array) {
        if (array == null) {
            return -1;
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите число, индекс которого необходимо найти:");
            int number = scan.nextInt();
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    index = i;
                }
            }
            return index;
        }
    }
}
