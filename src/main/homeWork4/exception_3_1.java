package main.homeWork4;

public class exception_3_1 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс находится за пределами заданного массива");
        }
    }
}
