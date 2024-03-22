package main.homeWork3;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class list_2_test_2 {
    @Test
    public void testCaseList() {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(8);
        myArrayList.add(6);
        System.out.println(myArrayList);
        assertTrue("Список не пуст", myArrayList.isEmpty());
    }
}
