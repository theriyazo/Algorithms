package com.foreach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter an element to search in the array");
        int item = in.nextInt();
        System.out.println(item+" is found at: "+linearSearch(arr,item)+" position");


    }

    // linear search the element and return the element if found
    // if not then return -1
    static int linearSearch(int[] array, int item){
        for (int i = 0; i < array.length; i++) {
            if(item==array[i]){
                return i+1;
            }
        }
        return -1;
    }
}
