package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class task1 {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayCreate = arrayCreate();
        System.out.println("Созданный список: " + arrayCreate);
        System.out.println("Список без четных чисел : " + arrayOdd(arrayCreate));
        System.out.println("Минимальное значение списка: " + arrayMin(arrayCreate));
        System.out.println("Максимальное значение списка: " + arrayMax(arrayCreate));
        System.out.println("Среднее значение списка: " + arrayAvg(arrayCreate));

    }

    
    // Заполнить список десятью случайными числами.
     
    static ArrayList<Integer> arrayCreate() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(1, 25));
        }
        return arrayList;
    }
    
     // Удаляем четные числа

    static ArrayList<Integer> arrayOdd(ArrayList<Integer> arrayCreate) {
        ArrayList<Integer> arrayListOdd = new ArrayList<>();
        for (int i = 0; i < arrayCreate.size(); i++) {
            if (arrayCreate.get(i) % 2 != 0) {
                arrayListOdd.add(arrayCreate.get(i));
            }
        }
        return arrayListOdd;
    }
    
    //  Находим минимальное значение в исходном списке
    
    static int arrayMin(ArrayList<Integer> arrayCreate) {
        return Collections.min(arrayCreate);
    }

    // Находим максимальное значение в исходном списке
  
    static int arrayMax(ArrayList<Integer> arrayCreate) {
        return Collections.max(arrayCreate);
    }

    // Находим среднее значение в исходном списке
    
    static int arrayAvg(ArrayList<Integer> arrayCreate) {
        int sum = 0;
        for (int i = 0; i < arrayCreate.size(); i++) {
            sum += arrayCreate.get(i);
        }
        return sum / arrayCreate.size();
    }

}