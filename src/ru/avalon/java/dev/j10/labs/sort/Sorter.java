package ru.avalon.java.dev.j10.labs.sort;

import java.util.Comparator;
import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.person.Personality;

/**
 * Класс описывающий реализацию интерфейса Sort 
 */
public class Sorter implements Sort {

    //TODO(преподаватель): не очень понимаю как реализовывается сортировка объектов типа Object? 
    @Override
    public void sort(Object[] array) {
        Arrays.sort(array); // стандартная сортировка объектов типа Object
    }

    // Пузырьковая сортировка для массива элементов типа Personality с возможностью выбора направления сортировки
    private void sortPersonality(Personality[] otherPersonality, boolean sortingDirection) {
        for (int i = 0; i < otherPersonality.length - 1; i++) {
            for (int j = i + 1; j < otherPersonality.length; j++) {
                int resultOfCompare = otherPersonality[i].compareTo(otherPersonality[j], sortingDirection); // используем compareTo описанный для класса Personality
                if (resultOfCompare > 0) {
                    Personality temp = otherPersonality[i];
                    otherPersonality[i] = otherPersonality[j];
                    otherPersonality[j] = temp;
                }
            }
        }
    }

    // Пузырьковая сортировка для массива элементов типа String с возможностью выбора направления сортировки
    private void sortString(String[] otherString, boolean sortingDirection) {
        for (int i = 0; i < otherString.length - 1; i++) {
            for (int j = i + 1; j < otherString.length; j++) {
                int resultOfCompare;
                if (sortingDirection == true) { // реализация изменения направления сортировки
                    resultOfCompare = otherString[i].compareTo(otherString[j]);
                } else {
                    resultOfCompare = otherString[j].compareTo(otherString[i]);
                }
                if (resultOfCompare > 0) {
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
            sortPersonality(otherPersonality, true); // производим сортировку
        }
        if (array instanceof String[]) { // если array это String, то
            String[] otherString = (String[]) array; // приводим к типу;
            sortString(otherString, true); // производим сортировку
        }
    }

    // метод сортировки массива сравниваемых объектов с возможностью выбора направления сортировки
    @Override
    public void sort(Comparable[] array, boolean sortingDirection) {
        if (array instanceof Personality[]) { // если array это Personality, то
            Personality[] otherPersonality = (Personality[]) array; // приводим к типу;
            sortPersonality(otherPersonality, sortingDirection); // производим сортировку
        }
        if (array instanceof String[]) { // если array это String, то
            String[] otherString = (String[]) array; // приводим к типу;
            sortString(otherString, sortingDirection); // производим сортировку
        }
    }

    //TODO(преподаватель): не очень понимаю как реализовать сортировку объектов типа Object? Использовал стандартные методы, но их не понимаю 
    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }

    @Override
    public void sort(Object[] array, Comparator comparator, boolean sortingDirection) {
        if (array instanceof Comparable[]) { // если array это Comparable, то
            if (array instanceof Personality[]) { // если array это Personality, то
                Personality[] otherPersonality = (Personality[]) array; // приводим к типу;
                for (int i = 0; i < otherPersonality.length - 1; i++) {
                    for (int j = i + 1; j < otherPersonality.length; j++) {
                        int resultOfCompare = comparator.compare(otherPersonality[j], otherPersonality[i]); // используем compareTo описанный для класса Personality
                        if (sortingDirection == false) { // реализация изменения направления сортировки
                            resultOfCompare = resultOfCompare * (-1);
                        }
                        if (resultOfCompare > 0) { // производим сортировку
                            Personality temp = otherPersonality[i];
                            otherPersonality[i] = otherPersonality[j];
                            otherPersonality[j] = temp;
                        }
                    }
                }
            }
            if (array instanceof String[]) { // если array это String, то
                String[] otherString = (String[]) array; // приводим к типу;
                for (int i = 0; i < otherString.length - 1; i++) {
                    for (int j = i + 1; j < otherString.length; j++) {
                        int resultOfCompare = comparator.compare(otherString[j], otherString[i]); // используем compareTo описанный для класса Personality
                        if (sortingDirection == false) { // реализация изменения направления сортировки
                            resultOfCompare = resultOfCompare * (-1);
                        }
                        if (resultOfCompare > 0) { // производим сортировку
                            String temp = otherString[i];
                            otherString[i] = otherString[j];
                            otherString[j] = temp;
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Object should be Comparable");
        }
    }
}
