package main.homeWork4;

import java.util.TreeSet;

public class set_2 {
    public static void main(String[] args) {
        TreeSet<Integer> linked = new TreeSet<>();
        TreeSet<Integer> array = new TreeSet<>();
        linked.add(178);
        linked.add(100);
        linked.add(66);
        linked.add(54);
        linked.add(48);
        linked.add(200);
        linked.add(9);
        linked.add(23);
        linked.add(18);
        linked.add(10);

        array.add(666);
        array.add(100);
        array.add(166);
        array.add(55);
        array.add(38);
        array.add(200);
        array.add(19);
        array.add(99);
        array.add(78);
        array.add(10);

        TreeSet<Integer> resultSet = new TreeSet<>(linked);
        resultSet.retainAll(array);

        System.out.println("Элементы, содержащиеся в обоих множествах: ");
        for (Integer element : resultSet.descendingSet()) {
            System.out.println(element);
        }
    }
}
