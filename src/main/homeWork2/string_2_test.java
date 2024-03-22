package main.homeWork2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class string_2_test {
    @Test
    public void testCaseTrueStrings() {
        String first = "Hello world";
        String second = "Hello world";
        assertTrue("Значения первой и второй строки не равны", first == second);
    }
}
