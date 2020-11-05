package com.company;

import java.util.Scanner;

public class Main {
public static int getInt(){
    boolean flag = true;
    int i = 0;
    while (flag){
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()){
            i = console.nextInt();
            flag = false;
        }
        else {
            System.out.println("Oooyyy nooooo it is traaaaap (please try again)");
        }
    }
    return i;
}
public static double length(int x1, int x2, int y1, int y2){
    double lengthOfCoordinates = Math.pow((Math.pow(Math.abs(x1-x2),2.0) +
            Math.pow(Math.abs(y1-y2),2.0)),1.0/2.0);
    return lengthOfCoordinates;
}
public static int maxCoordinates (int points[][], int coordinate){
    double maxLong[]= new double[points.length];
    int maxCoordinate = 0;
    for (int i = coordinate+1; i < points.length; i++){
        maxLong [i] = length(points[coordinate][0], points[i][0], points[coordinate][1], points[i][1]);
    }
    for (int i = 1; i < maxLong.length; i++ ){
        if (maxLong[maxCoordinate] <  maxLong[i]){
            maxCoordinate = i;
        }
    }
    return maxCoordinate;
}
    public static void main(String[] args) {
	System.out.print("write quantity of points : ");
	int points = getInt();
	int coordinates [][] = new int [points][2];
	int maxCoordinatesPoints [] = new int [points-1];
	double maxlengthPoints [] = new double[points-1];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < points; j++){
                coordinates [j][i] = (int)(Math.random()*21 - 10);
            }
        }
        for (int i = 0; i < points; i++){
            System.out.print("( " + coordinates[i][0] + ", " + coordinates[i][1] + " ); ");
        }
        System.out.println("");
        for (int i = 0; i < maxCoordinatesPoints.length; i++){
             maxCoordinatesPoints[i] = maxCoordinates(coordinates,i);
        }
        for (int i = 0; i < maxCoordinatesPoints.length;i++){
            maxlengthPoints[i]=length(coordinates[maxCoordinatesPoints[i]][0],coordinates[i][0],
                    coordinates[maxCoordinatesPoints[i]][1],coordinates[i][1]);
        }
        points = 0;
        for (int i = 1; i < maxCoordinatesPoints.length; i++){
            if (maxlengthPoints [points] < maxlengthPoints[i]){
                points = i;
            }
        }
        System.out.println("( " + coordinates[maxCoordinatesPoints[points]][0] + ", "
                + coordinates[maxCoordinatesPoints[points]][1] + " ); "
                + "and " + "( " + coordinates[points][0] + ", " + coordinates[points][1] + " ); ");
    }
}
