package main.homeWork3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotEquals;

public class list_2_test_1 {
    @Test
    public void testCaseListContains() {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Hello");
        myArrayList.add("Hello world");
        myArrayList.add("Java");
        System.out.println(myArrayList);
        assertNotEquals("Значение mir найдено", true, myArrayList.contains("mir"));
    }
}
