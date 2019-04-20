package ru.avalon.java.dev.j10.labs.person;

import ru.avalon.java.dev.j10.labs.person.Personality;

/**
 * класс для инициализации (заполнения) массива persons (людей) людьми
 */
public class PersonInitializer {

    public void initialize(Personality[] persons) { // инициализация массива persons (людей) рандомными параметрами
        for (int i = 0; i < persons.length; i++) {
            Personality temp = new Personality(null, null);
            temp.setRandomBirthDate();
            temp.setRandomName();
            persons[i] = temp;
        }
    }
}