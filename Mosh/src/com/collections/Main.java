package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();

        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        for (Integer integer : test) {
            System.out.println(integer);
        }
    }
}
