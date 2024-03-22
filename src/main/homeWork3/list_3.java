package main.homeWork3;

import java.util.ArrayList;
import java.util.LinkedList;

public class list_3 {
    public static void main(String[] args) {
        ArrayList<Double> myArrayList = new ArrayList<>();
        LinkedList<Double> myLinkedList = new LinkedList<>();

        long startTime_array = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myArrayList.add(Math.random());
        }
        long endTime_array = System.currentTimeMillis();
        long executionTime_array = endTime_array - startTime_array;
        System.out.println("Время выполнения ArrayList: " + executionTime_array);

        long startTime_linked = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myLinkedList.add(Math.random());
        }
        long endTime_linked = System.currentTimeMillis();
        long executionTime_linked = endTime_linked - startTime_linked;
        System.out.println("Время выполнения LinkedList: " + executionTime_linked);

        long startTime_countArray = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myArrayList.get((int) (Math.random() * (1000000 - 1)));
        }
        long endTime_countArray = System.currentTimeMillis();
        long executionTime_countArray = endTime_countArray - startTime_countArray;
        System.out.println("Время выполнения млн запросов для ArrayList: " + executionTime_countArray);

        long startTime_countLinked = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myLinkedList.get((int) (Math.random() * (1000000 - 1)));
        }
        long endTime_countLinked = System.currentTimeMillis();
        long executionTime_countLinked = endTime_countLinked - startTime_countLinked;
        System.out.println("Время выполнения млн запросов для LinkedList: " + executionTime_countLinked);
    }
}
