package ru.avalon.java.dev.j10.labs.randomRealization;

import java.util.Random;

// Класс для получения рандомного имени из списка возможных
public class RandomName {

    private Random random = new Random(); // новая переменная класса Random для появления возможности использовать класс Random далее
    
    private String[] names = {
        "Алексей",
        "Андрей",
        "Артем",
        "Александра",
        "Алиса",
        "Анастасия",
        "Анна",
        "Арина",
        "Виктор",
        "Валерия",
        "Варвара",
        "Вероника",
        "Виктория",
        "Даниил",
        "Дмитрий",
        "Дарья",
        "Максим",
        "Марк",
        "Маргарита",
        "Мария",
        "Давид",
        "Павел",
        "Тимофей",
        "Татьяна",
        "Оксана",
        "Олеся",
        "Светлана",
        "Святослав",
        "Евгений",
        "Евгения",
    };

    public String getRandomName() {
        int temp = random.nextInt(names.length); // получение рандомного числа от 0 до длины массива names
        String randomName = names[temp]; // переменной вывода имени присваивается какое то имя из массива возможных имен temp
        return randomName; // вывод рандомного имени
    }
}
