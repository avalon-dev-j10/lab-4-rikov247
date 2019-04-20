package ru.avalon.java.dev.j10.labs.person;

import ru.avalon.java.dev.j10.labs.randomRealization.RandomName;
import ru.avalon.java.dev.j10.labs.randomRealization.RandomBirthDate;
import java.util.Date;
import java.util.Objects;

/**
 * Класс, реализующий интерфейсы класса Person. <n>
 * Класс описывает Человека, у которого есть Имя и Дата рождения.
 */
public class Personality implements Person {

    private String name; // переменная для хранения имени Человека
    private Date birthDate; // переменная для хранения Даты рождения Человека
    private RandomName randomName = new RandomName(); // создание экземпляра класса RandomName для использования его методов
    private RandomBirthDate randomBirthDate = new RandomBirthDate(); // создание экземпляра класса RandomBirthDate для использования его методов

    public Personality(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    } // Метод инициализации Человека

    @Override
    public String getName() {
        return name;
    } // Получение имени Человека

    public void setRandomName() {
        name = randomName.getRandomName();
    } // Установка рандомного (случайного) имени для Человека

    public void setName(String name) {
        this.name = name;
    } // Установка имени типа String для Человека

    @Override
    public Date getBirthDate() {
        return birthDate;
    } // Получение дня рождения

    public void setRandomBirthDate() {
        birthDate = randomBirthDate.getRandomBirthDate();
    } // Установка рандомного (случайного) Дня рождения для Человека

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    } // Установка Дня рождения для Человека с помощью переменной типа "Date"

    // Далее = Блок сравнения
    @Override
    public boolean equals(Object otherObject) { // проверка на полную совместимость данных объекта Personality
        if (otherObject instanceof Personality) { // проверка: является ли otherObject Personality. Если да, то выполняем:
            Personality otherPersonality = (Personality) otherObject; // приведение otherObject типа Object к типу Personality
            return name.equals(otherPersonality.name)
                    && birthDate == otherPersonality.birthDate;
        }
        return false; // если otherObject не Person, то возвращаем false
    }

    @Override
    public int hashCode() { // перезапись hashCode 
        return Objects.hash(name, birthDate); // делаем на основе существующего алгоритма; hashCode комбинации имени и возраста
    }
    
    @Override
    public int compareTo(Object otherObject) { // сравнение объектов
        if (otherObject instanceof Personality) { // если otherObject это Personality, то
            Personality otherPersonality = (Personality) otherObject; // приводим к типу
            if (equals(otherPersonality)) {  // если у объектов равны и имя и возраст, то 0 (то есть сравниваем равенство полное)
                return 0;
            }
            return name.compareTo(otherPersonality.name) > 0 ? 1 : -1; // метод сравнения: если выполняется, то возвращаем 1; в ином случае -1
        }
        throw new IllegalArgumentException("otherObject not a Personality");
    }
}
