package main.homeWork2;

public class string_3 {
    public static void main(String[] args) {
        String str = "1С2е3г4о3д22н111я о111т3ли7чн88ый 3де344н5ь 4ч3т555обы7 345вы2у3ч2ить 1Д1ж22а9в88у4";
        String str1 = str.replaceAll("[0-9]", "");
        System.out.println(str1);
        String[] s = str1.split(" ");
        int i;
        for (i = 0; i < s.length; i++) {
            if (s[i].toLowerCase().startsWith("д")) {
                System.out.println(s[i]);
            }
        }
    }
}
