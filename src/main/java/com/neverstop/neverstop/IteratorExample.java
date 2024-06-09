package com.neverstop.neverstop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args)  {

      //  List<Integer> numbers =  List.of(1, 2, 3, 4, 5); //immutable list cannot add or remove

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if(value==2){
                iterator.remove();
            }
            System.out.println("value: " + value);
        }
        System.out.println(numbers);
    }
}
