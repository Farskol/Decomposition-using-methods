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
                if (i >= 0 ) {
                    flag = false;
                }
            } else {
                System.out.println("Error! This number is not natural");
            }
        }
        return i;
    }
    public static int SumAndDegreeOfNumber ( int number){
        String stringNumber = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++){
            sum += (int) Math.pow(Character.getNumericValue(stringNumber.charAt(i)),stringNumber.length());
        }
        return sum;
    }
    public static int  sizeOfNumbersArmstrong( int k ){
        int j = 0;
        for (int i = 1; i <= k; i++){
            if (SumAndDegreeOfNumber(i) == i){
                j++;
            }
        }
        return j;
    }
    public static int [] NumbersArmstrong( int k ){
        int massive [] = new int [sizeOfNumbersArmstrong(k)];
        int j = 0;
        for (int i = 1; i <= k; i++){
            if (SumAndDegreeOfNumber(i) == i){
                massive [j] = i;
                j++;
            }
        }
        return massive;
    }
    public static void showNumbers ( int massive []){
        for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int k = getInt();
        int massiveOfNumbersArmstrong [] = new int [sizeOfNumbersArmstrong(k)];
        massiveOfNumbersArmstrong = NumbersArmstrong(k);
        showNumbers(massiveOfNumbersArmstrong);
    }
}
