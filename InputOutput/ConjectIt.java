package com.company.HACKEREARTH.INPUT_OUTPUT;

import java.util.Scanner;

public class ConjectIt {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double t=obj.nextDouble();
        for (int i = 0; i < t; i++) {
            double n=obj.nextDouble();
            while (n!=1){
                if(n%2==0){
                    n/=2;
                }else {
                    n=3*n+1;
                }
            }
            if(n==1.0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
