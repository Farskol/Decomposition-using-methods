package com.company;

import java.util.Scanner;

public class Main {
    public static int getInt(){
        int i = 0;
        boolean flag = true;
        while (flag) {
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()) {
                i = console.nextInt();
                flag = false;
            } else {
                System.out.println("Error!!");
            }
        }
        return i;
    }
    public static int greatestCommonFactor(int ... AB){
        int GTC = 1;
        int minNumber = AB[0];
        for (int i = 0; i < AB.length-1; i++){
            if (minNumber > AB[i+1]){
                minNumber = AB[i+1];
            }
        }
        for (int i = 2; i <= minNumber; i++){
            int k = 0;
            for ( int j = 0; j < AB.length; j++) {
                if (AB[j]%i == 0) {
                    k++;
                }
            }
            if (k == AB.length){
                GTC = i;
            }
        }
        return GTC;
    }
    public static void main(String[] args) {
        System.out.println("write firs number:");
        int firstNumber = getInt();
        System.out.println("write second number:");
        int secondNumber = getInt();
        System.out.println("write third number :" );
        int thirdNumber = getInt();
        System.out.println("write fourth number:");
        int fourthNumber = getInt();
        System.out.println("greatest common factor :" + greatestCommonFactor(firstNumber,secondNumber,fourthNumber,thirdNumber));
    }
}
