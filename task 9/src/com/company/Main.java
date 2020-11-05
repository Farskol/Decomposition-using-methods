package com.company;

import java.util.Scanner;

public class Main {
public static void area(double x, double y, double z, double t){
    double p = (x+y+z+t)/2;
    double Area = Math.pow(((p-x)*(p-y)*(p-z)*(p-t)),1.0/2.0);
    System.out.print("Area is :" + Area);
}
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("write size X :");
        double X = console.nextDouble();
        System.out.print("write size Y :");
        double Y = console.nextDouble();
        System.out.print("write size Z :");
        double Z = console.nextDouble();
        System.out.print("write size T :");
        double T = console.nextDouble();
        area(X ,Y ,Z ,T);
    }
}
