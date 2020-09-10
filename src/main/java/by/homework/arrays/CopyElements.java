package by.homework.arrays;

public class CopyElements {

    public static int[] copyInRange(int[] array, int leftBound, int rightBound) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= leftBound && array[i] <= rightBound) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= leftBound && array[i] <= rightBound) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
