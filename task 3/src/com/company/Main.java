package com.company;

import java.util.Scanner;

public class Main {
    public static double getInt(){
        double i = 0;
        boolean flag = true;
        while (flag) {
            Scanner console = new Scanner(System.in);
            if (console.hasNextDouble()) {
                i = console.nextDouble();
                flag = false;
            } else {
                System.out.println("Error!!");
            }
        }
        return i;
    }
    public static double AreaOfTriangle(double a){
        double area = ((a*a)*Math.pow(3.0,1.0/2))/4;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("write long of hexagon :");
        double longOfHexagon = getInt();
        System.out.println("Area of hexagon is : " + AreaOfTriangle(longOfHexagon)*6);
    }
}
