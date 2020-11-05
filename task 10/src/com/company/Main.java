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
                if (i >= 0) {
                    flag = false;
                }
            } else {
                System.out.println("Error! This number is not natural");
            }
        }
        return i;
    }
    public static int lengthOfThisNumber (int number){
        String numberForMassive = Integer.toString(number);
        int n = 0;
        for (int i = 0; i < numberForMassive.length(); i++){
            int k = 0;
            for ( int j = i; j > 0; j--){
                if (numberForMassive.charAt(i) != numberForMassive.charAt(j-1)){
                    k++;
                }
            }
            if (k == i) {
                n++;
            }
        }
        return n;
    }
    public static int [] writeNumbers( int number, int length ){
        String numberForMassive = Integer.toString(number);
        int massiveOfNumber [] = new int [lengthOfThisNumber(number)];
        int n = 0;
        for (int i = 0; i < numberForMassive.length(); i++){
            int k = 0;
            for ( int j = i; j > 0; j--){
                if (numberForMassive.charAt(i) != numberForMassive.charAt(j-1)){
                    k++;
                }
            }
            if (k == i) {
                 massiveOfNumber [n] = Character.getNumericValue(numberForMassive.charAt(i));
                 n++;
            }
        }
        return massiveOfNumber;
    }
    public static void main(String[] args) {
	int number = getInt();
	String lengthForNumber = Integer.toString(number);
	int massive [] = new int [lengthForNumber.length()];
   massive = writeNumbers(number, lengthOfThisNumber(number));
   for (int i = 0; i < massive.length; i ++){
       System.out.print(massive [i] + ", ");
   }
    }
}
