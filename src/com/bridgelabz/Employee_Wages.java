package com.bridgelabz;

import java.util.Random;

public class Employee_Wages
{

    static int WAGE_PER_HOUR=20;
    static int FULL_TIME_WAGE = 8;

    static int PART_TIME_HOURS = 4;
    public static void main(String[] args)
    {


        Random rd = new Random();
          int dailyWage=0;
        int emp = rd.nextInt(3);
        System.out.println("**** "+emp+ " ****");

        switch (emp)
        {
            case 1 :
                System.out.println("Employee Was Present Full Time");
                dailyWage = WAGE_PER_HOUR * FULL_TIME_WAGE;
                System.out.println("Your Daily wage is : " + dailyWage);
                break;
            case 2 :
                System.out.println("Employee Was Present Half Day");
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Your Half Day Wage is : " + dailyWage);
                break;

            default:
                System.out.println("Employee Was Absent!!!");
        }

    }
}
