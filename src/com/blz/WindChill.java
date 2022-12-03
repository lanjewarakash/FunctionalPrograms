package com.blz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wind Chill Computation:");
        System.out.println("Enter temperature in Fahrenheit:");
        double t = scan.nextDouble();
        System.out.println("Enter wind speed in mph");
        double v = scan.nextDouble();
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        if (t > 50 || v > 120 || v < 3) {
            System.out.println("enter correct input");
        } else
        {
            System.out.println("your input is correct");
            System.out.println("windchill=" + windChill);
        }
        System.out.println("given temperature of" + t + "Fahrenheit" + "and the wind speed of " + v + "mph");
    }
}
