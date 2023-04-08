package com.bridgelabz;

import java.util.Random;

public class Employee_Wages
{

    static int WAGE_PER_HOUR=20;
    static int FULL_TIME_WAGE = 8;

    static int PART_TIME_HOURS = 4;
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage");

        Random rd = new Random();
          int dailyWage=0;
        int emp = rd.nextInt(3);
        if(emp == 1)
        {
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HOUR * FULL_TIME_WAGE;
            System.out.println("Your Daily Wage is : " + dailyWage);

        } else if (emp == 2)
        {
            System.out.println("Employee worked part time");
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Your Half Day Wage is : " + dailyWage);
        }
        else
        {
            System.out.println("Employee is Absent!!");
        }



    }
}
