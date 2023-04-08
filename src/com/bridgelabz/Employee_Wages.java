package com.bridgelabz;

import java.util.Random;

public class Employee_Wages
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage");

        Random rd = new Random();

        int emp = rd.nextInt(2);
        if(emp == 1)
        {
            System.out.println("Employee is present");

        }else
        {
            System.out.println("Employee is Absent!!");
        }



    }
}
