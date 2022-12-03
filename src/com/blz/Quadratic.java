package com.blz;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Welcome to quadratic equation program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Input the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Input the value of c: ");
        double c = sc.nextDouble();
        double delta = b*b-4.0*a*c;
        if(delta>0.0) {
            double r1 = (-b + sqrt(delta)) / (2 * a);
            double r2 = (-b - sqrt(delta)) / (2 * a);
            System.out.println(" Roots 1 of the Equation " + r1);
            System.out.println(" Roots 2 of the Equation " + r2);
        }
        else if (delta==0){
            double r1 = (-b/a);
            System.out.println("The Root is: " + r1);
        }
        else {
            System.out.println("The Equation has No Real Root.");
        }
    }
}
