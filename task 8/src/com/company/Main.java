package com.company;

import java.awt.*;
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
    public static void sumOfFirstThreeNumbers(int massive [], int k, int m){
        int iteration = m-((m-k)%3);
        for (int i = k-1; i < iteration; i+=3 ){
            int sum = 0;
            for ( int j = i; j < i+3 ; j++ ){
                sum+= massive[j];
            }
            System.out.print(sum + ", ");
        }
    }
    public static void main(String[] args) {
	System.out.println("write size of massive :");
	int sizeOfMassive = getInt();
	int massive [] = new int [sizeOfMassive];
	for (int i = 0 ; i < massive.length; i++){
	    massive[i] = (int)(Math.random()*40-20);
    }
	for (int i = 0; i < massive.length; i++){
        System.out.print(massive[i] + ", ");
    }
	System.out.println("");
	int firstNumberK = getInt();
	int secondNumberM = getInt();
	sumOfFirstThreeNumbers(massive,firstNumberK,secondNumberM);
    }
}
