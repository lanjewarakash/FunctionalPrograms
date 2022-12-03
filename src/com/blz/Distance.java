package com.blz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x1 value");
        int x1= scan.nextInt();
        System.out.println("enter x2 value");
        int x2= scan.nextInt();
        System.out.println("enter y1 value");
        int y1 = scan.nextInt();
        System.out.println("enter y2 value");
        int y2= scan.nextInt();
        double dist = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2)*1.0);
        System.out.println("distance from (" + x1+ "," + y1 + ")to (0,0)=" + dist);
    }
}

