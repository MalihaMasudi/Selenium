package com.Syntax.replit.Interview;
import java.util.Scanner;
public class Repls223 {
        /*Write logic in the main method to print a pyramid of numbers
        the logic should be generic i.e. it can print the pyrmid for any numbmer like 5, 6, 7 etc
        if input is
              2
        output should be
                 2
              2     2
          if input is 3
        the output should be
              3
             3 3
            3 3 3
        Ask user input for the number for which he wants to make the pyramid using scanner*/
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=i;j<num;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<(i*2);k++){
                    System.out.print(num+" ");
                }
                System.out.println();
            }}
        /*for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(num);

            }
            System.out.println(" ");
        }*/

    }







