package com.company.HACKEREARTH.INPUT_OUTPUT;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int start=obj.nextInt();
        int end=obj.nextInt();
        int div=obj.nextInt();
        int count=0;
        for (int i = start; i <=end ; i++) {
            if(i%div==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
