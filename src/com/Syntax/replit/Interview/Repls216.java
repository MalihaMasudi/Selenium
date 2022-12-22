package com.Syntax.replit.Interview;

import java.util.Arrays;

public class Repls216 {
    /*
    Create an Array of size N whose elements sum to zero

ArraySumToZero(0) ->{}

ArraySumToZero(1) ->{0}

ArraySumToZero(2) ->{-1,1}

ArraySumToZero(3) ->{1,-1,0}

ArraySumToZero(4) ->{2,-2,3,-3}

N will be given as input to the function and fucntion will return
an array whose element will sum to zero.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(4)));

    }
    public static int[] arraySumToZero(int N){
        int[] arr=new int[N];
        for(int i=0;i<N-1;i+=2){
            arr[i]=i+1;
            arr[i+1]=-(i+1);
        }
        return arr;
    }

    }






