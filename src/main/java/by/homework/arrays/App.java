package by.homework.arrays;



public class App {
    public static void main(String[] args) {


        int[] array = {1, -2, 5, 10, 4, 8, 7, -5, 16, 6};
        int leftBound = -5;
        int rightBound = 5;

        ArrayService.printArray(CopyElements.copyInRange(array, leftBound, rightBound));

    }

}


