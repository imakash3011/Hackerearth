package com.company.HACKEREARTH.INPUT_OUTPUT;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        int n=obj.nextInt();
//        String is immutable so make a character array of the string
        char []chars=str.toCharArray();
//        String  result="";
        for (int i = 0; i <str.length() ; i++) {
//            use inbuilt method to check the Uppercase ,lowercase , digit values in string
            if(Character.isUpperCase(str.charAt(i))){
                char ch=(char)((int)(chars[i]+n-65)%26+65);
//                replace the particular position with the new encrypted value
                chars[i]=ch;
            }else if(Character.isLowerCase(str.charAt(i))){
                char ch=(char)((int)(chars[i]+n-97)%26+97);
                chars[i]=ch;
            }else if(Character.isDigit(str.charAt(i))){
                char ch=(char)((int)(chars[i]+n-48)%10+48);
                chars[i]=ch;
            }else{
//                if the character is any alpha numeric keyword then ignore it and continue .
                continue;
            }
        }
        System.out.println(chars);

    }
}


//abcdZXYzxy-999.@
//200
//stuvRPQrpq-999.@
//s - 97) % 26 + 97

//        for (int i = 0; i <str.length() ; i++) {
//        if (chars[i] >= 'a' && chars[i] <= 'z') {
//        chars[i] = (char) (chars[i] + n);
//        } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
//        chars[i] = (char) (chars[i] + n);
//        } else if (chars[i] >= '0' && chars[i] <= '9') {
//        chars[i] = (char) (chars[i] + n);
//        } else {
//        continue;
//        }
//
//        }System.out.println(chars);