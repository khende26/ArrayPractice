package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double[] dailyAverageTemp = new double[7];
    Scanner userInput = new Scanner(System.in);

                for( int i =0; i < dailyAverageTemp.length; i++) {
                    System.out.println("Enter a temperature for day " + (i + 1) + ":");
                    dailyAverageTemp[1] = userInput.nextDouble();
                }
            System.out.print(dailyAverageTemp[0]);
    }
}
