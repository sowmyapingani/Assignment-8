package com.bridge.labzs;
import java.util.Random;

public class employeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int attendance = random.nextInt(2);

        int wagePerHour = 20;
        int fullDayHours = 8;
        int wagePerDay = wagePerHour + fullDayHours;

        if (attendance == 1) {
            System.out.println("Employee is present");
            wagePerDay = wagePerHour * fullDayHours;
        } else {
            System.out.println("Employee is absent");
            System.out.println("Employee wage Per Day : " + wagePerDay);
        }
    }
}