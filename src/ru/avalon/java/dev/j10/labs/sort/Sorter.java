package ru.avalon.java.dev.j10.labs.sort;

import java.util.Comparator;
import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.person.Personality;

/**
 *
 */
public class Sorter implements Sort {

    //TODO(преподаватель): не очень понимаю как реализовать сортировку объектов типа Object? 
    @Override
    public void sort(Object[] array) {
        Arrays.sort(array); // стандартная сортировка объектов типа Object
    }

    // Пузырьковая сортировка для массива элементов типа Personality
    public void sortPersonality(Personality[] otherPersonality) { 
        for (int i = 0; i < otherPersonality.length - 1; i++) {
            for (int j = i + 1; j < otherPersonality.length; j++) {
                int resultOfCompare = otherPersonality[i].compareTo(otherPersonality[j]);
                if (resultOfCompare > 0) {
                    Personality temp = otherPersonality[i];
                    otherPersonality[i] = otherPersonality[j];
                    otherPersonality[j] = temp;
                }
            }
        }
    }

    // Пузырьковая сортировка для массива элементов типа String
    public void sortString(String[] otherString) {
        for (int i = 0; i < otherString.length - 1; i++) {
            for (int j = i + 1; j < otherString.length; j++) {
                if (otherString[i].compareTo(otherString[j]) > 0) {
                    String temp = otherString[i]; 
                    otherString[i] = otherString[j];
                    otherString[j] = temp;
                }
            }
        }
    }

    // метод сортировки массива сравниваемых объектов
    @Override
    public void sort(Comparable[] array) {
        if (array instanceof Personality[]) { // если array это Personality, то
            Personality[] otherPersonality = (Personality[]) array; // приводим к типу;
            sortPersonality(otherPersonality); // производим сортировку
        }
        if (array instanceof String[]) { // если array это String, то
            String[] otherString = (String[]) array; // приводим к типу;
            sortString(otherString); // производим сортировку
        }
    }

    //TODO(преподаватель): не очень понимаю как реализовать сортировку объектов типа Object? Использовал стандартные методы, но их не понимаю 
    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }

}
