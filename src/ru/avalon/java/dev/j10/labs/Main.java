package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.person.*;
import ru.avalon.java.dev.j10.labs.randomRealization.*;
import ru.avalon.java.dev.j10.labs.sort.*;
import java.util.Comparator; 

public class Main {

    public static void main(String[] args) {

        // Strings (Строки)
        String[] strings = new String[20]; // создание пустого массива строк на 20 элементов

        RandomString randomString = new RandomString(); // создание экземпляра класса RandomString

        for (int i = 0; i < strings.length; i++) {
            strings[i] = randomString.getRandomString(11); // заполнение массива string рандомными строками с задаваемым количеством символов
        }

        // Persons (Люди)
        Personality[] persons = new Personality[20]; // создание пустого массива на 20 элементов типа Personality, которые реализуют интерфейс Person

        PersonInitializer personInitializer = new PersonInitializer(); // создается экземпляр класса (инициализатор) PersonInitializer для доступа к методам этого класса
        personInitializer.initialize(persons); // массив person инициализируется элементами (заполняется)

        Sort sort = new Sorter(); // инициализация экземпляра класса Sorter, реализующего интерфейс Sort

        Comparator comparator = new StringComparator(); // инициализация компаратора для строк

        // Сортировка массива persons по возрастанию (имени)
        sort.sort(persons);

        // Сортировка массива strings по возрастанию
        sort.sort(strings);

        // Сортировка массива strings с помощью компаратора по убыванию
        sort.sort(strings, comparator);
    }
}
