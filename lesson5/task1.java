// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


package lesson5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {

    // Добавляем номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    // Печатаем список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Nikolaeva", 123, bookPhone);
        addNumber("Nikolaeva", 1234, bookPhone);
        addNumber("Kozlova", 546585, bookPhone);
        addNumber("Zhukova", 8956477, bookPhone);
        addNumber("Grymov", 12356233, bookPhone);
        addNumber("Zverev", 787897, bookPhone);
        printBook(bookPhone);
    }
}