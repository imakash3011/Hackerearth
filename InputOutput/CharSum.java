package com.company.HACKEREARTH.INPUT_OUTPUT;

import java.util.Scanner;

public class CharSum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        int sum=0;
        char []chars=str.toCharArray();
//        System.out.println((int)chars[0]-96);
        for (int i = 0; i <str.length() ; i++) {
            sum+=(int)chars[i]-96;
        }
        System.out.println(sum);
    }
}
