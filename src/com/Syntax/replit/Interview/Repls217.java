package com.Syntax.replit.Interview;

import java.util.ArrayList;
import java.util.List;

public class Repls217 {
    /*
    Complete countDuplicates method This method should count how many
    numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1

     */
    public static void main(String[] args) {
        List<Integer>number=new ArrayList<Integer>();
        number.add(5);
        number.add(5);
        number.add(3);
        number.add(2);
        number.add(5);

        System.out.println(countDuplicates(number));
    }


    public static int countDuplicates(List<Integer> numbers) {
        var iterator=numbers.iterator();
        var iterator1=numbers.iterator();
        int count=0;
        while (iterator.hasNext()){
            var number1=iterator1.next();
            while (iterator1.hasNext()){
                var numbers1=iterator1.next();
                if (numbers1.equals(numbers1)){
                    count++;
                }

            }
        }
        return 0;
    }

}
