package com.Syntax.replit.Interview;
import java.util.LinkedList;
import java.util.List;
public class Repls222 {
  /*  Write the logic that picks largest and second largest numbers from a list add them and return the results.
    input to method is a list that contains the numbers
    input [10,20,30,40]
    output [70]
    input[5,3,8,9,10,11,5]
    output [21]*/

        public static void main(String[] args) {
            List<Integer>number=new LinkedList<>();
            number.add(10);
            number.add(20);
            number.add(30);
            number.add(40);
            System.out.println(findMaxSum(number));
        }
        public static int findMaxSum(List<Integer> list) {
            int largest=0;
            int secondLargest=0;
            int sum=0;
            for(Integer num:list){
                if(largest<num){
                    secondLargest=largest;
                    largest=num;
                }else if(secondLargest<num){
                    secondLargest=num;
                }
                sum= largest+secondLargest;


            }
            return sum;

        }

    }

