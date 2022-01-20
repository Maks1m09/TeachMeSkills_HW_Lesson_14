package com.teachmeskills.homework_14.task2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Максим");
        arrayList.add("Андрей");
        arrayList.add("Иван");
        arrayList.add("Катерина");
        arrayList.add("Алексей");
        arrayList.add("Саня");
        arrayList.add("Даниил");
        arrayList.add("Валдемар");
        arrayList.add("Яна");
        arrayList.add("Андриан");
        arrayList.add("Аркадий");
        arrayList.add("Павел");
        arrayList.add("Игорь");
        arrayList.add("Дмитрий");
        arrayList.add("Максим");
        System.out.println(arrayList.stream().map(x -> x.toLowerCase(Locale.ROOT)).filter("максим"::equals).count());
        System.out.println("________________");
        arrayList.stream().map(x -> x.toLowerCase(Locale.ROOT)).filter(name -> name.startsWith("а")).forEach(System.out::println);
        System.out.println("________________");
        System.out.println(arrayList.stream().sorted().findFirst());
        System.out.println("End");
    }
}
