package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] dailyAverageTemp = new double[7];
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println("Enter a temperature for day " + (i + 1) + ": ");
            dailyAverageTemp[i] = userInput.nextDouble();
        }
        System.out.println("Contents of the array are:" + Arrays.toString(dailyAverageTemp));
        double sum = 0;
        for (int i = 0; i < dailyAverageTemp.length; i++) {
            sum = sum + dailyAverageTemp[i];
        }
        System.out.println("Weekly Average is " + sum / dailyAverageTemp.length);
        System.out.println(((dailyAverageTemp[0]  + dailyAverageTemp[1])/2) + " is the daily average for the week so far");
        System.out.println(((dailyAverageTemp[0]  + dailyAverageTemp[1] +
                dailyAverageTemp[2])/3) + " is the daily average for the week so far");
        System.out.println(((dailyAverageTemp[0]  + dailyAverageTemp[1] + dailyAverageTemp[2] +
                        dailyAverageTemp[3])/4) +  " is the daily average for the week so far");
        System.out.println(((dailyAverageTemp[0]  + dailyAverageTemp[1] + dailyAverageTemp[2] +
                dailyAverageTemp[3] + dailyAverageTemp[4])/5) + " is the daily average for the week so far");
        System.out.println(((dailyAverageTemp[0]  + dailyAverageTemp[1] + dailyAverageTemp[2] +
                dailyAverageTemp[3] + dailyAverageTemp[4] + dailyAverageTemp[5])/6) + " is the daily average for the week so far");
        System.out.println(((dailyAverageTemp[0]  + dailyAverageTemp[1] + dailyAverageTemp[2] +
                dailyAverageTemp[3] + dailyAverageTemp[4] + dailyAverageTemp[5] + dailyAverageTemp[6])/7) + " is the daily average for the week so far");
  }

//        double Celsum = 0;
//        for (int i = 0; i < dailyAverageTemp.length; i++) {
//            Celsum = dailyAverageTemp[i] -32;
//            System.out.println(Celsum*5/9);



    }



