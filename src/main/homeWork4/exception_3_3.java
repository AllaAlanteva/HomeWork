package main.homeWork4;

public class exception_3_3 {
    public static void main(String[] args) {
        try {
            String stroka = "12.5";
            int number = Integer.parseInt(stroka);
        } catch (NumberFormatException e) {
            System.out.println("Невозможно преобразовать строку в число");
        }
    }
}
