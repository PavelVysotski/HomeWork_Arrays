package by.homework.arrays;

public class CopyElements {

    public static int[] copuInRange(int[] array, int leftBound, int rightBound) {
        int[] newArray = new int[rightBound - leftBound + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i + leftBound - 1];
        }
        return newArray;
    }
}
