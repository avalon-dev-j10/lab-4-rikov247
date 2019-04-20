package ru.avalon.java.dev.j10.labs.randomRealization;

import java.util.Date;
import java.util.Random;

/**
 * Класс для гернерации рандомного (случайного) дня рождения
 */
public class RandomBirthDate {

    private int year; // переменная: год рождения
    private int month; // переменная: месяц рождения
    private int day; // переменная: день рождения
    private Date birthDate = new Date(year, month, day); // переменная для хранения Даты рождения
    private Random random = new Random(); // новая переменная класса Random для появления возможности использовать класс Random далее

    public Date getRandomBirthDate() {
        int tempRandomYear = random.nextInt((2019 + 1) - 1939) + 1939; // получение рандомного числа в диапазоне 1939 - 2019 = год рождения
        int tempRandomMonth = random.nextInt((12 + 1) - 1) + 1; // получение рандомного месяца рождения от 1 до 12
        int tempRandomDay = random.nextInt((31 + 1) - 1) + 1; // получение рандомного числа рождения от 1 до 31
        Date tempRandomBirthDay = new Date(tempRandomYear - 1900, tempRandomMonth - 1, tempRandomDay); // генерация рандомной Даты
        return tempRandomBirthDay;
    }
}
