package com.Syntax.replit.Interview;

public class Repls224 {
        /*    Remove Consecutive duplicates
            Write the logic to remove only consecutive duplicates
            input ["aabbcde"]-> output["abcde"]
            input ["aabbcc"]-> output["abc"]
            input ["aabbcca"]-> output["abca"]
            input ["aabbccaddda"]-> output["abcada"]*/
        public static void main(String[] args) {
            System.out.println(removeConsecutiveDuplicates("aabbbcde"));
        }
        public static String removeConsecutiveDuplicates(String input) {
            if (input.length() <= 1)
                return input;
            if (input.charAt(0) == input.charAt(1))
                return removeConsecutiveDuplicates(
                        input.substring(1));
            else
                return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
        }
    }






