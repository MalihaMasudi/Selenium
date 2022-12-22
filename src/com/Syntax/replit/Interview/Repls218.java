package com.Syntax.replit.Interview;
import java.util.*;
public class Repls218 {
        /*
            Count the number of repetitions of words in an ArrayList append that count and return that list.
            You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
            input ["switch","tv","switch","tv","switch","tv"]
            output [switch, tv, switch1, tv1, switch2, tv2]
            In this example as word switch is repeated we pick the next entry
            where it is repeated and append the count ie how many times that
            word was present previously
            More Examples
            input ["switch","tv","switch","tv","switch","tv","radio"]
            output [switch, tv, switch1, tv1, switch2, tv2, radio]
            input ["switch","tv","switch","tv"]
            output [switch, tv, switch1, tv1]
            if words are not repeated we get the same output
            input ["switch","tv"]
            output [switch, tv]
        */
        public static void main(String[] args) {
            List<String>name=new LinkedList<>();
            name.add("switch");
            name.add("tv");
            name.add("switch");
            name.add("tv");
            name.add("switch");
            name.add("tv");
            name.add("radio");
            name.add("switch");


            List<String> listWord = countDeviceNames(name);
            System.out.println(listWord);
        }
        public static ArrayList<String> countDeviceNames(List<String> deviceNames) {
            Map<String,Integer>myMap=new LinkedHashMap<>();

            for(String s:deviceNames){
                if(myMap.get(s)==null){
                    myMap.put(s,1);
                }else{
                    int count=myMap.get(s);
                    String s1=s.concat(String.valueOf(count));
                    if(myMap.get(s1)!=null){
                        while(true){
                            s1=s.concat(String.valueOf(count));
                            if(myMap.get(s1)==null){
                                break;
                            }
                            count++;
                        }
                        myMap.put(s1,count);
                    }else{
                        myMap.put(s1,count++);
                    }
                }
            }

            ArrayList<String>result=new ArrayList<>();
            result.addAll(myMap.keySet());

            return result;
        }
    }




