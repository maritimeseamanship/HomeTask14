package com.katetaier14;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*1) В Дз11 был метод который возвращает 100 случайных людей.
             Написать метод который который удалит из этого списка добликаты по имени и фамилии.
             Т.е. останутся только люди с уникальной комбинайцией имя+фамилия. Остальные поля в расчет не берутся.*/

        PersonFactory factory = new PersonFactory();
        List<Person> personList = factory.pileupPersons(100);
        System.out.print(personList + "\n\n");
        System.out.println("The list without duplicates by first and last names:");
        Set<Person> personSet = new HashSet<>(personList);
        System.out.println(personSet);
    }
}
