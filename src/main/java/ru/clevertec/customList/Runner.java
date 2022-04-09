package ru.clevertec.customList;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Hello", "New", "World");
        List<String> list2 = new ArrayList<>();

        list2.add(null);
        list2.add(null);
        list2.add(null);

        Collections.copy(list2, list1);

        Iterator<String> iterator1 = list1.iterator();
        Iterator<String> iterator2 = list2.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            System.out.println("List1: " + iterator1.next() + "; List2: " + iterator2.next());
        }

        ListIterator<String> stringListIterator1 = list1.listIterator();
        ListIterator<String> stringListIterator2 = list2.listIterator();
        while (stringListIterator1.hasNext() && stringListIterator2.hasNext()) {
            System.out.println("List1: " + stringListIterator1.next() + "; List2: " + stringListIterator2.next());
        }
    }
}
