package com.company;

import java.util.Scanner;

public class Main {
    public static int getInt() {
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
    public static int SumOfNumbers (int number){
        String stringNumber = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++){
            sum += Character.getNumericValue(stringNumber.charAt(i));
        }
        return sum;
    }
    public static int quantityOfIteration (int  number){
        boolean flag = true;
        int iteration = 1;
        while (flag){
            number -= SumOfNumbers(number);
            if (number == 0) {
                flag = false;
            }
            else {
                iteration++;
            }
        }
        return iteration;
    }
    public static void main(String[] args) {
	int n = getInt();
System.out.println(quantityOfIteration(n));
    }
}
