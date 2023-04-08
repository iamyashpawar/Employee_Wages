package com.bridgelabz;

import java.util.Random;

public class Employee_Wages
{

    static int WAGE_PER_HOUR=20;
    static int FULL_TIME_WAGE = 8;

    static int MONTHLY_TOTAL_DAYS = 20;

    static int TOTAL_WORKING_HOURS;


    static int PART_TIME_HOURS = 4;
    public static void main(String[] args)
    {

         
        Random rd = new Random();
          int dailyWage=0;
          int monthlyPayment=0;
        int emp = rd.nextInt(3);
        int totalWageByHours = rd.nextInt(2);
        System.out.println("**** "+emp+ " ****");

        switch (emp)
        {
            case 1 :
                System.out.println("Employee Was Present Full Time");

                dailyWage = WAGE_PER_HOUR * FULL_TIME_WAGE;
                System.out.println("Your Daily wage is : " + dailyWage);
                if(TOTAL_WORKING_HOURS==1)
                {
                    System.out.println(TOTAL_WORKING_HOURS);
                    int wageAfterHundredHours = WAGE_PER_HOUR * 100;
                    System.out.println("Total 100 Hour Wage " +wageAfterHundredHours);
                }
                else
                {
                    monthlyPayment = dailyWage * MONTHLY_TOTAL_DAYS;
                    System.out.println("Your Monthly Payment is : " + monthlyPayment);
                }
                break;
            case 2 :
                System.out.println("Employee Was Present Half Day");
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Your Half Day Wage is : " + dailyWage);
                monthlyPayment = dailyWage * MONTHLY_TOTAL_DAYS;
                System.out.println("Your Monthly payment(Part time) : " + monthlyPayment);
                break;

            default:
                System.out.println("Employee Was Absent!!!");


        }

    }
}
