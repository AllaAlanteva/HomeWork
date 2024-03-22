package main.homeWork2;

public class string_1_1 {
    public static void main(String[] args) {
        char[] chars = "Hello world!!!".toCharArray();
        if((chars.length % 2)==0) {
            char[] name = new char[2];
            name[0] = chars[chars.length / 2 - 1];
            name[1] = chars[chars.length / 2];
            String result = new String(name);
            System.out.println(result);
        }
        else {
            char[] name = new char[1];
            name[0] = chars[chars.length / 2];
            String result = new String(name);
            System.out.println(result);
        }
    }
}
