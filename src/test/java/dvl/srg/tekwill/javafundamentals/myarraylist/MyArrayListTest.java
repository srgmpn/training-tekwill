package dvl.srg.tekwill.javafundamentals.myarraylist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by smotpan on 8/8/2017.
 */
public class MyArrayListTest {

    private MyArrayList myArrayList;


    @Test
    public void createAListWithDefaultConfigs() {
        myArrayList = new MyArrayList();
        assertNotNull(myArrayList);
    }

    @Test
    public void createAListWithCustomConfigs() {
        myArrayList = new MyArrayList(10);
        assertNotNull(myArrayList);
    }

    @Test
    public void getElementFromList() {
        myArrayList = new MyArrayList(1);
        myArrayList.add(100);
        assertNotNull(myArrayList);
        assertEquals(100, myArrayList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementFromListWithNonExistentIndex() {
        myArrayList = new MyArrayList(1);
        myArrayList.add(100);
        assertNotNull(myArrayList);
        myArrayList.get(1);
    }

    @Test
    public void testLengthOfTheList() {
        myArrayList = new MyArrayList();
        myArrayList.add(100);
        myArrayList.add(101);
        myArrayList.add(-100);
        assertNotNull(myArrayList);
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void addElementIntoList() {
        myArrayList = new MyArrayList(1);
        myArrayList.add(10);
        assertNotNull(myArrayList);
        assertEquals(1, myArrayList.size());
        assertEquals(10, myArrayList.get(0));
    }

    @Test
    public void addElementIntoFullList() {
        myArrayList = new MyArrayList(1);
        myArrayList.add(10);
        myArrayList.add(100);
        assertNotNull(myArrayList);
        assertEquals(1, myArrayList.size());
        assertEquals(10, myArrayList.get(0));
    }

    @Test
    public void containExistingElementInList() {
        myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(101);
        myArrayList.add(-1000);
        assertNotNull(myArrayList);
        assertTrue(myArrayList.contains(-1000));
    }

    @Test
    public void containNonExistingElementInList() {
        myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(101);
        assertNotNull(myArrayList);
        assertFalse(myArrayList.contains(1));
    }

    @Test
    public void testRemoveElementFromList() {
        myArrayList = new MyArrayList();
        myArrayList.add(100);
        myArrayList.add(50);
        myArrayList.add(-10);

        assertNotNull(myArrayList);
        assertEquals(3, myArrayList.size());

        myArrayList.remove(2);
        assertEquals(2, myArrayList.size());
        assertFalse(myArrayList.contains(-10));
    }

    @Test
    public void testRemoveElementFromListWithNonExistingIndex() {
        myArrayList = new MyArrayList();
        myArrayList.add(100);

        assertNotNull(myArrayList);
        assertEquals(1, myArrayList.size());

        myArrayList.remove(1);

        assertEquals(1, myArrayList.size());
        assertTrue(myArrayList.contains(100));
    }
}