package com.Syntax.replit.Interview;

import java.util.LinkedList;
import java.util.List;

public class Repls215 {
    /*
    A bracket is considered to be of the following characters: (, ).

Two brackets are considered to be a matched pair if the opening bracket "(" occurs to the left of a closing bracket ")" of the exact same type.

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, "(()" is not balanced because the contents is not balanced.

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return true. Otherwise, return false.


**Function Description**

Complete the function isBalanced in the editor below.

isBalanced has the following parameter(s):

string s: a string of brackets
Returns

string: either true or false

**Examples**

input "(()"  ->  false

input "("  ->  false

input ")"  ->  false

input "(()))"  ->  false

input "(())"  ->  true

input "()"  ->  true

input ")()("  ->  true

     */
    public static void main(String[] args) {
        Repls215 entry=new Repls215();
        boolean balanced=entry.isBalanced("()()()))");
        System.out.println(balanced);

    }
    public boolean isBalanced(String s){
        int length=s.length();
        if (length%2==0) {
            String firstPart = s.substring(0, length / 2);
            String secondPart = s.substring(length / 2, length);
            List<String> first = new LinkedList<>();
            first.add(firstPart);
            List<String> second = new LinkedList<>();
            second.add(secondPart);
            var iterator= first.listIterator();
            var iterator1 = second.listIterator();
            while (iterator.hasNext()) {
                while (iterator1.hasNext()) {
                    var firstOne = iterator.next();
                    var secondOne = iterator1.next();
                    for (int i = 0; i < firstOne.length(); i++) {
                        if(firstOne.equals(secondOne)&&firstOne.contains("(")&&secondOne.contains(")")){
                            return true;
                        }else if (firstOne.charAt(i) != secondOne.charAt(i)) {
                            return true;
                        }

                    }
                }
            }
        }else{
            return false;
        }
        return false;
        }
    }


