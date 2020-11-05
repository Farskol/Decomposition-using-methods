package com.company;

import java.util.Scanner;

public class Main {
public static int factorial ( int a ){
    int k = 1;
    for (int i = 2; i <= a; i++){
        k *= i;
    }
    return k;
}
public static int sumOfFactorial ( int a ){
    int sum = 0;
    for (int i = 2; i <= a; i++){
        int k = 0;
        for (int j = 2; j < i; j++){
            if (i%j != 0){
                k++;
            }
        }
        if (k == i-2){
            sum += factorial(i);
        }
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println(sumOfFactorial(number));
    }
}
