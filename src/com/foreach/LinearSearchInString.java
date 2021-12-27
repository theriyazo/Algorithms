package com.foreach;

import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "RiyazAhamad is a best student";
        System.out.println("enter a character to search in String");
        char target = in.next().charAt(0);


        System.out.println(LinearSearch(str, target));
    }
    static boolean LinearSearch(String strng, char trgt){
        if (strng.length() == 0) {
            return false;
        }

        for (int i = 0; i < strng.length(); i++) {
            if(trgt == strng.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
