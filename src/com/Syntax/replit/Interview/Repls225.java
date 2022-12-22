package com.Syntax.replit.Interview;

public class Repls225 {
        /*Input[123] ->output [321]
         Input[12345] ->output [54321]
         Input[1001] ->output [1001]
         Input[789] ->output [987]*/
        public static void main(String[] args) {
            System.out.println(reverseInteger(123));
        }
        public  static int reverseInteger(int N){
            int reverseInt = 0;
            while(N != 0){
                int reminder = N % 10;
                reverseInt= reverseInt * 10 + reminder;
                N/=10;
            }
            return reverseInt;

        }



    }


