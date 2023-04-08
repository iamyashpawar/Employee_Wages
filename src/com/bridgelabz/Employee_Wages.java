package com.bridgelabz;

import java.util.Random;

public class Employee_Wages
{

    static int WAGE_PER_HOUR=20;
    static int Full_Time_Wage = 8;
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage");

        Random rd = new Random();
          int dailyWage=0;
        int emp = rd.nextInt(2);
        if(emp == 1)
        {
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HOUR * Full_Time_Wage;
            System.out.println("Your Daily Wage is : " + dailyWage);

        }else
        {
            System.out.println("Employee is Absent!!");
        }



    }
}
