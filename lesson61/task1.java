// Задание
// Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество
// объектов.
// Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они
// сохранились во множество.
// Создайте метод
// public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
// только если значения во всех полях сравниваемых объектов равны.
// Создайте метод
// public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

package lesson61;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class task1 {
    public static void main(String[] args) {
        cats();
    }
    public static void cats(){

        Cat cat1 = new Cat("Сеня", "Ж", "Серо-белый", 3 );
        Cat cat2 = new Cat("Киса", "Ж", "Черный", 6 );
        Cat cat3 = new Cat("Барса", "Ж", "Белый", 11 );
        Cat cat4 = new Cat("Нюся", "Ж", "Черный", 2 );
        Cat cat5 = new Cat("Кузя", "М", "Черный", 9 );
        Cat cat6 = new Cat("Пухлик", "М", "Серый", 5 );

        HashSet<Cat> Cats = new HashSet<>();
        Cats.add(cat1);
        Cats.add(cat2);
        Cats.add(cat3);
        Cats.add(cat4);
        Cats.add(cat5);
        Cats.add(cat6);

        System.out.println(Cats);
        System.out.println(cat1.equals(cat6));

    }
}