package com.foreach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    }

    // linear search the element and return the element if found
    // if not then return -1
    static int linearSearch(int[] array, int item){
        for (int i = 0; i < array.length; i++) {
            if(item==array[i]){
                return array[i];
            }
        }
        return -1;
    }
}
