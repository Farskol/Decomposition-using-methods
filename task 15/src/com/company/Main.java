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

    public static boolean checkOnIncreasing(int i) {
        String stringN = Integer.toString(i);
        boolean flag = true;
        for (int j = 0; j < stringN.length() - 1; j++) {
            if (stringN.charAt(j)+1 != stringN.charAt(j+1)){
                flag = false;
                break;
        }
    }
        return flag;
    }
        public static int sizeOfIncreasingNumbers( int n ){
        int j = 0;
            for (int i = 10; i < n; i++) {
                if (checkOnIncreasing(i)){
                    j++;
                }
            }
            return j;
        }
    public static int [] increasingNumbers( int n ){
        int massive [] = new int [sizeOfIncreasingNumbers(n)];
        int j = 0;
        for (int i = 10; i < n; i++) {
            if (checkOnIncreasing(i)){
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
        int n = getInt();
        int massive [] = new int [sizeOfIncreasingNumbers(n)];
        massive = increasingNumbers(n);
        showNumbers(massive);
    }
}
