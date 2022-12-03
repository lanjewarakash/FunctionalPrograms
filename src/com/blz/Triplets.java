package com.blz;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        System.out.println("Enter the no. of input");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            int arr[] = new int[num];
            int count = 0;
            System.out.println("Enter values");
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();//taking integer input by creating array
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            count++;
                            System.out.println(arr[i] + " + " + arr[j] + "+" + arr[k] + "=" + "0");
                        }
                    }
                }
            }
            System.out.println("Totai pair are =  " + count);
        }
    }
