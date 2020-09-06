package by.homework.arrays;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {

        int[] array = {1, -5, 14, 22, 0, -18, 5, 7, 11, 6};
        int[] nullArray = null;
        int size = 20;

        System.out.println(LookupArrayService.indexOfMax(nullArray));
    }
}
