package by.homework.arrays;

import junit.framework.TestCase;
import org.junit.Test;


public class LookupArrayServiceTest extends TestCase {

    int[] array = {1, -5, 14, 22, 0, -18, 5, 7, 11, 6};
    int[] nullArray = null;


    @Test
    public void testFindMax() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(22, lookupArrayService.findMax(array));
        assertEquals(0, lookupArrayService.findMax(nullArray));
    }

    @Test
    public void testFindMin() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(-18, lookupArrayService.findMin(array));
        assertEquals(0, lookupArrayService.findMin(nullArray));
    }

    @Test
    public void testIndexOfMax() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(3, lookupArrayService.indexOfMax(array));
        assertEquals(-1, lookupArrayService.indexOfMax(nullArray));
    }

    @Test
    public void testIndexOfMin() {
        LookupArrayService lookupArrayService = new LookupArrayService();

        assertEquals(5, lookupArrayService.indexOfMax(array));
        assertEquals(-1, lookupArrayService.indexOfMax(nullArray));
    }

    @Test
    public void testIndexOf() {

    }
}