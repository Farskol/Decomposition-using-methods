package com.company;

import java.util.Scanner;

public class Main {
public static void SecondMaxNumber (double massive[]) {
    int secondNumber = 0;
    for (int i = 1; i < massive.length; i++) {
        if (massive[secondNumber] < massive[i]) {
            secondNumber = i;
        }
    }
    massive[secondNumber]=0;
    for (int i = 1; i < massive.length; i++) {
        if (massive[secondNumber] < massive[i]) {
            secondNumber = i;
        }
    }
    System.out.println("the maximum second number is: " + massive[secondNumber]);
}
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write how much should be massive: ");
        int sizeOfMassive = console.nextInt();
        double massive[] = new double[sizeOfMassive];
        for (int i = 0; i < massive.length; i++){
            massive[i] = Math.random()*20;
        }
        for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + ", ");
        }
        System.out.println("");
        SecondMaxNumber(massive);
    }
}
