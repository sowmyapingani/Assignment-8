package com.bridge.labzs;
import java.util.Random;

public class employeeWage {
    public static void main(String[] args) {
        System.out.println("Welcom to Employee Wage Camputation Program");
        Random random = new Random();
        int attendance = random.nextInt(2);
        int wagePerHour = 20;
        int fullDayHours = 8;
        int wagePerDay = 8;

        if (attendance == 1) {
            System.out.println("Employee Present");
            wagePerDay = wagePerHour * fullDayHours;
        } else
            System.out.println("Employee Absent");
        System.out.println("Employee Wage Per Day:" + wagePerDay);
    }
    }    