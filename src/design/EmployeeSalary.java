package design;

import java.util.Scanner;

public abstract class EmployeeSalary implements Employee {




         public abstract void salarycalculator();
    static String employeeName=null;
    static double hourWork = 0;
    static double regularRate= 0;
    static double grossPay;
    static double netPay = 0;
    static int employeeId = 0;
    static String assignDepartment = null;

    public static void main(String[] args) {
        welcomeModule();
        InputModule();
        Calculationmodule();
        Outputmodule();
    }


    public static void welcomeModule() {
        // Welcome
        System.out.println(" __________Pay Check_________");
        System.out.println("### Welcome To Piint Schoole ###");

    }

    public static void InputModule() {
        Getemployeename();
        getemployeeHours();
        getemployeeRate();
    }

    public static void Getemployeename() {
        // Employee Name
        Scanner scaname = new Scanner(System.in);
        System.out.println("Employee Name");
        employeeName = scaname.next();
    }

    public static void getemployeeHours() {
        // Loop Total Hours & Exception
        // Employee Hours
        boolean ValidTH = false;
        do {
            try {
                Scanner scantotal = new Scanner(System.in);
                System.out.println("Enter Valid Employee Hours Of Work");
                hourWork = scantotal.nextDouble();
                scantotal.close();
            } catch (Exception e) {
                System.out.println("Hours Of Work Data INVALID");
                continue;
            }
            if (hourWork >= 1 && hourWork <= 80) {
                ValidTH = true;
            } else {
                System.out.println("Error Hour of Work Number Between 0 - 80 ");
            }
        } while (ValidTH == false);
    }

    public static void getemployeeRate() {
        boolean ValidHR = false;
        do {
            try {
                Scanner scanRate = new Scanner(System.in);
                System.out.println("Enter Valid Employee Regular Rate");
                hourWork = scanRate.nextDouble();
                scanRate.close();
            } catch (Exception e) {
                System.out.println("Regular Rate Data INVALID");

                continue;
            }
            if (hourWork >= 10 && hourWork <= 50) {
                ValidHR = true;
            } else {
                System.out.println("Error Regular Rate Number between 10$ - 50$");
            }
        } while (ValidHR == false);
    }
    public static void Calculationmodule() {
        grosspayCalculation();
        Netpaycalculation();
    }
    public static void grosspayCalculation() {
        // Gross Pay Calculation
        grossPay= hourWork * regularRate;
    }
    public static void Netpaycalculation() {
        // Net Pay Calculation
        if (grossPay < 1500) {
            netPay = grossPay * (1 - .10);
        } else if (grossPay >= 1500 && grossPay < 2999) {
            netPay = grossPay * (1 - .15);
        } else if (grossPay >= 1500 && grossPay < 2999) {
            netPay = grossPay * (1 - .20);
        } else if (grossPay >= 3000 && grossPay < 4599) {
            netPay = grossPay * (1 - .25);
        } else if (grossPay >= 5000 && grossPay < 5599) {
            netPay = grossPay * (1 - .30);
        } else if (grossPay < 6000) {
            netPay = grossPay * (1 - .35);
        }
    }
    public static void Outputmodule() {
        // Output
        System.out.println("Employee Name:            " + employeeName);
        System.out.println("Employee Hour Work:       " + regularRate);
        System.out.println("Employee Regular Rate:    " + hourWork);
        System.out.println("Employee Gross Pay:       " + grossPay);
        System.out.println("Employee Net Pay:         " + netPay);
        System.out.println("#########Thank You########");
        System.out.println("######### Good By#########");
    }

    public int employeeId(int employeeId) {
        Scanner scanId = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        employeeId = scanId.nextInt();
        scanId.close();
        return 0;
    }

    public String employeeName(String employeeName) {
        Scanner scaName = new Scanner(System.in);
        System.out.println("Enter Employee Name ");
        employeeName = scaName.nextLine();
        return null;
    }


}
