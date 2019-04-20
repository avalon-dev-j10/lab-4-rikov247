package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * Компаратор двух строк, который позволит сортировать по убыванию
 */
public class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
    
}
