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
    public static boolean checkOfOddNumbers( int i ){
        boolean flag = true;
        String StringI = Integer.toString(i);
        for (int j = 0; j < StringI.length(); j++){
            if (StringI.charAt(j) % 2 == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int sumOfNumbersWithOddNumbers( int n ){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if (checkOfOddNumbers(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static int quantityEvenNumbers(int sum){
        String stringSum = Integer.toString(sum);
        int j =0;
        for (int i = 0; i < stringSum.length(); i++){
            if (stringSum.charAt(i) % 2 == 0){
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
	int n = getInt();
	n = sumOfNumbersWithOddNumbers(n);
    System.out.println("Summa of odd numbers is: " + n);
    System.out.println("quantity of even numbers of summa is: " + quantityEvenNumbers(n));
    }
}
