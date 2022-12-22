package com.Syntax.replit.Interview;

import java.util.LinkedList;
import java.util.List;

public class Repls219 {
    public static void main(String[] args) {
        /*
        Count how many times a given word from a list is present as prefix in another list both lists will be given
        as input to the function

You have to implment a method that takes two lists as input one list contains the query words that
 we want to search from the other list.

Word List  ["steve","stevens","danny","steves","dan","john","johny"
        ,"joe"
        ,"alex"
        ,"alexander"]

Query Word List ["steve","alex","joe","john","dan"]

output

[2, 1, 0, 1, 1]

As word steve is present as prefix in word stevens and steves so we get 2 for
it note we are not counting if we have the exact word in the
original list

word alex is prefix in alexander so we get 1

word joe is not present as prefix so we get 0

         */
        List<String>names=new LinkedList<>();
        names.add("stevens");
        names.add("johnson");
        names.add("alexander");
        names.add("alex");

        List<String>query=new LinkedList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");
        List<Integer>noOfPrefix=countOnlyPrefixes(names,query);
        System.out.println(noOfPrefix);

    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        List<Integer>counter=new LinkedList<>();
        for (String prefix: query){
            int count = 0;
            for (String name:names){
                if (name.startsWith(prefix)&&(!name.equals(prefix))){
                    count++;
                }
            }
            counter.add(count);
        }
        return counter;
    }
}
