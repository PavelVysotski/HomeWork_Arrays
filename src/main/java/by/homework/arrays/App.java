package by.homework.arrays;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {

        int[] array = {-8, 6, -5, 9, 14, -1, 0, 22, 14, -14};
        int size = 100;
//        System.out.println("Миксимальное число в массиве: " + LookupArrayService.findMax(array));
//        System.out.println("Минимальное число в массиве: " + LookupArrayService.findMin(array));
//        System.out.println("Индекс максимального числа: " + LookupArrayService.indexOfMax(array));
//        System.out.println("Индекс минимального числа: " + LookupArrayService.indexOfMin(array));
//        System.out.println("Индекс искомого числа: " + LookupArrayService.indexOf(array));

       int leftBound = 3;
       int rightBound = 6;
       ArrayService.printArray(CopyElements.copuInRange(array, leftBound, rightBound));

    }
}
