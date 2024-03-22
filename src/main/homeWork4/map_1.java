package main.homeWork4;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map_1 {
    public static void main(String[] args) {

        HashMap<String, Date> dictionary = new HashMap<>();
        dictionary.put("Иванова", new Date("JUNE 1 2008"));
        dictionary.put("Цветков", new Date("JULY 5 2005"));
        dictionary.put("Ромашкова", new Date("AUGUST 5 2001"));
        dictionary.put("Летов", new Date("MAY 5 1998"));
        dictionary.put("Кошкин", new Date("MARCH 5 1994"));
        dictionary.put("Мышкина", new Date("DECEMBER 5 1991"));
        dictionary.put("Петров", new Date("JULY 5 2000"));
        dictionary.put("Круглов", new Date("JUNE 5 2001"));
        dictionary.put("Апрельский", new Date("APRIL 5 1990"));
        dictionary.put("Мушкин", new Date("OCTOBER 5 1989"));

        System.out.println(dictionary);

        Iterator<Map.Entry<String, Date>> iterator = dictionary.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> a = iterator.next();
            int m = a.getValue().getMonth();

            if (m ==  5 || m == 6 || m == 7)
                iterator.remove();
        }
        System.out.println(dictionary);
    }
}
