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
                if (i >= 0 || i != 2) {
                    flag = false;
                }
            } else {
                System.out.println("Error! This number is not natural");
            }
        }
        return i;
    }
    public static int lengthOfMassiveOfSimpleNumbers (int n){
        int quantityOfSimpleNumbers = 0;
        for (int i = n; i <= 2*n; i++){
            int k = 0;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    k++;
                }
            }
            if (k == 0){
                quantityOfSimpleNumbers ++;
            }
        }
        return quantityOfSimpleNumbers;
    }
    public static int [] massiveOfSimpleNumbers (int n){
        int massive [] = new int [lengthOfMassiveOfSimpleNumbers(n)];
        int m = 0;
        for (int i = n; i <= 2*n; i++){
            int k = 0;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    k++;
                }
            }
            if (k == 0){
                massive [m] = i;
                m++;
            }
        }
        return massive;
    }
    public static void massiveTwinsOfSimpleNumbers (int massive []){
        for (int i = 0; i < massive.length-1; i++){
            if (massive[i] == massive[i+1]-2){
                System.out.print("( "+ massive[i] + "; " + massive[i+1] + " )" + ", ");
            }
        }
    }
    public static void main(String[] args) {
	int n = getInt();
	int massiveOfSimpleNumbers [] = new int [lengthOfMassiveOfSimpleNumbers(n)];
	massiveOfSimpleNumbers = massiveOfSimpleNumbers(n);
	for ( int i = 0; i < massiveOfSimpleNumbers.length; i++){
	    System.out.print(massiveOfSimpleNumbers[i] + ", ");
    }
	System.out.println("");
	massiveTwinsOfSimpleNumbers(massiveOfSimpleNumbers);
    }
}
