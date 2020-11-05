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
    public static void whereNumbersIsMore (int firstNumber, int secondNumber){
        int lengthFirstNumber = lengthOfThisNumber(firstNumber);
        int lengthSecondNumber = lengthOfThisNumber(secondNumber);
        if (lengthFirstNumber > lengthSecondNumber){
            System.out.print("numbers of this number -> " + firstNumber + " is more");
        }
        else {
            if (lengthSecondNumber > lengthFirstNumber){
                System.out.print("numbers of this number -> " + secondNumber + " is more");
            }
            else {
                System.out.print("This numbers are equal");
            }
        }
    }
    public static void main(String[] args) {
	int firstNumber = getInt();
	int secondNumber = getInt();
	whereNumbersIsMore(firstNumber, secondNumber);
    }
}
