package ru.avalon.java.dev.j10.labs.randomRealization;

import java.util.Random;

/**
 * Класс для генерации рандомной строки
 */
public class RandomString {

    private Random random = new Random(); // новая переменная класса Random для появления возможности использовать класс Random далее
    private String symbols = "AaBbCcDdEeFfGgHhIiGgKkLlMmNnOoPQqRrSsTtUuVvWwXxYyZz0123456789"; // строка из которой будем брать символы для рандомных строк

    public String getRandomString(int lengthString) {
        StringBuilder stringBuilder = new StringBuilder(lengthString); // экземпляр класса StringBuilder 
        for (int i = 0; i < lengthString; i++) {
            int randomSymbolPosition = random.nextInt(symbols.length()); // получение рандомного числа от 0 до длины массива characters = выбор символа из возможных
            char randomSymbol = symbols.charAt(randomSymbolPosition);// возвращает символ, расположенный по указанному индексу строки
            stringBuilder.append(randomSymbol); // получаемый рандомный символ добавляется в экземпляр класса stringBuilder
        }
        return stringBuilder.toString(); // вывод результирующей строки
    }
}
