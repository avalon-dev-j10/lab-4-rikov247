package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.person.Personality;

/**
 * Компаратор двух строк, который позволит сортировать по убыванию
 */
public class ComparatorOfComparableObject implements Comparator<Comparable> {

    @Override
    public int compare(Comparable o1, Comparable o2) {
        if (o1 instanceof String && o2 instanceof String) { // если o1 и o2 это String, то
            String otherString1 = (String) o1; // приводим к типу
            String otherString2 = (String) o2; // приводим к типу
            return otherString2.compareTo(otherString1);
        }
        if (o1 instanceof Personality && o2 instanceof Personality) { // если o1 и o2 это Personality, то
            Personality Personality1 = (Personality) o1; // приводим к типу
            Personality Personality2 = (Personality) o2; // приводим к типу
            return Personality2.compareTo(Personality1); // производим сравнение, по методу, описанному для класса Personality
        }
        throw new IllegalArgumentException("only objects of instanceof String or Personality can be compared");
    } 
}
