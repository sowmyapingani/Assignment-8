package com.bridge.labzs;
import java.util.Random;

public class employeeWage {
                    public static void main(String[] args) {
                        System.out.println("Welcom to Employee Wage Camputation Program");

                        Random random = new Random();

                        int wagePerHour = 20;
                        int fullDayHours = 8;
                        int partTimeHours = 4;
                        int monthlySalary = 0;
                        int monthlyHours = 0;
                        int wagePerDay = 0;
                        int days = 0;

                        while (monthlyHours <= 100 && days <= 20) {

                            int attendance = random.nextInt(3);
                            wagePerDay = 0;
                            switch (attendance) {
                                case 0:
                                    System.out.println("Employee Absent");
                                    break;
                                case 1:
                                    wagePerDay = partTimeHours * wagePerHour;
                                    monthlyHours = monthlyHours + partTimeHours;
                                    break;
                                default:
                                    wagePerDay = wagePerHour * fullDayHours;
                                    monthlyHours = monthlyHours + fullDayHours;
                            }
                            monthlySalary = monthlySalary + wagePerDay;
                            System.out.println("Day:" + days + "monthlyHours:" + monthlyHours + "monthlySalary");
                            days++;
                        }
                    }
                }
