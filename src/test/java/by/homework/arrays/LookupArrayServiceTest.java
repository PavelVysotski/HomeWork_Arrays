package by.homework.arrays;

import junit.framework.TestCase;



public class LookupArrayServiceTest extends TestCase {

    int[] array = {1, -5, 14, 22, 0, -18, 5, 7, 11, 6};
    int[] nullArray = null;



    public void testFindMax() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(22, lookupArrayService.findMax(array));
        assertEquals(0, lookupArrayService.findMax(nullArray));
    }

    public void testFindMin() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(-18, lookupArrayService.findMin(array));
        assertEquals(0, lookupArrayService.findMin(nullArray));
    }

    public void testIndexOfMax() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(3, lookupArrayService.indexOfMax(array));
        assertEquals(-1, lookupArrayService.indexOfMax(nullArray));
    }

    public void testIndexOfMin() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(5, lookupArrayService.indexOfMax(array));
        assertEquals(-1, lookupArrayService.indexOfMax(nullArray));
    }

    public void testIndexOf() {
        LookupArrayService lookupArrayService = new LookupArrayService();
        
        assertEquals(5, lookupArrayService.indexOf(array));
        assertEquals(-1, lookupArrayService.indexOf(nullArray));
    }
}