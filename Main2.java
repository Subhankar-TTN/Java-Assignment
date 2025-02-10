package com.java.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Float>floatList = new ArrayList<>();
        floatList.add(10.4f);
        floatList.add(20.3f);
        floatList.add(30.2f);
        floatList.add(40.4f);
        floatList.add(50.5f);

        //Iterator taking
        Iterator<Float>iterator = floatList.iterator();

        float sum = 0.0f;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("The sum of the numbers in the List is: " + sum);
    }
}
