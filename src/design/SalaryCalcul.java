package design;

import java.util.Scanner;

public class SalaryCalcul {

    public static void main(String[] args) {

        // Variable
        String Emplname;
        double Thours = 0;
        double Hrate = 0;
        double Gpay;
        double NPay = 0;

        // Welcome
        System.out.println(" __________Pay Check_________");
        System.out.println("### Welcome To Piint Schoole ###");

        // Input
        // Employee Name
        Scanner scaname = new Scanner(System.in);
        System.out.println("Employee Name");
        Emplname = scaname.next();

        // Loop Total Hours & Exception
        // Employee Hours
        boolean ValidTH = false;
        do {
            try {
                Scanner scantotal = new Scanner(System.in);
                System.out.println("Enter Valid Employee Total Hours");
                Thours = scantotal.nextDouble();

            } catch (Exception e) {
                System.out.println("Total Hour Data INVALID");
                continue;
            }
            ;
            if (Thours >= 1 && Thours <= 80) {
                ValidTH = true;
            } else {
                System.out.println("Error Total Hours Number Between 0 - 80 ");
            }
        } while (ValidTH == false);

        // Loop Hourly Rate & Exception
        // Employee Hourly Rate
        boolean ValidHR = false;
        do {
            try {
                Scanner scanRate = new Scanner(System.in);
                System.out.println("Enter Valid Employee Hourly Rate");
                Hrate = scanRate.nextDouble();

            } catch (Exception e) {
                System.out.println("Hour Rate Data INVALID");

                continue;
            }
            if (Hrate >= 10 && Hrate <= 50) {
                ValidHR = true;
            } else {
                System.out.println("Error Hour Rate Number between 10$ - 50$");
            }
        } while (ValidHR == false);

        // Calculation
        // Gross Pay Calculation
        Gpay = Thours * Hrate;
        // Net Pay Calculation
        if (Gpay < 1500) {
            NPay = Gpay * (1 - .10);
        } else if (Gpay >= 1500 && Gpay < 2999) {
            NPay = Gpay * (1 - .15);
        } else if (Gpay >= 1500 && Gpay < 2999) {
            NPay = Gpay * (1 - .20);
        } else if (Gpay >= 3000 && Gpay < 4599) {
            NPay = Gpay * (1 - .25);
        } else if (Gpay >= 5000 && Gpay < 5599) {
            NPay = Gpay * (1 - .30);
        } else if (Gpay < 6000) {
            NPay = Gpay * (1 - .35);
        }
        // Output
        System.out.println("Employee Name:            " + Emplname);
        System.out.println("Employee Hours:           " + Thours);
        System.out.println("Employee Rate:            " + Hrate);
        System.out.println("Employee Gross Pay:       " + Gpay);
        System.out.println("Employee Net Pay:         " + NPay);
        System.out.println("#########Thank You########");
        System.out.println("######### Good By#########");

    }

}
