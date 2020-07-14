package com.company.HACKEREARTH.INPUT_OUTPUT;

import java.util.Scanner;

public class Costofballoons {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for (int i = 1; i <=t ; i++) {
            int green=obj.nextInt();
            int purple=obj.nextInt();
            int ptct=obj.nextInt();
            int countp1=0;
            int countp2=0;
            int ans=0;
            int ans2=0;

            for (int j = 0; j <ptct ; j++) {
                int p1=obj.nextInt();
                int p2=obj.nextInt();
//                System.out.println(p1+" "+p2);
                if(p1==1 && p2==1){
                    countp1+=1;
                    countp2+=1;
                }else if(p1==1 && p2==0){
                    countp1+=1;
                }else if(p1==0 && p2==1){
                    countp2+=1;
                }else if(p1==0 && p2==0){
                    continue;
                }

            }
            if(i%2==1){
                System.out.println(countp1*green +countp2*purple );
            }else{
                System.out.println(countp1*purple + countp2*green );
            }
        }
    }
}
