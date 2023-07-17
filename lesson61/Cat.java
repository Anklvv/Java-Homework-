package lesson61;

import java.util.Objects;

public class Cat {
    /**
     * Кличка
     */
    String name;
    /**
     * Пол кота
     */
    String gender;
    /**
     Цвет кота
     */
    String color;
    /**
     Возраст
     */
    int age;

    public  Cat(){

    }
    public Cat(String name, String gender, String color, int age){
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Кличка:" + name +
                ", Пол:" + gender +
                ", Цвет:" + color +
                ", Возраст:" + age + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(gender, cat.gender) && Objects.equals(color, cat.color);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, gender, color, age);
    }
}