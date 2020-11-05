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
                flag = false;
            } else {
                System.out.println("Error!!");
            }
        }
        return i;
    }
    public static void easeNumbers(int ... numbers){
        for (int i = 0; i < numbers.length; i++){
            int k = 0;
            for (int j = 2; j < numbers[i]; j++){
                if (numbers[i]%j==0){
                    k++;
                }
            }
            if (k != 0){
                System.out.println("This numbers is not coprime !");
                return;
            }
        }
        System.out.println("This numbers is coprime !");
    }
    public static void main(String[] args) {
	System.out.println("Write free numbers");
	System.out.println("Firs number :");
	int firsNumber = getInt();
	System.out.println("Second number :");
	int secondNumber = getInt();
	System.out.println("Third number :");
	int thirdNumber = getInt();
	easeNumbers(firsNumber, secondNumber, thirdNumber);
    }
}
