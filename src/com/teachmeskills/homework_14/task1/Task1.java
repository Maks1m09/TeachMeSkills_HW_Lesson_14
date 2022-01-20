package com.teachmeskills.homework_14.task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(17);
        arrayList.add(15);
        arrayList.add(55);
        arrayList.add(11);
        arrayList.add(10);
        arrayList.add(24);
        arrayList.add(16);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(17);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        arrayList.stream().distinct().
                filter(x -> x >= 7 && x <= 17).
                filter(x -> x % 2 == 0).
                map(x -> x * 2).
                sorted().
                limit(4).
                forEach(System.out::println);
        System.out.println("__________");
        System.out.println(arrayList.stream().count());
        System.out.println("__________");
        System.out.println(arrayList.stream().mapToInt(x -> x).average());
        System.out.println("End");

    }
}
