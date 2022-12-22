package com.Syntax.replit.Interview;

public class Repls221 {
        /*    Find the largest even length word from a String
             if there are two words with same largest even length return the first one.
             if there are not even words return -1
            input ["find MaxLen Even"]
            output ["MaxLen"]
            input["I am very Good at Java"]
            output ["very"]
            input["I was"]
            output ["-1"]*/
        public static void main(String[] args) {
            System.out.println(findMaxLenEven("find MaxLen Even"));
        }

        public static String findMaxLenEven(String str) {
            int largest = 0;
            String largeWord="";
            String[] individualWord = str.split(" ");;
            for(String word:individualWord){
                if(word.length()>largest){
                    largest=word.length();
                    largeWord=word;
                    //largeWord= String.valueOf(word.charAt(word.length()));
                }
            }
            return largeWord;

        }
    }






