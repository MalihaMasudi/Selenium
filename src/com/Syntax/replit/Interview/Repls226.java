package com.Syntax.replit.Interview;

public class Repls226 {

        /*Reverse the String without using the Reverse method from the StringBuilder Class
        input["I am a java Programmer"] output["Programmer java a am I"]
        input["Syntax is Great"] output["Great is Syntax"]*/
        public static void main(String[] args) {
            System.out.println(reverse("Hello World!"));;
        }
        public static String reverse(String strToRev){
            String reverse="";
            String[] singleWord = strToRev.split(" ");
            int length = singleWord.length;
            for(int i=length-1;i>=0;i--){
                String word = singleWord[i];
                reverse+=word+" ";
            }
            return reverse.trim();
        }
    }

