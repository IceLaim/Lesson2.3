package com.geekbrains.HomeWork3;

import java.util.Set;

public class HomeWork3T2 {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Волков", "9955553322");
        phoneBook.add("Сидоров", "9053241342");
        phoneBook.add("Резнов", "9653427868");
        phoneBook.add("Кравченко", "9993698939");
        phoneBook.add("Штайнер", "9073875737");
        phoneBook.add("Пономаренко", "9036934512");
        phoneBook.add("Голубин", "9864376545");
        phoneBook.add("Сидоров", "9893652112");

        Set<String> surnames = phoneBook.allSurnames();
        for (String surname : surnames) {
            System.out.printf("Пользователь %s имеет номер(а) телефонов %s %n", surname, phoneBook.get(surname));
        }
    }
}
