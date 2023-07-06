//  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package lesson4;

import java.util.LinkedList;

public class task1 {

    public static void main(String[] args) {

        int[] listMas = { 1, 6, 8, 2, 9 };
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }

        System.out.println("Reversed_linkList = " + linkList);

    }
}
