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
    public static double [] massiveNumbers(int K, int N, int A){
        double massiveNumbers []= new double [A];
        for (int i = 0; i < A; ){
            double k = Math.random()*N;
            String stringK = Double.toString(k);
            int sum = 0;
            for (int j = 0; j < stringK.length(); j++){
                if (stringK.charAt(j) != '.'){
                    sum += Character.getNumericValue(stringK.charAt(j));
                }
            }
            if (sum == K){
                massiveNumbers [i] = k;
                i++;
            }
        }
        return massiveNumbers;
    }
    public static void main(String[] args) {
	int K = getInt();
	int N = getInt();
	int A = getInt();
	double massive [] = new double[A];
	massive = massiveNumbers(K, N, A);
	for (int i = 0; i < massive.length; i++){
	    System.out.print(massive[i] + ", ");
    }
    }
}
