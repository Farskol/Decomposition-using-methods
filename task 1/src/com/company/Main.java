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
    public static int greatestCommonFactor(int A, int B){
        int GTC = 1;
        int minNumber;
        if (A>=B){
            minNumber = B;
        }
        else {
            minNumber = A;
        }
        for (int i = 2; i <= minNumber; i++){
            if (A%i == 0 && B%i == 0){
                GTC = i;
            }
        }
            return GTC;
    }

    public static int leasCommonMultiple (int A, int B){
        int LCM;
        LCM = (A*B)/greatestCommonFactor(A,B);
        return LCM;
    }

    public static void main(String[] args) {
        System.out.println("write firs number:");
        int firstNumber = getInt();
        System.out.println("write second number:");
        int secondNumber = getInt();
        System.out.println("greatest common factor :" + greatestCommonFactor(firstNumber,secondNumber));
        System.out.println("least common multiple :" + leasCommonMultiple(firstNumber, secondNumber));
    }
}
