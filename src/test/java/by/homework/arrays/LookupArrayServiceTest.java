package by.homework.arrays;

import junit.framework.TestCase;

import java.util.Scanner;

public class LookupArrayServiceTest extends TestCase {

    int[] array = {1, -5, 14, 22, 0, -18, 5, 7, 11, 6};
    int[] nullArray = null;


    public void testFindMax() {
        assertEquals(22, LookupArrayService.findMax(array));
        assertEquals(0, LookupArrayService.findMax(nullArray));
    }

    public void testFindMin() {
        assertEquals(-18, LookupArrayService.findMin(array));
        assertEquals(0, LookupArrayService.findMin(nullArray));
    }

    public void testIndexOfMax() {
        assertEquals(3, LookupArrayService.indexOfMax(array));
        assertEquals(-1, LookupArrayService.indexOfMax(nullArray));
    }

    public void testIndexOfMin() {
        assertEquals(5, LookupArrayService.indexOfMax(array));
        assertEquals(-1, LookupArrayService.indexOfMax(nullArray));
    }

//    public void testIndexOf() {
//
//        assertEquals(5, LookupArrayService.indexOf(array));
//        assertEquals(-1, LookupArrayService.indexOf(nullArray));
//    }
}